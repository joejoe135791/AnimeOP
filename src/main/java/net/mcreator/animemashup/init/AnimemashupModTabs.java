
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.animemashup.init;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class AnimemashupModTabs {
	public static CreativeModeTab TAB_NARUTO;
	public static CreativeModeTab TAB_DEV_ITEMS;
	public static CreativeModeTab TAB_DEMONSLAYER;
	public static CreativeModeTab TAB_SHARED_ITEMS;

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
		TAB_DEV_ITEMS = new CreativeModeTab("tabdev_items") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(Blocks.COMMAND_BLOCK);
			}

			@Override
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
		TAB_DEMONSLAYER = new CreativeModeTab("tabdemonslayer") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(AnimemashupModItems.MICHIRU_HELMET.get());
			}

			@Override
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
		TAB_SHARED_ITEMS = new CreativeModeTab("tabshared_items") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(AnimemashupModItems.WRAPPINGS.get());
			}

			@Override
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
	}
}
