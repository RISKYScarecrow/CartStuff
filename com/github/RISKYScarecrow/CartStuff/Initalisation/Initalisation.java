package com.github.RISKYScarecrow.CartStuff.Initalisation;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

import com.github.RISKYScarecrow.CartStuff.CartStuff;
import com.github.RISKYScarecrow.CartStuff.Crate.TileEntityCrateBlock;

import cpw.mods.fml.common.registry.GameRegistry;

public class Initalisation
{
	private Initalisation()
	{
	}
	public static void initalise()
	{
		addCrate();

	}
	
	public static void addCrate()
	{
		CartStuff.crate = new TileEntityCrateBlock();
		GameRegistry.registerBlock(CartStuff.crate, CartStuff.crate.getUnlocalizedName());

		ItemStack spokeStack = new ItemStack(CartStuff.crate);
		GameRegistry.addShapedRecipe(spokeStack, new Object[] { "///", "/o/",
				"///", '/', Items.stick, 'o', Blocks.planks });
	}
}
