package com.github.RISKYScarecrow.CartStuff.modItems;


import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class Spokes extends Item 
{
	public Spokes()
	{
		setMaxStackSize(4);
		setCreativeTab(CreativeTabs.tabTools);
		setUnlocalizedName("Spokes");
		setTextureName("CartStuff:spokeTexture");
	}
}
