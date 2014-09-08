package com.github.RISKYScarecrow.CartStuff.Initalisation;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import com.github.RISKYScarecrow.CartStuff.CartStuff;
import com.github.RISKYScarecrow.CartStuff.Items.ItemSpokes;
import com.github.RISKYScarecrow.CartStuff.Items.ItemWheel;
import com.github.RISKYScarecrow.CartStuff.TileEntities.Crate.TileEntityCrateBlock;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class Initalisation
{
	private Initalisation()
	{
	}
	public static void initalise()
	{
		addCrate();
		addSpokes();
		addWheel();
	}
	
	public static void addCrate()
	{
		CartStuff.crate = new TileEntityCrateBlock();
		GameRegistry.registerBlock(CartStuff.crate, CartStuff.crate.getUnlocalizedName());

		ItemStack spokeStack = new ItemStack(CartStuff.crate);
		GameRegistry.addShapedRecipe(spokeStack, new Object[] { "///", "/o/",
				"///", '/', Items.stick, 'o', Blocks.planks });
	}
	
	public static void addWheel()
	{
		CartStuff.wheel = new ItemWheel();
		GameRegistry.registerItem(CartStuff.wheel, "Wheel");
	}
	
	public static void addSpokes()
	{
		CartStuff.spokes = new ItemSpokes();
		GameRegistry.registerItem(CartStuff.spokes, "Spokes");
	}
}
