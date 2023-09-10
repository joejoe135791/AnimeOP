
package net.mcreator.animemashup.item;

import top.theillusivec4.curios.api.type.capability.ICurioItem;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.animemashup.init.AnimemashupModTabs;

public class HeadbandItem extends Item implements ICurioItem {
	public HeadbandItem() {
		super(new Item.Properties().tab(AnimemashupModTabs.TAB_NARUTO).stacksTo(64).rarity(Rarity.COMMON));
	}
}
