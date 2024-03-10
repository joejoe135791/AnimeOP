package net.mcreator.animemashup.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerEvent;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.mcreator.animemashup.AnimemashupMod;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class PlayerFirstJoinProcedure {
	@SubscribeEvent
	public static void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent event) {
		execute(event, event.getEntity());
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if (entity.getPersistentData().getBoolean("FirstJoin") != true) {
			entity.getPersistentData().putBoolean("FirstJoin", true);
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(Component.literal("first join setup complete"), true);
			AnimemashupMod.LOGGER.info(("Player" + "\"" + " " + entity.getDisplayName().getString() + "\"" + " " + "Has joined for the first time!"));
		} else {
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(Component.literal(("Welcome back" + " " + entity.getDisplayName().getString() + "!")), true);
		}
	}
}
