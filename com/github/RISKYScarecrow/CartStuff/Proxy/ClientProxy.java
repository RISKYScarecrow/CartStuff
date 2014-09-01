package com.github.RISKYScarecrow.CartStuff.Proxy;

import com.github.RISKYScarecrow.CartStuff.Crate.ModelCrateClosed;
import com.github.RISKYScarecrow.CartStuff.Crate.TileEntityCrateEntity;
import com.github.RISKYScarecrow.CartStuff.Crate.TileEntityCrateRenderer;
import com.github.RISKYScarecrow.CartStuff.SkellyHelper.EntitySkellyHelper;
import com.github.RISKYScarecrow.CartStuff.SkellyHelper.EntitySkellyHelperRenderer;

import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.registry.GameRegistry;

public class ClientProxy extends CommonProxy
{
	public static void registerRenderThings()
	{
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityCrateEntity.class, new TileEntityCrateRenderer());
		GameRegistry.registerTileEntity(TileEntityCrateEntity.class, "tileEntityCrate");
		
		RenderingRegistry.registerEntityRenderingHandler(EntitySkellyHelper.class, new EntitySkellyHelperRenderer(new ModelCrateClosed(), 0.5F));
	}

}
