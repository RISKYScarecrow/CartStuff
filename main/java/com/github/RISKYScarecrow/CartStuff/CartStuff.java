package com.github.RISKYScarecrow.CartStuff;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import com.github.RISKYScarecrow.CartStuff.Initalisation.Initalisation;
import com.github.RISKYScarecrow.CartStuff.Initalisation.Recipes;
import com.github.RISKYScarecrow.CartStuff.modItems.Spokes;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = CartStuff.MODID, version = CartStuff.VERSION)

public class CartStuff {

	public static final String MODID = "CartStuff";
	public static final String VERSION = "1.0.1";

	public static Item spokes;
	
	// @SidedProxy(clientSide =
	// "com.github.RISKYScarecrow.CartStuff.Proxy.ClientProxy", serverSide =
	// "com.github.RISKYScarecrow.CartStuff.Proxy.CommonProxy")
	// public static CommonProxy proxy;


	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		
		//Initalisation.initalise();
		spokes = new Spokes();
		Initalisation.addSpokes(spokes);

	}

	@EventHandler
	public void init(FMLInitializationEvent event) {

	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {

	}
}
