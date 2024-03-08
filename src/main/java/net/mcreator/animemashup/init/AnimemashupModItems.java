
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

import net.mcreator.animemashup.item.WrappingsItem;
import net.mcreator.animemashup.item.UnobtainableheadbandItem;
import net.mcreator.animemashup.item.UchihakusanagiItem;
import net.mcreator.animemashup.item.PurpleKusanagiBaubleItem;
import net.mcreator.animemashup.item.MichiruItem;
import net.mcreator.animemashup.item.KunaiItem;
import net.mcreator.animemashup.item.KubikiribochoItem;
import net.mcreator.animemashup.item.HeadbandItem;
import net.mcreator.animemashup.item.FirstJoinResetItem;
import net.mcreator.animemashup.item.EarsItem;
import net.mcreator.animemashup.item.DefaultNichirinItem;
import net.mcreator.animemashup.item.DeathrayDEVITEMItem;
import net.mcreator.animemashup.item.ChakraniteNuggetItem;
import net.mcreator.animemashup.item.ChakraniteItem;
import net.mcreator.animemashup.item.ChakraniteIngotItem;
import net.mcreator.animemashup.AnimemashupMod;

public class AnimemashupModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, AnimemashupMod.MODID);
	public static final RegistryObject<Item> CHAKRANITE_ORE = block(AnimemashupModBlocks.CHAKRANITE_ORE, AnimemashupModTabs.TAB_NARUTO);
	public static final RegistryObject<Item> RAW_CHAKRANITE = REGISTRY.register("raw_chakranite", () -> new ChakraniteItem());
	public static final RegistryObject<Item> CHAKRANITE_INGOT = REGISTRY.register("chakranite_ingot", () -> new ChakraniteIngotItem());
	public static final RegistryObject<Item> CHAKRANITE_NUGGET = REGISTRY.register("chakranite_nugget", () -> new ChakraniteNuggetItem());
	public static final RegistryObject<Item> KUBIKIRIBOCHO = REGISTRY.register("kubikiribocho", () -> new KubikiribochoItem());
	public static final RegistryObject<Item> UNOBTAINABLEHEADBAND = REGISTRY.register("unobtainableheadband", () -> new UnobtainableheadbandItem());
	public static final RegistryObject<Item> HEADBAND = REGISTRY.register("headband", () -> new HeadbandItem());
	public static final RegistryObject<Item> PURPLE_KUSANAGI_BAUBLE = REGISTRY.register("purple_kusanagi_bauble", () -> new PurpleKusanagiBaubleItem());
	public static final RegistryObject<Item> EARS = REGISTRY.register("ears", () -> new EarsItem());
	public static final RegistryObject<Item> MICHIRU_HELMET = REGISTRY.register("michiru_helmet", () -> new MichiruItem.Helmet());
	public static final RegistryObject<Item> MICHIRU_CHESTPLATE = REGISTRY.register("michiru_chestplate", () -> new MichiruItem.Chestplate());
	public static final RegistryObject<Item> DEFAULT_NICHIRIN = REGISTRY.register("default_nichirin", () -> new DefaultNichirinItem());
	public static final RegistryObject<Item> DEATHRAY_DEVITEM = REGISTRY.register("deathray_devitem", () -> new DeathrayDEVITEMItem());
	public static final RegistryObject<Item> UCHIHAKUSANAGI = REGISTRY.register("uchihakusanagi", () -> new UchihakusanagiItem());
	public static final RegistryObject<Item> WRAPPINGS = REGISTRY.register("wrappings", () -> new WrappingsItem());
	public static final RegistryObject<Item> KUNAI = REGISTRY.register("kunai", () -> new KunaiItem());
	public static final RegistryObject<Item> FIRST_JOIN_RESET = REGISTRY.register("first_join_reset", () -> new FirstJoinResetItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
