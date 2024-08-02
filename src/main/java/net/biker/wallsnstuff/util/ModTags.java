package net.biker.wallsnstuff.util;

import net.biker.wallsnstuff.Wallsnstuff;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> DETECTOR_DETECTABLE_BLOCKS =
                createTag("detector_detectable_blocks");

        private static TagKey<Block> createTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, new Identifier(Wallsnstuff.MOD_ID, name));
        }
    }
    public static class Items {

        private static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, new Identifier(Wallsnstuff.MOD_ID, name));
        }
    }
}

