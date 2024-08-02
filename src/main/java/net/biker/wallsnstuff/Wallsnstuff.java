package net.biker.wallsnstuff;

import net.biker.wallsnstuff.block.ModBlocks;
import net.biker.wallsnstuff.item.ModItemGroups;
import net.biker.wallsnstuff.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Wallsnstuff implements ModInitializer {
	public static final String MOD_ID = "wallsnstuff";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}