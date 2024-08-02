package net.biker.wallsnstuff.datagen;

import com.mojang.datafixers.types.templates.Tag;
import net.biker.wallsnstuff.block.ModBlocks;
import net.biker.wallsnstuff.util.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(ModTags.Blocks.DETECTOR_DETECTABLE_BLOCKS)
                .add(ModBlocks.TEST_ORE)
                .forceAddTag(BlockTags.WALLS);

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.COBBLESTONE_FENCE)
                .add(ModBlocks.COBBLESTONE_GATE);

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.COBBLESTONE_GATE)
                .add(ModBlocks.COBBLESTONE_FENCE);


        getOrCreateTagBuilder(BlockTags.FENCES)
                .add(ModBlocks.COBBLESTONE_FENCE);


        getOrCreateTagBuilder(BlockTags.FENCE_GATES)
                .add(ModBlocks.COBBLESTONE_GATE);


        getOrCreateTagBuilder(BlockTags.WALLS);

    }
}
