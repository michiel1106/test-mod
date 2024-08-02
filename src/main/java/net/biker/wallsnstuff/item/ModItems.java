package net.biker.wallsnstuff.item;

import net.biker.wallsnstuff.Wallsnstuff;
import net.biker.wallsnstuff.item.custom.DetectorItem;
import net.fabricmc.fabric.api.item.v1.FabricItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item TEST = registerItem("test", new Item(new FabricItemSettings()));

    public static final Item DETECTOR = registerItem("detector", new DetectorItem(new FabricItemSettings().maxDamage(1392393)));

    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
        entries.add(TEST);
    }

    private  static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Wallsnstuff.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Wallsnstuff.LOGGER.info("Registering Mod Items for " + Wallsnstuff.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(ModItems::addItemsToIngredientItemGroup);
    }
}
