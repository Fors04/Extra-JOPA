
public static class Modelsnarl extends ModelBase {
	private final ModelRenderer group;

	public Modelsnarl() {
		textureWidth = 16;
		textureHeight = 16;

		group = new ModelRenderer(this);
		group.setRotationPoint(8.0F, 24.0F, 1.0F);
		setRotationAngle(group, 1.5708F, 0.0F, 0.0F);
		group.cubeList.add(new ModelBox(group, 7, 5, -9.0F, -2.0F, 5.0F, 2, 2, 8, 0.0F, false));
		group.cubeList.add(new ModelBox(group, 8, 5, -8.5F, -1.5F, 1.0F, 1, 1, 4, 0.0F, false));
		group.cubeList.add(new ModelBox(group, 8, 5, -8.7F, -1.7F, 3.0F, 1, 1, 4, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		group.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}