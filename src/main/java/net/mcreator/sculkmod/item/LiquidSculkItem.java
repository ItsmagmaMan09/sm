
package net.mcreator.sculkmod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BucketItem;

import net.mcreator.sculkmod.init.SculkModModFluids;

public class LiquidSculkItem extends BucketItem {
	public LiquidSculkItem() {
		super(SculkModModFluids.LIQUID_SCULK,
				new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.COMMON).tab(CreativeModeTab.TAB_MISC));
	}
}
