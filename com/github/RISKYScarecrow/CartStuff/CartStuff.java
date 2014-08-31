package com.github.RISKYScarecrow.CartStuff;

import net.minecraft.block.Block;

import com.github.RISKYScarecrow.CartStuff.Crate.TileEntityCrateEntity;
import com.github.RISKYScarecrow.CartStuff.Initalisation.Initalisation;
import com.github.RISKYScarecrow.CartStuff.Proxy.ClientProxy;
import com.github.RISKYScarecrow.CartStuff.Proxy.CommonProxy;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = CartStuff.MODID, version = CartStuff.VERSION)
public class CartStuff
{

	public static final String MODID = "CartStuff";
	public static final String VERSION = "1.0.1";

	public static Block crate;

	@SidedProxy(clientSide = "com.github.RISKYScarecrow.CartStuff.Proxy.ClientProxy", serverSide = "com.github.RISKYScarecrow.CartStuff.Proxy.CommonProxy")
	public static CommonProxy proxy;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		Initalisation.initalise();
	}

	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		ClientProxy.registerRenderThings();
        GameRegistry.registerTileEntity(TileEntityCrateEntity.class, "tileEntityCrate");
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{

	}
}
