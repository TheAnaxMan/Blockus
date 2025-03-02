package com.brand.blockus.registry.content;

import com.brand.blockus.blocks.base.*;
import com.brand.blockus.blocks.base.amethyst.AmethystLampBlock;
import com.brand.blockus.blocks.base.amethyst.AmethystPillarBlock;
import com.brand.blockus.blocks.base.asphalt.RainbowAsphalt;
import com.brand.blockus.blocks.base.redstone.FallingRedstoneBlock;
import com.brand.blockus.blocks.base.redstone.RedstoneLantern;
import com.brand.blockus.blocks.base.redstone.RedstonePumpkinBlock;
import com.brand.blockus.blocks.generator.BlockusSaplingGenerator;
import com.brand.blockus.registry.content.bundles.*;
import com.brand.blockus.registry.content.bundles.CopperBundle.OxidationType;
import com.brand.blockus.utils.BlockFactory;
import net.minecraft.block.*;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.ColorCode;
import net.minecraft.util.DyeColor;

public class BlockusBlocks extends BlockFactory {

    // Stone
    public static final BSSWBundle STONE_TILES = new BSSWBundle("stone_tiles", Blocks.STONE_BRICKS);
    public static final Block STONE_BRICK_PILLAR = registerPillar(Blocks.STONE_BRICKS);
    public static final Block HERRINGBONE_STONE_BRICKS = register("herringbone_stone_bricks", createCopy(Blocks.STONE_BRICKS));
    public static final Block STONE_CIRCULAR_PAVING = register("stone_circular_paving", OrientableBlockBase::new, createCopy(Blocks.STONE_BRICKS));
    public static final Block STONE_DOOR = stoneDoor("stone_door", 1.5f, 20.0f, BlockSoundGroup.STONE, MapColor.STONE_GRAY, BlockSetType.STONE);
    public static final Block STONE_TRAPDOOR = stoneTrapdoor("stone_trapdoor", 1.5f, 20.0f, BlockSoundGroup.STONE, MapColor.STONE_GRAY, BlockSetType.STONE);
    public static final Block SMOOTH_STONE_STAIRS = registerStairs(Blocks.SMOOTH_STONE);
    public static final Block STURDY_STONE = register("sturdy_stone", createCopy(Blocks.COBBLESTONE, PistonBehavior.BLOCK));

    // Andesite
    public static final BSSWBundle ANDESITE_BRICKS = new BSSWBundle("andesite_bricks", Blocks.POLISHED_ANDESITE);
    public static final Block CRACKED_ANDESITE_BRICKS = register("cracked_andesite_bricks", createCopy(BlockusBlocks.ANDESITE_BRICKS.block));
    public static final Block CHISELED_ANDESITE_BRICKS = register("chiseled_andesite_bricks", createCopy(BlockusBlocks.ANDESITE_BRICKS.block));
    public static final Block POLISHED_ANDESITE_PILLAR = registerPillar(Blocks.POLISHED_ANDESITE);
    public static final Block HERRINGBONE_ANDESITE_BRICKS = register("herringbone_andesite_bricks", createCopy(BlockusBlocks.ANDESITE_BRICKS.block));
    public static final Block ANDESITE_CIRCULAR_PAVING = register("andesite_circular_paving", OrientableBlockBase::new, createCopy(BlockusBlocks.ANDESITE_BRICKS.block));

    // Diorite
    public static final BSSWBundle DIORITE_BRICKS = new BSSWBundle("diorite_bricks", Blocks.POLISHED_DIORITE);
    public static final Block CRACKED_DIORITE_BRICKS = register("cracked_diorite_bricks", createCopy(BlockusBlocks.DIORITE_BRICKS.block));
    public static final Block CHISELED_DIORITE_BRICKS = register("chiseled_diorite_bricks", createCopy(BlockusBlocks.DIORITE_BRICKS.block));
    public static final Block POLISHED_DIORITE_PILLAR = registerPillar(Blocks.POLISHED_DIORITE);
    public static final Block HERRINGBONE_DIORITE_BRICKS = register("herringbone_diorite_bricks", createCopy(BlockusBlocks.DIORITE_BRICKS.block));
    public static final Block DIORITE_CIRCULAR_PAVING = register("diorite_circular_paving", OrientableBlockBase::new, createCopy(BlockusBlocks.DIORITE_BRICKS.block));

    // Granite
    public static final BSSWBundle GRANITE_BRICKS = new BSSWBundle("granite_bricks", Blocks.POLISHED_GRANITE);
    public static final Block CRACKED_GRANITE_BRICKS = register("cracked_granite_bricks", createCopy(BlockusBlocks.GRANITE_BRICKS.block));
    public static final Block CHISELED_GRANITE_BRICKS = register("chiseled_granite_bricks", createCopy(BlockusBlocks.GRANITE_BRICKS.block));
    public static final Block POLISHED_GRANITE_PILLAR = registerPillar(Blocks.POLISHED_GRANITE);
    public static final Block HERRINGBONE_GRANITE_BRICKS = register("herringbone_granite_bricks", createCopy(BlockusBlocks.GRANITE_BRICKS.block));
    public static final Block GRANITE_CIRCULAR_PAVING = register("granite_circular_paving", OrientableBlockBase::new, createCopy(BlockusBlocks.GRANITE_BRICKS.block));

    // Mud
    public static final Block CHISELED_MUD_BRICKS = register("chiseled_mud_bricks", createCopy(Blocks.MUD_BRICKS));
    public static final Block MUD_BRICK_PILLAR = registerPillar(Blocks.MUD_BRICKS);

    // Dripstone
    public static final BSSWBundle POLISHED_DRIPSTONE = new BSSWBundle("polished_dripstone", Blocks.DRIPSTONE_BLOCK, false);
    public static final BSSWBundle DRIPSTONE_BRICKS = new BSSWBundle("dripstone_bricks", BlockusBlocks.POLISHED_DRIPSTONE.block);
    public static final BSSWBundle MOSSY_DRIPSTONE_BRICKS = new BSSWBundle("mossy_dripstone_bricks", BlockusBlocks.DRIPSTONE_BRICKS.block);
    public static final Block CRACKED_DRIPSTONE_BRICKS = register("cracked_dripstone_bricks", createCopy(BlockusBlocks.DRIPSTONE_BRICKS.block));
    public static final Block CHISELED_DRIPSTONE = register("chiseled_dripstone", createCopy(BlockusBlocks.DRIPSTONE_BRICKS.block));
    public static final Block DRIPSTONE_PILLAR = registerPillar("dripstone", BlockusBlocks.DRIPSTONE_BRICKS.block);

    // Tuff
    public static final BSSWBundle MOSSY_TUFF_BRICKS = new BSSWBundle("mossy_tuff_bricks", Blocks.TUFF_BRICKS);
    public static final BSSWBundle TUFF_TILES = new BSSWBundle("tuff_tiles", Blocks.TUFF_BRICKS);
    public static final Block CRACKED_TUFF_BRICKS = register("cracked_tuff_bricks", createCopy(Blocks.TUFF_BRICKS));
    public static final Block CARVED_TUFF_BRICKS = register("carved_tuff_bricks", createCopy(Blocks.TUFF_BRICKS));
    public static final Block HERRINGBONE_TUFF_BRICKS = register("herringbone_tuff_bricks", createCopy(Blocks.TUFF_BRICKS));
    public static final Block TUFF_CIRCULAR_PAVING = register("tuff_circular_paving", OrientableBlockBase::new, createCopy(Blocks.TUFF_BRICKS));
    public static final Block TUFF_PILLAR = registerPillar("tuff", Blocks.POLISHED_TUFF);

    // Deepslate
    public static final BSSWBundle MOSSY_DEEPSLATE_BRICKS = new BSSWBundle("mossy_deepslate_bricks", Blocks.DEEPSLATE_BRICKS);
    public static final Block DEEPSLATE_PILLAR = registerPillar("deepslate", Blocks.POLISHED_DEEPSLATE);
    public static final Block HERRINGBONE_DEEPSLATE_BRICKS = register("herringbone_deepslate_bricks", createCopy(Blocks.DEEPSLATE_BRICKS));
    public static final Block DEEPSLATE_CIRCULAR_PAVING = register("deepslate_circular_paving", OrientableBlockBase::new, createCopy(Blocks.DEEPSLATE_BRICKS));
    public static final Block STURDY_DEEPSLATE = register("sturdy_deepslate", createCopy(Blocks.COBBLED_DEEPSLATE).pistonBehavior(PistonBehavior.BLOCK));

    // Sculk
    public static final BSSWBundle POLISHED_SCULK = new BSSWBundle("polished_sculk", Blocks.POLISHED_DEEPSLATE, MapColor.CYAN, false);
    public static final BSSWBundle SCULK_BRICKS = new BSSWBundle("sculk_bricks", BlockusBlocks.POLISHED_SCULK.block);
    public static final Block CHISELED_SCULK_BRICKS = register("chiseled_sculk_bricks", createCopy(BlockusBlocks.SCULK_BRICKS.block));
    public static final Block SCULK_PILLAR = registerPillar("sculk", BlockusBlocks.SCULK_BRICKS.block);

    // Amethyst
    public static final BSSWBundle POLISHED_AMETHYST = new BSSWBundle("polished_amethyst", Blocks.AMETHYST_BLOCK, false);
    public static final BSSWBundle AMETHYST_BRICKS = new BSSWBundle("amethyst_bricks", POLISHED_AMETHYST.block);
    public static final Block CHISELED_AMETHYST = register("chiseled_amethyst", AmethystBlock::new, createCopy(AMETHYST_BRICKS.block));
    public static final Block AMETHYST_PILLAR = register("amethyst_pillar", AmethystPillarBlock::new, createCopy(AMETHYST_BRICKS.block));

    // Blackstone
    public static final BSSWBundle POLISHED_BLACKSTONE_TILES = new BSSWBundle("polished_blackstone_tiles", Blocks.POLISHED_BLACKSTONE_BRICKS);
    public static final BSSWBundle CRIMSON_WARTY_BLACKSTONE_BRICKS = new BSSWBundle("crimson_warty_blackstone_bricks", Blocks.POLISHED_BLACKSTONE);
    public static final BSSWBundle WARPED_WARTY_BLACKSTONE_BRICKS = new BSSWBundle("warped_warty_blackstone_bricks", Blocks.POLISHED_BLACKSTONE);
    public static final Block POLISHED_BLACKSTONE_PILLAR = registerPillar(Blocks.POLISHED_BLACKSTONE);
    public static final Block HERRINGBONE_POLISHED_BLACKSTONE_BRICKS = register("herringbone_polished_blackstone_bricks", createCopy(Blocks.POLISHED_BLACKSTONE));
    public static final Block POLISHED_BLACKSTONE_CIRCULAR_PAVING = register("polished_blackstone_circular_paving", OrientableBlockBase::new, createCopy(Blocks.POLISHED_BLACKSTONE));
    public static final Block GOLD_DECORATED_POLISHED_BLACKSTONE = register("gold_decorated_polished_blackstone", createCopy(Blocks.POLISHED_BLACKSTONE));
    public static final Block STURDY_BLACKSTONE = register("sturdy_blackstone", createCopy(Blocks.BLACKSTONE, PistonBehavior.BLOCK));
    public static final Block BLACKSTONE_DOOR = stoneDoor("blackstone_door", 1.5f, 6.0f, BlockSoundGroup.STONE, MapColor.BLACK, BlockSetType.STONE);
    public static final Block BLACKSTONE_TRAPDOOR = stoneTrapdoor("blackstone_trapdoor", 1.5f, 6.0f, BlockSoundGroup.STONE, MapColor.BLACK, BlockSetType.STONE);

    // Basalt
    public static final BSSWBundle ROUGH_BASALT = new BSSWBundle("rough_basalt", Blocks.BASALT, false);
    public static final BSSWBundle POLISHED_BASALT_BRICKS = new BSSWBundle("polished_basalt_bricks", Blocks.POLISHED_BASALT);
    public static final Block CRACKED_POLISHED_BASALT_BRICKS = register("cracked_polished_basalt_bricks", createCopy(BlockusBlocks.POLISHED_BASALT_BRICKS.block));
    public static final Block CHISELED_POLISHED_BASALT = register("chiseled_polished_basalt", createCopy(BlockusBlocks.POLISHED_BASALT_BRICKS.block));
    public static final Block POLISHED_BASALT_PILLAR = registerPillar("polished_basalt", BlockusBlocks.POLISHED_BASALT_BRICKS.block);
    public static final Block HERRINGBONE_POLISHED_BASALT_BRICKS = register("herringbone_polished_basalt_bricks", createCopy(BlockusBlocks.POLISHED_BASALT_BRICKS.block));
    public static final Block POLISHED_BASALT_CIRCULAR_PAVING = register("polished_basalt_circular_paving", OrientableBlockBase::new, createCopy(BlockusBlocks.POLISHED_BASALT_BRICKS.block));

    // Wart Blocks
    public static final BSSWBundle CRIMSON_WART_BRICKS = new BSSWBundle("crimson_wart_bricks", Blocks.NETHER_WART_BLOCK, BlockSoundGroup.NETHER_BRICKS);
    public static final BSSWBundle WARPED_WART_BRICKS = new BSSWBundle("warped_wart_bricks", Blocks.WARPED_WART_BLOCK, BlockSoundGroup.NETHER_BRICKS);

    // Limestone
    public static final BSSWBundle LIMESTONE = new BSSWBundle("limestone", Blocks.STONE, MapColor.OAK_TAN);
    public static final BSSWBundle POLISHED_LIMESTONE = new BSSWBundle("polished_limestone", BlockusBlocks.LIMESTONE.block, false);
    public static final BSSWBundle LIMESTONE_BRICKS = new BSSWBundle("limestone_bricks", LIMESTONE.block);
    public static final BSSWBundle SMALL_LIMESTONE_BRICKS = new BSSWBundle("small_limestone_bricks", LIMESTONE_BRICKS.block);
    public static final BSSWBundle LIMESTONE_TILES = new BSSWBundle("limestone_tiles", LIMESTONE_BRICKS.block);
    public static final Block CHISELED_LIMESTONE = register("chiseled_limestone", createCopy(BlockusBlocks.LIMESTONE_BRICKS.block));
    public static final Block CHISELED_LIMESTONE_PILLAR = registerPillar(BlockusBlocks.CHISELED_LIMESTONE);
    public static final Block LIMESTONE_SQUARES = register("limestone_squares", createCopy(BlockusBlocks.LIMESTONE_BRICKS.block));
    public static final Block LIMESTONE_CIRCULAR_PAVING = register("limestone_circular_paving", OrientableBlockBase::new, createCopy(BlockusBlocks.LIMESTONE_BRICKS.block));
    public static final Block LIMESTONE_LINES = registerPillar2("limestone_lines", BlockusBlocks.LIMESTONE_BRICKS.block);
    public static final Block LIMESTONE_PILLAR = registerPillar(BlockusBlocks.LIMESTONE.block);

    // Marble
    public static final BSSWBundle MARBLE = new BSSWBundle("marble", Blocks.STONE, MapColor.OFF_WHITE);
    public static final BSSWBundle POLISHED_MARBLE = new BSSWBundle("polished_marble", BlockusBlocks.MARBLE.block, false);
    public static final BSSWBundle MARBLE_BRICKS = new BSSWBundle("marble_bricks", MARBLE.block);
    public static final BSSWBundle SMALL_MARBLE_BRICKS = new BSSWBundle("small_marble_bricks", MARBLE_BRICKS.block);
    public static final BSSWBundle MARBLE_TILES = new BSSWBundle("marble_tiles", MARBLE_BRICKS.block);
    public static final Block CHISELED_MARBLE = register("chiseled_marble", createCopy(BlockusBlocks.MARBLE_BRICKS.block));
    public static final Block CHISELED_MARBLE_PILLAR = registerPillar(BlockusBlocks.CHISELED_MARBLE);
    public static final Block MARBLE_SQUARES = register("marble_squares", createCopy(BlockusBlocks.MARBLE_BRICKS.block));
    public static final Block MARBLE_CIRCULAR_PAVING = register("marble_circular_paving", OrientableBlockBase::new, createCopy(BlockusBlocks.MARBLE_BRICKS.block));
    public static final Block MARBLE_LINES = registerPillar2("marble_lines", BlockusBlocks.MARBLE_BRICKS.block);
    public static final Block MARBLE_PILLAR = registerPillar(BlockusBlocks.MARBLE.block);

    // Bluestone
    public static final BSSWBundle BLUESTONE = new BSSWBundle("bluestone", Blocks.STONE, MapColor.CYAN);
    public static final BSSWBundle POLISHED_BLUESTONE = new BSSWBundle("polished_bluestone", BlockusBlocks.BLUESTONE.block, false);
    public static final BSSWBundle BLUESTONE_BRICKS = new BSSWBundle("bluestone_bricks", BLUESTONE.block);
    public static final BSSWBundle SMALL_BLUESTONE_BRICKS = new BSSWBundle("small_bluestone_bricks", BLUESTONE_BRICKS.block);
    public static final BSSWBundle BLUESTONE_TILES = new BSSWBundle("bluestone_tiles", BLUESTONE_BRICKS.block);
    public static final Block CHISELED_BLUESTONE = register("chiseled_bluestone", createCopy(BlockusBlocks.BLUESTONE_BRICKS.block));
    public static final Block CHISELED_BLUESTONE_PILLAR = registerPillar(BlockusBlocks.CHISELED_BLUESTONE);
    public static final Block BLUESTONE_SQUARES = register("bluestone_squares", createCopy(BlockusBlocks.BLUESTONE_BRICKS.block));
    public static final Block BLUESTONE_CIRCULAR_PAVING = register("bluestone_circular_paving", OrientableBlockBase::new, createCopy(BlockusBlocks.BLUESTONE_BRICKS.block));
    public static final Block BLUESTONE_LINES = registerPillar2("bluestone_lines", BlockusBlocks.BLUESTONE_BRICKS.block);
    public static final Block BLUESTONE_PILLAR = registerPillar(BlockusBlocks.BLUESTONE.block);

    // Viridite
    public static final BSSWBundle VIRIDITE = new BSSWBundle("viridite", Blocks.DEEPSLATE, MapColor.DARK_GREEN);
    public static final BSSWBundle POLISHED_VIRIDITE = new BSSWBundle("polished_viridite", BlockusBlocks.VIRIDITE.block, false);
    public static final BSSWBundle VIRIDITE_BRICKS = new BSSWBundle("viridite_bricks", VIRIDITE.block);
    public static final BSSWBundle SMALL_VIRIDITE_BRICKS = new BSSWBundle("small_viridite_bricks", VIRIDITE_BRICKS.block);
    public static final BSSWBundle VIRIDITE_TILES = new BSSWBundle("viridite_tiles", VIRIDITE_BRICKS.block);
    public static final Block CHISELED_VIRIDITE = register("chiseled_viridite", createCopy(BlockusBlocks.VIRIDITE_BRICKS.block));
    public static final Block CHISELED_VIRIDITE_PILLAR = registerPillar(BlockusBlocks.CHISELED_VIRIDITE);
    public static final Block VIRIDITE_SQUARES = register("viridite_squares", createCopy(BlockusBlocks.VIRIDITE_BRICKS.block));
    public static final Block VIRIDITE_CIRCULAR_PAVING = register("viridite_circular_paving", OrientableBlockBase::new, createCopy(BlockusBlocks.VIRIDITE_BRICKS.block));
    public static final Block VIRIDITE_LINES = registerPillar2("viridite_lines", BlockusBlocks.VIRIDITE_BRICKS.block);
    public static final Block VIRIDITE_PILLAR = registerPillar(BlockusBlocks.VIRIDITE.block);

    // Lava	Bricks
    public static final BSSWBundle LAVA_BRICKS = new BSSWBundle("lava_bricks", Blocks.STONE_BRICKS, 15);
    public static final Block CHISELED_LAVA_BRICKS = register("chiseled_lava_bricks", createCopy(BlockusBlocks.LAVA_BRICKS.block));

    // Lava Blackstone Bricks
    public static final BSSWBundle LAVA_POLISHED_BLACKSTONE_BRICKS = new BSSWBundle("lava_polished_blackstone_bricks", Blocks.POLISHED_BLACKSTONE_BRICKS, 15);
    public static final Block CHISELED_LAVA_POLISHED_BLACKSTONE = register("chiseled_lava_polished_blackstone", createCopy(BlockusBlocks.LAVA_POLISHED_BLACKSTONE_BRICKS.block));

    // Water Bricks
    public static final BSSWBundle WATER_BRICKS = new BSSWBundle("water_bricks", Blocks.STONE_BRICKS);
    public static final Block CHISELED_WATER_BRICKS = register("chiseled_water_bricks", createCopy(BlockusBlocks.WATER_BRICKS.block));

    // Snow Bricks
    public static final BSSWBundle SNOW_BRICKS = new BSSWBundle("snow_bricks", Blocks.STONE_BRICKS, 1.0f, 3.0f, MapColor.WHITE);
    public static final Block SNOW_PILLAR = registerPillar("snow", SNOW_BRICKS.block);

    // Ice Bricks
    public static final Block ICE_BRICKS = register("ice_bricks", create().mapColor(MapColor.PALE_PURPLE).slipperiness(0.98F).strength(0.5F).sounds(BlockSoundGroup.GLASS));
    public static final Block ICE_BRICK_WALL = registerWall(ICE_BRICKS);
    public static final Block ICE_PILLAR = registerPillar("ice", ICE_BRICKS);

    // Obsidian
    public static final BSSWBundle OBSIDIAN_BRICKS = new BSSWBundle("obsidian_bricks", Blocks.OBSIDIAN, PistonBehavior.BLOCK);
    public static final BSSWBundle SMALL_OBSIDIAN_BRICKS = new BSSWBundle("small_obsidian_bricks", OBSIDIAN_BRICKS.block);
    public static final Block CRACKED_OBSIDIAN_BRICKS = register("cracked_obsidian_bricks", createCopy(BlockusBlocks.OBSIDIAN_BRICKS.block));
    public static final Block OBSIDIAN_PILLAR = registerPillar("obsidian", BlockusBlocks.OBSIDIAN_BRICKS.block);
    public static final Block OBSIDIAN_CIRCULAR_PAVING = register("obsidian_circular_paving", OrientableBlockBase::new, createCopy(BlockusBlocks.OBSIDIAN_BRICKS.block));
    public static final Block OBSIDIAN_REINFORCED_DOOR = stoneDoor("obsidian_reinforced_door", 50.0F, 1200.0F, BlockSoundGroup.STONE, MapColor.BLACK, BlockSetType.IRON);
    public static final Block OBSIDIAN_REINFORCED_TRAPDOOR = stoneTrapdoor("obsidian_reinforced_trapdoor", 50.0F, 1200.0F, BlockSoundGroup.STONE, MapColor.BLACK, BlockSetType.IRON);
    public static final Block GLOWING_OBSIDIAN = register("glowing_obsidian", createCopy(Blocks.OBSIDIAN, PistonBehavior.BLOCK).luminance((state) -> 15));

    // Netherrack
    public static final BSSWBundle POLISHED_NETHERRACK = new BSSWBundle("polished_netherrack", Blocks.NETHERRACK, false);
    public static final BSSWBundle NETHERRACK_BRICKS = new BSSWBundle("netherrack_bricks", Blocks.NETHERRACK);
    public static final Block NETHERRACK_CIRCULAR_PAVING = register("netherrack_circular_paving", OrientableBlockBase::new, createCopy(BlockusBlocks.POLISHED_NETHERRACK.block));

    // Quartz Blocks
    public static final BSSWBundle QUARTZ_TILES = new BSSWBundle("quartz_tiles", Blocks.QUARTZ_BLOCK);
    public static final Block QUARTZ_CIRCULAR_PAVING = register("quartz_circular_paving", OrientableBlockBase::new, createCopy(BlockusBlocks.QUARTZ_TILES.block));

    // Magma Bricks
    public static final BSSWBundle MAGMA_BRICKS = new BSSWBundle("magma_bricks", Blocks.MAGMA_BLOCK, 15);
    public static final BSSWBundle SMALL_MAGMA_BRICKS = new BSSWBundle("small_magma_bricks", Blocks.MAGMA_BLOCK, 15);
    public static final Block CHISELED_MAGMA_BRICKS = register("chiseled_magma_bricks", createCopy(BlockusBlocks.MAGMA_BRICKS.block));

    // Blaze Bricks
    public static final BSSWBundle BLAZE_BRICKS = new BSSWBundle("blaze_bricks", Blocks.NETHER_BRICKS, 15);
    public static final Block BLAZE_PILLAR = registerPillar("blaze", BlockusBlocks.BLAZE_BRICKS.block);
    public static final Block BLAZE_LANTERN = register("blaze_lantern", createLampBlock(0.3F, 0.3F, BlockSoundGroup.GLASS, 15, MapColor.ORANGE));

    // Nether Bricks
    public static final BSSWBundle POLISHED_NETHER_BRICKS = new BSSWBundle("polished_nether_bricks", Blocks.NETHER_BRICKS, false);
    public static final BSSWBundle POLISHED_RED_NETHER_BRICKS = new BSSWBundle("polished_red_nether_bricks", Blocks.RED_NETHER_BRICKS, false);
    public static final Block HERRINGBONE_NETHER_BRICKS = register("herringbone_nether_bricks", createCopy(Blocks.NETHER_BRICKS));
    public static final Block HERRINGBONE_RED_NETHER_BRICKS = register("herringbone_red_nether_bricks", createCopy(Blocks.RED_NETHER_BRICKS));
    public static final Block NETHER_BRICK_PILLAR = registerPillar(Blocks.NETHER_BRICKS);
    public static final Block RED_NETHER_BRICK_PILLAR = registerPillar(Blocks.RED_NETHER_BRICKS);
    public static final BSSWBundle NETHER_TILES = new BSSWBundle("nether_tiles", Blocks.NETHER_BRICKS);

    // Charred Nether Bricks
    public static final BSSWBundle CHARRED_NETHER_BRICKS = new BSSWBundle("charred_nether_bricks", Blocks.NETHER_BRICKS, MapColor.BLACK);
    public static final BSSWBundle POLISHED_CHARRED_NETHER_BRICKS = new BSSWBundle("polished_charred_nether_bricks", BlockusBlocks.CHARRED_NETHER_BRICKS.block, false);
    public static final Block HERRINGBONE_CHARRED_NETHER_BRICKS = register("herringbone_charred_nether_bricks", createCopy(BlockusBlocks.CHARRED_NETHER_BRICKS.block));
    public static final Block CHARRED_NETHER_BRICK_PILLAR = registerPillar(BlockusBlocks.CHARRED_NETHER_BRICKS.block);

    // Teal Nether Bricks
    public static final BSSWBundle TEAL_NETHER_BRICKS = new BSSWBundle("teal_nether_bricks", Blocks.NETHER_BRICKS, MapColor.CYAN);
    public static final BSSWBundle POLISHED_TEAL_NETHER_BRICKS = new BSSWBundle("polished_teal_nether_bricks", BlockusBlocks.TEAL_NETHER_BRICKS.block, false);
    public static final Block HERRINGBONE_TEAL_NETHER_BRICKS = register("herringbone_teal_nether_bricks", createCopy(BlockusBlocks.TEAL_NETHER_BRICKS.block));
    public static final Block TEAL_NETHER_BRICK_PILLAR = registerPillar(BlockusBlocks.TEAL_NETHER_BRICKS.block);

    // Prismarine
    public static final Block CHISELED_PRISMARINE = register("chiseled_prismarine", createCopy(Blocks.PRISMARINE_BRICKS));
    public static final Block PRISMARINE_PILLAR = registerPillar("prismarine", Blocks.PRISMARINE_BRICKS);
    public static final Block PRISMARINE_CIRCULAR_PAVING = register("prismarine_circular_paving", OrientableBlockBase::new, createCopy(Blocks.PRISMARINE_BRICKS));
    public static final Block CHISELED_DARK_PRISMARINE = register("chiseled_dark_prismarine", OrientableBlockBase::new, createCopy(Blocks.DARK_PRISMARINE));
    public static final Block DARK_PRISMARINE_PILLAR = registerPillar("dark_prismarine", Blocks.DARK_PRISMARINE);
    public static final BSSWBundle PRISMARINE_TILES = new BSSWBundle("prismarine_tiles", Blocks.DARK_PRISMARINE);

    // Bricks
    public static final BSSWBundle LARGE_BRICKS = new BSSWBundle("large_bricks", Blocks.BRICKS);
    public static final Block HERRINGBONE_BRICKS = register("herringbone_bricks", createCopy(Blocks.BRICKS));

    // Soaked Bricks
    public static final BSSWBundle SOAKED_BRICKS = new BSSWBundle("soaked_bricks", Blocks.BRICKS);
    public static final Block HERRINGBONE_SOAKED_BRICKS = register("herringbone_soaked_bricks", createCopy(BlockusBlocks.SOAKED_BRICKS.block));

    // Charred Bricks
    public static final BSSWBundle CHARRED_BRICKS = new BSSWBundle("charred_bricks", Blocks.BRICKS);
    public static final Block HERRINGBONE_CHARRED_BRICKS = register("herringbone_charred_bricks", createCopy(BlockusBlocks.CHARRED_BRICKS.block));

    // Sandy Bricks
    public static final BSSWBundle SANDY_BRICKS = new BSSWBundle("sandy_bricks", Blocks.BRICKS);
    public static final Block HERRINGBONE_SANDY_BRICKS = register("herringbone_sandy_bricks", createCopy(BlockusBlocks.SANDY_BRICKS.block));

    // Resin Bricks
    public static final BSSWBundle LARGE_RESIN_BRICKS = new BSSWBundle("large_resin_bricks", Blocks.RESIN_BRICKS);
    public static final Block HERRINGBONE_RESIN_BRICKS = register("herringbone_resin_bricks", createCopy(Blocks.RESIN_BRICKS));
    public static final Block RESIN_BRICK_PILLAR = registerPillar(Blocks.RESIN_BRICKS);

    // Sandstone
    public static final BSSWBundle ROUGH_SANDSTONE = new BSSWBundle("rough_sandstone", Blocks.SANDSTONE, false);
    public static final BSSWBundle SANDSTONE_BRICKS = new BSSWBundle("sandstone_bricks", Blocks.SANDSTONE);
    public static final BSSWBundle SMALL_SANDSTONE_BRICKS = new BSSWBundle("small_sandstone_bricks", Blocks.SANDSTONE);
    public static final Block SANDSTONE_PILLAR = registerPillar("sandstone", Blocks.SANDSTONE);
    public static final Block GOLD_DECORATED_SANDSTONE = register("gold_decorated_sandstone", createCopy(Blocks.SANDSTONE));
    public static final Block LAPIS_DECORATED_SANDSTONE = register("lapis_decorated_sandstone", createCopy(Blocks.SANDSTONE));

    // Red Sandstone
    public static final BSSWBundle ROUGH_RED_SANDSTONE = new BSSWBundle("rough_red_sandstone", Blocks.RED_SANDSTONE, false);
    public static final BSSWBundle RED_SANDSTONE_BRICKS = new BSSWBundle("red_sandstone_bricks", Blocks.RED_SANDSTONE);
    public static final BSSWBundle SMALL_RED_SANDSTONE_BRICKS = new BSSWBundle("small_red_sandstone_bricks", Blocks.RED_SANDSTONE);
    public static final Block RED_SANDSTONE_PILLAR = registerPillar("red_sandstone", Blocks.RED_SANDSTONE);
    public static final Block GOLD_DECORATED_RED_SANDSTONE = register("gold_decorated_red_sandstone", createCopy(Blocks.RED_SANDSTONE));
    public static final Block LAPIS_DECORATED_RED_SANDSTONE = register("lapis_decorated_red_sandstone", createCopy(Blocks.RED_SANDSTONE));

    // Soul Sandstone
    public static final BSSWBundle SOUL_SANDSTONE = new BSSWBundle("soul_sandstone", Blocks.SANDSTONE, MapColor.BROWN);
    public static final BSSWBundle ROUGH_SOUL_SANDSTONE = new BSSWBundle("rough_soul_sandstone", BlockusBlocks.SOUL_SANDSTONE.block, false);
    public static final BSSWBundle SOUL_SANDSTONE_BRICKS = new BSSWBundle("soul_sandstone_bricks", SOUL_SANDSTONE.block);
    public static final BSSWBundle SMALL_SOUL_SANDSTONE_BRICKS = new BSSWBundle("small_soul_sandstone_bricks", SOUL_SANDSTONE.block);
    public static final BSSWBundle SMOOTH_SOUL_SANDSTONE = new BSSWBundle("smooth_soul_sandstone", BlockusBlocks.SOUL_SANDSTONE.block, false);
    public static final Block CUT_SOUL_SANDSTONE = register("cut_soul_sandstone", createCopy(BlockusBlocks.SOUL_SANDSTONE.block));
    public static final Block CUT_SOUL_SANDSTONE_SLAB = registerSlab(CUT_SOUL_SANDSTONE);
    public static final Block CHISELED_SOUL_SANDSTONE = register("chiseled_soul_sandstone", createCopy(BlockusBlocks.SOUL_SANDSTONE.block));
    public static final Block SOUL_SANDSTONE_PILLAR = registerPillar("soul_sandstone", BlockusBlocks.SOUL_SANDSTONE.block);
    public static final Block GOLD_DECORATED_SOUL_SANDSTONE = register("gold_decorated_soul_sandstone", createCopy(BlockusBlocks.SOUL_SANDSTONE.block));
    public static final Block LAPIS_DECORATED_SOUL_SANDSTONE = register("lapis_decorated_soul_sandstone", createCopy(BlockusBlocks.SOUL_SANDSTONE.block));

    // Rainbow
    public static final Block RAINBOW_ROSE = register("rainbow_rose", (settings) -> new FertilizableFlowerBlock(StatusEffects.GLOWING, 8, settings), create().mapColor(MapColor.DARK_GREEN).noCollision().breakInstantly().pistonBehavior(PistonBehavior.DESTROY).sounds(BlockSoundGroup.GRASS).offset(AbstractBlock.OffsetType.XZ));
    public static final Block RAINBOW_PETALS = register("rainbow_petal", FlowerbedBlock::new, create().mapColor(MapColor.DARK_GREEN).noCollision().sounds(BlockSoundGroup.PINK_PETALS).pistonBehavior(PistonBehavior.DESTROY));

    public static final Block POTTED_RAINBOW_ROSE = pottedPlant("potted_rainbow_rose", RAINBOW_ROSE);
    public static final Block RAINBOW_BLOCK = register("rainbow_block", FullFacingBlock::new, create().mapColor(MapColor.LIGHT_BLUE).strength(5.0f, 6.0f).requiresTool());
    public static final BSSWBundle RAINBOW_BRICKS = new BSSWBundle("rainbow_bricks", Blocks.BRICKS);
    public static final Block RAINBOW_GLOWSTONE = register("rainbow_glowstone", createCopy(Blocks.GLOWSTONE));

    // Honeycomb Bricks
    public static final BSSWBundle HONEYCOMB_BRICKS = new BSSWBundle("honeycomb_bricks", Blocks.BRICKS);

    // Purpur Blocks
    public static final BSSWBundle PURPUR_BRICKS = new BSSWBundle("purpur_bricks", Blocks.PURPUR_BLOCK);
    public static final BSSWBundle SMALL_PURPUR_BRICKS = new BSSWBundle("small_purpur_bricks", Blocks.PURPUR_BLOCK);
    public static final BSSWBundle POLISHED_PURPUR = new BSSWBundle("polished_purpur", Blocks.PURPUR_BLOCK, false);
    public static final Block CHISELED_PURPUR = register("chiseled_purpur", createCopy(BlockusBlocks.PURPUR_BRICKS.block));
    public static final Block PURPUR_SQUARES = register("purpur_squares", createCopy(BlockusBlocks.PURPUR_BRICKS.block));
    public static final Block PURPUR_LINES = registerPillar2("purpur_lines", BlockusBlocks.PURPUR_BRICKS.block);

    // Phantom Purpur Blocks
    public static final BSSWBundle PHANTOM_PURPUR_BRICKS = new BSSWBundle("phantom_purpur_bricks", Blocks.PURPUR_BLOCK);
    public static final BSSWBundle SMALL_PHANTOM_PURPUR_BRICKS = new BSSWBundle("small_phantom_purpur_bricks", Blocks.PURPUR_BLOCK);
    public static final BSSWBundle PHANTOM_PURPUR_BLOCK = new BSSWBundle("phantom_purpur_block", Blocks.PURPUR_BLOCK, false);
    public static final BSSWBundle POLISHED_PHANTOM_PURPUR = new BSSWBundle("polished_phantom_purpur", Blocks.PURPUR_BLOCK, false);
    public static final Block PHANTOM_PURPUR_PILLAR = registerPillar("phantom_purpur", Blocks.PURPUR_PILLAR);
    public static final Block CHISELED_PHANTOM_PURPUR = register("chiseled_phantom_purpur", createCopy(BlockusBlocks.PHANTOM_PURPUR_BRICKS.block));
    public static final Block PHANTOM_PURPUR_SQUARES = register("phantom_purpur_squares", createCopy(BlockusBlocks.PHANTOM_PURPUR_BRICKS.block));
    public static final Block PHANTOM_PURPUR_LINES = registerPillar2("phantom_purpur_lines", BlockusBlocks.PHANTOM_PURPUR_BRICKS.block);

    // End Stone
    public static final BSSWBundle POLISHED_END_STONE = new BSSWBundle("polished_end_stone", Blocks.END_STONE, false);
    public static final BSSWBundle SMALL_END_STONE_BRICKS = new BSSWBundle("small_end_stone_bricks", Blocks.END_STONE);
    public static final Block CHISELED_END_STONE_BRICKS = register("chiseled_end_stone_bricks", createCopy(Blocks.END_STONE_BRICKS));
    public static final Block HERRINGBONE_END_STONE_BRICKS = register("herringbone_end_stone_bricks", createCopy(Blocks.END_STONE_BRICKS));
    public static final Block CRACKED_END_STONE_BRICKS = register("cracked_end_stone_bricks", createCopy(Blocks.END_STONE_BRICKS));
    public static final Block END_STONE_PILLAR = registerPillar("end_stone", Blocks.END_STONE_BRICKS);
    public static final Block PURPUR_DECORATED_END_STONE = register("purpur_decorated_end_stone", createCopy(Blocks.END_STONE_BRICKS));
    public static final Block PHANTOM_PURPUR_DECORATED_END_STONE = register("phantom_purpur_decorated_end_stone", createCopy(Blocks.END_STONE_BRICKS));
    public static final BSSWBundle END_TILES = new BSSWBundle("end_tiles", Blocks.END_STONE_BRICKS);

    // White Oak Wood
    public static final Block WHITE_OAK_SAPLING = register("white_oak_sapling", (settings) -> new SaplingBlock(BlockusSaplingGenerator.WHITE_OAK, settings), createCopy(Blocks.OAK_SAPLING).pistonBehavior(PistonBehavior.DESTROY));
    public static final Block POTTED_WHITE_OAK_SAPLING = pottedPlant("potted_white_oak_sapling", WHITE_OAK_SAPLING);
    public static final Block WHITE_OAK_LOG = register("white_oak_log", PillarBlock::new, createCopy(Blocks.OAK_LOG).mapColor(MapColor.TERRACOTTA_LIGHT_GRAY));
    public static final Block STRIPPED_WHITE_OAK_LOG = registerPillar2("stripped_white_oak_log", WHITE_OAK_LOG);
    public static final Block WHITE_OAK_WOOD = registerPillar2("white_oak_wood", WHITE_OAK_LOG);
    public static final Block STRIPPED_WHITE_OAK_WOOD = registerPillar2("stripped_white_oak_wood", WHITE_OAK_LOG);
    public static final Block WHITE_OAK_LEAVES = register("white_oak_leaves", LeavesBlock::new, createCopy(Blocks.OAK_LEAVES).mapColor(MapColor.ORANGE).pistonBehavior(PistonBehavior.DESTROY).allowsSpawning(BlockusBlocks::canSpawnOnLeaves).suffocates(BlockusBlocks::never).blockVision(BlockusBlocks::never));
    public static final WoodBundle WHITE_OAK = new WoodBundle("white_oak", Blocks.OAK_PLANKS, MapColor.OFF_WHITE, BlockSoundGroup.WOOD);

    // Raw Bamboo
    public static final WoodBundle RAW_BAMBOO = new WoodBundle("raw_bamboo", Blocks.BAMBOO_PLANKS, MapColor.DARK_GREEN, BlockSoundGroup.BAMBOO_WOOD, WoodType.BAMBOO, BlockSetType.BAMBOO);

    // Charred
    public static final WoodBundle CHARRED = new WoodBundle("charred", Blocks.OAK_PLANKS, MapColor.TERRACOTTA_GRAY, BlockSoundGroup.WOOD, false);

    // Mosaics
    public static final BSSWBundle OAK_MOSAIC = new BSSWBundle("oak_mosaic", Blocks.OAK_PLANKS, false);
    public static final BSSWBundle SPRUCE_MOSAIC = new BSSWBundle("spruce_mosaic", Blocks.SPRUCE_PLANKS, false);
    public static final BSSWBundle BIRCH_MOSAIC = new BSSWBundle("birch_mosaic", Blocks.BIRCH_PLANKS, false);
    public static final BSSWBundle JUNGLE_MOSAIC = new BSSWBundle("jungle_mosaic", Blocks.JUNGLE_PLANKS, false);
    public static final BSSWBundle ACACIA_MOSAIC = new BSSWBundle("acacia_mosaic", Blocks.ACACIA_PLANKS, false);
    public static final BSSWBundle DARK_OAK_MOSAIC = new BSSWBundle("dark_oak_mosaic", Blocks.DARK_OAK_PLANKS, false);
    public static final BSSWBundle MANGROVE_MOSAIC = new BSSWBundle("mangrove_mosaic", Blocks.MANGROVE_PLANKS, false);
    public static final BSSWBundle CHERRY_MOSAIC = new BSSWBundle("cherry_mosaic", Blocks.CHERRY_PLANKS, false);
    public static final BSSWBundle PALE_OAK_MOSAIC = new BSSWBundle("pale_oak_mosaic", Blocks.PALE_OAK_PLANKS, false);
    public static final BSSWBundle RAW_BAMBOO_MOSAIC = new BSSWBundle("raw_bamboo_mosaic", RAW_BAMBOO.planks, false);
    public static final BSSWBundle WHITE_OAK_MOSAIC = new BSSWBundle("white_oak_mosaic", WHITE_OAK.planks, false);
    public static final BSSWBundle CRIMSON_MOSAIC = new BSSWBundle("crimson_mosaic", Blocks.CRIMSON_PLANKS, false);
    public static final BSSWBundle WARPED_MOSAIC = new BSSWBundle("warped_mosaic", Blocks.WARPED_PLANKS, false);
    public static final BSSWBundle CHARRED_MOSAIC = new BSSWBundle("charred_mosaic", CHARRED.planks, false);


    // Mossy Planks
    public static final BSSWBundle MOSSY_OAK_PLANKS = new BSSWBundle("mossy_oak_planks", Blocks.OAK_PLANKS, false);
    public static final BSSWBundle MOSSY_SPRUCE_PLANKS = new BSSWBundle("mossy_spruce_planks", Blocks.SPRUCE_PLANKS, false);
    public static final BSSWBundle MOSSY_BIRCH_PLANKS = new BSSWBundle("mossy_birch_planks", Blocks.BIRCH_PLANKS, false);
    public static final BSSWBundle MOSSY_JUNGLE_PLANKS = new BSSWBundle("mossy_jungle_planks", Blocks.JUNGLE_PLANKS, false);
    public static final BSSWBundle MOSSY_ACACIA_PLANKS = new BSSWBundle("mossy_acacia_planks", Blocks.ACACIA_PLANKS, false);
    public static final BSSWBundle MOSSY_DARK_OAK_PLANKS = new BSSWBundle("mossy_dark_oak_planks", Blocks.DARK_OAK_PLANKS, false);
    public static final BSSWBundle MOSSY_MANGROVE_PLANKS = new BSSWBundle("mossy_mangrove_planks", Blocks.MANGROVE_PLANKS, false);
    public static final BSSWBundle MOSSY_CHERRY_PLANKS = new BSSWBundle("mossy_cherry_planks", Blocks.CHERRY_PLANKS, false);
    public static final BSSWBundle MOSSY_PALE_OAK_PLANKS = new BSSWBundle("mossy_pale_oak_planks", Blocks.PALE_OAK_PLANKS, false);
    public static final BSSWBundle MOSSY_BAMBOO_PLANKS = new BSSWBundle("mossy_bamboo_planks", Blocks.BAMBOO_PLANKS, false);
    public static final BSSWBundle MOSSY_RAW_BAMBOO_PLANKS = new BSSWBundle("mossy_raw_bamboo_planks", RAW_BAMBOO.planks, false);
    public static final BSSWBundle MOSSY_WHITE_OAK_PLANKS = new BSSWBundle("mossy_white_oak_planks", WHITE_OAK.planks, false);
    public static final BSSWBundle MOSSY_CRIMSON_PLANKS = new BSSWBundle("mossy_crimson_planks", Blocks.CRIMSON_PLANKS, false);
    public static final BSSWBundle MOSSY_WARPED_PLANKS = new BSSWBundle("mossy_warped_planks", Blocks.WARPED_PLANKS, false);
    public static final BSSWBundle MOSSY_CHARRED_PLANKS = new BSSWBundle("mossy_charred_planks", CHARRED.planks, false);

    // Herringbone Planks
    public static final Block HERRINGBONE_OAK_PLANKS = register("herringbone_oak_planks", createCopy(Blocks.OAK_PLANKS));
    public static final Block HERRINGBONE_SPRUCE_PLANKS = register("herringbone_spruce_planks", createCopy(Blocks.SPRUCE_PLANKS));
    public static final Block HERRINGBONE_BIRCH_PLANKS = register("herringbone_birch_planks", createCopy(Blocks.BIRCH_PLANKS));
    public static final Block HERRINGBONE_JUNGLE_PLANKS = register("herringbone_jungle_planks", createCopy(Blocks.JUNGLE_PLANKS));
    public static final Block HERRINGBONE_ACACIA_PLANKS = register("herringbone_acacia_planks", createCopy(Blocks.ACACIA_PLANKS));
    public static final Block HERRINGBONE_DARK_OAK_PLANKS = register("herringbone_dark_oak_planks", createCopy(Blocks.DARK_OAK_PLANKS));
    public static final Block HERRINGBONE_MANGROVE_PLANKS = register("herringbone_mangrove_planks", createCopy(Blocks.MANGROVE_PLANKS));
    public static final Block HERRINGBONE_CHERRY_PLANKS = register("herringbone_cherry_planks", createCopy(Blocks.CHERRY_PLANKS));
    public static final Block HERRINGBONE_PALE_OAK_PLANKS = register("herringbone_pale_oak_planks", createCopy(Blocks.PALE_OAK_PLANKS));
    public static final Block HERRINGBONE_BAMBOO_PLANKS = register("herringbone_bamboo_planks", createCopy(Blocks.BAMBOO_PLANKS));
    public static final Block HERRINGBONE_RAW_BAMBOO_PLANKS = register("herringbone_raw_bamboo_planks", createCopy(RAW_BAMBOO.planks));
    public static final Block HERRINGBONE_WHITE_OAK_PLANKS = register("herringbone_white_oak_planks", createCopy(WHITE_OAK.planks));
    public static final Block HERRINGBONE_CRIMSON_PLANKS = register("herringbone_crimson_planks", createCopy(Blocks.CRIMSON_PLANKS));
    public static final Block HERRINGBONE_WARPED_PLANKS = register("herringbone_warped_planks", createCopy(Blocks.WARPED_PLANKS));
    public static final Block HERRINGBONE_CHARRED_PLANKS = register("herringbone_charred_planks", createCopy(CHARRED.planks));

    // Small Logs
    public static final Block OAK_SMALL_LOGS = registerPillar2("oak_small_logs", Blocks.OAK_LOG);
    public static final Block SPRUCE_SMALL_LOGS = registerPillar2("spruce_small_logs", Blocks.SPRUCE_LOG);
    public static final Block BIRCH_SMALL_LOGS = registerPillar2("birch_small_logs", Blocks.BIRCH_LOG);
    public static final Block JUNGLE_SMALL_LOGS = registerPillar2("jungle_small_logs", Blocks.JUNGLE_LOG);
    public static final Block ACACIA_SMALL_LOGS = registerPillar2("acacia_small_logs", Blocks.ACACIA_LOG);
    public static final Block DARK_OAK_SMALL_LOGS = registerPillar2("dark_oak_small_logs", Blocks.DARK_OAK_LOG);
    public static final Block MANGROVE_SMALL_LOGS = registerPillar2("mangrove_small_logs", Blocks.MANGROVE_LOG);
    public static final Block CHERRY_SMALL_LOGS = registerPillar2("cherry_small_logs", Blocks.CHERRY_LOG);
    public static final Block PALE_OAK_SMALL_LOGS = registerPillar2("pale_oak_small_logs", Blocks.PALE_OAK_LOG);
    public static final Block WHITE_OAK_SMALL_LOGS = registerPillar2("white_oak_small_logs", WHITE_OAK_LOG);
    public static final Block CRIMSON_SMALL_STEMS = registerPillar2("crimson_small_stems", Blocks.CRIMSON_STEM);
    public static final Block WARPED_SMALL_STEMS = registerPillar2("warped_small_stems", Blocks.WARPED_STEM);

    // Posts
    public static final WoodenPostBundle OAK_POST = new WoodenPostBundle("oak_post", Blocks.OAK_LOG, Blocks.STRIPPED_OAK_LOG);
    public static final WoodenPostBundle SPRUCE_POST = new WoodenPostBundle("spruce_post", Blocks.SPRUCE_LOG, Blocks.STRIPPED_SPRUCE_LOG);
    public static final WoodenPostBundle BIRCH_POST = new WoodenPostBundle("birch_post", Blocks.BIRCH_LOG, Blocks.STRIPPED_BIRCH_LOG);
    public static final WoodenPostBundle JUNGLE_POST = new WoodenPostBundle("jungle_post", Blocks.JUNGLE_LOG, Blocks.STRIPPED_JUNGLE_LOG);
    public static final WoodenPostBundle ACACIA_POST = new WoodenPostBundle("acacia_post", Blocks.ACACIA_LOG, Blocks.STRIPPED_ACACIA_LOG);
    public static final WoodenPostBundle DARK_OAK_POST = new WoodenPostBundle("dark_oak_post", Blocks.DARK_OAK_LOG, Blocks.STRIPPED_DARK_OAK_LOG);
    public static final WoodenPostBundle MANGROVE_POST = new WoodenPostBundle("mangrove_post", Blocks.MANGROVE_LOG, Blocks.STRIPPED_MANGROVE_LOG);
    public static final WoodenPostBundle CHERRY_POST = new WoodenPostBundle("cherry_post", Blocks.CHERRY_LOG, Blocks.STRIPPED_CHERRY_LOG);
    public static final WoodenPostBundle PALE_OAK_POST = new WoodenPostBundle("pale_oak_post", Blocks.PALE_OAK_LOG, Blocks.STRIPPED_PALE_OAK_LOG);
    public static final WoodenPostBundle WHITE_OAK_POST = new WoodenPostBundle("white_oak_post", WHITE_OAK_LOG, STRIPPED_WHITE_OAK_LOG, false);
    public static final WoodenPostBundle CRIMSON_POST = new WoodenPostBundle("crimson_post", Blocks.CRIMSON_STEM, Blocks.STRIPPED_CRIMSON_STEM, false);
    public static final WoodenPostBundle WARPED_POST = new WoodenPostBundle("warped_post", Blocks.WARPED_STEM, Blocks.STRIPPED_WARPED_STEM, false);

    // Timber Frames & Grates
    public static final TimberFrameBundle OAK_TIMBER_FRAME = new TimberFrameBundle(Blocks.OAK_PLANKS);
    public static final TimberFrameBundle BIRCH_TIMBER_FRAME = new TimberFrameBundle(Blocks.BIRCH_PLANKS);
    public static final TimberFrameBundle SPRUCE_TIMBER_FRAME = new TimberFrameBundle(Blocks.SPRUCE_PLANKS);
    public static final TimberFrameBundle JUNGLE_TIMBER_FRAME = new TimberFrameBundle(Blocks.JUNGLE_PLANKS);
    public static final TimberFrameBundle ACACIA_TIMBER_FRAME = new TimberFrameBundle(Blocks.ACACIA_PLANKS);
    public static final TimberFrameBundle DARK_OAK_TIMBER_FRAME = new TimberFrameBundle(Blocks.DARK_OAK_PLANKS);
    public static final TimberFrameBundle MANGROVE_TIMBER_FRAME = new TimberFrameBundle(Blocks.MANGROVE_PLANKS);
    public static final TimberFrameBundle CHERRY_TIMBER_FRAME = new TimberFrameBundle(Blocks.CHERRY_PLANKS);
    public static final TimberFrameBundle PALE_OAK_TIMBER_FRAME = new TimberFrameBundle(Blocks.PALE_OAK_PLANKS);
    public static final TimberFrameBundle BAMBOO_TIMBER_FRAME = new TimberFrameBundle(Blocks.BAMBOO_PLANKS);
    public static final TimberFrameBundle RAW_BAMBOO_TIMBER_FRAME = new TimberFrameBundle(BlockusBlocks.RAW_BAMBOO.planks);
    public static final TimberFrameBundle WHITE_OAK_TIMBER_FRAME = new TimberFrameBundle(BlockusBlocks.WHITE_OAK.planks);
    public static final TimberFrameBundle CRIMSON_TIMBER_FRAME = new TimberFrameBundle(Blocks.CRIMSON_PLANKS, false);
    public static final TimberFrameBundle WARPED_TIMBER_FRAME = new TimberFrameBundle(Blocks.WARPED_PLANKS, false);
    public static final TimberFrameBundle CHARRED_TIMBER_FRAME = new TimberFrameBundle(BlockusBlocks.CHARRED.planks, false);
    public static final Block WOODEN_FRAME = woodenPane("wooden_frame");

    // Small Hedges
    public static final Block OAK_SMALL_HEDGE = smallHedge("oak_small_hedge", Blocks.OAK_LEAVES);
    public static final Block SPRUCE_SMALL_HEDGE = smallHedge("spruce_small_hedge", Blocks.SPRUCE_LEAVES);
    public static final Block BIRCH_SMALL_HEDGE = smallHedge("birch_small_hedge", Blocks.BIRCH_LEAVES);
    public static final Block JUNGLE_SMALL_HEDGE = smallHedge("jungle_small_hedge", Blocks.JUNGLE_LEAVES);
    public static final Block ACACIA_SMALL_HEDGE = smallHedge("acacia_small_hedge", Blocks.ACACIA_LEAVES);
    public static final Block DARK_OAK_SMALL_HEDGE = smallHedge("dark_oak_small_hedge", Blocks.DARK_OAK_LEAVES);
    public static final Block MANGROVE_SMALL_HEDGE = smallHedge("mangrove_small_hedge", Blocks.MANGROVE_LEAVES);
    public static final Block CHERRY_SMALL_HEDGE = smallHedge("cherry_small_hedge", Blocks.CHERRY_LEAVES);
    public static final Block PALE_OAK_SMALL_HEDGE = smallHedge("pale_oak_small_hedge", Blocks.PALE_OAK_LEAVES);
    public static final Block WHITE_OAK_SMALL_HEDGE = smallHedge("white_oak_small_hedge", WHITE_OAK_LEAVES);
    public static final Block AZALEA_SMALL_HEDGE = smallHedge("azalea_small_hedge", Blocks.AZALEA_LEAVES);
    public static final Block FLOWERING_AZALEA_SMALL_HEDGE = smallHedge("azalea_small_hedge_flowers", Blocks.FLOWERING_AZALEA_LEAVES);
    public static final Block MOSS_SMALL_HEDGE = smallHedge("moss_small_hedge", Blocks.MOSS_BLOCK);
    public static final Block PALE_MOSS_SMALL_HEDGE = smallHedge("pale_moss_small_hedge", Blocks.PALE_MOSS_BLOCK);
    public static final Block CRIMSON_SMALL_HEDGE = smallHedge("crimson_small_hedge", Blocks.NETHER_WART_BLOCK);
    public static final Block WARPED_SMALL_HEDGE = smallHedge("warped_small_hedge", Blocks.WARPED_WART_BLOCK);

    // Large Flower Pots
    public static final Block LARGE_FLOWER_POT = largeFlowerPot("large_flower_pot");
    public static final PottedLargeBundle POTTED_ROSE_BUSH = new PottedLargeBundle("potted_rose_bush", Blocks.ROSE_BUSH);
    public static final PottedLargeBundle POTTED_LILAC = new PottedLargeBundle("potted_lilac", Blocks.LILAC);
    public static final PottedLargeBundle POTTED_PEONY = new PottedLargeBundle("potted_peony", Blocks.PEONY);
    public static final PottedLargeBundle POTTED_LARGE_FERN = new PottedLargeBundle("potted_large_fern", Blocks.LARGE_FERN);
    public static final PottedLargeBundle POTTED_OAK = new PottedLargeBundle("potted_oak", Blocks.OAK_SAPLING);
    public static final PottedLargeBundle POTTED_SPRUCE = new PottedLargeBundle("potted_spruce", Blocks.SPRUCE_SAPLING);
    public static final PottedLargeBundle POTTED_BIRCH = new PottedLargeBundle("potted_birch", Blocks.BIRCH_SAPLING);
    public static final PottedLargeBundle POTTED_JUNGLE = new PottedLargeBundle("potted_jungle", Blocks.JUNGLE_SAPLING);
    public static final PottedLargeBundle POTTED_ACACIA = new PottedLargeBundle("potted_acacia", Blocks.ACACIA_SAPLING);
    public static final PottedLargeBundle POTTED_DARK_OAK = new PottedLargeBundle("potted_dark_oak", Blocks.DARK_OAK_SAPLING);
    public static final PottedLargeBundle POTTED_MANGROVE = new PottedLargeBundle("potted_mangrove", Blocks.MANGROVE_PROPAGULE);
    public static final PottedLargeBundle POTTED_CHERRY_BLOSSOM = new PottedLargeBundle("potted_cherry_blossom", Blocks.CHERRY_SAPLING);
    public static final PottedLargeBundle POTTED_PALE_OAK = new PottedLargeBundle("potted_pale_oak", Blocks.PALE_OAK_SAPLING);
    public static final PottedLargeBundle POTTED_WHITE_OAK = new PottedLargeBundle("potted_white_oak", WHITE_OAK_SAPLING);
    public static final PottedLargeBundle POTTED_HUGE_RED_MUSHROOM = new PottedLargeBundle("potted_huge_red_mushroom", Blocks.RED_MUSHROOM);
    public static final PottedLargeBundle POTTED_HUGE_BROWN_MUSHROOM = new PottedLargeBundle("potted_huge_brown_mushroom", Blocks.BROWN_MUSHROOM);
    public static final PottedLargeBundle POTTED_HUGE_CRIMSON_FUNGUS = new PottedLargeBundle("potted_huge_crimson_fungus", Blocks.CRIMSON_FUNGUS);
    public static final PottedLargeBundle POTTED_HUGE_WARPED_FUNGUS = new PottedLargeBundle("potted_huge_warped_fungus", Blocks.WARPED_FUNGUS);
    public static final PottedLargeBundle POTTED_CACTUS_LARGE = new PottedLargeBundle("potted_cactus_large", Blocks.CACTUS);
    public static final PottedLargeBundle POTTED_BAMBOO_LARGE = new PottedLargeBundle("potted_bamboo_large", Blocks.BAMBOO);
    public static final PottedLargeBundle POTTED_AZALEA_LARGE = new PottedLargeBundle("potted_azalea_large", Blocks.AZALEA);
    public static final PottedLargeBundle POTTED_FLOWERING_AZALEA_LARGE = new PottedLargeBundle("potted_flowering_azalea_large", Blocks.FLOWERING_AZALEA);
    public static final PottedLargeBundle POTTED_PITCHER_PLANT = new PottedLargeBundle("potted_pitcher_plant", Blocks.PITCHER_PLANT);

    // Chocolate
    public static final BSSWBundle CHOCOLATE_BLOCK = new BSSWBundle("chocolate_block", 1.0F, 1.0F, MapColor.BROWN, false);
    public static final BSSWBundle CHOCOLATE_BRICKS = new BSSWBundle("chocolate_bricks", BlockusBlocks.CHOCOLATE_BLOCK.block);
    public static final Block CHOCOLATE_SQUARES = register("chocolate_squares", createCopy(BlockusBlocks.CHOCOLATE_BRICKS.block));
    public static final Block CHOCOLATE_TABLET = register("chocolate_tablet", ChocolateTabletBlock::new, createCopy(BlockusBlocks.CHOCOLATE_BLOCK.block).strength(0.2F, 1.0F));

    // Ore Bricks
    public static final BSSWBundle IRON_BRICKS = new BSSWBundle("iron_bricks", Blocks.IRON_BLOCK);
    public static final BSSWBundle GOLD_BRICKS = new BSSWBundle("gold_bricks", Blocks.GOLD_BLOCK);
    public static final BSSWBundle LAPIS_BRICKS = new BSSWBundle("lapis_bricks", Blocks.LAPIS_BLOCK);
    public static final BSSWBundle REDSTONE_BRICKS = new BSSWBundle("redstone_bricks", Blocks.REDSTONE_BLOCK);
    public static final BSSWBundle EMERALD_BRICKS = new BSSWBundle("emerald_bricks", Blocks.EMERALD_BLOCK);
    public static final BSSWBundle DIAMOND_BRICKS = new BSSWBundle("diamond_bricks", Blocks.DIAMOND_BLOCK);
    public static final BSSWBundle NETHERITE_BRICKS = new BSSWBundle("netherite_bricks", Blocks.NETHERITE_BLOCK);

    // Copper
    public static final CopperBundle COPPER_BRICKS = new CopperBundle("copper_bricks", OxidationType.UNAFFECTED, Blocks.COPPER_BLOCK);
    public static final CopperBundle EXPOSED_COPPER_BRICKS = new CopperBundle("copper_bricks", OxidationType.EXPOSED, Blocks.EXPOSED_COPPER);
    public static final CopperBundle WEATHERED_COPPER_BRICKS = new CopperBundle("copper_bricks", OxidationType.WEATHERED, Blocks.WEATHERED_COPPER);
    public static final CopperBundle OXIDIZED_COPPER_BRICKS = new CopperBundle("copper_bricks", OxidationType.OXIDIZED, Blocks.OXIDIZED_COPPER);
    public static final CopperBundle COPPER_TUFF_BRICKS = new CopperBundle("copper_tuff_bricks", OxidationType.UNAFFECTED, Blocks.TUFF_BRICKS);
    public static final CopperBundle EXPOSED_COPPER_TUFF_BRICKS = new CopperBundle("copper_tuff_bricks", OxidationType.EXPOSED, Blocks.TUFF_BRICKS);
    public static final CopperBundle WEATHERED_COPPER_TUFF_BRICKS = new CopperBundle("copper_tuff_bricks", OxidationType.WEATHERED, Blocks.TUFF_BRICKS);
    public static final CopperBundle OXIDIZED_COPPER_TUFF_BRICKS = new CopperBundle("copper_tuff_bricks", OxidationType.OXIDIZED, Blocks.TUFF_BRICKS);

    // Food Blocks
    public static final Block SWEET_BERRIES_CRATE = crate("sweet_berries_crate");
    public static final Block GLOW_BERRIES_CRATE = crate("glow_berries_crate", 14);
    public static final Block SALMON_CRATE = crate("salmon_crate");
    public static final Block PUFFERFISH_CRATE = crate("pufferfish_crate");
    public static final Block TROPICAL_FISH_CRATE = crate("tropical_fish_crate");
    public static final Block COD_CRATE = crate("cod_crate");
    public static final Block COOKIE_BLOCK = register("cookie_block", CookieBlock::new, create().mapColor(MapColor.ORANGE).strength(0.5F).sounds(BlockSoundGroup.GRASS));
    public static final Block CHORUS_BLOCK = register("chorus_block", PillarBlock::new, create().mapColor(MapColor.PURPLE).strength(0.5f).sounds(BlockSoundGroup.GRASS));
    public static final Block POTATO_CRATE = crate("potato_crate");
    public static final Block APPLE_CRATE = crate("apple_crate");
    public static final Block GOLDEN_APPLE_CRATE = crate("golden_apple_crate");
    public static final Block BEETROOT_CRATE = crate("beetroot_crate");
    public static final Block CARROT_CRATE = crate("carrot_crate");
    public static final Block GOLDEN_CARROT_CRATE = crate("golden_carrot_crate");
    public static final Block BREAD_BOX = register("bread_box", OrientableBlockBase::new, createCopy(Blocks.OAK_PLANKS).strength(2.5f));

    // Stained Stone Bricks
    public static final BSSWBundle WHITE_STONE_BRICKS = new BSSWBundle("white_stone_bricks", Blocks.STONE_BRICKS, MapColor.WHITE);
    public static final BSSWBundle GRAY_STONE_BRICKS = new BSSWBundle("gray_stone_bricks", Blocks.STONE_BRICKS, MapColor.GRAY);
    public static final BSSWBundle BLACK_STONE_BRICKS = new BSSWBundle("black_stone_bricks", Blocks.STONE_BRICKS, MapColor.BLACK);
    public static final BSSWBundle BROWN_STONE_BRICKS = new BSSWBundle("brown_stone_bricks", Blocks.STONE_BRICKS, MapColor.BROWN);
    public static final BSSWBundle RED_STONE_BRICKS = new BSSWBundle("red_stone_bricks", Blocks.STONE_BRICKS, MapColor.RED);
    public static final BSSWBundle ORANGE_STONE_BRICKS = new BSSWBundle("orange_stone_bricks", Blocks.STONE_BRICKS, MapColor.ORANGE);
    public static final BSSWBundle YELLOW_STONE_BRICKS = new BSSWBundle("yellow_stone_bricks", Blocks.STONE_BRICKS, MapColor.YELLOW);
    public static final BSSWBundle LIME_STONE_BRICKS = new BSSWBundle("lime_stone_bricks", Blocks.STONE_BRICKS, MapColor.LIME);
    public static final BSSWBundle GREEN_STONE_BRICKS = new BSSWBundle("green_stone_bricks", Blocks.STONE_BRICKS, MapColor.GREEN);
    public static final BSSWBundle CYAN_STONE_BRICKS = new BSSWBundle("cyan_stone_bricks", Blocks.STONE_BRICKS, MapColor.CYAN);
    public static final BSSWBundle LIGHT_BLUE_STONE_BRICKS = new BSSWBundle("light_blue_stone_bricks", Blocks.STONE_BRICKS, MapColor.LIGHT_BLUE);
    public static final BSSWBundle BLUE_STONE_BRICKS = new BSSWBundle("blue_stone_bricks", Blocks.STONE_BRICKS, MapColor.BLUE);
    public static final BSSWBundle PURPLE_STONE_BRICKS = new BSSWBundle("purple_stone_bricks", Blocks.STONE_BRICKS, MapColor.PURPLE);
    public static final BSSWBundle MAGENTA_STONE_BRICKS = new BSSWBundle("magenta_stone_bricks", Blocks.STONE_BRICKS, MapColor.MAGENTA);
    public static final BSSWBundle PINK_STONE_BRICKS = new BSSWBundle("pink_stone_bricks", Blocks.STONE_BRICKS, MapColor.PINK);

    // Concrete
    public static final ConcreteBundle WHITE_CONCRETE_BRICKS = new ConcreteBundle("white_concrete_bricks", Blocks.WHITE_CONCRETE);
    public static final ConcreteBundle LIGHT_GRAY_CONCRETE_BRICKS = new ConcreteBundle("light_gray_concrete_bricks", Blocks.LIGHT_GRAY_CONCRETE);
    public static final ConcreteBundle GRAY_CONCRETE_BRICKS = new ConcreteBundle("gray_concrete_bricks", Blocks.GRAY_CONCRETE);
    public static final ConcreteBundle BLACK_CONCRETE_BRICKS = new ConcreteBundle("black_concrete_bricks", Blocks.BLACK_CONCRETE);
    public static final ConcreteBundle BROWN_CONCRETE_BRICKS = new ConcreteBundle("brown_concrete_bricks", Blocks.BROWN_CONCRETE);
    public static final ConcreteBundle RED_CONCRETE_BRICKS = new ConcreteBundle("red_concrete_bricks", Blocks.RED_CONCRETE);
    public static final ConcreteBundle ORANGE_CONCRETE_BRICKS = new ConcreteBundle("orange_concrete_bricks", Blocks.ORANGE_CONCRETE);
    public static final ConcreteBundle YELLOW_CONCRETE_BRICKS = new ConcreteBundle("yellow_concrete_bricks", Blocks.YELLOW_CONCRETE);
    public static final ConcreteBundle LIME_CONCRETE_BRICKS = new ConcreteBundle("lime_concrete_bricks", Blocks.LIME_CONCRETE);
    public static final ConcreteBundle GREEN_CONCRETE_BRICKS = new ConcreteBundle("green_concrete_bricks", Blocks.GREEN_CONCRETE);
    public static final ConcreteBundle CYAN_CONCRETE_BRICKS = new ConcreteBundle("cyan_concrete_bricks", Blocks.CYAN_CONCRETE);
    public static final ConcreteBundle LIGHT_BLUE_CONCRETE_BRICKS = new ConcreteBundle("light_blue_concrete_bricks", Blocks.LIGHT_BLUE_CONCRETE);
    public static final ConcreteBundle BLUE_CONCRETE_BRICKS = new ConcreteBundle("blue_concrete_bricks", Blocks.BLUE_CONCRETE);
    public static final ConcreteBundle PURPLE_CONCRETE_BRICKS = new ConcreteBundle("purple_concrete_bricks", Blocks.PURPLE_CONCRETE);
    public static final ConcreteBundle MAGENTA_CONCRETE_BRICKS = new ConcreteBundle("magenta_concrete_bricks", Blocks.MAGENTA_CONCRETE);
    public static final ConcreteBundle PINK_CONCRETE_BRICKS = new ConcreteBundle("pink_concrete_bricks", Blocks.PINK_CONCRETE);

    // Redstone Lamps
    public static final Block WHITE_REDSTONE_LAMP = redstoneLamp("white_redstone_lamp", MapColor.WHITE);
    public static final Block ORANGE_REDSTONE_LAMP = redstoneLamp("orange_redstone_lamp", MapColor.ORANGE);
    public static final Block MAGENTA_REDSTONE_LAMP = redstoneLamp("magenta_redstone_lamp", MapColor.MAGENTA);
    public static final Block LIGHT_BLUE_REDSTONE_LAMP = redstoneLamp("light_blue_redstone_lamp", MapColor.LIGHT_BLUE);
    public static final Block YELLOW_REDSTONE_LAMP = redstoneLamp("yellow_redstone_lamp", MapColor.YELLOW);
    public static final Block LIME_REDSTONE_LAMP = redstoneLamp("lime_redstone_lamp", MapColor.LIME);
    public static final Block PINK_REDSTONE_LAMP = redstoneLamp("pink_redstone_lamp", MapColor.PINK);
    public static final Block GRAY_REDSTONE_LAMP = redstoneLamp("gray_redstone_lamp", MapColor.GRAY);
    public static final Block LIGHT_GRAY_REDSTONE_LAMP = redstoneLamp("light_gray_redstone_lamp", MapColor.LIGHT_GRAY);
    public static final Block CYAN_REDSTONE_LAMP = redstoneLamp("cyan_redstone_lamp", MapColor.CYAN);
    public static final Block PURPLE_REDSTONE_LAMP = redstoneLamp("purple_redstone_lamp", MapColor.PURPLE);
    public static final Block BLUE_REDSTONE_LAMP = redstoneLamp("blue_redstone_lamp", MapColor.BLUE);
    public static final Block BROWN_REDSTONE_LAMP = redstoneLamp("brown_redstone_lamp", MapColor.BROWN);
    public static final Block GREEN_REDSTONE_LAMP = redstoneLamp("green_redstone_lamp", MapColor.GREEN);
    public static final Block RED_REDSTONE_LAMP = redstoneLamp("red_redstone_lamp", MapColor.RED);
    public static final Block REDSTONE_LAMP_LIT = litRedstoneLamp("redstone_lamp_lit", Blocks.REDSTONE_LAMP);
    public static final Block WHITE_REDSTONE_LAMP_LIT = litRedstoneLamp("white_redstone_lamp_lit", WHITE_REDSTONE_LAMP);
    public static final Block ORANGE_REDSTONE_LAMP_LIT = litRedstoneLamp("orange_redstone_lamp_lit", ORANGE_REDSTONE_LAMP);
    public static final Block MAGENTA_REDSTONE_LAMP_LIT = litRedstoneLamp("magenta_redstone_lamp_lit", MAGENTA_REDSTONE_LAMP);
    public static final Block LIGHT_BLUE_REDSTONE_LAMP_LIT = litRedstoneLamp("light_blue_redstone_lamp_lit", LIGHT_BLUE_REDSTONE_LAMP);
    public static final Block YELLOW_REDSTONE_LAMP_LIT = litRedstoneLamp("yellow_redstone_lamp_lit", YELLOW_REDSTONE_LAMP);
    public static final Block LIME_REDSTONE_LAMP_LIT = litRedstoneLamp("lime_redstone_lamp_lit", LIME_REDSTONE_LAMP);
    public static final Block PINK_REDSTONE_LAMP_LIT = litRedstoneLamp("pink_redstone_lamp_lit", PINK_REDSTONE_LAMP);
    public static final Block GRAY_REDSTONE_LAMP_LIT = litRedstoneLamp("gray_redstone_lamp_lit", GRAY_REDSTONE_LAMP);
    public static final Block LIGHT_GRAY_REDSTONE_LAMP_LIT = litRedstoneLamp("light_gray_redstone_lamp_lit", LIGHT_GRAY_REDSTONE_LAMP);
    public static final Block CYAN_REDSTONE_LAMP_LIT = litRedstoneLamp("cyan_redstone_lamp_lit", CYAN_REDSTONE_LAMP);
    public static final Block PURPLE_REDSTONE_LAMP_LIT = litRedstoneLamp("purple_redstone_lamp_lit", PURPLE_REDSTONE_LAMP);
    public static final Block BLUE_REDSTONE_LAMP_LIT = litRedstoneLamp("blue_redstone_lamp_lit", BLUE_REDSTONE_LAMP);
    public static final Block BROWN_REDSTONE_LAMP_LIT = litRedstoneLamp("brown_redstone_lamp_lit", BROWN_REDSTONE_LAMP);
    public static final Block GREEN_REDSTONE_LAMP_LIT = litRedstoneLamp("green_redstone_lamp_lit", GREEN_REDSTONE_LAMP);
    public static final Block RED_REDSTONE_LAMP_LIT = litRedstoneLamp("red_redstone_lamp_lit", RED_REDSTONE_LAMP);
    public static final Block RAINBOW_LAMP = redstoneLamp("rainbow_lamp", MapColor.TERRACOTTA_ORANGE);
    public static final Block RAINBOW_LAMP_LIT = litRedstoneLamp("rainbow_lamp_lit", RAINBOW_LAMP);

    // Neon Blocks
    public static final Block WHITE_NEON = neonBlock("white_neon", DyeColor.WHITE);
    public static final Block LIGHT_GRAY_NEON = neonBlock("light_gray_neon", DyeColor.LIGHT_GRAY);
    public static final Block GRAY_NEON = neonBlock("gray_neon", DyeColor.GRAY);
    public static final Block BLACK_NEON = neonBlock("black_neon", DyeColor.BLACK);
    public static final Block BROWN_NEON = neonBlock("brown_neon", DyeColor.BROWN);
    public static final Block RED_NEON = neonBlock("red_neon", DyeColor.RED);
    public static final Block ORANGE_NEON = neonBlock("orange_neon", DyeColor.ORANGE);
    public static final Block YELLOW_NEON = neonBlock("yellow_neon", DyeColor.YELLOW);
    public static final Block LIME_NEON = neonBlock("lime_neon", DyeColor.LIME);
    public static final Block GREEN_NEON = neonBlock("green_neon", DyeColor.GREEN);
    public static final Block CYAN_NEON = neonBlock("cyan_neon", DyeColor.CYAN);
    public static final Block LIGHT_BLUE_NEON = neonBlock("light_blue_neon", DyeColor.LIGHT_BLUE);
    public static final Block BLUE_NEON = neonBlock("blue_neon", DyeColor.BLUE);
    public static final Block PURPLE_NEON = neonBlock("purple_neon", DyeColor.PURPLE);
    public static final Block MAGENTA_NEON = neonBlock("magenta_neon", DyeColor.MAGENTA);
    public static final Block PINK_NEON = neonBlock("pink_neon", DyeColor.PINK);

    // Futurneo Blocks
    public static final Block WHITE_FUTURNEO_BLOCK = futurneoBlock("white_futurneo_block", MapColor.BLACK);
    public static final Block LIGHT_GRAY_FUTURNEO_BLOCK = futurneoBlock("light_gray_futurneo_block", MapColor.BLACK);
    public static final Block GRAY_FUTURNEO_BLOCK = futurneoBlock("gray_futurneo_block", MapColor.BLACK);
    public static final Block BLACK_FUTURNEO_BLOCK = futurneoBlock("black_futurneo_block", MapColor.BLACK);
    public static final Block BROWN_FUTURNEO_BLOCK = futurneoBlock("brown_futurneo_block", MapColor.BLACK);
    public static final Block RED_FUTURNEO_BLOCK = futurneoBlock("red_futurneo_block", MapColor.BLACK);
    public static final Block ORANGE_FUTURNEO_BLOCK = futurneoBlock("orange_futurneo_block", MapColor.BLACK);
    public static final Block YELLOW_FUTURNEO_BLOCK = futurneoBlock("yellow_futurneo_block", MapColor.BLACK);
    public static final Block LIME_FUTURNEO_BLOCK = futurneoBlock("lime_futurneo_block", MapColor.BLACK);
    public static final Block GREEN_FUTURNEO_BLOCK = futurneoBlock("green_futurneo_block", MapColor.BLACK);
    public static final Block CYAN_FUTURNEO_BLOCK = futurneoBlock("cyan_futurneo_block", MapColor.BLACK);
    public static final Block LIGHT_BLUE_FUTURNEO_BLOCK = futurneoBlock("light_blue_futurneo_block", MapColor.BLACK);
    public static final Block BLUE_FUTURNEO_BLOCK = futurneoBlock("blue_futurneo_block", MapColor.BLACK);
    public static final Block PURPLE_FUTURNEO_BLOCK = futurneoBlock("purple_futurneo_block", MapColor.BLACK);
    public static final Block MAGENTA_FUTURNEO_BLOCK = futurneoBlock("magenta_futurneo_block", MapColor.BLACK);
    public static final Block PINK_FUTURNEO_BLOCK = futurneoBlock("pink_futurneo_block", MapColor.BLACK);
    public static final Block GRAY_BRIGHT_FUTURNEO_BLOCK = futurneoBlock("gray_bright_futurneo_block", MapColor.WHITE);
    public static final Block RAINBOW_FUTURNEO_BLOCK = futurneoBlock("rainbow_futurneo_block", MapColor.BLACK);

    // Asphalt
    public static final AsphaltBundle ASPHALT = new AsphaltBundle(DyeColor.BLACK);
    public static final AsphaltBundle WHITE_ASPHALT = new AsphaltBundle(DyeColor.WHITE);
    public static final AsphaltBundle LIGHT_GRAY_ASPHALT = new AsphaltBundle(DyeColor.LIGHT_GRAY);
    public static final AsphaltBundle GRAY_ASPHALT = new AsphaltBundle(DyeColor.GRAY);
    public static final AsphaltBundle BROWN_ASPHALT = new AsphaltBundle(DyeColor.BROWN);
    public static final AsphaltBundle RED_ASPHALT = new AsphaltBundle(DyeColor.RED);
    public static final AsphaltBundle ORANGE_ASPHALT = new AsphaltBundle(DyeColor.ORANGE);
    public static final AsphaltBundle YELLOW_ASPHALT = new AsphaltBundle(DyeColor.YELLOW);
    public static final AsphaltBundle LIME_ASPHALT = new AsphaltBundle(DyeColor.LIME);
    public static final AsphaltBundle GREEN_ASPHALT = new AsphaltBundle(DyeColor.GREEN);
    public static final AsphaltBundle CYAN_ASPHALT = new AsphaltBundle(DyeColor.CYAN);
    public static final AsphaltBundle LIGHT_BLUE_ASPHALT = new AsphaltBundle(DyeColor.LIGHT_BLUE);
    public static final AsphaltBundle BLUE_ASPHALT = new AsphaltBundle(DyeColor.BLUE);
    public static final AsphaltBundle PURPLE_ASPHALT = new AsphaltBundle(DyeColor.PURPLE);
    public static final AsphaltBundle MAGENTA_ASPHALT = new AsphaltBundle(DyeColor.MAGENTA);
    public static final AsphaltBundle PINK_ASPHALT = new AsphaltBundle(DyeColor.PINK);
    public static final Block RAINBOW_ASPHALT = register("rainbow_asphalt", RainbowAsphalt::new, create().mapColor(DyeColor.BLUE).instrument(NoteBlockInstrument.BASEDRUM).strength(1.5f, 6.0f).requiresTool());

    // Shingles
    public static final BSSWBundle SHINGLES = new BSSWBundle("shingles", Blocks.TERRACOTTA, BlockSoundGroup.NETHER_BRICKS, false);
    public static final BSSWBundle WHITE_SHINGLES = new BSSWBundle("white_shingles", Blocks.WHITE_TERRACOTTA, BlockSoundGroup.NETHER_BRICKS, false);
    public static final BSSWBundle LIGHT_GRAY_SHINGLES = new BSSWBundle("light_gray_shingles", Blocks.LIGHT_GRAY_TERRACOTTA, BlockSoundGroup.NETHER_BRICKS, false);
    public static final BSSWBundle GRAY_SHINGLES = new BSSWBundle("gray_shingles", Blocks.GRAY_TERRACOTTA, BlockSoundGroup.NETHER_BRICKS, false);
    public static final BSSWBundle BLACK_SHINGLES = new BSSWBundle("black_shingles", Blocks.BLACK_TERRACOTTA, BlockSoundGroup.NETHER_BRICKS, false);
    public static final BSSWBundle BROWN_SHINGLES = new BSSWBundle("brown_shingles", Blocks.BROWN_TERRACOTTA, BlockSoundGroup.NETHER_BRICKS, false);
    public static final BSSWBundle RED_SHINGLES = new BSSWBundle("red_shingles", Blocks.RED_TERRACOTTA, BlockSoundGroup.NETHER_BRICKS, false);
    public static final BSSWBundle ORANGE_SHINGLES = new BSSWBundle("orange_shingles", Blocks.ORANGE_TERRACOTTA, BlockSoundGroup.NETHER_BRICKS, false);
    public static final BSSWBundle YELLOW_SHINGLES = new BSSWBundle("yellow_shingles", Blocks.YELLOW_TERRACOTTA, BlockSoundGroup.NETHER_BRICKS, false);
    public static final BSSWBundle LIME_SHINGLES = new BSSWBundle("lime_shingles", Blocks.LIME_TERRACOTTA, BlockSoundGroup.NETHER_BRICKS, false);
    public static final BSSWBundle GREEN_SHINGLES = new BSSWBundle("green_shingles", Blocks.GREEN_TERRACOTTA, BlockSoundGroup.NETHER_BRICKS, false);
    public static final BSSWBundle CYAN_SHINGLES = new BSSWBundle("cyan_shingles", Blocks.CYAN_TERRACOTTA, BlockSoundGroup.NETHER_BRICKS, false);
    public static final BSSWBundle LIGHT_BLUE_SHINGLES = new BSSWBundle("light_blue_shingles", Blocks.LIGHT_BLUE_TERRACOTTA, BlockSoundGroup.NETHER_BRICKS, false);
    public static final BSSWBundle BLUE_SHINGLES = new BSSWBundle("blue_shingles", Blocks.BLUE_TERRACOTTA, BlockSoundGroup.NETHER_BRICKS, false);
    public static final BSSWBundle PURPLE_SHINGLES = new BSSWBundle("purple_shingles", Blocks.PURPLE_TERRACOTTA, BlockSoundGroup.NETHER_BRICKS, false);
    public static final BSSWBundle MAGENTA_SHINGLES = new BSSWBundle("magenta_shingles", Blocks.MAGENTA_TERRACOTTA, BlockSoundGroup.NETHER_BRICKS, false);
    public static final BSSWBundle PINK_SHINGLES = new BSSWBundle("pink_shingles", Blocks.PINK_TERRACOTTA, BlockSoundGroup.NETHER_BRICKS, false);

    // Glass - Beveled Glass
    public static final Block RAINBOW_GLASS = stainedGlass("rainbow_glass", DyeColor.YELLOW, Blocks.GLASS);
    public static final Block RAINBOW_GLASS_PANE = stainedGlassPane("rainbow_glass_pane", DyeColor.YELLOW, Blocks.GLASS_PANE);
    public static final Block BEVELED_GLASS = register("beveled_glass", TransparentBlock::new, createCopy(Blocks.GLASS));
    public static final Block WHITE_BEVELED_GLASS = stainedGlass("white_beveled_glass", DyeColor.WHITE, Blocks.WHITE_STAINED_GLASS);
    public static final Block ORANGE_BEVELED_GLASS = stainedGlass("orange_beveled_glass", DyeColor.ORANGE, Blocks.ORANGE_STAINED_GLASS);
    public static final Block MAGENTA_BEVELED_GLASS = stainedGlass("magenta_beveled_glass", DyeColor.MAGENTA, Blocks.MAGENTA_STAINED_GLASS);
    public static final Block LIGHT_BLUE_BEVELED_GLASS = stainedGlass("light_blue_beveled_glass", DyeColor.LIGHT_BLUE, Blocks.LIGHT_BLUE_STAINED_GLASS);
    public static final Block YELLOW_BEVELED_GLASS = stainedGlass("yellow_beveled_glass", DyeColor.YELLOW, Blocks.YELLOW_STAINED_GLASS);
    public static final Block LIME_BEVELED_GLASS = stainedGlass("lime_beveled_glass", DyeColor.LIME, Blocks.LIME_STAINED_GLASS);
    public static final Block PINK_BEVELED_GLASS = stainedGlass("pink_beveled_glass", DyeColor.PINK, Blocks.PINK_STAINED_GLASS);
    public static final Block LIGHT_GRAY_BEVELED_GLASS = stainedGlass("light_gray_beveled_glass", DyeColor.LIGHT_GRAY, Blocks.LIGHT_GRAY_STAINED_GLASS);
    public static final Block GRAY_BEVELED_GLASS = stainedGlass("gray_beveled_glass", DyeColor.GRAY, Blocks.GRAY_STAINED_GLASS);
    public static final Block CYAN_BEVELED_GLASS = stainedGlass("cyan_beveled_glass", DyeColor.CYAN, Blocks.CYAN_STAINED_GLASS);
    public static final Block PURPLE_BEVELED_GLASS = stainedGlass("purple_beveled_glass", DyeColor.PURPLE, Blocks.PURPLE_STAINED_GLASS);
    public static final Block BLUE_BEVELED_GLASS = stainedGlass("blue_beveled_glass", DyeColor.BLUE, Blocks.BLUE_STAINED_GLASS);
    public static final Block BROWN_BEVELED_GLASS = stainedGlass("brown_beveled_glass", DyeColor.BROWN, Blocks.BROWN_STAINED_GLASS);
    public static final Block GREEN_BEVELED_GLASS = stainedGlass("green_beveled_glass", DyeColor.GREEN, Blocks.GREEN_STAINED_GLASS);
    public static final Block RED_BEVELED_GLASS = stainedGlass("red_beveled_glass", DyeColor.RED, Blocks.RED_STAINED_GLASS);
    public static final Block BLACK_BEVELED_GLASS = stainedGlass("black_beveled_glass", DyeColor.BLACK, Blocks.BLACK_STAINED_GLASS);
    public static final Block RAINBOW_BEVELED_GLASS = stainedGlass("rainbow_beveled_glass", DyeColor.YELLOW, RAINBOW_GLASS);
    public static final Block BEVELED_GLASS_PANE = register("beveled_glass_pane", PaneBlock::new, createCopy(Blocks.GLASS_PANE));
    public static final Block WHITE_BEVELED_GLASS_PANE = stainedGlassPane("white_beveled_glass_pane", DyeColor.WHITE, Blocks.WHITE_STAINED_GLASS_PANE);
    public static final Block ORANGE_BEVELED_GLASS_PANE = stainedGlassPane("orange_beveled_glass_pane", DyeColor.ORANGE, Blocks.ORANGE_STAINED_GLASS_PANE);
    public static final Block MAGENTA_BEVELED_GLASS_PANE = stainedGlassPane("magenta_beveled_glass_pane", DyeColor.MAGENTA, Blocks.MAGENTA_STAINED_GLASS_PANE);
    public static final Block LIGHT_BLUE_BEVELED_GLASS_PANE = stainedGlassPane("light_blue_beveled_glass_pane", DyeColor.LIGHT_BLUE, Blocks.LIGHT_BLUE_STAINED_GLASS_PANE);
    public static final Block YELLOW_BEVELED_GLASS_PANE = stainedGlassPane("yellow_beveled_glass_pane", DyeColor.YELLOW, Blocks.YELLOW_STAINED_GLASS_PANE);
    public static final Block LIME_BEVELED_GLASS_PANE = stainedGlassPane("lime_beveled_glass_pane", DyeColor.LIME, Blocks.LIME_STAINED_GLASS_PANE);
    public static final Block PINK_BEVELED_GLASS_PANE = stainedGlassPane("pink_beveled_glass_pane", DyeColor.PINK, Blocks.PINK_STAINED_GLASS_PANE);
    public static final Block LIGHT_GRAY_BEVELED_GLASS_PANE = stainedGlassPane("light_gray_beveled_glass_pane", DyeColor.LIGHT_GRAY, Blocks.LIGHT_GRAY_STAINED_GLASS_PANE);
    public static final Block GRAY_BEVELED_GLASS_PANE = stainedGlassPane("gray_beveled_glass_pane", DyeColor.GRAY, Blocks.GRAY_STAINED_GLASS_PANE);
    public static final Block CYAN_BEVELED_GLASS_PANE = stainedGlassPane("cyan_beveled_glass_pane", DyeColor.CYAN, Blocks.CYAN_STAINED_GLASS_PANE);
    public static final Block PURPLE_BEVELED_GLASS_PANE = stainedGlassPane("purple_beveled_glass_pane", DyeColor.PURPLE, Blocks.PURPLE_STAINED_GLASS_PANE);
    public static final Block BLUE_BEVELED_GLASS_PANE = stainedGlassPane("blue_beveled_glass_pane", DyeColor.BLUE, Blocks.BLUE_STAINED_GLASS_PANE);
    public static final Block BROWN_BEVELED_GLASS_PANE = stainedGlassPane("brown_beveled_glass_pane", DyeColor.BROWN, Blocks.BROWN_STAINED_GLASS_PANE);
    public static final Block GREEN_BEVELED_GLASS_PANE = stainedGlassPane("green_beveled_glass_pane", DyeColor.GREEN, Blocks.GREEN_STAINED_GLASS_PANE);
    public static final Block RED_BEVELED_GLASS_PANE = stainedGlassPane("red_beveled_glass_pane", DyeColor.RED, Blocks.RED_STAINED_GLASS_PANE);
    public static final Block BLACK_BEVELED_GLASS_PANE = stainedGlassPane("black_beveled_glass_pane", DyeColor.BLACK, Blocks.BLACK_STAINED_GLASS_PANE);
    public static final Block RAINBOW_BEVELED_GLASS_PANE = stainedGlassPane("rainbow_beveled_glass_pane", DyeColor.YELLOW, RAINBOW_GLASS_PANE);
    public static final Block TINTED_BEVELED_GLASS = register("tinted_beveled_glass", TintedGlassBlock::new, createCopy(Blocks.TINTED_GLASS).allowsSpawning(BlockusBlocks::never).solidBlock(BlockusBlocks::never).suffocates(BlockusBlocks::never).blockVision(BlockusBlocks::never));

    // Patterned Wools
    public static final WoolBundle WHITE_PATTERNED_WOOL = new WoolBundle(Blocks.WHITE_WOOL, Blocks.WHITE_CARPET, DyeColor.WHITE);
    public static final WoolBundle LIGHT_GRAY_PATTERNED_WOOL = new WoolBundle(Blocks.LIGHT_GRAY_WOOL, Blocks.LIGHT_GRAY_CARPET, DyeColor.LIGHT_GRAY);
    public static final WoolBundle GRAY_PATTERNED_WOOL = new WoolBundle(Blocks.GRAY_WOOL, Blocks.GRAY_CARPET, DyeColor.GRAY);
    public static final WoolBundle BLACK_PATTERNED_WOOL = new WoolBundle(Blocks.BLACK_WOOL, Blocks.BLACK_CARPET, DyeColor.BLACK);
    public static final WoolBundle BROWN_PATTERNED_WOOL = new WoolBundle(Blocks.BROWN_WOOL, Blocks.BROWN_CARPET, DyeColor.BROWN);
    public static final WoolBundle RED_PATTERNED_WOOL = new WoolBundle(Blocks.RED_WOOL, Blocks.RED_CARPET, DyeColor.RED);
    public static final WoolBundle ORANGE_PATTERNED_WOOL = new WoolBundle(Blocks.ORANGE_WOOL, Blocks.ORANGE_CARPET, DyeColor.ORANGE);
    public static final WoolBundle YELLOW_PATTERNED_WOOL = new WoolBundle(Blocks.YELLOW_WOOL, Blocks.YELLOW_CARPET, DyeColor.YELLOW);
    public static final WoolBundle LIME_PATTERNED_WOOL = new WoolBundle(Blocks.LIME_WOOL, Blocks.LIME_CARPET, DyeColor.LIME);
    public static final WoolBundle GREEN_PATTERNED_WOOL = new WoolBundle(Blocks.GREEN_WOOL, Blocks.GREEN_CARPET, DyeColor.GREEN);
    public static final WoolBundle CYAN_PATTERNED_WOOL = new WoolBundle(Blocks.CYAN_WOOL, Blocks.CYAN_CARPET, DyeColor.CYAN);
    public static final WoolBundle LIGHT_BLUE_PATTERNED_WOOL = new WoolBundle(Blocks.LIGHT_BLUE_WOOL, Blocks.LIGHT_BLUE_CARPET, DyeColor.LIGHT_BLUE);
    public static final WoolBundle BLUE_PATTERNED_WOOL = new WoolBundle(Blocks.BLUE_WOOL, Blocks.BLUE_CARPET, DyeColor.BLUE);
    public static final WoolBundle PURPLE_PATTERNED_WOOL = new WoolBundle(Blocks.PURPLE_WOOL, Blocks.PURPLE_CARPET, DyeColor.PURPLE);
    public static final WoolBundle MAGENTA_PATTERNED_WOOL = new WoolBundle(Blocks.MAGENTA_WOOL, Blocks.MAGENTA_CARPET, DyeColor.MAGENTA);
    public static final WoolBundle PINK_PATTERNED_WOOL = new WoolBundle(Blocks.PINK_WOOL, Blocks.PINK_CARPET, DyeColor.PINK);

    // Gingham Wools
    public static final WoolBundle WHITE_GINGHAM_WOOL = new WoolBundle(Blocks.WHITE_WOOL, Blocks.WHITE_CARPET, DyeColor.WHITE, WoolBundle.GINGHAM);
    public static final WoolBundle LIGHT_GRAY_GINGHAM_WOOL = new WoolBundle(Blocks.LIGHT_GRAY_WOOL, Blocks.LIGHT_GRAY_CARPET, DyeColor.LIGHT_GRAY, WoolBundle.GINGHAM);
    public static final WoolBundle GRAY_GINGHAM_WOOL = new WoolBundle(Blocks.GRAY_WOOL, Blocks.GRAY_CARPET, DyeColor.GRAY, WoolBundle.GINGHAM);
    public static final WoolBundle BLACK_GINGHAM_WOOL = new WoolBundle(Blocks.BLACK_WOOL, Blocks.BLACK_CARPET, DyeColor.BLACK, WoolBundle.GINGHAM);
    public static final WoolBundle BROWN_GINGHAM_WOOL = new WoolBundle(Blocks.BROWN_WOOL, Blocks.BROWN_CARPET, DyeColor.BROWN, WoolBundle.GINGHAM);
    public static final WoolBundle RED_GINGHAM_WOOL = new WoolBundle(Blocks.RED_WOOL, Blocks.RED_CARPET, DyeColor.RED, WoolBundle.GINGHAM);
    public static final WoolBundle ORANGE_GINGHAM_WOOL = new WoolBundle(Blocks.ORANGE_WOOL, Blocks.ORANGE_CARPET, DyeColor.ORANGE, WoolBundle.GINGHAM);
    public static final WoolBundle YELLOW_GINGHAM_WOOL = new WoolBundle(Blocks.YELLOW_WOOL, Blocks.YELLOW_CARPET, DyeColor.YELLOW, WoolBundle.GINGHAM);
    public static final WoolBundle LIME_GINGHAM_WOOL = new WoolBundle(Blocks.LIME_WOOL, Blocks.LIME_CARPET, DyeColor.LIME, WoolBundle.GINGHAM);
    public static final WoolBundle GREEN_GINGHAM_WOOL = new WoolBundle(Blocks.GREEN_WOOL, Blocks.GREEN_CARPET, DyeColor.GREEN, WoolBundle.GINGHAM);
    public static final WoolBundle CYAN_GINGHAM_WOOL = new WoolBundle(Blocks.CYAN_WOOL, Blocks.CYAN_CARPET, DyeColor.CYAN, WoolBundle.GINGHAM);
    public static final WoolBundle LIGHT_BLUE_GINGHAM_WOOL = new WoolBundle(Blocks.LIGHT_BLUE_WOOL, Blocks.LIGHT_BLUE_CARPET, DyeColor.LIGHT_BLUE, WoolBundle.GINGHAM);
    public static final WoolBundle BLUE_GINGHAM_WOOL = new WoolBundle(Blocks.BLUE_WOOL, Blocks.BLUE_CARPET, DyeColor.BLUE, WoolBundle.GINGHAM);
    public static final WoolBundle PURPLE_GINGHAM_WOOL = new WoolBundle(Blocks.PURPLE_WOOL, Blocks.PURPLE_CARPET, DyeColor.PURPLE, WoolBundle.GINGHAM);
    public static final WoolBundle MAGENTA_GINGHAM_WOOL = new WoolBundle(Blocks.MAGENTA_WOOL, Blocks.MAGENTA_CARPET, DyeColor.MAGENTA, WoolBundle.GINGHAM);
    public static final WoolBundle PINK_GINGHAM_WOOL = new WoolBundle(Blocks.PINK_WOOL, Blocks.PINK_CARPET, DyeColor.PINK, WoolBundle.GINGHAM);

    // Glazed Terracotta Pillars
    public static final Block WHITE_GLAZED_TERRACOTTA_PILLAR = registerPillar(Blocks.WHITE_GLAZED_TERRACOTTA);
    public static final Block LIGHT_GRAY_GLAZED_TERRACOTTA_PILLAR = registerPillar(Blocks.LIGHT_GRAY_GLAZED_TERRACOTTA);
    public static final Block GRAY_GLAZED_TERRACOTTA_PILLAR = registerPillar(Blocks.GRAY_GLAZED_TERRACOTTA);
    public static final Block BLACK_GLAZED_TERRACOTTA_PILLAR = registerPillar(Blocks.BLACK_GLAZED_TERRACOTTA);
    public static final Block BROWN_GLAZED_TERRACOTTA_PILLAR = registerPillar(Blocks.BROWN_GLAZED_TERRACOTTA);
    public static final Block RED_GLAZED_TERRACOTTA_PILLAR = registerPillar(Blocks.RED_GLAZED_TERRACOTTA);
    public static final Block ORANGE_GLAZED_TERRACOTTA_PILLAR = registerPillar(Blocks.ORANGE_GLAZED_TERRACOTTA);
    public static final Block YELLOW_GLAZED_TERRACOTTA_PILLAR = registerPillar(Blocks.YELLOW_GLAZED_TERRACOTTA);
    public static final Block LIME_GLAZED_TERRACOTTA_PILLAR = registerPillar(Blocks.LIME_GLAZED_TERRACOTTA);
    public static final Block GREEN_GLAZED_TERRACOTTA_PILLAR = registerPillar(Blocks.GREEN_GLAZED_TERRACOTTA);
    public static final Block CYAN_GLAZED_TERRACOTTA_PILLAR = registerPillar(Blocks.CYAN_GLAZED_TERRACOTTA);
    public static final Block LIGHT_BLUE_GLAZED_TERRACOTTA_PILLAR = registerPillar(Blocks.LIGHT_BLUE_GLAZED_TERRACOTTA);
    public static final Block BLUE_GLAZED_TERRACOTTA_PILLAR = registerPillar(Blocks.BLUE_GLAZED_TERRACOTTA);
    public static final Block PURPLE_GLAZED_TERRACOTTA_PILLAR = registerPillar(Blocks.PURPLE_GLAZED_TERRACOTTA);
    public static final Block MAGENTA_GLAZED_TERRACOTTA_PILLAR = registerPillar(Blocks.MAGENTA_GLAZED_TERRACOTTA);
    public static final Block PINK_GLAZED_TERRACOTTA_PILLAR = registerPillar(Blocks.PINK_GLAZED_TERRACOTTA);

    // Pressure Plates
    public static final Block POLISHED_ANDESITE_PRESSURE_PLATE = stonePressurePlate(Blocks.POLISHED_ANDESITE);
    public static final Block POLISHED_DIORITE_PRESSURE_PLATE = stonePressurePlate(Blocks.POLISHED_DIORITE);
    public static final Block POLISHED_GRANITE_PRESSURE_PLATE = stonePressurePlate(Blocks.POLISHED_GRANITE);
    public static final Block LIMESTONE_PRESSURE_PLATE = stonePressurePlate(BlockusBlocks.LIMESTONE.block);
    public static final Block MARBLE_PRESSURE_PLATE = stonePressurePlate(BlockusBlocks.MARBLE.block);
    public static final Block BLUESTONE_PRESSURE_PLATE = stonePressurePlate(BlockusBlocks.BLUESTONE.block);
    public static final Block VIRIDITE_PRESSURE_PLATE = stonePressurePlate(BlockusBlocks.VIRIDITE.block);
    public static final Block POLISHED_NETHERRACK_PRESSURE_PLATE = stonePressurePlate(BlockusBlocks.POLISHED_NETHERRACK.block);
    public static final Block POLISHED_END_STONE_PRESSURE_PLATE = stonePressurePlate(BlockusBlocks.POLISHED_END_STONE.block);
    public static final Block POLISHED_BASALT_PRESSURE_PLATE = stonePressurePlate(Blocks.POLISHED_BASALT);
    public static final Block POLISHED_DEEPSLATE_PRESSURE_PLATE = stonePressurePlate(Blocks.POLISHED_DEEPSLATE);
    public static final Block POLISHED_TUFF_PRESSURE_PLATE = stonePressurePlate(Blocks.POLISHED_TUFF);
    public static final Block POLISHED_SCULK_PRESSURE_PLATE = stonePressurePlate(BlockusBlocks.POLISHED_SCULK.block);
    public static final Block OBSIDIAN_PRESSURE_PLATE = register("obsidian_pressure_plate", ObsidianPressurePlateBlock::new, createCopy(Blocks.OBSIDIAN).solid().noCollision().pistonBehavior(PistonBehavior.DESTROY));

    // Buttons
    public static final Block POLISHED_ANDESITE_BUTTON = stoneButton(Blocks.POLISHED_ANDESITE);
    public static final Block POLISHED_DIORITE_BUTTON = stoneButton(Blocks.POLISHED_DIORITE);
    public static final Block POLISHED_GRANITE_BUTTON = stoneButton(Blocks.POLISHED_GRANITE);
    public static final Block LIMESTONE_BUTTON = stoneButton(BlockusBlocks.LIMESTONE.block);
    public static final Block MARBLE_BUTTON = stoneButton(BlockusBlocks.MARBLE.block);
    public static final Block BLUESTONE_BUTTON = stoneButton(BlockusBlocks.BLUESTONE.block);
    public static final Block VIRIDITE_BUTTON = stoneButton(BlockusBlocks.VIRIDITE.block);
    public static final Block POLISHED_NETHERRACK_BUTTON = stoneButton(BlockusBlocks.POLISHED_NETHERRACK.block);
    public static final Block POLISHED_END_STONE_BUTTON = stoneButton(BlockusBlocks.POLISHED_END_STONE.block);
    public static final Block POLISHED_BASALT_BUTTON = stoneButton(Blocks.POLISHED_BASALT);
    public static final Block POLISHED_DEEPSLATE_BUTTON = stoneButton(Blocks.POLISHED_DEEPSLATE);
    public static final Block POLISHED_TUFF_BUTTON = stoneButton(Blocks.POLISHED_TUFF);
    public static final Block POLISHED_SCULK_BUTTON = stoneButton(BlockusBlocks.POLISHED_SCULK.block);

    // Thatch
    public static final BSSWBundle THATCH = new BSSWBundle("thatch", Blocks.HAY_BLOCK, false);

    // Paper
    public static final Block PAPER_BLOCK = register("paper_block", create().mapColor(MapColor.OFF_WHITE).strength(0.1f, 0.8f).sounds(BlockSoundGroup.GRASS));
    public static final Block BURNT_PAPER_BLOCK = register("burnt_paper_block", create().mapColor(MapColor.STONE_GRAY).strength(0.1f, 0.8f).sounds(BlockSoundGroup.GRASS));
    public static final Block FRAMED_PAPER_BLOCK = register("framed_paper_block", create().mapColor(MapColor.OFF_WHITE).instrument(NoteBlockInstrument.BASS).strength(0.1f, 0.8f).sounds(BlockSoundGroup.WOOD).burnable());
    public static final Block PAPER_WALL = woodenPane("paper_wall");
    public static final Block PAPER_DOOR = woodenDoor("paper_door", 0.1f, 0.8f, BlockSoundGroup.WOOD, MapColor.OFF_WHITE, BlockSetType.OAK);
    public static final Block PAPER_TRAPDOOR = woodenTrapdoor("paper_trapdoor", 0.1f, 0.8f, BlockSoundGroup.WOOD, MapColor.OFF_WHITE, BlockSetType.OAK);
    public static final Block PAPER_LAMP = register("paper_lamp", PaperLampBlock::new, create().mapColor(MapColor.OFF_WHITE).strength(0.1f, 0.8f).sounds(BlockSoundGroup.GRASS).luminance((state) -> 15).instrument(NoteBlockInstrument.BASS));

    // Plating
    public static final BSSWBundle IRON_PLATING = new BSSWBundle("iron_plating", Blocks.IRON_BLOCK, MapColor.STONE_GRAY, false);
    public static final BSSWBundle GOLD_PLATING = new BSSWBundle("gold_plating", Blocks.GOLD_BLOCK, false);

    // Gates - chains - bars
    public static final Block IRON_GATE = register("iron_gate", (settings) -> new DoorBlock(BlockSetType.IRON, settings), createCopy(Blocks.IRON_DOOR));
    public static final Block GOLDEN_GATE = register("golden_gate", (settings) -> new DoorBlock(BlockSetType.IRON, settings), createCopy(Blocks.IRON_DOOR));
    public static final Block GOLDEN_BARS = register("golden_bars", PaneBlock::new, createCopy(Blocks.IRON_BARS));
    public static final Block GOLDEN_CHAIN = register("golden_chain", ChainBlock::new, createCopy(Blocks.CHAIN));

    // Lantern Blocks
    public static final Block LANTERN_BLOCK = register("lantern_block", createCopy(Blocks.LANTERN, PistonBehavior.NORMAL));
    public static final Block SOUL_LANTERN_BLOCK = register("soul_lantern_block", createCopy(Blocks.SOUL_LANTERN, PistonBehavior.NORMAL));
    public static final Block AMETHYST_LANTERN = register("amethyst_lantern", LanternBlock::new, createCopy(Blocks.LANTERN));
    public static final Block AMETHYST_LANTERN_BLOCK = register("amethyst_lantern_block", createCopy(Blocks.LANTERN, PistonBehavior.NORMAL));
    public static final Block REDSTONE_LANTERN = register("redstone_lantern", RedstoneLantern::new, createCopy(Blocks.LANTERN).luminance((state) -> 7));
    public static final Block REDSTONE_LANTERN_BLOCK = register("redstone_lantern_block", RedstoneBlock::new, createCopy(REDSTONE_LANTERN).luminance((state) -> 7).pistonBehavior(PistonBehavior.NORMAL));
    public static final Block SOUL_O_LANTERN = register("soul_o_lantern", CarvedPumpkinBlock::new, createCopy(Blocks.JACK_O_LANTERN).luminance((state) -> 10));
    public static final Block REDSTONE_O_LANTERN = register("redstone_o_lantern", RedstonePumpkinBlock::new, createCopy(Blocks.JACK_O_LANTERN).luminance((state) -> 7));
    public static final Block AMETHYST_LAMP = register("amethyst_lamp", AmethystLampBlock::new, createCopy(Blocks.AMETHYST_BLOCK));

    // Barriers
    public static final Block CAUTION_BARRIER = register("caution_barrier", Barrier::new, create().mapColor(MapColor.YELLOW).strength(1.5F, 1200.0F).instrument(NoteBlockInstrument.BASEDRUM).requiresTool());
    public static final Block ROAD_BARRIER = register("road_barrier", Barrier::new, create().mapColor(MapColor.STONE_GRAY).strength(2.0F, 6.0F).instrument(NoteBlockInstrument.BASEDRUM).requiresTool());

    // Netherite Blocks
    public static final Block NETHERITE_STAIRS = registerStairs(Blocks.NETHERITE_BLOCK);
    public static final Block NETHERITE_SLAB = registerSlab(Blocks.NETHERITE_BLOCK);

    // Other
    public static final Block PATH = register("path", DirtPathBlock::new, createCopy(Blocks.DIRT_PATH));
    public static final Block CHARCOAL_BLOCK = register("charcoal_block", createCopy(Blocks.COAL_BLOCK));
    public static final Block SUGAR_BLOCK = register("sugar_block", SimpleFallingBlock::new, create().mapColor(MapColor.OFF_WHITE).strength(0.5F).sounds(BlockSoundGroup.SAND));
    public static final Block ENDER_BLOCK = register("ender_block", create().mapColor(MapColor.TERRACOTTA_GREEN).strength(5.0f, 6.0f));
    public static final Block ROTTEN_FLESH_BLOCK = register("rotten_flesh_block", create().mapColor(MapColor.TERRACOTTA_RED).strength(0.5f).sounds(BlockSoundGroup.SLIME));
    public static final Block MEMBRANE_BLOCK = register("membrane_block", create().mapColor(MapColor.TERRACOTTA_WHITE).strength(0.5f).sounds(BlockSoundGroup.SLIME));
    public static final Block NETHER_STAR_BLOCK = registerGlint("nether_stars_block", NetherStarBlock::new, create().mapColor(MapColor.OFF_WHITE).strength(5.0f, 6.0f).requiresTool());
    public static final Block REDSTONE_SAND = register("redstone_sand", FallingRedstoneBlock::new, createCopy(Blocks.SAND).mapColor(MapColor.BRIGHT_RED));
    public static final Block LOVE_BLOCK = register("love_block", LoveBlock::new, create().mapColor(MapColor.PINK).strength(2, 6.0f).requiresTool());
    public static final Block WEIGHT_STORAGE_CUBE = register("weight_storage_cube", WeightStorageCubeBlock::new, create().mapColor(MapColor.IRON_GRAY).strength(0.1f, 6.0f));
    public static final Block COMPANION_CUBE = register("companion_cube", SimpleFallingBlock::new, create().mapColor(MapColor.IRON_GRAY).strength(0.1F, 6.0F).sounds(BlockSoundGroup.STONE));
    public static final Block CAUTION_BLOCK = register("caution_block", create().mapColor(MapColor.ORANGE).strength(1.5f, 1200.0f).requiresTool());
    public static final Block STARS_BLOCK = register("stars_block", create().mapColor(MapColor.BLACK).strength(5.0f, 6.0f));

    // Legacy
    public static final Block LEGACY_SAPLING = registerLegacy("legacy_sapling", (settings) -> new SaplingBlock(BlockusSaplingGenerator.LEGACY_OAK, settings), createCopy(Blocks.OAK_SAPLING), "Indev");
    public static final PottedLargeBundle POTTED_LEGACY_TREE = new PottedLargeBundle("potted_legacy_tree", BlockusBlocks.LEGACY_SAPLING);
    public static final Block POTTED_LEGACY_SAPLING = pottedPlant("potted_legacy_sapling", LEGACY_SAPLING);
    public static final Block LEGACY_FIRST_GRASS_BLOCK = registerLegacy("legacy_first_grass_block", createCopy(Blocks.GRASS_BLOCK), "Cave game");
    public static final Block LEGACY_GRASS_BLOCK = registerLegacy("legacy_grass_block", createCopy(Blocks.GRASS_BLOCK), "Pre-Classic");
    public static final Block LEGACY_LEAVES = registerLegacy("legacy_leaves", LeavesBlock::new, createCopy(Blocks.OAK_LEAVES).mapColor(MapColor.LIME).allowsSpawning(BlockusBlocks::canSpawnOnLeaves).suffocates(BlockusBlocks::never).blockVision(BlockusBlocks::never), "Classic 0.0.15a");
    public static final Block LEGACY_LOG = registerLegacy("legacy_log", PillarBlock::new, createCopy(Blocks.OAK_LOG), "Classic 0.0.14a");
    public static final Block LEGACY_BRICKS = registerLegacy("legacy_bricks", createCopy(Blocks.BRICKS), "Classic 0.26");
    public static final Block LEGACY_PLANKS = registerLegacy("legacy_planks", createCopy(Blocks.OAK_PLANKS), "Pre-Classic");
    public static final Block LEGACY_FIRST_COBBLESTONE = registerLegacy("legacy_first_cobblestone", createCopy(Blocks.COBBLESTONE), "Pre-Classic");
    public static final Block LEGACY_COBBLESTONE = registerLegacy("legacy_cobblestone", createCopy(Blocks.COBBLESTONE), "Classic 0.0.14a");
    public static final Block LEGACY_MOSSY_COBBLESTONE = registerLegacy("legacy_mossy_cobblestone", createCopy(Blocks.MOSSY_COBBLESTONE), "Classic 0.26");
    public static final Block LEGACY_GRAVEL = registerLegacy("legacy_gravel", (settings) -> new ColoredFallingBlock(new ColorCode(-8356741), settings), createCopy(Blocks.GRAVEL), "Classic 0.0.15a");
    public static final Block LEGACY_IRON_BLOCK = registerLegacy("legacy_iron_block", createCopy(Blocks.IRON_BLOCK), "Classic 0.26");
    public static final Block LEGACY_GOLD_BLOCK = registerLegacy("legacy_gold_block", createCopy(Blocks.GOLD_BLOCK), "Classic 0.26");
    public static final Block LEGACY_EXPLOSION_PROOF_GOLD_BLOCK = registerLegacy("legacy_explosion_proof_gold_block", createCopy(Blocks.GOLD_BLOCK).strength(5.0f, 6000.0f), "Classic 0.0.20a");
    public static final Block LEGACY_COAL_BLOCK = registerLegacy("legacy_coal_block", createCopy(Blocks.COAL_BLOCK), "2.0 April Fool");
    public static final Block LEGACY_DIAMOND_BLOCK = registerLegacy("legacy_diamond_block", createCopy(Blocks.DIAMOND_BLOCK), "Indev");
    public static final Block LEGACY_LAPIS_BLOCK = registerLegacy("legacy_lapis_block", createCopy(Blocks.LAPIS_BLOCK), "Beta 1.2");
    public static final Block LEGACY_SPONGE = registerLegacy("legacy_sponge", SpongeBlock::new, createCopy(Blocks.SPONGE), "Classic 0.0.19a");
    public static final Block LEGACY_CRYING_OBSIDIAN = registerLegacy("legacy_crying_obsidian", createCopy(Blocks.CRYING_OBSIDIAN, PistonBehavior.BLOCK), "Beta 1.3 (texture)");
    public static final Block LEGACY_GLOWSTONE = registerLegacy("legacy_glowstone", createCopy(Blocks.GLOWSTONE), "Alpha 1.2.0");
    public static final Block LEGACY_STONECUTTER = registerLegacy("legacy_stonecutter", LegacyStonecutterBlock::new, createCopy(Blocks.COBBLESTONE).strength(1.5f, 17.5f), "PE Alpha");
    public static final Block LEGACY_GLOWING_OBSIDIAN = registerLegacy("legacy_glowing_obsidian", createCopy(BlockusBlocks.GLOWING_OBSIDIAN), "PE Alpha");
    public static final Block LEGACY_NETHER_REACTOR_CORE = registerLegacy("legacy_nether_reactor_core", create().mapColor(MapColor.LIGHT_BLUE).strength(1.5f, 6.0f).requiresTool(), "PE Alpha");
    public static final Block LEGACY_ROSE = registerLegacy("legacy_rose", (settings) -> new FlowerBlock(StatusEffects.NIGHT_VISION, 5.0F, settings), createCopy(Blocks.POPPY), "Beta 1.8");
    public static final Block POTTED_LEGACY_ROSE = pottedPlant("potted_legacy_rose", LEGACY_ROSE);
    public static final Block LEGACY_BLUE_ROSE = registerLegacy("legacy_blue_rose", (settings) -> new FlowerBlock(StatusEffects.NIGHT_VISION, 5.0F, settings), createCopy(Blocks.POPPY), "PE Alpha");
    public static final Block POTTED_LEGACY_BLUE_ROSE = pottedPlant("potted_legacy_blue_rose", LEGACY_BLUE_ROSE);


    // Colored Tiles
    /**
     * <p>Bicolor variants in {@link ColoredTilesBundle}.
     */
    public static final Block WHITE_COLORED_TILES = register("white_colored_tiles", createCopy(Blocks.WHITE_CONCRETE));
    public static final Block ORANGE_COLORED_TILES = register("orange_colored_tiles", createCopy(Blocks.ORANGE_CONCRETE));
    public static final Block MAGENTA_COLORED_TILES = register("magenta_colored_tiles", createCopy(Blocks.MAGENTA_CONCRETE));
    public static final Block LIGHT_BLUE_COLORED_TILES = register("light_blue_colored_tiles", createCopy(Blocks.LIGHT_BLUE_CONCRETE));
    public static final Block YELLOW_COLORED_TILES = register("yellow_colored_tiles", createCopy(Blocks.YELLOW_CONCRETE));
    public static final Block LIME_COLORED_TILES = register("lime_colored_tiles", createCopy(Blocks.LIME_CONCRETE));
    public static final Block PINK_COLORED_TILES = register("pink_colored_tiles", createCopy(Blocks.PINK_CONCRETE));
    public static final Block GRAY_COLORED_TILES = register("gray_colored_tiles", createCopy(Blocks.GRAY_CONCRETE));
    public static final Block LIGHT_GRAY_COLORED_TILES = register("light_gray_colored_tiles", createCopy(Blocks.LIGHT_GRAY_CONCRETE));
    public static final Block CYAN_COLORED_TILES = register("cyan_colored_tiles", createCopy(Blocks.CYAN_CONCRETE));
    public static final Block PURPLE_COLORED_TILES = register("purple_colored_tiles", createCopy(Blocks.PURPLE_CONCRETE));
    public static final Block BLUE_COLORED_TILES = register("blue_colored_tiles", createCopy(Blocks.BLUE_CONCRETE));
    public static final Block BROWN_COLORED_TILES = register("brown_colored_tiles", createCopy(Blocks.BROWN_CONCRETE));
    public static final Block GREEN_COLORED_TILES = register("green_colored_tiles", createCopy(Blocks.GREEN_CONCRETE));
    public static final Block RED_COLORED_TILES = register("red_colored_tiles", createCopy(Blocks.RED_CONCRETE));
    public static final Block BLACK_COLORED_TILES = register("black_colored_tiles", createCopy(Blocks.BLACK_CONCRETE));
    public static final Block RAINBOW_COLORED_TILES = register("rainbow_colored_tiles", HorizontalAxisBlock::new, createCopy(Blocks.LIGHT_BLUE_CONCRETE));

}
