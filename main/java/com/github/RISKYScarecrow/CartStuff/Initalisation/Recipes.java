package com.github.RISKYScarecrow.CartStuff.Initalisation;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import com.github.RISKYScarecrow.CartStuff.Items.Spokes;

import cpw.mods.fml.common.registry.GameRegistry;

public final class Recipes {


	private Recipes() {
	}

	public static void add() {
		addBlockRecipes();
	}
	
	public static void addBlockRecipes()
	{
		Spokes spokes = new Spokes();
		ItemStack spokeStack = new ItemStack(spokes);
		GameRegistry.addShapedRecipe(spokeStack,
				"///",
				"/o/",
				"///",
				'/', Item.getItemById(280),
				'o', Block.getBlockById(5));
	}
}