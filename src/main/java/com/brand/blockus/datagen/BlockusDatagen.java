package com.brand.blockus.datagen;

import com.brand.blockus.datagen.providers.*;
import com.brand.blockus.worldgen.BlockusWorldgenProvider;
import net.fabricmc.api.EnvType;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.resource.conditions.v1.ResourceCondition;
import net.fabricmc.fabric.api.resource.conditions.v1.ResourceConditions;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.registry.RegistryBuilder;
import net.minecraft.registry.RegistryKeys;

import java.lang.reflect.InvocationTargetException;

public class BlockusDatagen implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator dataGenerator) {

        final FabricDataGenerator.Pack pack = dataGenerator.createPack();
        pack.addProvider(BlockusRecipeProvider::new);

        BlockusBlockTagProvider blockTags = pack.addProvider(BlockusBlockTagProvider::new);
        pack.addProvider((output, registries) -> new BlockusItemTagProvider(output, registries, blockTags));

        pack.addProvider(BlockusBlockLootTableProvider::new);
        pack.addProvider(BlockusWorldgenProvider::new);
        pack.addProvider(BlockusLangEnProvider::new);
//        pack.addProvider(BlockusPromenadeBlockLootTableProvider::new);

        if (FabricLoader.getInstance().getEnvironmentType() == EnvType.CLIENT) {
            try {
                Class<?> clientEntrypointClass = Class.forName("com.brand.blockus.datagen.BlockusDatagenClient");
                DataGeneratorEntrypoint entrypoint = (DataGeneratorEntrypoint) clientEntrypointClass.getConstructor().newInstance();
                entrypoint.onInitializeDataGenerator(dataGenerator);
            } catch (ClassNotFoundException | NoSuchMethodException | InstantiationException | IllegalAccessException |
                     InvocationTargetException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Override
    public void buildRegistry(RegistryBuilder registryBuilder) {
        registryBuilder.addRegistry(RegistryKeys.CONFIGURED_FEATURE, BlockusWorldgenProvider::bootstrapConfiguredFeatures);
        registryBuilder.addRegistry(RegistryKeys.PLACED_FEATURE, BlockusWorldgenProvider::bootstrapPlacedFeatures);
    }

    public static ResourceCondition getLoadCondition(String... modIds) {
        return ResourceConditions.allModsLoaded(modIds);
    }
}
