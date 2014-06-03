package com.github.RISKYScarecrow.CartStuff.modItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class Wheel extends Item 
{
	public Wheel()
	{
		setMaxStackSize(1);
		setCreativeTab(CreativeTabs.tabTools);
		setUnlocalizedName("Wheel");
		setTextureName("CartStuff:wheelTexture");
	}
}
