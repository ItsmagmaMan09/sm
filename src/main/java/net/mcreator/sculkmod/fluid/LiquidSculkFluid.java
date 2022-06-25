
package net.mcreator.sculkmod.fluid;

import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.fluids.FluidAttributes;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.sculkmod.init.SculkModModItems;
import net.mcreator.sculkmod.init.SculkModModFluids;
import net.mcreator.sculkmod.init.SculkModModBlocks;

public abstract class LiquidSculkFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(SculkModModFluids.LIQUID_SCULK,
			SculkModModFluids.FLOWING_LIQUID_SCULK,
			FluidAttributes.builder(new ResourceLocation("sculk_mod:blocks/liquid_sculk3"), new ResourceLocation("sculk_mod:blocks/liquid_sculk3"))

	).explosionResistance(100f)

			.bucket(SculkModModItems.LIQUID_SCULK_BUCKET).block(() -> (LiquidBlock) SculkModModBlocks.LIQUID_SCULK.get());

	private LiquidSculkFluid() {
		super(PROPERTIES);
	}

	public static class Source extends LiquidSculkFluid {
		public Source() {
			super();
		}

		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends LiquidSculkFluid {
		public Flowing() {
			super();
		}

		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}
