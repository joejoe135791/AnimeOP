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

// Made with Blockbench 4.7.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class ModelKunai_Test_1_Converted<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("animemashup", "model_kunai_test_1_converted"), "main");
	public final ModelPart Blade;
	public final ModelPart bone;

	public ModelKunai_Test_1_Converted(ModelPart root) {
		this.Blade = root.getChild("Blade");
		this.bone = root.getChild("bone");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Blade = partdefinition.addOrReplaceChild("Blade", CubeListBuilder.create(), PartPose.offset(-8.0F, 16.0F, 8.0F));
		PartDefinition cube_r1 = Blade.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-0.333F, 0.0657F, -0.1F, 0.055F, 0.055F, 0.1F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.15F, 1.25F, 0.0F, 0.0F, 0.0F, -0.7854F));
		PartDefinition cube_r2 = Blade.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 2).addBox(0.306F, -0.2F, 0.0F, 0.1F, 0.4F, 0.1F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, 1.6F, -0.1F, 0.0F, 0.0F, 0.3927F));
		PartDefinition cube_r3 = Blade.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 2).addBox(-0.407F, -0.2F, 0.0F, 0.1F, 0.4F, 0.1F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.4F, 1.6F, -0.1F, 0.0F, 0.0F, -0.3927F));
		PartDefinition cube_r4 = Blade.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 2).addBox(-0.1F, -0.6F, -0.1F, 0.2F, 1.1F, 0.1F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2F, 2.5F, 0.0F, 0.0F, 0.0F, 0.3927F));
		PartDefinition cube_r5 = Blade.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(1, 2).addBox(-0.2F, -0.5F, -0.1F, 0.3F, 1.0F, 0.1F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, 2.5F, 0.0F, 0.0F, 0.0F, -0.3927F));
		PartDefinition cube_r6 = Blade.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(0, 2).addBox(0.8F, -0.7F, -0.1F, 0.2F, 1.3F, 0.1F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.1F, 2.0F, 0.0F, 0.0F, 0.0F, 0.3927F));
		PartDefinition cube_r7 = Blade.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(0, 2).addBox(-1.0F, -0.7F, -0.1F, 0.2F, 1.3F, 0.1F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 2.0F, 0.0F, 0.0F, 0.0F, -0.3927F));
		PartDefinition cube_r8 = Blade.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(1, 2).addBox(-0.51F, -0.51F, -0.1F, 0.83F, 0.83F, 0.1F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 3.0F, 0.0F, 0.0F, 0.0F, 0.7854F));
		PartDefinition bone = partdefinition.addOrReplaceChild("bone", CubeListBuilder.create().texOffs(0, 2).addBox(-8.1F, -4.8F, 7.88F, 0.2F, 1.1F, 0.15F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition Ring_r1 = bone.addOrReplaceChild("Ring_r1", CubeListBuilder.create().texOffs(1, 2).addBox(-0.3F, 0.25F, -0.05F, 0.4F, 0.4F, 0.1F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.25F, -3.95F, 7.95F, 0.0F, 0.0F, -0.7854F));
		return LayerDefinition.create(meshdefinition, 4, 4);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Blade.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bone.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
