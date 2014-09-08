package com.github.RISKYScarecrow.CartStuff.Items;

import com.github.RISKYScarecrow.CartStuff.CartStuff;

import net.minecraft.item.Item;

public class ItemSpokes extends Item
{
	public ItemSpokes()
	{
		this.setUnlocalizedName("Spokes");
		this.setTextureName("CartStuff:spokeTexture");
		this.setCreativeTab(CartStuff.tabCartStuff);
	}
}
