
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.animemashup.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.animemashup.item.WhiteKusanagiScabbardItem;
import net.mcreator.animemashup.item.WhiteKusanagiItem;
import net.mcreator.animemashup.item.UnobtainableheadbandItem;
import net.mcreator.animemashup.item.RedKusanagiScabbardItem;
import net.mcreator.animemashup.item.RedKusanagiItem;
import net.mcreator.animemashup.item.PurpleKusanagiScabbardItem;
import net.mcreator.animemashup.item.PurpleKusanagiItem;
import net.mcreator.animemashup.item.PurpleKusanagiBaubleItem;
import net.mcreator.animemashup.item.KunaiItem;
import net.mcreator.animemashup.item.KubikiribochoItem;
import net.mcreator.animemashup.item.HeadbandItem;
import net.mcreator.animemashup.item.ChakraniteNuggetItem;
import net.mcreator.animemashup.item.ChakraniteItem;
import net.mcreator.animemashup.item.ChakraniteIngotItem;
import net.mcreator.animemashup.item.BlackKusanagiScabbardItem;
import net.mcreator.animemashup.item.BlackKusanagiItem;
import net.mcreator.animemashup.AnimemashupMod;

public class AnimemashupModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, AnimemashupMod.MODID);
	public static final RegistryObject<Item> KUNAI = REGISTRY.register("kunai", () -> new KunaiItem());
	public static final RegistryObject<Item> PURPLE_KUSANAGI = REGISTRY.register("purple_kusanagi", () -> new PurpleKusanagiItem());
	public static final RegistryObject<Item> PURPLE_KUSANAGI_SCABBARD = REGISTRY.register("purple_kusanagi_scabbard", () -> new PurpleKusanagiScabbardItem());
	public static final RegistryObject<Item> WHITE_KUSANAGI = REGISTRY.register("white_kusanagi", () -> new WhiteKusanagiItem());
	public static final RegistryObject<Item> WHITE_KUSANAGI_SCABBARD = REGISTRY.register("white_kusanagi_scabbard", () -> new WhiteKusanagiScabbardItem());
	public static final RegistryObject<Item> BLACK_KUSANAGI = REGISTRY.register("black_kusanagi", () -> new BlackKusanagiItem());
	public static final RegistryObject<Item> BLACK_KUSANAGI_SCABBARD = REGISTRY.register("black_kusanagi_scabbard", () -> new BlackKusanagiScabbardItem());
	public static final RegistryObject<Item> CHAKRANITE_ORE = block(AnimemashupModBlocks.CHAKRANITE_ORE, AnimemashupModTabs.TAB_NARUTO);
	public static final RegistryObject<Item> RAW_CHAKRANITE = REGISTRY.register("raw_chakranite", () -> new ChakraniteItem());
	public static final RegistryObject<Item> CHAKRANITE_INGOT = REGISTRY.register("chakranite_ingot", () -> new ChakraniteIngotItem());
	public static final RegistryObject<Item> CHAKRANITE_NUGGET = REGISTRY.register("chakranite_nugget", () -> new ChakraniteNuggetItem());
	public static final RegistryObject<Item> RED_KUSANAGI = REGISTRY.register("red_kusanagi", () -> new RedKusanagiItem());
	public static final RegistryObject<Item> RED_KUSANAGI_SCABBARD = REGISTRY.register("red_kusanagi_scabbard", () -> new RedKusanagiScabbardItem());
	public static final RegistryObject<Item> KUBIKIRIBOCHO = REGISTRY.register("kubikiribocho", () -> new KubikiribochoItem());
	public static final RegistryObject<Item> UNOBTAINABLEHEADBAND = REGISTRY.register("unobtainableheadband", () -> new UnobtainableheadbandItem());
	public static final RegistryObject<Item> HEADBAND = REGISTRY.register("headband", () -> new HeadbandItem());
	public static final RegistryObject<Item> PURPLE_KUSANAGI_BAUBLE = REGISTRY.register("purple_kusanagi_bauble", () -> new PurpleKusanagiBaubleItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
