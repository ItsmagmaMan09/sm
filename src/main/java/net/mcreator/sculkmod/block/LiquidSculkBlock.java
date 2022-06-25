
package net.mcreator.sculkmod.block;

import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.core.BlockPos;

import net.mcreator.sculkmod.init.SculkModModFluids;

public class LiquidSculkBlock extends LiquidBlock {
	public LiquidSculkBlock() {
		super(() -> (FlowingFluid) SculkModModFluids.LIQUID_SCULK.get(), BlockBehaviour.Properties.of(Material.WATER).strength(100f)

		);
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 13;
	}
}
