
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.sculkmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import net.mcreator.sculkmod.block.SculkfruitBlock;
import net.mcreator.sculkmod.block.Sculk_GemOreBlock;
import net.mcreator.sculkmod.block.Sculk_GemBlockBlock;
import net.mcreator.sculkmod.block.SculkWorldPortalBlock;
import net.mcreator.sculkmod.block.SculkWoodBlock;
import net.mcreator.sculkmod.block.SculkStoneBlock;
import net.mcreator.sculkmod.block.SculkStairsBlock;
import net.mcreator.sculkmod.block.SculkSlabBlock;
import net.mcreator.sculkmod.block.SculkPressurePlateBlock;
import net.mcreator.sculkmod.block.SculkPlanksBlock;
import net.mcreator.sculkmod.block.SculkLogBlock;
import net.mcreator.sculkmod.block.SculkLeavesBlock;
import net.mcreator.sculkmod.block.SculkGrassBlock;
import net.mcreator.sculkmod.block.SculkFenceGateBlock;
import net.mcreator.sculkmod.block.SculkFenceBlock;
import net.mcreator.sculkmod.block.SculkButtonBlock;
import net.mcreator.sculkmod.block.SculkBlockBlock;
import net.mcreator.sculkmod.block.LiquidSculkBlock;
import net.mcreator.sculkmod.SculkModMod;

public class SculkModModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, SculkModMod.MODID);
	public static final RegistryObject<Block> SCULK_BLOCK = REGISTRY.register("sculk_block", () -> new SculkBlockBlock());
	public static final RegistryObject<Block> LIQUID_SCULK = REGISTRY.register("liquid_sculk", () -> new LiquidSculkBlock());
	public static final RegistryObject<Block> SCULK_WOOD = REGISTRY.register("sculk_wood", () -> new SculkWoodBlock());
	public static final RegistryObject<Block> SCULK_LOG = REGISTRY.register("sculk_log", () -> new SculkLogBlock());
	public static final RegistryObject<Block> SCULK_PLANKS = REGISTRY.register("sculk_planks", () -> new SculkPlanksBlock());
	public static final RegistryObject<Block> SCULK_LEAVES = REGISTRY.register("sculk_leaves", () -> new SculkLeavesBlock());
	public static final RegistryObject<Block> SCULK_STAIRS = REGISTRY.register("sculk_stairs", () -> new SculkStairsBlock());
	public static final RegistryObject<Block> SCULK_SLAB = REGISTRY.register("sculk_slab", () -> new SculkSlabBlock());
	public static final RegistryObject<Block> SCULK_FENCE = REGISTRY.register("sculk_fence", () -> new SculkFenceBlock());
	public static final RegistryObject<Block> SCULK_FENCE_GATE = REGISTRY.register("sculk_fence_gate", () -> new SculkFenceGateBlock());
	public static final RegistryObject<Block> SCULK_PRESSURE_PLATE = REGISTRY.register("sculk_pressure_plate", () -> new SculkPressurePlateBlock());
	public static final RegistryObject<Block> SCULK_BUTTON = REGISTRY.register("sculk_button", () -> new SculkButtonBlock());
	public static final RegistryObject<Block> SCULK_WORLD_PORTAL = REGISTRY.register("sculk_world_portal", () -> new SculkWorldPortalBlock());
	public static final RegistryObject<Block> SCULK_GEM_ORE = REGISTRY.register("sculk_gem_ore", () -> new Sculk_GemOreBlock());
	public static final RegistryObject<Block> SCULK_GEM_BLOCK = REGISTRY.register("sculk_gem_block", () -> new Sculk_GemBlockBlock());
	public static final RegistryObject<Block> SCULK_GRASS = REGISTRY.register("sculk_grass", () -> new SculkGrassBlock());
	public static final RegistryObject<Block> SCULKFRUIT = REGISTRY.register("sculkfruit", () -> new SculkfruitBlock());
	public static final RegistryObject<Block> SCULK_STONE = REGISTRY.register("sculk_stone", () -> new SculkStoneBlock());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			SculkLeavesBlock.registerRenderLayer();
			SculkfruitBlock.registerRenderLayer();
		}
	}
}
