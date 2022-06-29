
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.sculkmod.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.sculkmod.client.renderer.SculkthingRenderer;
import net.mcreator.sculkmod.client.renderer.SculkfoxRenderer;
import net.mcreator.sculkmod.client.renderer.SculkWalkerRenderer;
import net.mcreator.sculkmod.client.renderer.PhantomsculkRenderer;
import net.mcreator.sculkmod.client.renderer.CheapWardenRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class SculkModModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(SculkModModEntities.SCULKFOX.get(), SculkfoxRenderer::new);
		event.registerEntityRenderer(SculkModModEntities.CHEAP_WARDEN.get(), CheapWardenRenderer::new);
		event.registerEntityRenderer(SculkModModEntities.SCULKTHING.get(), SculkthingRenderer::new);
		event.registerEntityRenderer(SculkModModEntities.PHANTOMSCULK.get(), PhantomsculkRenderer::new);
		event.registerEntityRenderer(SculkModModEntities.SCULK_WALKER.get(), SculkWalkerRenderer::new);
	}
}
