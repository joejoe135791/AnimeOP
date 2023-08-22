
package net.mcreator.animemashup.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.animemashup.init.AnimemashupModTabs;

public class ChakraniteIngotItem extends Item {
	public ChakraniteIngotItem() {
		super(new Item.Properties().tab(AnimemashupModTabs.TAB_NARUTO).stacksTo(64).rarity(Rarity.RARE));
	}
}
