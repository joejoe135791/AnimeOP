
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.animemashup.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class AnimemashupModTabs {
	public static CreativeModeTab TAB_NARUTO;

	public static void load() {
		TAB_NARUTO = new CreativeModeTab("tabnaruto") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(AnimemashupModItems.UNOBTAINABLEHEADBAND.get());
			}

			@Override
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
	}
}
