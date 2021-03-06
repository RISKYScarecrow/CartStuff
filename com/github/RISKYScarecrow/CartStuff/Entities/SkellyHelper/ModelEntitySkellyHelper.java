package com.github.RISKYScarecrow.CartStuff.Entities.SkellyHelper;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelEntitySkellyHelper extends ModelBase
{
	// fields
	ModelRenderer Head;
	ModelRenderer Spine;
	ModelRenderer Torso;
	ModelRenderer Right_arm_upper;
	ModelRenderer Left_arm_upper;
	ModelRenderer Chest_Part_1;
	ModelRenderer Chest_Part_2;
	ModelRenderer Chest_Part_7;
	ModelRenderer Chest_Part_8;
	ModelRenderer Upper_Back;
	ModelRenderer Upper_Left;
	ModelRenderer Upper_Right;
	ModelRenderer Middle_Back;
	ModelRenderer Middle_Left;
	ModelRenderer Middle_Right;
	ModelRenderer Lower_Back;
	ModelRenderer Lower_Left;
	ModelRenderer Lower_Right;
	ModelRenderer Left_leg_lower;
	ModelRenderer Left_leg_upper;
	ModelRenderer Right_leg_lower;
	ModelRenderer Right_leg_upper;
	ModelRenderer Part_1__Back;
	ModelRenderer Part_2__Main_Bag;
	ModelRenderer Part_3_Side_Pouch_Left;
	ModelRenderer Part_3_Side_Pouch_Right;
	ModelRenderer Part_4_Back_Pouch;
	ModelRenderer Flap_Part_1;
	ModelRenderer Flap_Part_2;
	ModelRenderer Flap_Part_3;

	public ModelEntitySkellyHelper()
	{
		textureWidth = 500;
		textureHeight = 500;

		Head = new ModelRenderer(this, 5, 40);
		Head.addBox(0F, 0F, 0F, 8, 8, 8);
		Head.setRotationPoint(-4F, -12F, -4F);
		Head.setTextureSize(500, 500);
		Head.mirror = true;
		setRotation(Head, 0F, 0F, 0F);
		Spine = new ModelRenderer(this, 10, 60);
		Spine.addBox(0F, 0F, 0F, 2, 13, 1);
		Spine.setRotationPoint(-1F, -4.3F, 1F);
		Spine.setTextureSize(500, 500);
		Spine.mirror = true;
		setRotation(Spine, 0.1047198F, 0F, 0F);
		Torso = new ModelRenderer(this, 3, 78);
		Torso.addBox(0F, 0F, 0F, 8, 4, 4);
		Torso.setRotationPoint(-4F, 8F, -0.5F);
		Torso.setTextureSize(500, 500);
		Torso.mirror = true;
		setRotation(Torso, -0.122173F, 0F, 0F);
		Right_arm_upper = new ModelRenderer(this, 30, 105);
		Right_arm_upper.addBox(0F, 0F, 0F, 2, 4, 2);
		Right_arm_upper.setRotationPoint(3.7F, -3F, 0F);
		Right_arm_upper.setTextureSize(500, 500);
		Right_arm_upper.mirror = true;
		setRotation(Right_arm_upper, -0.1745329F, 0F, -0.2094395F);
		Left_arm_upper = new ModelRenderer(this, 42, 105);
		Left_arm_upper.addBox(0F, 0F, 0F, 2, 4, 2);
		Left_arm_upper.setRotationPoint(-5.7F, -3.4F, 0F);
		Left_arm_upper.setTextureSize(500, 500);
		Left_arm_upper.mirror = true;
		setRotation(Left_arm_upper, -0.1745329F, 0F, 0.2094395F);
		Chest_Part_1 = new ModelRenderer(this, 30, 90);
		Chest_Part_1.addBox(0F, 0F, 0F, 1, 5, 1);
		Chest_Part_1.setRotationPoint(-4F, -2.691F, -1.86F);
		Chest_Part_1.setTextureSize(500, 500);
		Chest_Part_1.mirror = true;
		setRotation(Chest_Part_1, 0.1047198F, 0F, 0F);
		Chest_Part_2 = new ModelRenderer(this, 40, 90);
		Chest_Part_2.addBox(0F, 0F, 0F, 1, 7, 1);
		Chest_Part_2.setRotationPoint(-3F, -2.691F, -1.86F);
		Chest_Part_2.setTextureSize(500, 500);
		Chest_Part_2.mirror = true;
		setRotation(Chest_Part_2, 0.1047198F, 0F, 0F);
		Chest_Part_7 = new ModelRenderer(this, 40, 90);
		Chest_Part_7.addBox(0F, 0F, 0F, 1, 7, 1);
		Chest_Part_7.setRotationPoint(2F, -2.691F, -1.86F);
		Chest_Part_7.setTextureSize(500, 500);
		Chest_Part_7.mirror = true;
		setRotation(Chest_Part_7, 0.1047198F, 0F, 0F);
		Chest_Part_8 = new ModelRenderer(this, 35, 90);
		Chest_Part_8.addBox(0F, 0F, 0F, 1, 5, 1);
		Chest_Part_8.setRotationPoint(3F, -2.691F, -1.86F);
		Chest_Part_8.setTextureSize(500, 500);
		Chest_Part_8.mirror = true;
		setRotation(Chest_Part_8, 0.1047198F, 0F, 0F);
		Upper_Back = new ModelRenderer(this, 25, 65);
		Upper_Back.addBox(0F, 0F, 0F, 8, 1, 1);
		Upper_Back.setRotationPoint(-4F, -3F, 1.13F);
		Upper_Back.setTextureSize(500, 500);
		Upper_Back.mirror = true;
		setRotation(Upper_Back, 0.1047198F, 0F, 0F);
		Upper_Left = new ModelRenderer(this, 30, 70);
		Upper_Left.addBox(0F, 0F, 0F, 1, 1, 4);
		Upper_Left.setRotationPoint(-4F, -2.69F, -1.86F);
		Upper_Left.setTextureSize(500, 500);
		Upper_Left.mirror = true;
		setRotation(Upper_Left, 0.1047198F, 0F, 0F);
		Upper_Right = new ModelRenderer(this, 30, 80);
		Upper_Right.addBox(0F, 0F, 0F, 1, 1, 4);
		Upper_Right.setRotationPoint(3F, -2.69F, -1.86F);
		Upper_Right.setTextureSize(500, 500);
		Upper_Right.mirror = true;
		setRotation(Upper_Right, 0.1047198F, 0F, 0F);
		Middle_Back = new ModelRenderer(this, 25, 65);
		Middle_Back.addBox(0F, 0F, 0F, 8, 1, 1);
		Middle_Back.setRotationPoint(-4F, -1F, 1.34F);
		Middle_Back.setTextureSize(500, 500);
		Middle_Back.mirror = true;
		setRotation(Middle_Back, 0.1047198F, 0F, 0F);
		Middle_Left = new ModelRenderer(this, 30, 70);
		Middle_Left.addBox(0F, 0F, 0F, 1, 1, 4);
		Middle_Left.setRotationPoint(-4F, -0.69F, -1.65F);
		Middle_Left.setTextureSize(500, 500);
		Middle_Left.mirror = true;
		setRotation(Middle_Left, 0.1047198F, 0F, 0F);
		Middle_Right = new ModelRenderer(this, 30, 80);
		Middle_Right.addBox(0F, 0F, 0F, 1, 1, 4);
		Middle_Right.setRotationPoint(3F, -0.69F, -1.65F);
		Middle_Right.setTextureSize(500, 500);
		Middle_Right.mirror = true;
		setRotation(Middle_Right, 0.1047198F, 0F, 0F);
		Lower_Back = new ModelRenderer(this, 25, 65);
		Lower_Back.addBox(-4F, 1F, 1.44F, 8, 1, 1);
		Lower_Back.setRotationPoint(0F, 0F, 0F);
		Lower_Back.setTextureSize(500, 500);
		Lower_Back.mirror = true;
		setRotation(Lower_Back, 0.1047198F, 0F, 0F);
		Lower_Left = new ModelRenderer(this, 30, 70);
		Lower_Left.addBox(0F, 0F, 0F, 1, 1, 4);
		Lower_Left.setRotationPoint(-4F, 1.15F, -1.45F);
		Lower_Left.setTextureSize(500, 500);
		Lower_Left.mirror = true;
		setRotation(Lower_Left, 0.1047198F, 0F, 0F);
		Lower_Right = new ModelRenderer(this, 30, 80);
		Lower_Right.addBox(0F, 0F, 0F, 1, 1, 4);
		Lower_Right.setRotationPoint(3F, 1.15F, -1.45F);
		Lower_Right.setTextureSize(500, 500);
		Lower_Right.mirror = true;
		setRotation(Lower_Right, 0.1047198F, 0F, 0F);
		Left_leg_lower = new ModelRenderer(this, 5, 100);
		Left_leg_lower.addBox(0F, 0F, 0F, 2, 8, 2);
		Left_leg_lower.setRotationPoint(-3F, 16F, -1F);
		Left_leg_lower.setTextureSize(500, 500);
		Left_leg_lower.mirror = true;
		setRotation(Left_leg_lower, 0.122173F, 0F, 0F);
		Left_leg_upper = new ModelRenderer(this, 5, 90);
		Left_leg_upper.addBox(0F, 0F, 0F, 2, 5, 2);
		Left_leg_upper.setRotationPoint(-3F, 11.2F, 0.3F);
		Left_leg_upper.setTextureSize(500, 500);
		Left_leg_upper.mirror = true;
		setRotation(Left_leg_upper, -0.2617994F, 0F, 0F);
		Right_leg_lower = new ModelRenderer(this, 15, 100);
		Right_leg_lower.addBox(0F, 0F, 0F, 2, 8, 2);
		Right_leg_lower.setRotationPoint(1F, 16F, -1F);
		Right_leg_lower.setTextureSize(500, 500);
		Right_leg_lower.mirror = true;
		setRotation(Right_leg_lower, 0.122173F, 0F, 0F);
		Right_leg_upper = new ModelRenderer(this, 15, 90);
		Right_leg_upper.addBox(0F, 0F, 0F, 2, 5, 2);
		Right_leg_upper.setRotationPoint(1F, 11.2F, 0.3F);
		Right_leg_upper.setTextureSize(500, 500);
		Right_leg_upper.mirror = true;
		setRotation(Right_leg_upper, -0.2617994F, 0F, 0F);
		Part_1__Back = new ModelRenderer(this, 100, 40);
		Part_1__Back.addBox(0F, 0F, 0F, 9, 13, 1);
		Part_1__Back.setRotationPoint(-4.5F, -3.4F, 2F);
		Part_1__Back.setTextureSize(500, 500);
		Part_1__Back.mirror = true;
		setRotation(Part_1__Back, 0.0872665F, 0F, 0F);
		Part_2__Main_Bag = new ModelRenderer(this, 125, 40);
		Part_2__Main_Bag.addBox(0F, 0F, 0F, 9, 13, 4);
		Part_2__Main_Bag.setRotationPoint(-4.5F, -3.485F, 2.97F);
		Part_2__Main_Bag.setTextureSize(500, 500);
		Part_2__Main_Bag.mirror = true;
		setRotation(Part_2__Main_Bag, 0.0523599F, 0F, 0F);
		Part_3_Side_Pouch_Left = new ModelRenderer(this, 105, 60);
		Part_3_Side_Pouch_Left.addBox(0F, 0F, 0F, 1, 4, 3);
		Part_3_Side_Pouch_Left.setRotationPoint(-5.5F, 5.515F, 3.6F);
		Part_3_Side_Pouch_Left.setTextureSize(500, 500);
		Part_3_Side_Pouch_Left.mirror = true;
		setRotation(Part_3_Side_Pouch_Left, 0.0523599F, 0F, 0F);
		Part_3_Side_Pouch_Right = new ModelRenderer(this, 105, 70);
		Part_3_Side_Pouch_Right.addBox(0F, 0F, 0F, 1, 4, 3);
		Part_3_Side_Pouch_Right.setRotationPoint(4.5F, 5.515F, 3.6F);
		Part_3_Side_Pouch_Right.setTextureSize(500, 500);
		Part_3_Side_Pouch_Right.mirror = true;
		setRotation(Part_3_Side_Pouch_Right, 0.0523599F, 0F, 0F);
		Part_4_Back_Pouch = new ModelRenderer(this, 125, 64);
		Part_4_Back_Pouch.addBox(0F, 0F, 0F, 7, 6, 1);
		Part_4_Back_Pouch.setRotationPoint(-3.5F, 3.3F, 7.27F);
		Part_4_Back_Pouch.setTextureSize(500, 500);
		Part_4_Back_Pouch.mirror = true;
		setRotation(Part_4_Back_Pouch, 0.0523599F, 0F, 0F);
		Flap_Part_1 = new ModelRenderer(this, 100, 86);
		Flap_Part_1.addBox(0F, 0F, 0F, 9, 0, 4);
		Flap_Part_1.setRotationPoint(-4.5F, -3.4F, 2F);
		Flap_Part_1.setTextureSize(500, 500);
		Flap_Part_1.mirror = true;
		setRotation(Flap_Part_1, 0.1919862F, 0F, 0F);
		Flap_Part_2 = new ModelRenderer(this, 100, 94);
		Flap_Part_2.addBox(0F, 0F, 0F, 9, 0, 2);
		Flap_Part_2.setRotationPoint(-4.5F, -4.16F, 5.926F);
		Flap_Part_2.setTextureSize(500, 500);
		Flap_Part_2.mirror = true;
		setRotation(Flap_Part_2, -0.418879F, 0F, 0F);
		Flap_Part_3 = new ModelRenderer(this, 100, 100);
		Flap_Part_3.addBox(0F, 0F, 0F, 9, 0, 4);
		Flap_Part_3.setRotationPoint(-4.5F, 0.5F, 7F);
		Flap_Part_3.setTextureSize(500, 500);
		Flap_Part_3.mirror = true;
		setRotation(Flap_Part_3, 1.413717F, 0F, 0F);
	}

	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		Head.render(f5);
		Spine.render(f5);
		Torso.render(f5);
		Right_arm_upper.render(f5);
		Left_arm_upper.render(f5);
		Chest_Part_1.render(f5);
		Chest_Part_2.render(f5);
		Chest_Part_7.render(f5);
		Chest_Part_8.render(f5);
		Upper_Back.render(f5);
		Upper_Left.render(f5);
		Upper_Right.render(f5);
		Middle_Back.render(f5);
		Middle_Left.render(f5);
		Middle_Right.render(f5);
		Lower_Back.render(f5);
		Lower_Left.render(f5);
		Lower_Right.render(f5);
		Left_leg_lower.render(f5);
		Left_leg_upper.render(f5);
		Right_leg_lower.render(f5);
		Right_leg_upper.render(f5);
		Part_1__Back.render(f5);
		Part_2__Main_Bag.render(f5);
		Part_3_Side_Pouch_Left.render(f5);
		Part_3_Side_Pouch_Right.render(f5);
		Part_4_Back_Pouch.render(f5);
		Flap_Part_1.render(f5);
		Flap_Part_2.render(f5);
		Flap_Part_3.render(f5);
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
		Left_leg_lower.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
		Left_leg_upper.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
		
		Right_leg_lower.rotateAngleX = MathHelper.cos((float) (f * 0.6662F + 3.14159F) ) * 1.4F * f1;
		Right_leg_upper.rotateAngleX = MathHelper.cos((float) (f * 0.6662F + 3.14159F) ) * 1.4F * f1;
	}

}
