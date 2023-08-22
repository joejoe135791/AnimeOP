package net.mcreator.animemashup.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.8.1
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelblueleafheadband<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("animemashup", "modelblueleafheadband"), "main");
	public final ModelPart bb_main;

	public Modelblueleafheadband(ModelPart root) {
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main",
				CubeListBuilder.create().texOffs(0, 0).addBox(-12.0F, -7.25F, 4.0F, 8.0F, 2.5F, 0.0F, new CubeDeformation(0.1F)).texOffs(0, -8).addBox(-12.0F, -7.25F, 4.0F, 0.0F, 2.5F, 8.0F, new CubeDeformation(0.1F)).texOffs(0, -8)
						.addBox(-4.0F, -7.25F, 4.0F, 0.0F, 2.5F, 8.0F, new CubeDeformation(0.1F)).texOffs(0, 2).addBox(-12.0F, -7.25F, 12.0F, 8.0F, 2.5F, 0.0F, new CubeDeformation(0.1F)).texOffs(0, 10)
						.addBox(-10.7F, -7.05F, 3.9F, 5.4F, 2.0F, 0.0F, new CubeDeformation(0.1F)).texOffs(10, 11).addBox(-9.75F, -6.5F, 12.1F, 3.5F, 1.25F, 0.0F, new CubeDeformation(0.05F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition cube_r1 = bb_main.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(0, 12).addBox(-2.5F, 0.2692F, 3.7657F, 3.0F, 4.4F, 0.0F, new CubeDeformation(0.0F)).texOffs(6, 12).addBox(-0.5F, 0.2692F, 3.7657F, 3.0F, 4.4F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.0F, -5.2099F, 8.324F, 0.3927F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 16, 16);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}