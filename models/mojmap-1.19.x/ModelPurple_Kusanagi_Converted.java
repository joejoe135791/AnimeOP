// Made with Blockbench 4.8.1
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelPurple_Kusanagi_Converted<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "purple_kusanagi_converted"), "main");
	private final ModelPart bone;

	public ModelPurple_Kusanagi_Converted(ModelPart root) {
		this.bone = root.getChild("bone");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bone = partdefinition.addOrReplaceChild("bone",
				CubeListBuilder.create().texOffs(4, 0)
						.addBox(-8.25F, -6.3F, 7.1512F, 0.7F, 6.3F, 1.697F, new CubeDeformation(0.0F)).texOffs(0, 8)
						.addBox(-8.0F, -26.496F, 7.4F, 0.2F, 20.196F, 1.2F, new CubeDeformation(0.0F)).texOffs(8, 3)
						.addBox(-8.0F, -27.105F, 7.4F, 0.2F, 0.615F, 0.5F, new CubeDeformation(0.0F)).texOffs(9, 10)
						.addBox(-8.0F, -27.203F, 7.4F, 0.2F, 0.1F, 0.4F, new CubeDeformation(0.0F)).texOffs(12, 12)
						.addBox(-8.0F, -27.405F, 7.4F, 0.2F, 0.205F, 0.2F, new CubeDeformation(0.0F)).texOffs(12, 6)
						.addBox(-8.0F, -27.3F, 7.5F, 0.2F, 0.1F, 0.2F, new CubeDeformation(0.0F)).texOffs(10, 0)
						.addBox(-8.005F, -27.618F, 7.4F, 0.21F, 0.214F, 0.078F, new CubeDeformation(0.0F)),
				PartPose.offset(8.0F, 24.0F, -8.0F));

		PartDefinition cube_r1 = bone.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(8, 6)
						.addBox(-0.105F, 0.349F, -0.6F, 0.21F, 0.1F, 1.5F, new CubeDeformation(0.0F)).texOffs(9, 2)
						.addBox(-0.105F, 0.25F, -0.7F, 0.21F, 0.1F, 1.587F, new CubeDeformation(0.0F)).texOffs(10, 6)
						.addBox(-0.1F, 0.45F, -0.3F, 0.2F, 0.3F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.9F, -27.3F, 8.15F, -0.7854F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 32, 32);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		bone.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}