package com.github.RISKYScarecrow.CartStuff.Initalisation;

import com.github.RISKYScarecrow.CartStuff.CartStuff;
import com.github.RISKYScarecrow.CartStuff.modItems.Spokes;

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
	
	
	public static void addSpokes(Item i)
	{
			GameRegistry.registerItem(i, i.getUnlocalizedName());
		
		ItemStack spokeStack = new ItemStack(i);
		GameRegistry.addShapedRecipe(spokeStack, new Object[] { "///", "/o/",
				"///", '/', Items.stick, 'o', Blocks.planks });
	}
	public static void addWheel(Item i)
	{
		GameRegistry.registerItem(i, i.getUnlocalizedName());
		
		ItemStack spokeStack = new ItemStack(i);
		GameRegistry.addShapedRecipe(spokeStack, new Object[] { "/ /", " o ",
				"/ /", '/', Blocks.planks, 'o', CartStuff.spokes });}
}
