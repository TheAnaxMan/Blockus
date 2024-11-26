package com.brand.blockus.utils;

import java.util.List;
import java.util.stream.Stream;

public class BlockChecker {

    public static final List<String> FLAMMABLE_WOODS = List.of("oak", "spruce", "birch", "jungle", "acacia", "dark_oak", "mangrove", "cherry", "pale_oak", "bamboo", "raw_bamboo", "white_oak");
    public static final List<String> NON_FLAMMABLE_WOODS = List.of("crimson", "warped", "charred");
    public static final List<String> WOODS = Stream.concat(FLAMMABLE_WOODS.stream(), NON_FLAMMABLE_WOODS.stream()).toList();

    public static boolean isWoodenMosaic(String type, List<String> types) {
        return types.stream().anyMatch(t -> type.equals(t + "_mosaic"));
    }

    public static boolean isMossyPlanks(String type, List<String> types) {
        return types.stream().anyMatch(t -> type.equals("mossy_" + t + "_planks"));
    }

    public static boolean isUnwaxedCopper(String baseId) {
        return baseId.contains("copper") && !baseId.contains("waxed");
    }

    public static boolean isAmethyst(String baseId) {
        return baseId.contains("amethyst");
    }

    public static boolean isRedstone(String baseId) {
        return baseId.contains("redstone");
    }

    public static boolean isNetherite(String baseId) {
        return baseId.contains("netherite");
    }
}
