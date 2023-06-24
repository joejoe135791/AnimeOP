
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.animemashup.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.animemashup.item.KunaiItem;
import net.mcreator.animemashup.AnimemashupMod;

public class AnimemashupModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, AnimemashupMod.MODID);
	public static final RegistryObject<Item> KUNAI = REGISTRY.register("kunai", () -> new KunaiItem());
}
