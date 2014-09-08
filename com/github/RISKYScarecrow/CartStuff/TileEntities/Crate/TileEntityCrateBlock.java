package com.github.RISKYScarecrow.CartStuff.TileEntities.Crate;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class TileEntityCrateBlock extends BlockContainer
{

	// Treat it like a normal block here. The Block Bounds are a good idea - the
	// first three are X Y and Z of the botton-left corner,
	// And the second three are the top-right corner.
	public TileEntityCrateBlock()
	{
		super(Material.iron);
		this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
		this.setBlockName("Crate");
	}

	// Make sure you set this as your TileEntity class relevant for the block!
	public TileEntity createNewTileEntity(World world, int par1)
	{
		return new TileEntityCrateEntity();
	}

	public boolean onBlockActivated(World par1World, int x, int y, int z, EntityPlayer par5EntityPlayer, int par6, float par7, float par8, float par9)
	{
		par1World.getTileEntity(x, y, z).blockMetadata = (par1World.getTileEntity(x, y, z).blockMetadata + 1) % 4;
		Minecraft.getMinecraft().thePlayer.sendChatMessage("data is " + par1World.getTileEntity(x, y, z).blockMetadata);
		return true;
	}

	// You don't want the normal render type, or it wont render properly.
	@Override
	public int getRenderType()
	{
		return -1;
	}

	// It's not an opaque cube, so you need this.
	@Override
	public boolean isOpaqueCube()
	{
		return false;
	}

	// It's not a normal block, so you need this too.
	public boolean renderAsNormalBlock()
	{
		return false;
	}

	// This is the icon to use for showing the block in your hand.
	public void registerIcons(IIconRegister icon)
	{
		this.blockIcon = icon.registerIcon("Roads:TrafficLightIcon");
	}

	public void onBlockPlacedBy(World world, int i, int j, int k, EntityLiving entityliving)
	{
		int rotation = MathHelper.floor_double((double) ((entityliving.rotationYaw * 4F) / 360F) + 2.5D) & 3;
		world.setBlockMetadataWithNotify(i, j, k, rotation, 2);
	}
}
