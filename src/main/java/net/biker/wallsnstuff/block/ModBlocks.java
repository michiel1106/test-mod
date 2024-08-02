package net.biker.wallsnstuff.block;

import net.biker.wallsnstuff.Wallsnstuff;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class ModBlocks {

    public static final Block TEST_BLOCK = registerBlock("test_block",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).sounds(BlockSoundGroup.DEEPSLATE)));

    public static final Block TEST_ORE = registerBlock("test_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.STONE).strength(3f), UniformIntProvider.create(1,2)));


    public static final Block COBBLESTONE_FENCE = registerBlock("cobblestone_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE)));

    public static final Block COBBLESTONE_GATE = registerBlock("cobblestone_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.STONE), WoodType.ACACIA));


    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(Wallsnstuff.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(Wallsnstuff.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        Wallsnstuff.LOGGER.info("logging the registering wallnstuff");

    }
}
