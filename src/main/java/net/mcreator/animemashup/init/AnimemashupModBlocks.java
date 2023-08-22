
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.animemashup.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.animemashup.block.ChakraniteOreBlock;
import net.mcreator.animemashup.AnimemashupMod;

public class AnimemashupModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, AnimemashupMod.MODID);
	public static final RegistryObject<Block> CHAKRANITE_ORE = REGISTRY.register("chakranite_ore", () -> new ChakraniteOreBlock());
}
