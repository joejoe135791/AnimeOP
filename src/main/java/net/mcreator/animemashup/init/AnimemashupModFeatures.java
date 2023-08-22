
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.animemashup.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.mcreator.animemashup.world.features.ores.ChakraniteOreFeature;
import net.mcreator.animemashup.AnimemashupMod;

@Mod.EventBusSubscriber
public class AnimemashupModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, AnimemashupMod.MODID);
	public static final RegistryObject<Feature<?>> CHAKRANITE_ORE = REGISTRY.register("chakranite_ore", ChakraniteOreFeature::feature);
}
