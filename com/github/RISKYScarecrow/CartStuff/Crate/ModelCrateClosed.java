package com.github.RISKYScarecrow.CartStuff.Crate;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelCrateClosed extends ModelBase
{
	// fields
	ModelRenderer Inner_Cube;
	ModelRenderer Panel_1;
	ModelRenderer Panel_2;
	ModelRenderer Panel_3;
	ModelRenderer Panel_4;
	ModelRenderer Panel_5;
	ModelRenderer Panel_6;
	ModelRenderer Panel_7;
	ModelRenderer Cross_Section_1;
	ModelRenderer Cross_Section_2;
	ModelRenderer Cross_Section_3;
	ModelRenderer Panel_8;
	ModelRenderer Panel_9;
	ModelRenderer Panel_10;
	ModelRenderer Panel_11;
	ModelRenderer Panel_12;
	ModelRenderer Nail_4;
	ModelRenderer Paper;
	ModelRenderer Nail_3;
	ModelRenderer Nail_1;
	ModelRenderer Nail_2;
	ModelRenderer Lid;

	public ModelCrateClosed()
	{
		textureWidth = 1024;
		textureHeight = 1024;

		Inner_Cube = new ModelRenderer(this, 0, 0);
		Inner_Cube.addBox(0F, -3F, 0F, 112, 112, 112);
		Inner_Cube.setRotationPoint(0F, -32F, 0F);
		Inner_Cube.setTextureSize(1024, 1024);
		Inner_Cube.mirror = true;
		setRotation(Inner_Cube, 0F, 0F, 0F);
		Panel_1 = new ModelRenderer(this, 0, 276);
		Panel_1.addBox(0F, 0F, 0F, 16, 128, 16);
		Panel_1.setRotationPoint(-8F, -43F, -8F);
		Panel_1.setTextureSize(1024, 1024);
		Panel_1.mirror = true;
		setRotation(Panel_1, 0F, 0F, 0F);
		Panel_2 = new ModelRenderer(this, 79, 276);
		Panel_2.addBox(0F, 0F, 0F, 16, 128, 16);
		Panel_2.setRotationPoint(104F, -43F, -8F);
		Panel_2.setTextureSize(1024, 1024);
		Panel_2.mirror = true;
		setRotation(Panel_2, 0F, 0F, 0F);
		Panel_3 = new ModelRenderer(this, 160, 332);
		Panel_3.addBox(0F, 0F, 0F, 98, 16, 16);
		Panel_3.setRotationPoint(7F, 69F, -8F);
		Panel_3.setTextureSize(1024, 1024);
		Panel_3.mirror = true;
		setRotation(Panel_3, 0F, 0F, 0F);
		Panel_4 = new ModelRenderer(this, 160, 290);
		Panel_4.addBox(0F, 0F, 0F, 98, 16, 16);
		Panel_4.setRotationPoint(7F, -43F, -8F);
		Panel_4.setTextureSize(1024, 1024);
		Panel_4.mirror = true;
		setRotation(Panel_4, 0F, 0F, 0F);
		Panel_5 = new ModelRenderer(this, 0, 791);
		Panel_5.addBox(0F, 0F, 0F, 16, 128, 16);
		Panel_5.setRotationPoint(-8F, -43F, 104F);
		Panel_5.setTextureSize(1024, 1024);
		Panel_5.mirror = true;
		setRotation(Panel_5, 0F, 0F, 0F);
		Panel_6 = new ModelRenderer(this, 80, 741);
		Panel_6.addBox(0F, 0F, 0F, 16, 16, 98);
		Panel_6.setRotationPoint(-8F, -43F, 7F);
		Panel_6.setTextureSize(1024, 1024);
		Panel_6.mirror = true;
		setRotation(Panel_6, 0F, 0F, 0F);
		Panel_7 = new ModelRenderer(this, 80, 864);
		Panel_7.addBox(0F, 0F, 0F, 16, 16, 98);
		Panel_7.setRotationPoint(-8F, 69F, 7F);
		Panel_7.setTextureSize(1024, 1024);
		Panel_7.mirror = true;
		setRotation(Panel_7, 0F, 0F, 0F);
		Cross_Section_1 = new ModelRenderer(this, 442, 791);
		Cross_Section_1.addBox(0F, 0F, 0F, 4, 140, 16);
		Cross_Section_1.setRotationPoint(112F, -34F, 100F);
		Cross_Section_1.setTextureSize(1024, 1024);
		Cross_Section_1.mirror = true;
		setRotation(Cross_Section_1, -0.7853982F, 0F, 0F);
		Cross_Section_3 = new ModelRenderer(this, 330, 791);
		Cross_Section_3.addBox(0F, 0F, 0F, 4, 140, 16);
		Cross_Section_3.setRotationPoint(-4F, -23F, 0F);
		Cross_Section_3.setTextureSize(1024, 1024);
		Cross_Section_3.mirror = true;
		setRotation(Cross_Section_3, 0.7853982F, 0F, 0F);
		Panel_8 = new ModelRenderer(this, 0, 537);
		Panel_8.addBox(0F, 0F, 0F, 16, 128, 16);
		Panel_8.setRotationPoint(104F, -43F, 104F);
		Panel_8.setTextureSize(1024, 1024);
		Panel_8.mirror = true;
		setRotation(Panel_8, 0F, 0F, 0F);
		Panel_9 = new ModelRenderer(this, 88, 546);
		Panel_9.addBox(0F, 0F, 0F, 98, 16, 16);
		Panel_9.setRotationPoint(7F, -43F, 104F);
		Panel_9.setTextureSize(1024, 1024);
		Panel_9.mirror = true;
		setRotation(Panel_9, 0F, 0F, 0F);
		Panel_10 = new ModelRenderer(this, 88, 592);
		Panel_10.addBox(0F, 0F, 0F, 98, 16, 16);
		Panel_10.setRotationPoint(7F, 69F, 104F);
		Panel_10.setTextureSize(1024, 1024);
		Panel_10.mirror = true;
		setRotation(Panel_10, 0F, 0F, 0F);
		Cross_Section_2 = new ModelRenderer(this, 330, 520);
		Cross_Section_2.addBox(0F, 0F, 0F, 4, 140, 16);
		Cross_Section_2.setRotationPoint(0F, -23F, 116F);
		Cross_Section_2.setTextureSize(1024, 1024);
		Cross_Section_2.mirror = true;
		setRotation(Cross_Section_2, 0.7853982F, 1.570796F, 0F);
		Panel_11 = new ModelRenderer(this, 500, 741);
		Panel_11.addBox(0F, 0F, 0F, 16, 16, 98);
		Panel_11.setRotationPoint(104F, -43F, 7F);
		Panel_11.setTextureSize(1024, 1024);
		Panel_11.mirror = true;
		setRotation(Panel_11, 0F, 0F, 0F);
		Panel_12 = new ModelRenderer(this, 500, 865);
		Panel_12.addBox(0F, 0F, 0F, 16, 16, 98);
		Panel_12.setRotationPoint(104F, 69F, 7F);
		Panel_12.setTextureSize(1024, 1024);
		Panel_12.mirror = true;
		setRotation(Panel_12, 0F, 0F, 0F);
		Nail_4 = new ModelRenderer(this, 600, 550);
		Nail_4.addBox(0F, 0F, 0F, 5, 5, 2);
		Nail_4.setRotationPoint(77F, 47F, -3F);
		Nail_4.setTextureSize(1024, 1024);
		Nail_4.mirror = true;
		setRotation(Nail_4, 0F, 0F, 0F);
		Paper = new ModelRenderer(this, 450, 530);
		Paper.addBox(0F, 0F, 0F, 60, 70, 1);
		Paper.setRotationPoint(26F, -14F, -2F);
		Paper.setTextureSize(1024, 1024);
		Paper.mirror = true;
		setRotation(Paper, 0F, 0F, 0F);
		Nail_3 = new ModelRenderer(this, 600, 550);
		Nail_3.addBox(0F, 0F, 0F, 5, 5, 2);
		Nail_3.setRotationPoint(30F, 47F, -3F);
		Nail_3.setTextureSize(1024, 1024);
		Nail_3.mirror = true;
		setRotation(Nail_3, 0F, 0F, 0F);
		Nail_1 = new ModelRenderer(this, 600, 550);
		Nail_1.addBox(0F, 0F, 0F, 5, 5, 2);
		Nail_1.setRotationPoint(30F, -10F, -3F);
		Nail_1.setTextureSize(1024, 1024);
		Nail_1.mirror = true;
		setRotation(Nail_1, 0F, 0F, 0F);
		Nail_2 = new ModelRenderer(this, 600, 550);
		Nail_2.addBox(0F, 0F, 0F, 5, 5, 2);
		Nail_2.setRotationPoint(77F, -10F, -3F);
		Nail_2.setTextureSize(1024, 1024);
		Nail_2.mirror = true;
		setRotation(Nail_2, 0F, 0F, 0F);
		Lid = new ModelRenderer(this, 442, 617);
		Lid.addBox(0F, 0F, 0F, 96, 4, 96);
		Lid.setRotationPoint(8F, -39F, 8F);
		Lid.setTextureSize(1024, 1024);
		Lid.mirror = true;
		setRotation(Lid, 0F, 0F, 0F);
	}

	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		Inner_Cube.render(f5);
		Panel_1.render(f5);
		Panel_2.render(f5);
		Panel_3.render(f5);
		Panel_4.render(f5);
		Panel_5.render(f5);
		Panel_6.render(f5);
		Panel_7.render(f5);
		Cross_Section_1.render(f5);
		Cross_Section_2.render(f5);
		Cross_Section_3.render(f5);
		Panel_8.render(f5);
		Panel_9.render(f5);
		Panel_10.render(f5);
		Panel_11.render(f5);
		Panel_12.render(f5);
		Paper.render(f5);
		Nail_4.render(f5);
		Nail_3.render(f5);
		Nail_1.render(f5);
		Nail_2.render(f5);
		Lid.render(f5);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z)
	{
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
	{
		super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
	}

}
