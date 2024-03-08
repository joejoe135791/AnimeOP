
package net.mcreator.animemashup.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.animemashup.init.AnimemashupModTabs;

public class WrappingsItem extends Item {
	public WrappingsItem() {
		super(new Item.Properties().tab(AnimemashupModTabs.TAB_SHARED_ITEMS).stacksTo(16).rarity(Rarity.COMMON));
	}
}
