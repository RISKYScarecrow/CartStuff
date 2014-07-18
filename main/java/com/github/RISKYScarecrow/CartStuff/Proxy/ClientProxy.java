package com.github.RISKYScarecrow.CartStuff.Proxy;

import net.minecraft.client.renderer.entity.Render;

import com.github.RISKYScarecrow.CartStuff.modEntity.EntityHorseCart;
import com.github.RISKYScarecrow.CartStuff.Renderer.EntityHorseCartRender;

import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxy extends CommonProxy 
{
	public void registerRenderThings() {
		RenderingRegistry.registerEntityRenderingHandler(EntityHorseCart.class, new EntityHorseCartRender());
	}

}
