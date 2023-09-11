package net.mcreator.animemashup.init;

import top.theillusivec4.curios.api.client.CuriosRendererRegistry;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;

import net.mcreator.animemashup.client.renderer.PurpleKusanagiBaubleRenderer;
import net.mcreator.animemashup.client.renderer.HeadbandRenderer;
import net.mcreator.animemashup.client.model.Modelblueleafheadband;
import net.mcreator.animemashup.client.model.ModelPurple_Kusanagi_Converted;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class AnimemashupModCuriosRenderers {
	@SubscribeEvent
	public static void registerLayers(final EntityRenderersEvent.RegisterLayerDefinitions evt) {
		evt.registerLayerDefinition(AnimemashupModLayerDefinitions.HEADBAND, Modelblueleafheadband::createBodyLayer);
		evt.registerLayerDefinition(AnimemashupModLayerDefinitions.PURPLE_KUSANAGI_BAUBLE, ModelPurple_Kusanagi_Converted::createBodyLayer);
	}

	@SubscribeEvent
	public static void clientSetup(final FMLClientSetupEvent evt) {
		CuriosRendererRegistry.register(AnimemashupModItems.HEADBAND.get(), HeadbandRenderer::new);
		CuriosRendererRegistry.register(AnimemashupModItems.PURPLE_KUSANAGI_BAUBLE.get(), PurpleKusanagiBaubleRenderer::new);
	}
}
