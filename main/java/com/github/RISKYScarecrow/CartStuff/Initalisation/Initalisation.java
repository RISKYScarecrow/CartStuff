package com.github.RISKYScarecrow.CartStuff.Initalisation;

import com.github.RISKYScarecrow.CartStuff.CartStuff;
import com.github.RISKYScarecrow.CartStuff.modItems.Spokes;
import com.github.RISKYScarecrow.CartStuff.modItems.Wheel;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class Initalisation
{
	private Initalisation()
	{
	}
	public static void initalise()
	{
		addSpokes();
		addWheel();
	}
	
	public static void addSpokes()
	{
		CartStuff.spokes = new Spokes();
		GameRegistry.registerItem(CartStuff.spokes, CartStuff.spokes.getUnlocalizedName());

		ItemStack spokeStack = new ItemStack(CartStuff.spokes);
		GameRegistry.addShapedRecipe(spokeStack, new Object[] { "///", "/o/",
				"///", '/', Items.stick, 'o', Blocks.planks });
	}

	public static void addWheel()
	{
		CartStuff.wheel = new Wheel();
		GameRegistry.registerItem(CartStuff.wheel, CartStuff.wheel.getUnlocalizedName());

		ItemStack spokeStack = new ItemStack(CartStuff.wheel);
		GameRegistry.addShapedRecipe(spokeStack, new Object[] { "/ /", " o ",
				"/ /", '/', Blocks.planks, 'o', CartStuff.spokes });
	}
}
