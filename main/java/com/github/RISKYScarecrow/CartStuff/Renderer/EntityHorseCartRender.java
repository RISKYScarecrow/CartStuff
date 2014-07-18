package com.github.RISKYScarecrow.CartStuff.Renderer;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityBoat;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import com.github.RISKYScarecrow.CartStuff.modEntity.EntityHorseCart;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class EntityHorseCartRender extends Render {

	private static final ResourceLocation cartTextures = new ResourceLocation("textures/entity/boat.png");
	protected ModelBase modelCart;

	public EntityHorseCartRender() {
		this.modelCart = new ModelCuteOcelot();
	}

	@Override
	public void doRender(Entity par1EntityHorseCart, double par2, double par4,
			double par6, float var8, float var9) {
		GL11.glPushMatrix();
		GL11.glTranslatef((float) par2, (float) par4, (float) par6);
		this.bindEntityTexture(par1EntityHorseCart);
		GL11.glScalef(-1.0F, -1.0F, 1.0F);
		this.modelCart.render(par1EntityHorseCart, 0.0F, 0.0F, -0.1F, 0.0F,
				0.0F, 0.0625F);
		GL11.glPopMatrix();

	}

	protected ResourceLocation getEntityTexture(EntityHorseCart var1) {
		return cartTextures;
	}
    
	protected ResourceLocation getEntityTexture(Entity par1Entity)
    {
        return this.getEntityTexture((EntityBoat)par1Entity);
    }
}
