package com.github.RISKYScarecrow.CartStuff;


import com.github.RISKYScarecrow.CartStuff.Recipies.Recipes;

import net.minecraft.init.Blocks;

import com.github.RISKYScarecrow.CartStuff.Initalisation.ItemDeclaration;
import com.github.RISKYScarecrow.CartStuff.Initalisation.Recipes;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = CartStuff.MODID, version = CartStuff.VERSION)
public class CartStuff
{

	public static final String MODID = "CartStuff";
	public static final String VERSION = "1.0.1";

	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		ItemDeclaration.addItems();
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
