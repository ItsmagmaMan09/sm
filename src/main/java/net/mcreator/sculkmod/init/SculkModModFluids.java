
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.sculkmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.material.Fluid;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

import net.mcreator.sculkmod.fluid.LiquidSculkFluid;
import net.mcreator.sculkmod.SculkModMod;

public class SculkModModFluids {
	public static final DeferredRegister<Fluid> REGISTRY = DeferredRegister.create(ForgeRegistries.FLUIDS, SculkModMod.MODID);
	public static final RegistryObject<Fluid> LIQUID_SCULK = REGISTRY.register("liquid_sculk", () -> new LiquidSculkFluid.Source());
	public static final RegistryObject<Fluid> FLOWING_LIQUID_SCULK = REGISTRY.register("flowing_liquid_sculk", () -> new LiquidSculkFluid.Flowing());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			ItemBlockRenderTypes.setRenderLayer(LIQUID_SCULK.get(), renderType -> renderType == RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_LIQUID_SCULK.get(), renderType -> renderType == RenderType.translucent());
		}
	}
}
