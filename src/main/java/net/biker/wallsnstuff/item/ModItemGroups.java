package net.biker.wallsnstuff.item;

import net.biker.wallsnstuff.Wallsnstuff;
import net.biker.wallsnstuff.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;


public class ModItemGroups {
    public static final ItemGroup WALLS_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(Wallsnstuff.MOD_ID, "walls"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.walls"))
                    .icon(() -> new ItemStack(ModItems.TEST)).entries((displayContext, entries) -> {
                        entries.add(ModItems.TEST);

                        entries.add(ModBlocks.TEST_BLOCK);
                        entries.add(ModBlocks.TEST_ORE);
                        entries.add(ModItems.DETECTOR);
                        entries.add(ModBlocks.COBBLESTONE_FENCE);
                        entries.add(ModBlocks.COBBLESTONE_GATE);

                    }).build());
    public  static  void registerItemGroups() {
        Wallsnstuff.LOGGER.info("registering item group for wallsnstuff mod");
    }
}
