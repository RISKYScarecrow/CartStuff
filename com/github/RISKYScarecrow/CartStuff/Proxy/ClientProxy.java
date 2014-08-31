package com.github.RISKYScarecrow.CartStuff.Proxy;

import com.github.RISKYScarecrow.CartStuff.Crate.TileEntityCrateEntity;
import com.github.RISKYScarecrow.CartStuff.Crate.TileEntityCrateRenderer;

import cpw.mods.fml.client.registry.ClientRegistry;

public class ClientProxy extends CommonProxy
{
	public static void registerRenderThings()
	{
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityCrateEntity.class, new TileEntityCrateRenderer());
	}

}
