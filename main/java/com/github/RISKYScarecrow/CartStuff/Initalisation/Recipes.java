package com.github.RISKYScarecrow.CartStuff.Initalisation;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import com.github.RISKYScarecrow.CartStuff.modItems.Spokes;

import cpw.mods.fml.common.registry.GameRegistry;

public final class Recipes {

	private Recipes() {
	}

	public static void add() {
		// addItemRecipes();
	}

	public static void addItemRecipes(Item s) {

		// Spokes
		ItemStack spokeStack = new ItemStack(s);
		GameRegistry.addShapedRecipe(spokeStack, new Object[] { "///", "/o/",
				"///", '/', Items.stick, 'o', Blocks.planks });
	}

}