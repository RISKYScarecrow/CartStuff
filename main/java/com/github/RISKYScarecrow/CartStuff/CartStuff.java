package com.github.RISKYScarecrow.CartStuff;

import com.github.RISKYScarecrow.CartStuff.Recipies.Recipes;

import net.minecraft.init.Blocks;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;


@Mod(modid = CartStuff.MODID, version = CartStuff.VERSION)


public class CartStuff {

	public static final String MODID = "cartstuff";
	public static final String VERSION = "1.0.1";

	
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) 
	{
		Recipes.add();
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) 
	{
	
	}

}
