
package net.mcreator.sculkmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

import net.mcreator.sculkmod.entity.SculkthingEntity;
import net.mcreator.sculkmod.client.model.Modelsculkman;

public class SculkthingRenderer extends MobRenderer<SculkthingEntity, Modelsculkman<SculkthingEntity>> {
	public SculkthingRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelsculkman(context.bakeLayer(Modelsculkman.LAYER_LOCATION)), 0.5f);
		this.addLayer(new EyesLayer<SculkthingEntity, Modelsculkman<SculkthingEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("sculk_mod:textures/evoker.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(SculkthingEntity entity) {
		return new ResourceLocation("sculk_mod:textures/evoker.png");
	}
}
