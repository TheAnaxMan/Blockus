package com.brand.blockus.itemgroups;

import com.brand.blockus.Blockus;
import com.brand.blockus.content.BlockusBlocks;
import com.brand.blockus.content.types.*;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.resource.featuretoggle.FeatureSet;
import net.minecraft.util.Identifier;

public class BlockusBuildingBlocks {

    private static final ItemGroup BLOCKUS_BUILDING_BLOCKS = new FabricItemGroup(new Identifier(Blockus.MOD_ID, "blockus_building_blocks")) {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(BlockusBlocks.BLAZE_BRICKS.block);
        }

        @Override
        protected void addItems(FeatureSet enabledFeatures, Entries entries) {
            entries.add(BlockusBlocks.WHITE_OAK_LOG);
            entries.add(BlockusBlocks.WHITE_OAK_WOOD);
            entries.add(BlockusBlocks.STRIPPED_WHITE_OAK_LOG);
            entries.add(BlockusBlocks.STRIPPED_WHITE_OAK_WOOD);

            for (WoodTypesB woodType : WoodTypesB.values()) {
                entries.add(woodType.planks);
                entries.add(woodType.stairs);
                entries.add(woodType.slab);
                entries.add(woodType.fence);
                entries.add(woodType.fence_gate);
                entries.add(woodType.door);
                entries.add(woodType.trapdoor);
            }

            for (WoodTypesNB woodType : WoodTypesNB.values()) {
                entries.add(woodType.planks);
                entries.add(woodType.stairs);
                entries.add(woodType.slab);
                entries.add(woodType.fence);
                entries.add(woodType.fence_gate);
                entries.add(woodType.door);
                entries.add(woodType.trapdoor);
            }

            entries.add(BlockusBlocks.OAK_SMALL_LOGS);
            entries.add(BlockusBlocks.BIRCH_SMALL_LOGS);
            entries.add(BlockusBlocks.SPRUCE_SMALL_LOGS);
            entries.add(BlockusBlocks.JUNGLE_SMALL_LOGS);
            entries.add(BlockusBlocks.ACACIA_SMALL_LOGS);
            entries.add(BlockusBlocks.DARK_OAK_SMALL_LOGS);
            entries.add(BlockusBlocks.MANGROVE_SMALL_LOGS);
            entries.add(BlockusBlocks.WHITE_OAK_SMALL_LOGS);
            entries.add(BlockusBlocks.CRIMSON_SMALL_STEMS);
            entries.add(BlockusBlocks.WARPED_SMALL_STEMS);

            entries.add(BlockusBlocks.HERRINGBONE_OAK_PLANKS);
            entries.add(BlockusBlocks.HERRINGBONE_BIRCH_PLANKS);
            entries.add(BlockusBlocks.HERRINGBONE_SPRUCE_PLANKS);
            entries.add(BlockusBlocks.HERRINGBONE_JUNGLE_PLANKS);
            entries.add(BlockusBlocks.HERRINGBONE_ACACIA_PLANKS);
            entries.add(BlockusBlocks.HERRINGBONE_DARK_OAK_PLANKS);
            entries.add(BlockusBlocks.HERRINGBONE_MANGROVE_PLANKS);
            entries.add(BlockusBlocks.HERRINGBONE_WHITE_OAK_PLANKS);
            entries.add(BlockusBlocks.HERRINGBONE_BAMBOO_PLANKS);
            entries.add(BlockusBlocks.HERRINGBONE_CRIMSON_PLANKS);
            entries.add(BlockusBlocks.HERRINGBONE_WARPED_PLANKS);
            entries.add(BlockusBlocks.HERRINGBONE_CHARRED_PLANKS);

            for (TimberFrameTypesB timberFrameType : TimberFrameTypesB.values()) {
                entries.add(timberFrameType.block);
                entries.add(timberFrameType.diagonal);
                entries.add(timberFrameType.cross);
            }

            for (TimberFrameTypesNB timberFrameType: TimberFrameTypesNB.values()) {
                entries.add(timberFrameType.block);
                entries.add(timberFrameType.diagonal);
                entries.add(timberFrameType.cross);
            }

            entries.add(BlockusBlocks.THATCH.block);
            entries.add(BlockusBlocks.THATCH.stairs);
            entries.add(BlockusBlocks.THATCH.slab);
            entries.add(BlockusBlocks.WOODEN_FRAME);

            entries.add(BlockusBlocks.PAPER_BLOCK);
            entries.add(BlockusBlocks.BURNT_PAPER_BLOCK);
            entries.add(BlockusBlocks.FRAMED_PAPER_BLOCK);
            entries.add(BlockusBlocks.PAPER_WALL);
            entries.add(BlockusBlocks.PAPER_DOOR);
            entries.add(BlockusBlocks.PAPER_TRAPDOOR);
            entries.add(BlockusBlocks.PAPER_LAMP);

            entries.add(BlockusBlocks.ICE_BRICKS);
            entries.add(BlockusBlocks.ICE_BRICK_WALL);
            entries.add(BlockusBlocks.ICE_PILLAR);

            entries.add(BlockusBlocks.SNOW_BRICKS);
            entries.add(BlockusBlocks.SNOW_BRICK_STAIRS);
            entries.add(BlockusBlocks.SNOW_BRICK_SLAB);
            entries.add(BlockusBlocks.SNOW_BRICK_WALL);
            entries.add(BlockusBlocks.SNOW_PILLAR);

            entries.add(BlockusBlocks.STONE_TILES.block);
            entries.add(BlockusBlocks.STONE_TILES.stairs);
            entries.add(BlockusBlocks.STONE_TILES.slab);
            entries.add(BlockusBlocks.STONE_TILES.wall);
            entries.add(BlockusBlocks.STONE_BRICK_PILLAR);
            entries.add(BlockusBlocks.HERRINGBONE_STONE_BRICKS);
            entries.add(BlockusBlocks.STONE_CIRCULAR_PAVING);
            entries.add(BlockusBlocks.SMOOTH_STONE_STAIRS);
            entries.add(BlockusBlocks.STONE_DOOR);
            entries.add(BlockusBlocks.STONE_TRAPDOOR);
            entries.add(BlockusBlocks.STURDY_STONE);

            entries.add(BlockusBlocks.GRANITE_BRICKS.block);
            entries.add(BlockusBlocks.GRANITE_BRICKS.stairs);
            entries.add(BlockusBlocks.GRANITE_BRICKS.slab);
            entries.add(BlockusBlocks.GRANITE_BRICKS.wall);
            entries.add(BlockusBlocks.HERRINGBONE_GRANITE_BRICKS);
            entries.add(BlockusBlocks.CHISELED_GRANITE_BRICKS);
            entries.add(BlockusBlocks.CRACKED_GRANITE_BRICKS);
            entries.add(BlockusBlocks.POLISHED_GRANITE_PILLAR);
            entries.add(BlockusBlocks.GRANITE_CIRCULAR_PAVING);

            entries.add(BlockusBlocks.DIORITE_BRICKS.block);
            entries.add(BlockusBlocks.DIORITE_BRICKS.stairs);
            entries.add(BlockusBlocks.DIORITE_BRICKS.slab);
            entries.add(BlockusBlocks.DIORITE_BRICKS.wall);
            entries.add(BlockusBlocks.HERRINGBONE_DIORITE_BRICKS);
            entries.add(BlockusBlocks.CHISELED_DIORITE_BRICKS);
            entries.add(BlockusBlocks.CRACKED_DIORITE_BRICKS);
            entries.add(BlockusBlocks.POLISHED_DIORITE_PILLAR);
            entries.add(BlockusBlocks.DIORITE_CIRCULAR_PAVING);

            entries.add(BlockusBlocks.ANDESITE_BRICKS.block);
            entries.add(BlockusBlocks.ANDESITE_BRICKS.stairs);
            entries.add(BlockusBlocks.ANDESITE_BRICKS.slab);
            entries.add(BlockusBlocks.ANDESITE_BRICKS.wall);
            entries.add(BlockusBlocks.HERRINGBONE_ANDESITE_BRICKS);
            entries.add(BlockusBlocks.CHISELED_ANDESITE_BRICKS);
            entries.add(BlockusBlocks.CRACKED_ANDESITE_BRICKS);
            entries.add(BlockusBlocks.POLISHED_ANDESITE_PILLAR);
            entries.add(BlockusBlocks.ANDESITE_CIRCULAR_PAVING);

            entries.add(BlockusBlocks.WATER_BRICKS.block);
            entries.add(BlockusBlocks.WATER_BRICKS.stairs);
            entries.add(BlockusBlocks.WATER_BRICKS.slab);
            entries.add(BlockusBlocks.WATER_BRICKS.wall);
            entries.add(BlockusBlocks.CHISELED_WATER_BRICKS);

            entries.add(BlockusBlocks.LAVA_BRICKS.block);
            entries.add(BlockusBlocks.LAVA_BRICKS.stairs);
            entries.add(BlockusBlocks.LAVA_BRICKS.slab);
            entries.add(BlockusBlocks.LAVA_BRICKS.wall);
            entries.add(BlockusBlocks.CHISELED_LAVA_BRICKS);

            entries.add(BlockusBlocks.POLISHED_AMETHYST);
            entries.add(BlockusBlocks.POLISHED_AMETHYST_STAIRS);
            entries.add(BlockusBlocks.POLISHED_AMETHYST_SLAB);
            entries.add(BlockusBlocks.AMETHYST_BRICKS);
            entries.add(BlockusBlocks.AMETHYST_BRICK_STAIRS);
            entries.add(BlockusBlocks.AMETHYST_BRICK_SLAB);
            entries.add(BlockusBlocks.AMETHYST_BRICK_WALL);
            entries.add(BlockusBlocks.CHISELED_AMETHYST);
            entries.add(BlockusBlocks.AMETHYST_PILLAR);

            entries.add(BlockusBlocks.LIMESTONE.block);
            entries.add(BlockusBlocks.LIMESTONE.stairs);
            entries.add(BlockusBlocks.LIMESTONE.slab);
            entries.add(BlockusBlocks.LIMESTONE.wall);
            entries.add(BlockusBlocks.POLISHED_LIMESTONE.block);
            entries.add(BlockusBlocks.POLISHED_LIMESTONE.stairs);
            entries.add(BlockusBlocks.POLISHED_LIMESTONE.slab);
            entries.add(BlockusBlocks.LIMESTONE_BRICKS.block);
            entries.add(BlockusBlocks.LIMESTONE_BRICKS.stairs);
            entries.add(BlockusBlocks.LIMESTONE_BRICKS.slab);
            entries.add(BlockusBlocks.LIMESTONE_BRICKS.wall);
            entries.add(BlockusBlocks.SMALL_LIMESTONE_BRICKS.block);
            entries.add(BlockusBlocks.SMALL_LIMESTONE_BRICKS.stairs);
            entries.add(BlockusBlocks.SMALL_LIMESTONE_BRICKS.slab);
            entries.add(BlockusBlocks.SMALL_LIMESTONE_BRICKS.wall);
            entries.add(BlockusBlocks.LIMESTONE_TILES.block);
            entries.add(BlockusBlocks.LIMESTONE_TILES.stairs);
            entries.add(BlockusBlocks.LIMESTONE_TILES.slab);
            entries.add(BlockusBlocks.LIMESTONE_TILES.wall);
            entries.add(BlockusBlocks.CHISELED_LIMESTONE);
            entries.add(BlockusBlocks.LIMESTONE_PILLAR);
            entries.add(BlockusBlocks.CHISELED_LIMESTONE_PILLAR);
            entries.add(BlockusBlocks.LIMESTONE_SQUARES);
            entries.add(BlockusBlocks.LIMESTONE_CIRCULAR_PAVING);
            entries.add(BlockusBlocks.LIMESTONE_LINES);

            entries.add(BlockusBlocks.MARBLE.block);
            entries.add(BlockusBlocks.MARBLE.stairs);
            entries.add(BlockusBlocks.MARBLE.slab);
            entries.add(BlockusBlocks.MARBLE.wall);
            entries.add(BlockusBlocks.POLISHED_MARBLE.block);
            entries.add(BlockusBlocks.POLISHED_MARBLE.stairs);
            entries.add(BlockusBlocks.POLISHED_MARBLE.slab);
            entries.add(BlockusBlocks.MARBLE_BRICKS.block);
            entries.add(BlockusBlocks.MARBLE_BRICKS.stairs);
            entries.add(BlockusBlocks.MARBLE_BRICKS.slab);
            entries.add(BlockusBlocks.MARBLE_BRICKS.wall);
            entries.add(BlockusBlocks.SMALL_MARBLE_BRICKS.block);
            entries.add(BlockusBlocks.SMALL_MARBLE_BRICKS.stairs);
            entries.add(BlockusBlocks.SMALL_MARBLE_BRICKS.slab);
            entries.add(BlockusBlocks.SMALL_MARBLE_BRICKS.wall);
            entries.add(BlockusBlocks.MARBLE_TILES.block);
            entries.add(BlockusBlocks.MARBLE_TILES.stairs);
            entries.add(BlockusBlocks.MARBLE_TILES.slab);
            entries.add(BlockusBlocks.MARBLE_TILES.wall);
            entries.add(BlockusBlocks.CHISELED_MARBLE);
            entries.add(BlockusBlocks.MARBLE_PILLAR);
            entries.add(BlockusBlocks.CHISELED_MARBLE_PILLAR);
            entries.add(BlockusBlocks.MARBLE_SQUARES);
            entries.add(BlockusBlocks.MARBLE_CIRCULAR_PAVING);
            entries.add(BlockusBlocks.MARBLE_LINES);

            entries.add(BlockusBlocks.POLISHED_DRIPSTONE.block);
            entries.add(BlockusBlocks.POLISHED_DRIPSTONE.stairs);
            entries.add(BlockusBlocks.POLISHED_DRIPSTONE.slab);
            entries.add(BlockusBlocks.DRIPSTONE_BRICKS.block);
            entries.add(BlockusBlocks.DRIPSTONE_BRICKS.stairs);
            entries.add(BlockusBlocks.DRIPSTONE_BRICKS.slab);
            entries.add(BlockusBlocks.DRIPSTONE_BRICKS.wall);
            entries.add(BlockusBlocks.CRACKED_DRIPSTONE_BRICKS);
            entries.add(BlockusBlocks.CHISELED_DRIPSTONE);
            entries.add(BlockusBlocks.DRIPSTONE_PILLAR);

            entries.add(BlockusBlocks.POLISHED_TUFF.block);
            entries.add(BlockusBlocks.POLISHED_TUFF.stairs);
            entries.add(BlockusBlocks.POLISHED_TUFF.slab);
            entries.add(BlockusBlocks.TUFF_BRICKS.block);
            entries.add(BlockusBlocks.TUFF_BRICKS.stairs);
            entries.add(BlockusBlocks.TUFF_BRICKS.slab);
            entries.add(BlockusBlocks.TUFF_BRICKS.wall);
            entries.add(BlockusBlocks.CRACKED_TUFF_BRICKS);
            entries.add(BlockusBlocks.CHISELED_TUFF);
            entries.add(BlockusBlocks.HERRINGBONE_TUFF_BRICKS);
            entries.add(BlockusBlocks.TUFF_PILLAR);
            entries.add(BlockusBlocks.TUFF_CIRCULAR_PAVING);

            entries.add(BlockusBlocks.MOSSY_DEEPSLATE_BRICKS.block);
            entries.add(BlockusBlocks.MOSSY_DEEPSLATE_BRICKS.stairs);
            entries.add(BlockusBlocks.MOSSY_DEEPSLATE_BRICKS.slab);
            entries.add(BlockusBlocks.MOSSY_DEEPSLATE_BRICKS.wall);
            entries.add(BlockusBlocks.HERRINGBONE_DEEPSLATE_BRICKS);
            entries.add(BlockusBlocks.DEEPSLATE_PILLAR);
            entries.add(BlockusBlocks.DEEPSLATE_CIRCULAR_PAVING);
            entries.add(BlockusBlocks.STURDY_DEEPSLATE);

            entries.add(BlockusBlocks.BLUESTONE.block);
            entries.add(BlockusBlocks.BLUESTONE.stairs);
            entries.add(BlockusBlocks.BLUESTONE.slab);
            entries.add(BlockusBlocks.BLUESTONE.wall);
            entries.add(BlockusBlocks.POLISHED_BLUESTONE.block);
            entries.add(BlockusBlocks.POLISHED_BLUESTONE.stairs);
            entries.add(BlockusBlocks.POLISHED_BLUESTONE.slab);
            entries.add(BlockusBlocks.BLUESTONE_BRICKS.block);
            entries.add(BlockusBlocks.BLUESTONE_BRICKS.stairs);
            entries.add(BlockusBlocks.BLUESTONE_BRICKS.slab);
            entries.add(BlockusBlocks.BLUESTONE_BRICKS.wall);
            entries.add(BlockusBlocks.SMALL_BLUESTONE_BRICKS.block);
            entries.add(BlockusBlocks.SMALL_BLUESTONE_BRICKS.stairs);
            entries.add(BlockusBlocks.SMALL_BLUESTONE_BRICKS.slab);
            entries.add(BlockusBlocks.SMALL_BLUESTONE_BRICKS.wall);
            entries.add(BlockusBlocks.BLUESTONE_TILES.block);
            entries.add(BlockusBlocks.BLUESTONE_TILES.stairs);
            entries.add(BlockusBlocks.BLUESTONE_TILES.slab);
            entries.add(BlockusBlocks.BLUESTONE_TILES.wall);
            entries.add(BlockusBlocks.CHISELED_BLUESTONE);
            entries.add(BlockusBlocks.BLUESTONE_PILLAR);
            entries.add(BlockusBlocks.CHISELED_BLUESTONE_PILLAR);
            entries.add(BlockusBlocks.BLUESTONE_SQUARES);
            entries.add(BlockusBlocks.BLUESTONE_CIRCULAR_PAVING);
            entries.add(BlockusBlocks.BLUESTONE_LINES);

            entries.add(BlockusBlocks.VIRIDITE.block);
            entries.add(BlockusBlocks.VIRIDITE.stairs);
            entries.add(BlockusBlocks.VIRIDITE.slab);
            entries.add(BlockusBlocks.VIRIDITE.wall);
            entries.add(BlockusBlocks.POLISHED_VIRIDITE.block);
            entries.add(BlockusBlocks.POLISHED_VIRIDITE.stairs);
            entries.add(BlockusBlocks.POLISHED_VIRIDITE.slab);
            entries.add(BlockusBlocks.VIRIDITE_BRICKS.block);
            entries.add(BlockusBlocks.VIRIDITE_BRICKS.stairs);
            entries.add(BlockusBlocks.VIRIDITE_BRICKS.slab);
            entries.add(BlockusBlocks.VIRIDITE_BRICKS.wall);
            entries.add(BlockusBlocks.SMALL_VIRIDITE_BRICKS.block);
            entries.add(BlockusBlocks.SMALL_VIRIDITE_BRICKS.stairs);
            entries.add(BlockusBlocks.SMALL_VIRIDITE_BRICKS.slab);
            entries.add(BlockusBlocks.SMALL_VIRIDITE_BRICKS.wall);
            entries.add(BlockusBlocks.VIRIDITE_TILES.block);
            entries.add(BlockusBlocks.VIRIDITE_TILES.stairs);
            entries.add(BlockusBlocks.VIRIDITE_TILES.slab);
            entries.add(BlockusBlocks.VIRIDITE_TILES.wall);
            entries.add(BlockusBlocks.CHISELED_VIRIDITE);
            entries.add(BlockusBlocks.VIRIDITE_PILLAR);
            entries.add(BlockusBlocks.CHISELED_VIRIDITE_PILLAR);
            entries.add(BlockusBlocks.VIRIDITE_SQUARES);
            entries.add(BlockusBlocks.VIRIDITE_CIRCULAR_PAVING);
            entries.add(BlockusBlocks.VIRIDITE_LINES);

            entries.add(BlockusBlocks.POLISHED_SCULK.block);
            entries.add(BlockusBlocks.POLISHED_SCULK.stairs);
            entries.add(BlockusBlocks.POLISHED_SCULK.slab);
            entries.add(BlockusBlocks.SCULK_BRICKS.block);
            entries.add(BlockusBlocks.SCULK_BRICKS.stairs);
            entries.add(BlockusBlocks.SCULK_BRICKS.slab);
            entries.add(BlockusBlocks.SCULK_BRICKS.wall);
            entries.add(BlockusBlocks.CHISELED_SCULK_BRICKS);
            entries.add(BlockusBlocks.SCULK_PILLAR);

            entries.add(BlockusBlocks.HONEYCOMB_BRICKS.block);
            entries.add(BlockusBlocks.HONEYCOMB_BRICKS.stairs);
            entries.add(BlockusBlocks.HONEYCOMB_BRICKS.slab);
            entries.add(BlockusBlocks.HONEYCOMB_BRICKS.wall);

            entries.add(BlockusBlocks.LARGE_BRICKS.block);
            entries.add(BlockusBlocks.LARGE_BRICKS.stairs);
            entries.add(BlockusBlocks.LARGE_BRICKS.slab);
            entries.add(BlockusBlocks.LARGE_BRICKS.wall);
            entries.add(BlockusBlocks.HERRINGBONE_BRICKS);
            entries.add(BlockusBlocks.SOAKED_BRICKS.block);
            entries.add(BlockusBlocks.SOAKED_BRICKS.stairs);
            entries.add(BlockusBlocks.SOAKED_BRICKS.slab);
            entries.add(BlockusBlocks.SOAKED_BRICKS.wall);
            entries.add(BlockusBlocks.HERRINGBONE_SOAKED_BRICKS);
            entries.add(BlockusBlocks.SANDY_BRICKS.block);
            entries.add(BlockusBlocks.SANDY_BRICKS.stairs);
            entries.add(BlockusBlocks.SANDY_BRICKS.slab);
            entries.add(BlockusBlocks.SANDY_BRICKS.wall);
            entries.add(BlockusBlocks.HERRINGBONE_SANDY_BRICKS);
            entries.add(BlockusBlocks.CHARRED_BRICKS.block);
            entries.add(BlockusBlocks.CHARRED_BRICKS.stairs);
            entries.add(BlockusBlocks.CHARRED_BRICKS.slab);
            entries.add(BlockusBlocks.CHARRED_BRICKS.wall);
            entries.add(BlockusBlocks.HERRINGBONE_CHARRED_BRICKS);

            entries.add(BlockusBlocks.ROUGH_SANDSTONE.block);
            entries.add(BlockusBlocks.ROUGH_SANDSTONE.stairs);
            entries.add(BlockusBlocks.ROUGH_SANDSTONE.slab);
            entries.add(BlockusBlocks.SANDSTONE_BRICKS.block);
            entries.add(BlockusBlocks.SANDSTONE_BRICKS.stairs);
            entries.add(BlockusBlocks.SANDSTONE_BRICKS.slab);
            entries.add(BlockusBlocks.SANDSTONE_BRICKS.wall);
            entries.add(BlockusBlocks.SMALL_SANDSTONE_BRICKS.block);
            entries.add(BlockusBlocks.SMALL_SANDSTONE_BRICKS.stairs);
            entries.add(BlockusBlocks.SMALL_SANDSTONE_BRICKS.slab);
            entries.add(BlockusBlocks.SMALL_SANDSTONE_BRICKS.wall);
            entries.add(BlockusBlocks.SANDSTONE_PILLAR);
            entries.add(BlockusBlocks.GOLD_DECORATED_SANDSTONE);
            entries.add(BlockusBlocks.LAPIS_DECORATED_SANDSTONE);

            entries.add(BlockusBlocks.ROUGH_RED_SANDSTONE.block);
            entries.add(BlockusBlocks.ROUGH_RED_SANDSTONE.stairs);
            entries.add(BlockusBlocks.ROUGH_RED_SANDSTONE.slab);
            entries.add(BlockusBlocks.RED_SANDSTONE_BRICKS.block);
            entries.add(BlockusBlocks.RED_SANDSTONE_BRICKS.stairs);
            entries.add(BlockusBlocks.RED_SANDSTONE_BRICKS.slab);
            entries.add(BlockusBlocks.RED_SANDSTONE_BRICKS.wall);
            entries.add(BlockusBlocks.SMALL_RED_SANDSTONE_BRICKS.block);
            entries.add(BlockusBlocks.SMALL_RED_SANDSTONE_BRICKS.stairs);
            entries.add(BlockusBlocks.SMALL_RED_SANDSTONE_BRICKS.slab);
            entries.add(BlockusBlocks.SMALL_RED_SANDSTONE_BRICKS.wall);
            entries.add(BlockusBlocks.RED_SANDSTONE_PILLAR);
            entries.add(BlockusBlocks.GOLD_DECORATED_RED_SANDSTONE);
            entries.add(BlockusBlocks.LAPIS_DECORATED_RED_SANDSTONE);

            entries.add(BlockusBlocks.SOUL_SANDSTONE.block);
            entries.add(BlockusBlocks.SOUL_SANDSTONE.stairs);
            entries.add(BlockusBlocks.SOUL_SANDSTONE.slab);
            entries.add(BlockusBlocks.SOUL_SANDSTONE.wall);
            entries.add(BlockusBlocks.ROUGH_SOUL_SANDSTONE.block);
            entries.add(BlockusBlocks.ROUGH_SOUL_SANDSTONE.stairs);
            entries.add(BlockusBlocks.ROUGH_SOUL_SANDSTONE.slab);
            entries.add(BlockusBlocks.SMOOTH_SOUL_SANDSTONE.block);
            entries.add(BlockusBlocks.SMOOTH_SOUL_SANDSTONE.stairs);
            entries.add(BlockusBlocks.SMOOTH_SOUL_SANDSTONE.slab);
            entries.add(BlockusBlocks.SOUL_SANDSTONE_BRICKS.block);
            entries.add(BlockusBlocks.SOUL_SANDSTONE_BRICKS.stairs);
            entries.add(BlockusBlocks.SOUL_SANDSTONE_BRICKS.slab);
            entries.add(BlockusBlocks.SOUL_SANDSTONE_BRICKS.wall);
            entries.add(BlockusBlocks.SMALL_SOUL_SANDSTONE_BRICKS.block);
            entries.add(BlockusBlocks.SMALL_SOUL_SANDSTONE_BRICKS.stairs);
            entries.add(BlockusBlocks.SMALL_SOUL_SANDSTONE_BRICKS.slab);
            entries.add(BlockusBlocks.SMALL_SOUL_SANDSTONE_BRICKS.wall);
            entries.add(BlockusBlocks.CHISELED_SOUL_SANDSTONE);
            entries.add(BlockusBlocks.CUT_SOUL_SANDSTONE);
            entries.add(BlockusBlocks.CUT_SOUL_SANDSTONE_SLAB);
            entries.add(BlockusBlocks.SOUL_SANDSTONE_PILLAR);
            entries.add(BlockusBlocks.GOLD_DECORATED_SOUL_SANDSTONE);
            entries.add(BlockusBlocks.LAPIS_DECORATED_SOUL_SANDSTONE);

            entries.add(BlockusBlocks.PRISMARINE_CIRCULAR_PAVING);
            entries.add(BlockusBlocks.CHISELED_DARK_PRISMARINE);
            entries.add(BlockusBlocks.DARK_PRISMARINE_PILLAR);
            entries.add(BlockusBlocks.CHISELED_PRISMARINE);
            entries.add(BlockusBlocks.PRISMARINE_PILLAR);

            entries.add(BlockusBlocks.QUARTZ_TILES.block);
            entries.add(BlockusBlocks.QUARTZ_TILES.stairs);
            entries.add(BlockusBlocks.QUARTZ_TILES.slab);
            entries.add(BlockusBlocks.QUARTZ_TILES.wall);
            entries.add(BlockusBlocks.QUARTZ_CIRCULAR_PAVING);

            entries.add(BlockusBlocks.POLISHED_NETHERRACK.block);
            entries.add(BlockusBlocks.POLISHED_NETHERRACK.stairs);
            entries.add(BlockusBlocks.POLISHED_NETHERRACK.slab);
            entries.add(BlockusBlocks.NETHERRACK_BRICKS.block);
            entries.add(BlockusBlocks.NETHERRACK_BRICKS.stairs);
            entries.add(BlockusBlocks.NETHERRACK_BRICKS.slab);
            entries.add(BlockusBlocks.NETHERRACK_BRICKS.wall);
            entries.add(BlockusBlocks.NETHERRACK_CIRCULAR_PAVING);

            entries.add(BlockusBlocks.CRIMSON_WART_BRICKS.block);
            entries.add(BlockusBlocks.CRIMSON_WART_BRICKS.stairs);
            entries.add(BlockusBlocks.CRIMSON_WART_BRICKS.slab);
            entries.add(BlockusBlocks.CRIMSON_WART_BRICKS.wall);
            entries.add(BlockusBlocks.WARPED_WART_BRICKS.block);
            entries.add(BlockusBlocks.WARPED_WART_BRICKS.stairs);
            entries.add(BlockusBlocks.WARPED_WART_BRICKS.slab);
            entries.add(BlockusBlocks.WARPED_WART_BRICKS.wall);

            entries.add(BlockusBlocks.POLISHED_NETHER_BRICKS);
            entries.add(BlockusBlocks.POLISHED_RED_NETHER_BRICKS);
            entries.add(BlockusBlocks.HERRINGBONE_NETHER_BRICKS);
            entries.add(BlockusBlocks.HERRINGBONE_RED_NETHER_BRICKS);
            entries.add(BlockusBlocks.NETHER_BRICK_PILLAR);
            entries.add(BlockusBlocks.RED_NETHER_BRICK_PILLAR);
            entries.add(BlockusBlocks.CHARRED_NETHER_BRICKS.block);
            entries.add(BlockusBlocks.CHARRED_NETHER_BRICKS.stairs);
            entries.add(BlockusBlocks.CHARRED_NETHER_BRICKS.slab);
            entries.add(BlockusBlocks.CHARRED_NETHER_BRICKS.wall);
            entries.add(BlockusBlocks.POLISHED_CHARRED_NETHER_BRICKS);
            entries.add(BlockusBlocks.HERRINGBONE_CHARRED_NETHER_BRICKS);
            entries.add(BlockusBlocks.CHARRED_NETHER_BRICK_PILLAR);
            entries.add(BlockusBlocks.TEAL_NETHER_BRICKS.block);
            entries.add(BlockusBlocks.TEAL_NETHER_BRICKS.stairs);
            entries.add(BlockusBlocks.TEAL_NETHER_BRICKS.slab);
            entries.add(BlockusBlocks.TEAL_NETHER_BRICKS.wall);
            entries.add(BlockusBlocks.POLISHED_TEAL_NETHER_BRICKS);
            entries.add(BlockusBlocks.HERRINGBONE_TEAL_NETHER_BRICKS);
            entries.add(BlockusBlocks.TEAL_NETHER_BRICK_PILLAR);

            entries.add(BlockusBlocks.BLAZE_BRICKS.block);
            entries.add(BlockusBlocks.BLAZE_BRICKS.stairs);
            entries.add(BlockusBlocks.BLAZE_BRICKS.slab);
            entries.add(BlockusBlocks.BLAZE_BRICKS.wall);
            entries.add(BlockusBlocks.BLAZE_PILLAR);
            entries.add(BlockusBlocks.BLAZE_LANTERN);

            entries.add(BlockusBlocks.ROUGH_BASALT.block);
            entries.add(BlockusBlocks.ROUGH_BASALT.slab);
            entries.add(BlockusBlocks.ROUGH_BASALT.stairs);
            entries.add(BlockusBlocks.POLISHED_BASALT_BRICKS.block);
            entries.add(BlockusBlocks.POLISHED_BASALT_BRICKS.stairs);
            entries.add(BlockusBlocks.POLISHED_BASALT_BRICKS.slab);
            entries.add(BlockusBlocks.POLISHED_BASALT_BRICKS.wall);
            entries.add(BlockusBlocks.CHISELED_POLISHED_BASALT);
            entries.add(BlockusBlocks.CRACKED_POLISHED_BASALT_BRICKS);
            entries.add(BlockusBlocks.POLISHED_BASALT_PILLAR);
            entries.add(BlockusBlocks.HERRINGBONE_POLISHED_BASALT_BRICKS);
            entries.add(BlockusBlocks.POLISHED_BASALT_CIRCULAR_PAVING);

            entries.add(BlockusBlocks.POLISHED_BLACKSTONE_TILES.block);
            entries.add(BlockusBlocks.POLISHED_BLACKSTONE_TILES.stairs);
            entries.add(BlockusBlocks.POLISHED_BLACKSTONE_TILES.slab);
            entries.add(BlockusBlocks.POLISHED_BLACKSTONE_TILES.wall);
            entries.add(BlockusBlocks.POLISHED_BLACKSTONE_PILLAR);
            entries.add(BlockusBlocks.HERRINGBONE_POLISHED_BLACKSTONE_BRICKS);
            entries.add(BlockusBlocks.POLISHED_BLACKSTONE_CIRCULAR_PAVING);
            entries.add(BlockusBlocks.CRIMSON_WARTY_BLACKSTONE_BRICKS.block);
            entries.add(BlockusBlocks.CRIMSON_WARTY_BLACKSTONE_BRICKS.stairs);
            entries.add(BlockusBlocks.CRIMSON_WARTY_BLACKSTONE_BRICKS.slab);
            entries.add(BlockusBlocks.CRIMSON_WARTY_BLACKSTONE_BRICKS.wall);
            entries.add(BlockusBlocks.WARPED_WARTY_BLACKSTONE_BRICKS.block);
            entries.add(BlockusBlocks.WARPED_WARTY_BLACKSTONE_BRICKS.stairs);
            entries.add(BlockusBlocks.WARPED_WARTY_BLACKSTONE_BRICKS.slab);
            entries.add(BlockusBlocks.WARPED_WARTY_BLACKSTONE_BRICKS.wall);
            entries.add(BlockusBlocks.BLACKSTONE_DOOR);
            entries.add(BlockusBlocks.BLACKSTONE_TRAPDOOR);
            entries.add(BlockusBlocks.GOLD_DECORATED_POLISHED_BLACKSTONE);
            entries.add(BlockusBlocks.STURDY_BLACKSTONE);

            entries.add(BlockusBlocks.LAVA_POLISHED_BLACKSTONE_BRICKS.block);
            entries.add(BlockusBlocks.LAVA_POLISHED_BLACKSTONE_BRICKS.stairs);
            entries.add(BlockusBlocks.LAVA_POLISHED_BLACKSTONE_BRICKS.slab);
            entries.add(BlockusBlocks.LAVA_POLISHED_BLACKSTONE_BRICKS.wall);
            entries.add(BlockusBlocks.CHISELED_LAVA_POLISHED_BLACKSTONE);

            entries.add(BlockusBlocks.MAGMA_BRICKS.block);
            entries.add(BlockusBlocks.MAGMA_BRICKS.stairs);
            entries.add(BlockusBlocks.MAGMA_BRICKS.slab);
            entries.add(BlockusBlocks.MAGMA_BRICKS.wall);
            entries.add(BlockusBlocks.SMALL_MAGMA_BRICKS.block);
            entries.add(BlockusBlocks.SMALL_MAGMA_BRICKS.stairs);
            entries.add(BlockusBlocks.SMALL_MAGMA_BRICKS.slab);
            entries.add(BlockusBlocks.SMALL_MAGMA_BRICKS.wall);
            entries.add(BlockusBlocks.CHISELED_MAGMA_BRICKS);

            entries.add(BlockusBlocks.OBSIDIAN_BRICKS.block);
            entries.add(BlockusBlocks.OBSIDIAN_BRICKS.stairs);
            entries.add(BlockusBlocks.OBSIDIAN_BRICKS.slab);
            entries.add(BlockusBlocks.OBSIDIAN_BRICKS.wall);
            entries.add(BlockusBlocks.CRACKED_OBSIDIAN_BRICKS);
            entries.add(BlockusBlocks.SMALL_OBSIDIAN_BRICKS.block);
            entries.add(BlockusBlocks.SMALL_OBSIDIAN_BRICKS.stairs);
            entries.add(BlockusBlocks.SMALL_OBSIDIAN_BRICKS.slab);
            entries.add(BlockusBlocks.SMALL_OBSIDIAN_BRICKS.wall);
            entries.add(BlockusBlocks.OBSIDIAN_PILLAR);
            entries.add(BlockusBlocks.OBSIDIAN_CIRCULAR_PAVING);
            entries.add(BlockusBlocks.OBSIDIAN_REINFORCED_DOOR);
            entries.add(BlockusBlocks.OBSIDIAN_REINFORCED_TRAPDOOR);
            entries.add(BlockusBlocks.GLOWING_OBSIDIAN);

            entries.add(BlockusBlocks.CHISELED_END_STONE_BRICKS);
            entries.add(BlockusBlocks.HERRINGBONE_END_STONE_BRICKS);
            entries.add(BlockusBlocks.POLISHED_END_STONE.block);
            entries.add(BlockusBlocks.POLISHED_END_STONE.stairs);
            entries.add(BlockusBlocks.POLISHED_END_STONE.slab);
            entries.add(BlockusBlocks.CRACKED_END_STONE_BRICKS);
            entries.add(BlockusBlocks.END_STONE_PILLAR);
            entries.add(BlockusBlocks.SMALL_END_STONE_BRICKS.block);
            entries.add(BlockusBlocks.SMALL_END_STONE_BRICKS.stairs);
            entries.add(BlockusBlocks.SMALL_END_STONE_BRICKS.slab);
            entries.add(BlockusBlocks.SMALL_END_STONE_BRICKS.wall);
            entries.add(BlockusBlocks.PURPUR_DECORATED_END_STONE);
            entries.add(BlockusBlocks.PHANTOM_PURPUR_DECORATED_END_STONE);;

            entries.add(BlockusBlocks.PURPUR_BRICKS.block);
            entries.add(BlockusBlocks.PURPUR_BRICKS.stairs);
            entries.add(BlockusBlocks.PURPUR_BRICKS.slab);
            entries.add(BlockusBlocks.PURPUR_BRICKS.wall);
            entries.add(BlockusBlocks.POLISHED_PURPUR.block);
            entries.add(BlockusBlocks.POLISHED_PURPUR.stairs);
            entries.add(BlockusBlocks.POLISHED_PURPUR.slab);
            entries.add(BlockusBlocks.PURPUR_SQUARES);
            entries.add(BlockusBlocks.SMALL_PURPUR_BRICKS.block);
            entries.add(BlockusBlocks.SMALL_PURPUR_BRICKS.stairs);
            entries.add(BlockusBlocks.SMALL_PURPUR_BRICKS.slab);
            entries.add(BlockusBlocks.SMALL_PURPUR_BRICKS.wall);
            entries.add(BlockusBlocks.CHISELED_PURPUR);
            entries.add(BlockusBlocks.PURPUR_LINES);

            entries.add(BlockusBlocks.PHANTOM_PURPUR_BLOCK.block);
            entries.add(BlockusBlocks.PHANTOM_PURPUR_BLOCK.stairs);
            entries.add(BlockusBlocks.PHANTOM_PURPUR_BLOCK.slab);
            entries.add(BlockusBlocks.PHANTOM_PURPUR_PILLAR);
            entries.add(BlockusBlocks.PHANTOM_PURPUR_BRICKS.block);
            entries.add(BlockusBlocks.PHANTOM_PURPUR_BRICKS.stairs);
            entries.add(BlockusBlocks.PHANTOM_PURPUR_BRICKS.slab);
            entries.add(BlockusBlocks.PHANTOM_PURPUR_BRICKS.wall);
            entries.add(BlockusBlocks.POLISHED_PHANTOM_PURPUR.block);
            entries.add(BlockusBlocks.POLISHED_PHANTOM_PURPUR.stairs);
            entries.add(BlockusBlocks.POLISHED_PHANTOM_PURPUR.slab);
            entries.add(BlockusBlocks.PHANTOM_PURPUR_SQUARES);
            entries.add(BlockusBlocks.SMALL_PHANTOM_PURPUR_BRICKS.block);
            entries.add(BlockusBlocks.SMALL_PHANTOM_PURPUR_BRICKS.stairs);
            entries.add(BlockusBlocks.SMALL_PHANTOM_PURPUR_BRICKS.slab);
            entries.add(BlockusBlocks.SMALL_PHANTOM_PURPUR_BRICKS.wall);
            entries.add(BlockusBlocks.CHISELED_PHANTOM_PURPUR);
            entries.add(BlockusBlocks.PHANTOM_PURPUR_LINES);

            entries.add(BlockusBlocks.LANTERN_BLOCK);
            entries.add(BlockusBlocks.SOUL_LANTERN_BLOCK);

            entries.add(BlockusBlocks.CAUTION_BLOCK);
            entries.add(BlockusBlocks.CAUTION_BARRIER);
            entries.add(BlockusBlocks.ROAD_BARRIER);

            entries.add(BlockusBlocks.IRON_PLATING.block);
            entries.add(BlockusBlocks.IRON_PLATING.stairs);
            entries.add(BlockusBlocks.IRON_PLATING.slab);
            entries.add(BlockusBlocks.IRON_GATE);

            entries.add(BlockusBlocks.GOLD_PLATING.block);
            entries.add(BlockusBlocks.GOLD_PLATING.stairs);
            entries.add(BlockusBlocks.GOLD_PLATING.slab);
            entries.add(BlockusBlocks.GOLDEN_BARS);
            entries.add(BlockusBlocks.GOLDEN_GATE);

            entries.add(BlockusBlocks.NETHERITE_STAIRS);
            entries.add(BlockusBlocks.NETHERITE_SLAB);

            entries.add(BlockusBlocks.CHARCOAL_BLOCK);
            entries.add(BlockusBlocks.ENDER_BLOCK);
            entries.add(BlockusBlocks.NETHER_STAR_BLOCK);
            entries.add(BlockusBlocks.LOVE_BLOCK);
            entries.add(BlockusBlocks.WEIGHT_STORAGE_CUBE);
            entries.add(BlockusBlocks.COMPANION_CUBE);
            entries.add(BlockusBlocks.STARS_BLOCK);

            entries.add(BlockusBlocks.ROTTEN_FLESH_BLOCK);
            entries.add(BlockusBlocks.CHORUS_BLOCK);

            entries.add(BlockusBlocks.SUGAR_BLOCK);
            entries.add(BlockusBlocks.COOKIE_BLOCK);
            entries.add(BlockusBlocks.SWEET_BERRIES_CRATE);
            entries.add(BlockusBlocks.SALMON_CRATE);
            entries.add(BlockusBlocks.PUFFERFISH_CRATE);
            entries.add(BlockusBlocks.TROPICAL_FISH_CRATE);
            entries.add(BlockusBlocks.COD_CRATE);
            entries.add(BlockusBlocks.POTATO_CRATE);
            entries.add(BlockusBlocks.APPLE_CRATE);
            entries.add(BlockusBlocks.BEETROOT_CRATE);
            entries.add(BlockusBlocks.CARROT_CRATE);
            entries.add(BlockusBlocks.BREAD_BOX);
            entries.add(BlockusBlocks.GOLDEN_APPLE_CRATE);
            entries.add(BlockusBlocks.GOLDEN_CARROT_CRATE);
            entries.add(BlockusBlocks.GLOW_BERRIES_CRATE);

            entries.add(BlockusBlocks.RAINBOW_BLOCK);
            entries.add(BlockusBlocks.RAINBOW_BRICKS.block);
            entries.add(BlockusBlocks.RAINBOW_BRICKS.stairs);
            entries.add(BlockusBlocks.RAINBOW_BRICKS.slab);
            entries.add(BlockusBlocks.RAINBOW_BRICKS.wall);
            entries.add(BlockusBlocks.RAINBOW_GLOWSTONE);


            entries.add(BlockusBlocks.RAINBOW_ASPHALT);

            for (AsphaltTypes asphaltTypes : AsphaltTypes.values()) {
                entries.add(asphaltTypes.block);
                entries.add(asphaltTypes.stairs);
                entries.add(asphaltTypes.slab);
            }

            entries.add(BlockusBlocks.SHINGLES.block);
            entries.add(BlockusBlocks.WHITE_SHINGLES.block);
            entries.add(BlockusBlocks.LIGHT_GRAY_SHINGLES.block);
            entries.add(BlockusBlocks.GRAY_SHINGLES.block);
            entries.add(BlockusBlocks.BLACK_SHINGLES.block);
            entries.add(BlockusBlocks.BROWN_SHINGLES.block);
            entries.add(BlockusBlocks.RED_SHINGLES.block);
            entries.add(BlockusBlocks.ORANGE_SHINGLES.block);
            entries.add(BlockusBlocks.YELLOW_SHINGLES.block);
            entries.add(BlockusBlocks.LIME_SHINGLES.block);
            entries.add(BlockusBlocks.GREEN_SHINGLES.block);
            entries.add(BlockusBlocks.CYAN_SHINGLES.block);
            entries.add(BlockusBlocks.LIGHT_BLUE_SHINGLES.block);
            entries.add(BlockusBlocks.BLUE_SHINGLES.block);
            entries.add(BlockusBlocks.PURPLE_SHINGLES.block);
            entries.add(BlockusBlocks.MAGENTA_SHINGLES.block);
            entries.add(BlockusBlocks.PINK_SHINGLES.block);
            entries.add(BlockusBlocks.SHINGLES.stairs);
            entries.add(BlockusBlocks.WHITE_SHINGLES.stairs);
            entries.add(BlockusBlocks.LIGHT_GRAY_SHINGLES.stairs);
            entries.add(BlockusBlocks.GRAY_SHINGLES.stairs);
            entries.add(BlockusBlocks.BLACK_SHINGLES.stairs);
            entries.add(BlockusBlocks.BROWN_SHINGLES.stairs);
            entries.add(BlockusBlocks.RED_SHINGLES.stairs);
            entries.add(BlockusBlocks.ORANGE_SHINGLES.stairs);
            entries.add(BlockusBlocks.YELLOW_SHINGLES.stairs);
            entries.add(BlockusBlocks.LIME_SHINGLES.stairs);
            entries.add(BlockusBlocks.GREEN_SHINGLES.stairs);
            entries.add(BlockusBlocks.CYAN_SHINGLES.stairs);
            entries.add(BlockusBlocks.LIGHT_BLUE_SHINGLES.stairs);
            entries.add(BlockusBlocks.BLUE_SHINGLES.stairs);
            entries.add(BlockusBlocks.PURPLE_SHINGLES.stairs);
            entries.add(BlockusBlocks.MAGENTA_SHINGLES.stairs);
            entries.add(BlockusBlocks.PINK_SHINGLES.stairs);
            entries.add(BlockusBlocks.SHINGLES.slab);
            entries.add(BlockusBlocks.WHITE_SHINGLES.slab);
            entries.add(BlockusBlocks.LIGHT_GRAY_SHINGLES.slab);
            entries.add(BlockusBlocks.GRAY_SHINGLES.slab);
            entries.add(BlockusBlocks.BLACK_SHINGLES.slab);
            entries.add(BlockusBlocks.BROWN_SHINGLES.slab);
            entries.add(BlockusBlocks.RED_SHINGLES.slab);
            entries.add(BlockusBlocks.ORANGE_SHINGLES.slab);
            entries.add(BlockusBlocks.YELLOW_SHINGLES.slab);
            entries.add(BlockusBlocks.LIME_SHINGLES.slab);
            entries.add(BlockusBlocks.GREEN_SHINGLES.slab);
            entries.add(BlockusBlocks.CYAN_SHINGLES.slab);
            entries.add(BlockusBlocks.LIGHT_BLUE_SHINGLES.slab);
            entries.add(BlockusBlocks.BLUE_SHINGLES.slab);
            entries.add(BlockusBlocks.PURPLE_SHINGLES.slab);
            entries.add(BlockusBlocks.MAGENTA_SHINGLES.slab);
            entries.add(BlockusBlocks.PINK_SHINGLES.slab);

            entries.add(BlockusBlocks.WHITE_GLAZED_TERRACOTTA_PILLAR);
            entries.add(BlockusBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_PILLAR);
            entries.add(BlockusBlocks.GRAY_GLAZED_TERRACOTTA_PILLAR);
            entries.add(BlockusBlocks.BLACK_GLAZED_TERRACOTTA_PILLAR);
            entries.add(BlockusBlocks.BROWN_GLAZED_TERRACOTTA_PILLAR);
            entries.add(BlockusBlocks.RED_GLAZED_TERRACOTTA_PILLAR);
            entries.add(BlockusBlocks.ORANGE_GLAZED_TERRACOTTA_PILLAR);
            entries.add(BlockusBlocks.YELLOW_GLAZED_TERRACOTTA_PILLAR);
            entries.add(BlockusBlocks.LIME_GLAZED_TERRACOTTA_PILLAR);
            entries.add(BlockusBlocks.GREEN_GLAZED_TERRACOTTA_PILLAR);
            entries.add(BlockusBlocks.CYAN_GLAZED_TERRACOTTA_PILLAR);
            entries.add(BlockusBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_PILLAR);
            entries.add(BlockusBlocks.BLUE_GLAZED_TERRACOTTA_PILLAR);
            entries.add(BlockusBlocks.PURPLE_GLAZED_TERRACOTTA_PILLAR);
            entries.add(BlockusBlocks.MAGENTA_GLAZED_TERRACOTTA_PILLAR);
            entries.add(BlockusBlocks.PINK_GLAZED_TERRACOTTA_PILLAR);

            entries.add(BlockusBlocks.WHITE_STONE_BRICKS.block);
            entries.add(BlockusBlocks.GRAY_STONE_BRICKS.block);
            entries.add(BlockusBlocks.BLACK_STONE_BRICKS.block);
            entries.add(BlockusBlocks.BROWN_STONE_BRICKS.block);
            entries.add(BlockusBlocks.RED_STONE_BRICKS.block);
            entries.add(BlockusBlocks.ORANGE_STONE_BRICKS.block);
            entries.add(BlockusBlocks.YELLOW_STONE_BRICKS.block);
            entries.add(BlockusBlocks.LIME_STONE_BRICKS.block);
            entries.add(BlockusBlocks.GREEN_STONE_BRICKS.block);
            entries.add(BlockusBlocks.CYAN_STONE_BRICKS.block);
            entries.add(BlockusBlocks.LIGHT_BLUE_STONE_BRICKS.block);
            entries.add(BlockusBlocks.BLUE_STONE_BRICKS.block);
            entries.add(BlockusBlocks.PURPLE_STONE_BRICKS.block);
            entries.add(BlockusBlocks.MAGENTA_STONE_BRICKS.block);
            entries.add(BlockusBlocks.PINK_STONE_BRICKS.block);
            entries.add(BlockusBlocks.WHITE_STONE_BRICKS.stairs);
            entries.add(BlockusBlocks.GRAY_STONE_BRICKS.stairs);
            entries.add(BlockusBlocks.BLACK_STONE_BRICKS.stairs);
            entries.add(BlockusBlocks.BROWN_STONE_BRICKS.stairs);
            entries.add(BlockusBlocks.RED_STONE_BRICKS.stairs);
            entries.add(BlockusBlocks.ORANGE_STONE_BRICKS.stairs);
            entries.add(BlockusBlocks.YELLOW_STONE_BRICKS.stairs);
            entries.add(BlockusBlocks.LIME_STONE_BRICKS.stairs);
            entries.add(BlockusBlocks.GREEN_STONE_BRICKS.stairs);
            entries.add(BlockusBlocks.CYAN_STONE_BRICKS.stairs);
            entries.add(BlockusBlocks.LIGHT_BLUE_STONE_BRICKS.stairs);
            entries.add(BlockusBlocks.BLUE_STONE_BRICKS.stairs);
            entries.add(BlockusBlocks.PURPLE_STONE_BRICKS.stairs);
            entries.add(BlockusBlocks.MAGENTA_STONE_BRICKS.stairs);
            entries.add(BlockusBlocks.PINK_STONE_BRICKS.stairs);
            entries.add(BlockusBlocks.WHITE_STONE_BRICKS.slab);
            entries.add(BlockusBlocks.GRAY_STONE_BRICKS.slab);
            entries.add(BlockusBlocks.BLACK_STONE_BRICKS.slab);
            entries.add(BlockusBlocks.BROWN_STONE_BRICKS.slab);
            entries.add(BlockusBlocks.RED_STONE_BRICKS.slab);
            entries.add(BlockusBlocks.ORANGE_STONE_BRICKS.slab);
            entries.add(BlockusBlocks.YELLOW_STONE_BRICKS.slab);
            entries.add(BlockusBlocks.LIME_STONE_BRICKS.slab);
            entries.add(BlockusBlocks.GREEN_STONE_BRICKS.slab);
            entries.add(BlockusBlocks.CYAN_STONE_BRICKS.slab);
            entries.add(BlockusBlocks.LIGHT_BLUE_STONE_BRICKS.slab);
            entries.add(BlockusBlocks.BLUE_STONE_BRICKS.slab);
            entries.add(BlockusBlocks.PURPLE_STONE_BRICKS.slab);
            entries.add(BlockusBlocks.MAGENTA_STONE_BRICKS.slab);
            entries.add(BlockusBlocks.PINK_STONE_BRICKS.slab);
            entries.add(BlockusBlocks.WHITE_STONE_BRICKS.wall);
            entries.add(BlockusBlocks.GRAY_STONE_BRICKS.wall);
            entries.add(BlockusBlocks.BLACK_STONE_BRICKS.wall);
            entries.add(BlockusBlocks.BROWN_STONE_BRICKS.wall);
            entries.add(BlockusBlocks.RED_STONE_BRICKS.wall);
            entries.add(BlockusBlocks.ORANGE_STONE_BRICKS.wall);
            entries.add(BlockusBlocks.YELLOW_STONE_BRICKS.wall);
            entries.add(BlockusBlocks.LIME_STONE_BRICKS.wall);
            entries.add(BlockusBlocks.GREEN_STONE_BRICKS.wall);
            entries.add(BlockusBlocks.CYAN_STONE_BRICKS.wall);
            entries.add(BlockusBlocks.LIGHT_BLUE_STONE_BRICKS.wall);
            entries.add(BlockusBlocks.BLUE_STONE_BRICKS.wall);
            entries.add(BlockusBlocks.PURPLE_STONE_BRICKS.wall);
            entries.add(BlockusBlocks.MAGENTA_STONE_BRICKS.wall);
            entries.add(BlockusBlocks.PINK_STONE_BRICKS.wall);

            for (ConcreteTypes concreteTypes : ConcreteTypes.values()) {
                entries.add(concreteTypes.block);
                entries.add(concreteTypes.stairs);
                entries.add(concreteTypes.slab);
                entries.add(concreteTypes.wall);

            }

            entries.add(BlockusBlocks.WHITE_NEON);
            entries.add(BlockusBlocks.LIGHT_GRAY_NEON);
            entries.add(BlockusBlocks.GRAY_NEON);
            entries.add(BlockusBlocks.BLACK_NEON);
            entries.add(BlockusBlocks.BROWN_NEON);
            entries.add(BlockusBlocks.RED_NEON);
            entries.add(BlockusBlocks.ORANGE_NEON);
            entries.add(BlockusBlocks.YELLOW_NEON);
            entries.add(BlockusBlocks.LIME_NEON);
            entries.add(BlockusBlocks.GREEN_NEON);
            entries.add(BlockusBlocks.CYAN_NEON);
            entries.add(BlockusBlocks.LIGHT_BLUE_NEON);
            entries.add(BlockusBlocks.BLUE_NEON);
            entries.add(BlockusBlocks.PURPLE_NEON);
            entries.add(BlockusBlocks.MAGENTA_NEON);
            entries.add(BlockusBlocks.PINK_NEON);

            entries.add(BlockusBlocks.WHITE_FUTURNEO_BLOCK);
            entries.add(BlockusBlocks.LIGHT_GRAY_FUTURNEO_BLOCK);
            entries.add(BlockusBlocks.GRAY_FUTURNEO_BLOCK);
            entries.add(BlockusBlocks.GRAY_BRIGHT_FUTURNEO_BLOCK);
            entries.add(BlockusBlocks.BLACK_FUTURNEO_BLOCK);
            entries.add(BlockusBlocks.BROWN_FUTURNEO_BLOCK);
            entries.add(BlockusBlocks.RED_FUTURNEO_BLOCK);
            entries.add(BlockusBlocks.ORANGE_FUTURNEO_BLOCK);
            entries.add(BlockusBlocks.YELLOW_FUTURNEO_BLOCK);
            entries.add(BlockusBlocks.LIME_FUTURNEO_BLOCK);
            entries.add(BlockusBlocks.GREEN_FUTURNEO_BLOCK);
            entries.add(BlockusBlocks.CYAN_FUTURNEO_BLOCK);
            entries.add(BlockusBlocks.LIGHT_BLUE_FUTURNEO_BLOCK);
            entries.add(BlockusBlocks.BLUE_FUTURNEO_BLOCK);
            entries.add(BlockusBlocks.PURPLE_FUTURNEO_BLOCK);
            entries.add(BlockusBlocks.MAGENTA_FUTURNEO_BLOCK);
            entries.add(BlockusBlocks.PINK_FUTURNEO_BLOCK);
            entries.add(BlockusBlocks.RAINBOW_FUTURNEO_BLOCK);

            entries.add(BlockusBlocks.REDSTONE_LAMP_LIT);
            entries.add(BlockusBlocks.WHITE_REDSTONE_LAMP_LIT);
            entries.add(BlockusBlocks.LIGHT_GRAY_REDSTONE_LAMP_LIT);
            entries.add(BlockusBlocks.GRAY_REDSTONE_LAMP_LIT);
            entries.add(BlockusBlocks.BROWN_REDSTONE_LAMP_LIT);
            entries.add(BlockusBlocks.RED_REDSTONE_LAMP_LIT);
            entries.add(BlockusBlocks.ORANGE_REDSTONE_LAMP_LIT);
            entries.add(BlockusBlocks.YELLOW_REDSTONE_LAMP_LIT);
            entries.add(BlockusBlocks.LIME_REDSTONE_LAMP_LIT);
            entries.add(BlockusBlocks.GREEN_REDSTONE_LAMP_LIT);
            entries.add(BlockusBlocks.CYAN_REDSTONE_LAMP_LIT);
            entries.add(BlockusBlocks.LIGHT_BLUE_REDSTONE_LAMP_LIT);
            entries.add(BlockusBlocks.BLUE_REDSTONE_LAMP_LIT);
            entries.add(BlockusBlocks.PURPLE_REDSTONE_LAMP_LIT);
            entries.add(BlockusBlocks.MAGENTA_REDSTONE_LAMP_LIT);
            entries.add(BlockusBlocks.PINK_REDSTONE_LAMP_LIT);
            entries.add(BlockusBlocks.RAINBOW_LAMP_LIT);

            entries.add(BlockusBlocks.BEVELED_GLASS);
            entries.add(BlockusBlocks.TINTED_BEVELED_GLASS);
            entries.add(BlockusBlocks.WHITE_BEVELED_GLASS);
            entries.add(BlockusBlocks.LIGHT_GRAY_BEVELED_GLASS);
            entries.add(BlockusBlocks.GRAY_BEVELED_GLASS);
            entries.add(BlockusBlocks.BLACK_BEVELED_GLASS);
            entries.add(BlockusBlocks.BROWN_BEVELED_GLASS);
            entries.add(BlockusBlocks.RED_BEVELED_GLASS);
            entries.add(BlockusBlocks.ORANGE_BEVELED_GLASS);
            entries.add(BlockusBlocks.YELLOW_BEVELED_GLASS);
            entries.add(BlockusBlocks.LIME_BEVELED_GLASS);
            entries.add(BlockusBlocks.GREEN_BEVELED_GLASS);
            entries.add(BlockusBlocks.CYAN_BEVELED_GLASS);
            entries.add(BlockusBlocks.LIGHT_BLUE_BEVELED_GLASS);
            entries.add(BlockusBlocks.BLUE_BEVELED_GLASS);
            entries.add(BlockusBlocks.PURPLE_BEVELED_GLASS);
            entries.add(BlockusBlocks.MAGENTA_BEVELED_GLASS);
            entries.add(BlockusBlocks.PINK_BEVELED_GLASS);
            entries.add(BlockusBlocks.RAINBOW_BEVELED_GLASS);

            entries.add(BlockusBlocks.BEVELED_GLASS_PANE);
            entries.add(BlockusBlocks.WHITE_BEVELED_GLASS_PANE);
            entries.add(BlockusBlocks.LIGHT_GRAY_BEVELED_GLASS_PANE);
            entries.add(BlockusBlocks.GRAY_BEVELED_GLASS_PANE);
            entries.add(BlockusBlocks.BLACK_BEVELED_GLASS_PANE);
            entries.add(BlockusBlocks.BROWN_BEVELED_GLASS_PANE);
            entries.add(BlockusBlocks.RED_BEVELED_GLASS_PANE);
            entries.add(BlockusBlocks.ORANGE_BEVELED_GLASS_PANE);
            entries.add(BlockusBlocks.YELLOW_BEVELED_GLASS_PANE);
            entries.add(BlockusBlocks.LIME_BEVELED_GLASS_PANE);
            entries.add(BlockusBlocks.GREEN_BEVELED_GLASS_PANE);
            entries.add(BlockusBlocks.CYAN_BEVELED_GLASS_PANE);
            entries.add(BlockusBlocks.LIGHT_BLUE_BEVELED_GLASS_PANE);
            entries.add(BlockusBlocks.BLUE_BEVELED_GLASS_PANE);
            entries.add(BlockusBlocks.PURPLE_BEVELED_GLASS_PANE);
            entries.add(BlockusBlocks.MAGENTA_BEVELED_GLASS_PANE);
            entries.add(BlockusBlocks.PINK_BEVELED_GLASS_PANE);
            entries.add(BlockusBlocks.RAINBOW_BEVELED_GLASS_PANE);

            entries.add(BlockusBlocks.WHITE_COLORED_TILES);
            entries.add(BlockusBlocks.LIGHT_GRAY_COLORED_TILES);
            entries.add(BlockusBlocks.GRAY_COLORED_TILES);
            entries.add(BlockusBlocks.BLACK_COLORED_TILES);
            entries.add(BlockusBlocks.BROWN_COLORED_TILES);
            entries.add(BlockusBlocks.RED_COLORED_TILES);
            entries.add(BlockusBlocks.ORANGE_COLORED_TILES);
            entries.add(BlockusBlocks.YELLOW_COLORED_TILES);
            entries.add(BlockusBlocks.LIME_COLORED_TILES);
            entries.add(BlockusBlocks.GREEN_COLORED_TILES);
            entries.add(BlockusBlocks.CYAN_COLORED_TILES);
            entries.add(BlockusBlocks.LIGHT_BLUE_COLORED_TILES);
            entries.add(BlockusBlocks.BLUE_COLORED_TILES);
            entries.add(BlockusBlocks.PURPLE_COLORED_TILES);
            entries.add(BlockusBlocks.MAGENTA_COLORED_TILES);
            entries.add(BlockusBlocks.PINK_COLORED_TILES);

            entries.add(BlockusBlocks.ORANGE_WHITE_COLORED_TILES);
            entries.add(BlockusBlocks.MAGENTA_WHITE_COLORED_TILES);
            entries.add(BlockusBlocks.LIGHT_BLUE_WHITE_COLORED_TILES);
            entries.add(BlockusBlocks.YELLOW_WHITE_COLORED_TILES);
            entries.add(BlockusBlocks.LIME_WHITE_COLORED_TILES);
            entries.add(BlockusBlocks.PINK_WHITE_COLORED_TILES);
            entries.add(BlockusBlocks.GRAY_WHITE_COLORED_TILES);
            entries.add(BlockusBlocks.LIGHT_GRAY_WHITE_COLORED_TILES);
            entries.add(BlockusBlocks.CYAN_WHITE_COLORED_TILES);
            entries.add(BlockusBlocks.PURPLE_WHITE_COLORED_TILES);
            entries.add(BlockusBlocks.BLUE_WHITE_COLORED_TILES);
            entries.add(BlockusBlocks.BROWN_WHITE_COLORED_TILES);
            entries.add(BlockusBlocks.GREEN_WHITE_COLORED_TILES);
            entries.add(BlockusBlocks.RED_WHITE_COLORED_TILES);
            entries.add(BlockusBlocks.BLACK_WHITE_COLORED_TILES);
            entries.add(BlockusBlocks.GRAY_LIGHT_GRAY_COLORED_TILES);
            entries.add(BlockusBlocks.BLACK_GRAY_COLORED_TILES);
            entries.add(BlockusBlocks.BLACK_RED_COLORED_TILES);
            entries.add(BlockusBlocks.BLACK_BLUE_COLORED_TILES);
            entries.add(BlockusBlocks.MAGENTA_BLACK_COLORED_TILES);
            entries.add(BlockusBlocks.PINK_MAGENTA_COLORED_TILES);
            entries.add(BlockusBlocks.PURPLE_ORANGE_COLORED_TILES);
            entries.add(BlockusBlocks.PURPLE_BLUE_COLORED_TILES);
            entries.add(BlockusBlocks.GREEN_ORANGE_COLORED_TILES);
            entries.add(BlockusBlocks.GREEN_BROWN_COLORED_TILES);
            entries.add(BlockusBlocks.LIME_YELLOW_COLORED_TILES);
            entries.add(BlockusBlocks.LIGHT_BLUE_YELLOW_COLORED_TILES);
            entries.add(BlockusBlocks.BLUE_CYAN_COLORED_TILES);
            entries.add(BlockusBlocks.RED_BLUE_COLORED_TILES);
            entries.add(BlockusBlocks.RAINBOW_COLORED_TILES);

            entries.add(BlockusBlocks.WHITE_PATTERNED_WOOL);
            entries.add(BlockusBlocks.LIGHT_GRAY_PATTERNED_WOOL);
            entries.add(BlockusBlocks.GRAY_PATTERNED_WOOL);
            entries.add(BlockusBlocks.BLACK_PATTERNED_WOOL);
            entries.add(BlockusBlocks.BROWN_PATTERNED_WOOL);
            entries.add(BlockusBlocks.RED_PATTERNED_WOOL);
            entries.add(BlockusBlocks.ORANGE_PATTERNED_WOOL);
            entries.add(BlockusBlocks.YELLOW_PATTERNED_WOOL);
            entries.add(BlockusBlocks.LIME_PATTERNED_WOOL);
            entries.add(BlockusBlocks.GREEN_PATTERNED_WOOL);
            entries.add(BlockusBlocks.CYAN_PATTERNED_WOOL);
            entries.add(BlockusBlocks.LIGHT_BLUE_PATTERNED_WOOL);
            entries.add(BlockusBlocks.BLUE_PATTERNED_WOOL);
            entries.add(BlockusBlocks.PURPLE_PATTERNED_WOOL);
            entries.add(BlockusBlocks.MAGENTA_PATTERNED_WOOL);
            entries.add(BlockusBlocks.PINK_PATTERNED_WOOL);
        }
    };
}
