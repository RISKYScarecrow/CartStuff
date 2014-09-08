package com.github.RISKYScarecrow.CartStuff.Proxy;

import com.github.RISKYScarecrow.CartStuff.Entities.SkellyHelper.EntitySkellyHelper;
import com.github.RISKYScarecrow.CartStuff.Entities.SkellyHelper.EntitySkellyHelperRenderer;
import com.github.RISKYScarecrow.CartStuff.Entities.SkellyHelper.ModelEntitySkellyHelper;
import com.github.RISKYScarecrow.CartStuff.TileEntities.Crate.TileEntityCrateEntity;
import com.github.RISKYScarecrow.CartStuff.TileEntities.Crate.TileEntityCrateRenderer;

import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.registry.GameRegistry;

public class ClientProxy extends CommonProxy
{
	public static void registerRenderThings()
	{
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityCrateEntity.class, new TileEntityCrateRenderer());
		GameRegistry.registerTileEntity(TileEntityCrateEntity.class, "tileEntityCrate");
		
		RenderingRegistry.registerEntityRenderingHandler(EntitySkellyHelper.class, new EntitySkellyHelperRenderer(new ModelEntitySkellyHelper(), 0.5F));
	}

}
