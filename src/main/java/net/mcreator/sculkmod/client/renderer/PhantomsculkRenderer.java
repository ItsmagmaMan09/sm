
package net.mcreator.sculkmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

import net.mcreator.sculkmod.entity.PhantomsculkEntity;
import net.mcreator.sculkmod.client.model.Modelphantomsculk;

public class PhantomsculkRenderer extends MobRenderer<PhantomsculkEntity, Modelphantomsculk<PhantomsculkEntity>> {
	public PhantomsculkRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelphantomsculk(context.bakeLayer(Modelphantomsculk.LAYER_LOCATION)), 0.5f);
		this.addLayer(new EyesLayer<PhantomsculkEntity, Modelphantomsculk<PhantomsculkEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("sculk_mod:textures/glooooooooooow.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(PhantomsculkEntity entity) {
		return new ResourceLocation("sculk_mod:textures/lolol.png");
	}
}
