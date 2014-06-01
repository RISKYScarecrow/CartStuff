package com.github.RISKYScarecrow.CartStuff.Initalisation;

import net.minecraft.item.Item;

import com.github.RISKYScarecrow.CartStuff.modItems.Spokes;

import cpw.mods.fml.common.registry.GameRegistry;

public class ItemDeclaration
{
	private ItemDeclaration()
	{
	}
	
	public static void addItems(Item i)
	{
	
		GameRegistry.registerItem(i, i.getUnlocalizedName());
		
		//wheel = new Wheel();
		//GameRegistry.registerItem(wheel, "Wheel");
	}
}
