
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.sculkmod.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.sculkmod.client.model.Modelsculkman;
import net.mcreator.sculkmod.client.model.Modelsculkfox;
import net.mcreator.sculkmod.client.model.Modelphantomsculk;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class SculkModModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelsculkfox.LAYER_LOCATION, Modelsculkfox::createBodyLayer);
		event.registerLayerDefinition(Modelphantomsculk.LAYER_LOCATION, Modelphantomsculk::createBodyLayer);
		event.registerLayerDefinition(Modelsculkman.LAYER_LOCATION, Modelsculkman::createBodyLayer);
	}
}
