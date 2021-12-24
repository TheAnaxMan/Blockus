package com.brand.blockus.compatibility.content.promenade;

import com.brand.blockus.Blockus;
import com.brand.blockus.content.BlocksRegistration;
import com.brand.blockus.content.BlockusItems;
import net.fabricmc.fabric.api.registry.CompostingChanceRegistry;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.registry.Registry;

public class BlockusPromenadeItems {

    public static Item CHERRY_OAK_SMALL_LOGS;
    public static Item PALM_SMALL_LOGS;
    public static Item DARK_AMARANTH_SMALL_STEMS;
    public static Item AUTUMN_OAK_SMALL_HEDGE;
    public static Item AUTUMN_BIRCH_SMALL_HEDGE;
    public static Item PINK_CHERRY_OAK_SMALL_HEDGE;
    public static Item WHITE_CHERRY_OAK_SMALL_HEDGE;
    public static Item PALM_SMALL_HEDGE;
    public static Item DARK_AMARANTH_SMALL_HEDGE;
    public static Item WHITE_OAK_LEAF_PILE;
    public static Item BLUEBERRIES_CRATE;

    public static void init() {

        // Small Logs
        CHERRY_OAK_SMALL_LOGS = register(BlockusPromenadeBlocks.CHERRY_OAK_SMALL_LOGS, Blockus.BLOCKUS_BUILDING_BLOCKS);
        FuelRegistry.INSTANCE.add(BlockusPromenadeItems.CHERRY_OAK_SMALL_LOGS, 300);

        PALM_SMALL_LOGS = register(BlockusPromenadeBlocks.PALM_SMALL_LOGS, Blockus.BLOCKUS_BUILDING_BLOCKS);
        FuelRegistry.INSTANCE.add(BlockusPromenadeItems.PALM_SMALL_LOGS, 300);

        DARK_AMARANTH_SMALL_STEMS = register(BlockusPromenadeBlocks.DARK_AMARANTH_SMALL_STEMS, Blockus.BLOCKUS_BUILDING_BLOCKS);

        // Small Hedges
        AUTUMN_OAK_SMALL_HEDGE = register(BlockusPromenadeBlocks.AUTUMN_OAK_SMALL_HEDGE, Blockus.BLOCKUS_DECORATIONS);
        CompostingChanceRegistry.INSTANCE.add(AUTUMN_OAK_SMALL_HEDGE, 0.85f);

        AUTUMN_BIRCH_SMALL_HEDGE = register(BlockusPromenadeBlocks.AUTUMN_BIRCH_SMALL_HEDGE, Blockus.BLOCKUS_DECORATIONS);
        CompostingChanceRegistry.INSTANCE.add(AUTUMN_BIRCH_SMALL_HEDGE, 0.85f);

        PINK_CHERRY_OAK_SMALL_HEDGE = register(BlockusPromenadeBlocks.PINK_CHERRY_OAK_SMALL_HEDGE, Blockus.BLOCKUS_DECORATIONS);
        CompostingChanceRegistry.INSTANCE.add(PINK_CHERRY_OAK_SMALL_HEDGE, 0.85f);

        WHITE_CHERRY_OAK_SMALL_HEDGE = register(BlockusPromenadeBlocks.WHITE_CHERRY_OAK_SMALL_HEDGE, Blockus.BLOCKUS_DECORATIONS);
        CompostingChanceRegistry.INSTANCE.add(WHITE_CHERRY_OAK_SMALL_HEDGE, 0.85f);

        PALM_SMALL_HEDGE = register(BlockusPromenadeBlocks.PALM_SMALL_HEDGE, Blockus.BLOCKUS_DECORATIONS);
        CompostingChanceRegistry.INSTANCE.add(PALM_SMALL_HEDGE, 0.85f);

        DARK_AMARANTH_SMALL_HEDGE = register(BlockusPromenadeBlocks.DARK_AMARANTH_SMALL_HEDGE, Blockus.BLOCKUS_DECORATIONS);
        CompostingChanceRegistry.INSTANCE.add(DARK_AMARANTH_SMALL_HEDGE, 0.85f);

        // Leaf Piles
        WHITE_OAK_LEAF_PILE = register(BlockusPromenadeBlocks.WHITE_OAK_LEAF_PILE, Blockus.BLOCKUS_DECORATIONS);
        CompostingChanceRegistry.INSTANCE.add(WHITE_OAK_LEAF_PILE, 0.85f);

        // Crates
        BLUEBERRIES_CRATE = register(BlockusPromenadeBlocks.BLUEBERRIES_CRATE, Blockus.BLOCKUS_BUILDING_BLOCKS);
        CompostingChanceRegistry.INSTANCE.add(BLUEBERRIES_CRATE, 0.50f);
    }

    public static Item register(Block block, ItemGroup group) {
        return Registry.register(Registry.ITEM, Registry.BLOCK.getId(block), new BlockItem(block, new Item.Settings().maxCount(64).group(group)));
    }
}
