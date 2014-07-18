package com.github.RISKYScarecrow.CartStuff;

import net.minecraft.item.Item;

import com.github.RISKYScarecrow.CartStuff.Initalisation.Initalisation;
import com.github.RISKYScarecrow.CartStuff.Proxy.CommonProxy;
import com.github.RISKYScarecrow.CartStuff.modEntity.EntityHorseCart;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.EntityRegistry;

@Mod(modid = CartStuff.MODID, version = CartStuff.VERSION)
public class CartStuff
{

	public static final String MODID = "CartStuff";
	public static final String VERSION = "1.0.1";

	public static Item spokes;
	public static Item wheel;

	@SidedProxy(clientSide = "com.github.RISKYScarecrow.CartStuff.Proxy.ClientProxy", serverSide = "com.github.RISKYScarecrow.CartStuff.Proxy.CommonProxy")
	public static CommonProxy proxy;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		Initalisation.initalise();
		EntityRegistry.registerModEntity(EntityHorseCart.class, "Cart", 1, this, 80, 3, true);
	}

	@EventHandler
	public void init(FMLInitializationEvent event)
	{

	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{

	}
}
