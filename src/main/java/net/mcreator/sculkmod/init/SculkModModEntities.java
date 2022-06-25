
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.sculkmod.init;

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

import net.mcreator.sculkmod.entity.SculkthingEntity;
import net.mcreator.sculkmod.entity.SculkfoxEntity;
import net.mcreator.sculkmod.entity.PhantomsculkEntity;
import net.mcreator.sculkmod.entity.CheapWardenEntity;
import net.mcreator.sculkmod.SculkModMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class SculkModModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITIES, SculkModMod.MODID);
	public static final RegistryObject<EntityType<SculkfoxEntity>> SCULKFOX = register("sculkfox",
			EntityType.Builder.<SculkfoxEntity>of(SculkfoxEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SculkfoxEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<CheapWardenEntity>> CHEAP_WARDEN = register("cheap_warden",
			EntityType.Builder.<CheapWardenEntity>of(CheapWardenEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CheapWardenEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<SculkthingEntity>> SCULKTHING = register("sculkthing",
			EntityType.Builder.<SculkthingEntity>of(SculkthingEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(70).setUpdateInterval(3).setCustomClientFactory(SculkthingEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<PhantomsculkEntity>> PHANTOMSCULK = register("phantomsculk",
			EntityType.Builder.<PhantomsculkEntity>of(PhantomsculkEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(PhantomsculkEntity::new).fireImmune().sized(0.6f, 1.8f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			SculkfoxEntity.init();
			CheapWardenEntity.init();
			SculkthingEntity.init();
			PhantomsculkEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(SCULKFOX.get(), SculkfoxEntity.createAttributes().build());
		event.put(CHEAP_WARDEN.get(), CheapWardenEntity.createAttributes().build());
		event.put(SCULKTHING.get(), SculkthingEntity.createAttributes().build());
		event.put(PHANTOMSCULK.get(), PhantomsculkEntity.createAttributes().build());
	}
}
