
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.sculkmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.sculkmod.item.Sculk_GemSwordItem;
import net.mcreator.sculkmod.item.Sculk_GemShovelItem;
import net.mcreator.sculkmod.item.Sculk_GemPickaxeItem;
import net.mcreator.sculkmod.item.Sculk_GemItem;
import net.mcreator.sculkmod.item.Sculk_GemHoeItem;
import net.mcreator.sculkmod.item.Sculk_GemAxeItem;
import net.mcreator.sculkmod.item.Sculk_GemArmorItem;
import net.mcreator.sculkmod.item.SculkWorldItem;
import net.mcreator.sculkmod.item.LiquidSculkItem;
import net.mcreator.sculkmod.SculkModMod;

public class SculkModModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, SculkModMod.MODID);
	public static final RegistryObject<Item> SCULK_BLOCK = block(SculkModModBlocks.SCULK_BLOCK, CreativeModeTab.TAB_REDSTONE);
	public static final RegistryObject<Item> LIQUID_SCULK_BUCKET = REGISTRY.register("liquid_sculk_bucket", () -> new LiquidSculkItem());
	public static final RegistryObject<Item> SCULK_WOOD = block(SculkModModBlocks.SCULK_WOOD, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> SCULK_LOG = block(SculkModModBlocks.SCULK_LOG, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> SCULK_PLANKS = block(SculkModModBlocks.SCULK_PLANKS, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> SCULK_LEAVES = block(SculkModModBlocks.SCULK_LEAVES, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> SCULK_STAIRS = block(SculkModModBlocks.SCULK_STAIRS, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> SCULK_SLAB = block(SculkModModBlocks.SCULK_SLAB, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> SCULK_FENCE = block(SculkModModBlocks.SCULK_FENCE, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> SCULK_FENCE_GATE = block(SculkModModBlocks.SCULK_FENCE_GATE, CreativeModeTab.TAB_REDSTONE);
	public static final RegistryObject<Item> SCULK_PRESSURE_PLATE = block(SculkModModBlocks.SCULK_PRESSURE_PLATE, CreativeModeTab.TAB_REDSTONE);
	public static final RegistryObject<Item> SCULK_BUTTON = block(SculkModModBlocks.SCULK_BUTTON, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> SCULK_GEM = REGISTRY.register("sculk_gem", () -> new Sculk_GemItem());
	public static final RegistryObject<Item> SCULK_WORLD = REGISTRY.register("sculk_world", () -> new SculkWorldItem());
	public static final RegistryObject<Item> SCULK_GEM_ORE = block(SculkModModBlocks.SCULK_GEM_ORE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> SCULK_GEM_BLOCK = block(SculkModModBlocks.SCULK_GEM_BLOCK, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> SCULK_GEM_PICKAXE = REGISTRY.register("sculk_gem_pickaxe", () -> new Sculk_GemPickaxeItem());
	public static final RegistryObject<Item> SCULK_GEM_AXE = REGISTRY.register("sculk_gem_axe", () -> new Sculk_GemAxeItem());
	public static final RegistryObject<Item> SCULK_GEM_SWORD = REGISTRY.register("sculk_gem_sword", () -> new Sculk_GemSwordItem());
	public static final RegistryObject<Item> SCULK_GEM_SHOVEL = REGISTRY.register("sculk_gem_shovel", () -> new Sculk_GemShovelItem());
	public static final RegistryObject<Item> SCULK_GEM_HOE = REGISTRY.register("sculk_gem_hoe", () -> new Sculk_GemHoeItem());
	public static final RegistryObject<Item> SCULK_GEM_ARMOR_HELMET = REGISTRY.register("sculk_gem_armor_helmet",
			() -> new Sculk_GemArmorItem.Helmet());
	public static final RegistryObject<Item> SCULK_GEM_ARMOR_CHESTPLATE = REGISTRY.register("sculk_gem_armor_chestplate",
			() -> new Sculk_GemArmorItem.Chestplate());
	public static final RegistryObject<Item> SCULK_GEM_ARMOR_LEGGINGS = REGISTRY.register("sculk_gem_armor_leggings",
			() -> new Sculk_GemArmorItem.Leggings());
	public static final RegistryObject<Item> SCULK_GEM_ARMOR_BOOTS = REGISTRY.register("sculk_gem_armor_boots", () -> new Sculk_GemArmorItem.Boots());
	public static final RegistryObject<Item> SCULK_GRASS = block(SculkModModBlocks.SCULK_GRASS, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> SCULKFRUIT = block(SculkModModBlocks.SCULKFRUIT, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> SCULKFOX = REGISTRY.register("sculkfox_spawn_egg",
			() -> new ForgeSpawnEggItem(SculkModModEntities.SCULKFOX, -16724788, -16751002, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> CHEAP_WARDEN = REGISTRY.register("cheap_warden_spawn_egg",
			() -> new ForgeSpawnEggItem(SculkModModEntities.CHEAP_WARDEN, -16751002, -16737895, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> SCULKTHING = REGISTRY.register("sculkthing_spawn_egg",
			() -> new ForgeSpawnEggItem(SculkModModEntities.SCULKTHING, -16764109, -16751002, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> PHANTOMSCULK = REGISTRY.register("phantomsculk_spawn_egg",
			() -> new ForgeSpawnEggItem(SculkModModEntities.PHANTOMSCULK, -16737895, -6684673, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
