package com.github.RISKYScarecrow.CartStuff.Initalisation;

import com.github.RISKYScarecrow.CartStuff.Items.Spokes;

import net.minecraft.item.Item;
import cpw.mods.fml.common.registry.GameRegistry;

public class ItemDeclaration
{
	
	public static Item spokes;
	
	private ItemDeclaration()
	{
	}
	
	public static void addItems()
	{
		spokes = new Spokes();
		GameRegistry.registerItem(spokes, "CartStuff_Spokes");
	}
}
