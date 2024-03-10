
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.animemashup.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.animemashup.entity.ShurikenEntity;
import net.mcreator.animemashup.entity.KunaiEntity;
import net.mcreator.animemashup.entity.DeveloperExuhplosiooonEntity;
import net.mcreator.animemashup.AnimemashupMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class AnimemashupModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, AnimemashupMod.MODID);
	public static final RegistryObject<EntityType<KunaiEntity>> KUNAI = register("projectile_kunai",
			EntityType.Builder.<KunaiEntity>of(KunaiEntity::new, MobCategory.MISC).setCustomClientFactory(KunaiEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<ShurikenEntity>> SHURIKEN = register("projectile_shuriken",
			EntityType.Builder.<ShurikenEntity>of(ShurikenEntity::new, MobCategory.MISC).setCustomClientFactory(ShurikenEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<DeveloperExuhplosiooonEntity>> DEVELOPER_EXUHPLOSIOOON = register("projectile_developer_exuhplosiooon",
			EntityType.Builder.<DeveloperExuhplosiooonEntity>of(DeveloperExuhplosiooonEntity::new, MobCategory.MISC).setCustomClientFactory(DeveloperExuhplosiooonEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
	}
}
