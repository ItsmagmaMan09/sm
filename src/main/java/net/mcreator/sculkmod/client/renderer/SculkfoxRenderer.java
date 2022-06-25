
package net.mcreator.sculkmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

import net.mcreator.sculkmod.entity.SculkfoxEntity;
import net.mcreator.sculkmod.client.model.Modelsculkfox;

public class SculkfoxRenderer extends MobRenderer<SculkfoxEntity, Modelsculkfox<SculkfoxEntity>> {
	public SculkfoxRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelsculkfox(context.bakeLayer(Modelsculkfox.LAYER_LOCATION)), 0.5f);
		this.addLayer(new EyesLayer<SculkfoxEntity, Modelsculkfox<SculkfoxEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("sculk_mod:textures/dasdiasd.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(SculkfoxEntity entity) {
		return new ResourceLocation("sculk_mod:textures/dasdiasd.png");
	}
}
