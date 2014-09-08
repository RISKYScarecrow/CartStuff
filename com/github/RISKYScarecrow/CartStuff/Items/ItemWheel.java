package com.github.RISKYScarecrow.CartStuff.Items;

import com.github.RISKYScarecrow.CartStuff.CartStuff;

import net.minecraft.item.Item;

public class ItemWheel extends Item
{
	public ItemWheel()
	{
		this.setMaxStackSize(4);
		this.setUnlocalizedName("Wheel");
		this.setTextureName("CartStuff:wheelTexture");
		this.setCreativeTab(CartStuff.tabCartStuff);
	}
}
