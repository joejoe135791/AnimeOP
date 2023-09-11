
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.animemashup.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.animemashup.client.model.Modelblueleafheadband;
import net.mcreator.animemashup.client.model.ModelPurple_Kusanagi_Converted;
import net.mcreator.animemashup.client.model.ModelKunai_Test_1_Converted;
import net.mcreator.animemashup.client.model.ModelKunai;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class AnimemashupModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelblueleafheadband.LAYER_LOCATION, Modelblueleafheadband::createBodyLayer);
		event.registerLayerDefinition(ModelPurple_Kusanagi_Converted.LAYER_LOCATION, ModelPurple_Kusanagi_Converted::createBodyLayer);
		event.registerLayerDefinition(ModelKunai_Test_1_Converted.LAYER_LOCATION, ModelKunai_Test_1_Converted::createBodyLayer);
		event.registerLayerDefinition(ModelKunai.LAYER_LOCATION, ModelKunai::createBodyLayer);
	}
}
