package net.mcreator.animemashup.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.mcreator.animemashup.AnimemashupMod;

public class ResetFirstJoinProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _player && !_player.level.isClientSide())
			_player.displayClientMessage(Component.literal(("Player" + " " + "\"" + entity.getDisplayName().getString() + "\"" + " " + "has used a developer item" + " " + "to reset their first join data" + " " + "data will be reset on next join!")),
					false);
		if (entity instanceof Player _player && !_player.level.isClientSide())
			_player.displayClientMessage(Component.literal(("Player" + " " + "\"" + entity.getDisplayName().getString() + "\"" + " " + "has used a developer item" + " " + "to reset their first join data" + " " + "data will be reset on next join!")),
					true);
		entity.getPersistentData().putBoolean("FirstJoin", false);
		AnimemashupMod.LOGGER.warn(("Player" + " " + "\"" + entity.getDisplayName().getString() + "\"" + " " + "has used a developer item" + " " + "to reset their first join data" + " " + "data will be reset on next join!"));
	}
}
