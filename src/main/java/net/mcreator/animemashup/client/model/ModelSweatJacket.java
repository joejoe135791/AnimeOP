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

// Made with Blockbench 4.8.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class ModelSweatJacket<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("animemashup", "model_sweat_jacket"), "main");
	public final ModelPart armorLeftArm;
	public final ModelPart armorRightArm;
	public final ModelPart armorBody;
	public final ModelPart armorHead;

	public ModelSweatJacket(ModelPart root) {
		this.armorLeftArm = root.getChild("armorLeftArm");
		this.armorRightArm = root.getChild("armorRightArm");
		this.armorBody = root.getChild("armorBody");
		this.armorHead = root.getChild("armorHead");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition armorLeftArm = partdefinition.addOrReplaceChild("armorLeftArm", CubeListBuilder.create().texOffs(20, 20).addBox(-1.0F, -1.96F, -2.0F, 3.0F, 9.0F, 4.0F, new CubeDeformation(0.05F)), PartPose.offset(4.0F, 2.0F, 0.0F));
		PartDefinition RightPuff4_r1 = armorLeftArm.addOrReplaceChild("RightPuff4_r1", CubeListBuilder.create().texOffs(30, 35).addBox(-0.2274F, -1.8765F, -2.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.048F)),
				PartPose.offsetAndRotation(0.8854F, 3.5017F, 0.0F, 0.0F, 0.0F, -0.733F));
		PartDefinition RightPuff3_r1 = armorLeftArm.addOrReplaceChild("RightPuff3_r1", CubeListBuilder.create().texOffs(30, 29).addBox(-0.8036F, -1.292F, -2.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.048F)),
				PartPose.offsetAndRotation(0.8854F, 3.5017F, 0.0F, 0.0F, 0.0F, 0.1833F));
		PartDefinition RightPuff2_r1 = armorLeftArm.addOrReplaceChild("RightPuff2_r1", CubeListBuilder.create().texOffs(0, 37).addBox(-1.1455F, -0.3493F, -2.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.048F)),
				PartPose.offsetAndRotation(0.8854F, 3.5017F, 0.0F, 0.0F, 0.0F, -0.6021F));
		PartDefinition RightPuff1_r1 = armorLeftArm.addOrReplaceChild("RightPuff1_r1", CubeListBuilder.create().texOffs(22, 33).addBox(-0.1509F, 0.3661F, -2.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.048F)),
				PartPose.offsetAndRotation(0.8854F, 3.5017F, 0.0F, 0.0F, 0.0F, 0.3142F));
		PartDefinition armorRightArm = partdefinition.addOrReplaceChild("armorRightArm", CubeListBuilder.create().texOffs(0, 24).addBox(-2.0F, -1.96F, -2.0F, 3.0F, 9.0F, 4.0F, new CubeDeformation(0.05F)), PartPose.offset(-4.0F, 2.0F, 0.0F));
		PartDefinition LeftPuff4_r1 = armorRightArm.addOrReplaceChild("LeftPuff4_r1", CubeListBuilder.create().texOffs(37, 0).addBox(-1.7726F, -1.8765F, -2.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.048F)),
				PartPose.offsetAndRotation(-0.8854F, 3.5017F, 0.0F, 0.0F, 0.0F, 0.733F));
		PartDefinition LeftPuff3_r1 = armorRightArm.addOrReplaceChild("LeftPuff3_r1", CubeListBuilder.create().texOffs(10, 33).addBox(-1.1964F, -1.292F, -2.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.048F)),
				PartPose.offsetAndRotation(-0.8854F, 3.5017F, 0.0F, 0.0F, 0.0F, -0.1833F));
		PartDefinition LeftPuff2_r1 = armorRightArm.addOrReplaceChild("LeftPuff2_r1", CubeListBuilder.create().texOffs(38, 25).addBox(-0.8545F, -0.3493F, -2.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.048F)),
				PartPose.offsetAndRotation(-0.8854F, 3.5017F, 0.0F, 0.0F, 0.0F, 0.6021F));
		PartDefinition LeftPuff1_r1 = armorRightArm.addOrReplaceChild("LeftPuff1_r1", CubeListBuilder.create().texOffs(34, 19).addBox(-1.8491F, 0.3661F, -2.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.048F)),
				PartPose.offsetAndRotation(-0.8854F, 3.5017F, 0.0F, 0.0F, 0.0F, -0.3142F));
		PartDefinition armorBody = partdefinition.addOrReplaceChild("armorBody", CubeListBuilder.create().texOffs(0, 9).addBox(-4.0F, 0.0375F, -2.0F, 8.0F, 11.0F, 4.0F, new CubeDeformation(0.06F)).texOffs(28, 7)
				.addBox(-2.0F, 0.05F, -2.05F, 1.4F, 10.7F, 2.0F, new CubeDeformation(0.04F)).texOffs(28, 7).mirror().addBox(0.6F, 0.05F, -2.05F, 1.4F, 10.7F, 2.0F, new CubeDeformation(0.04F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition PocketRight_r1 = armorBody.addOrReplaceChild("PocketRight_r1", CubeListBuilder.create().texOffs(20, 9).addBox(-1.0F, -0.7F, -0.9F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.08F)),
				PartPose.offsetAndRotation(-2.9701F, 8.3009F, -0.9843F, 0.2967F, 0.0F, -1.2654F));
		PartDefinition PocketLeft_r1 = armorBody.addOrReplaceChild("PocketLeft_r1", CubeListBuilder.create().texOffs(23, 3).addBox(-1.0F, -0.5F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.08F)),
				PartPose.offsetAndRotation(3.1804F, 8.2346F, -0.9471F, 0.2967F, 0.0F, 1.2654F));
		PartDefinition armorHead = partdefinition.addOrReplaceChild("armorHead",
				CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -2.045F, -3.0F, 3.4F, 2.0F, 7.0F, new CubeDeformation(0.06F)).texOffs(0, 0).mirror().addBox(0.6F, -2.045F, -3.0F, 3.4F, 2.0F, 7.0F, new CubeDeformation(0.06F)).mirror(false)
						.texOffs(0, 0).mirror().addBox(-0.5F, -2.045F, 2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.06F)).mirror(false).texOffs(23, 0).addBox(-4.0F, -2.03F, -3.1F, 8.0F, 2.0F, 1.0F, new CubeDeformation(0.04F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		armorLeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		armorRightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		armorBody.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		armorHead.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
