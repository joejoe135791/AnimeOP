
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.animemashup.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.animemashup.world.inventory.MenunaruMenu;
import net.mcreator.animemashup.world.inventory.DupeMenu;
import net.mcreator.animemashup.AnimemashupMod;

public class AnimemashupModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, AnimemashupMod.MODID);
	public static final RegistryObject<MenuType<DupeMenu>> DUPE = REGISTRY.register("dupe", () -> IForgeMenuType.create(DupeMenu::new));
	public static final RegistryObject<MenuType<MenunaruMenu>> MENUNARU = REGISTRY.register("menunaru", () -> IForgeMenuType.create(MenunaruMenu::new));
}
