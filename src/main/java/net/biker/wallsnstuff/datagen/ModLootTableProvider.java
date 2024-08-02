package net.biker.wallsnstuff.datagen;

import net.biker.wallsnstuff.block.ModBlocks;
import net.biker.wallsnstuff.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.TEST_BLOCK);
        addDrop(ModBlocks.TEST_ORE, oreDrops(ModBlocks.TEST_ORE, ModItems.TEST));
        addDrop(ModBlocks.COBBLESTONE_FENCE);
        addDrop(ModBlocks.COBBLESTONE_GATE);

    }
}
