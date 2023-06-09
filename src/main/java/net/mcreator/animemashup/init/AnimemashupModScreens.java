
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.animemashup.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.animemashup.client.gui.MenunaruScreen;
import net.mcreator.animemashup.client.gui.DupeScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class AnimemashupModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(AnimemashupModMenus.DUPE.get(), DupeScreen::new);
			MenuScreens.register(AnimemashupModMenus.MENUNARU.get(), MenunaruScreen::new);
		});
	}
}
