
package net.mcreator.animemashup.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.animemashup.init.AnimemashupModTabs;

public class ChakraniteItem extends Item {
	public ChakraniteItem() {
		super(new Item.Properties().tab(AnimemashupModTabs.TAB_NARUTO).stacksTo(64).rarity(Rarity.RARE));
	}
}
