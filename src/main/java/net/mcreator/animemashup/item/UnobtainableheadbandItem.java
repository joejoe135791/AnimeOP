
package net.mcreator.animemashup.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class UnobtainableheadbandItem extends Item {
	public UnobtainableheadbandItem() {
		super(new Item.Properties().tab(null).stacksTo(64).rarity(Rarity.EPIC).food((new FoodProperties.Builder()).nutrition(999).saturationMod(90f).alwaysEat().meat().build()));
	}
}
