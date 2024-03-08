
package net.mcreator.animemashup.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Item;

import net.mcreator.animemashup.init.AnimemashupModTabs;

public class UchihakusanagiItem extends SwordItem {
	public UchihakusanagiItem() {
		super(new Tier() {
			public int getUses() {
				return 690;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return 6f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 15;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of();
			}
		}, 3, -2.7f, new Item.Properties().tab(AnimemashupModTabs.TAB_NARUTO).fireResistant());
	}
}
