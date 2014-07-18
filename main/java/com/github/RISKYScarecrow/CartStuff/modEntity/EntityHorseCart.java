package com.github.RISKYScarecrow.CartStuff.modEntity;

import net.minecraft.entity.Entity;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class EntityHorseCart extends Entity
{
    private double speedMultiplier;
    private int cartPosRotationIncrements;
    private double cartX;
    private double cartY;
    private double cartZ;
    private double cartYaw;
    private double cartPitch;
    
    @SideOnly(Side.CLIENT)
    private double velocityX;
    @SideOnly(Side.CLIENT)
    private double velocityY;
    @SideOnly(Side.CLIENT)
    private double velocityZ;

    
    
	public EntityHorseCart(World par1World)
	{
		super(par1World);
	}
	
	public EntityHorseCart(World par1World, double par2, double par4, double par6)
    {
        this(par1World);
        this.setPosition(par2, par4 + (double)this.yOffset, par6);
        this.motionX = 0.0D;
        this.motionY = 0.0D;
        this.motionZ = 0.0D;
        this.prevPosX = par2;
        this.prevPosY = par4;
        this.prevPosZ = par6;
    }

	
	protected void entityInit()
    {
        this.dataWatcher.addObject(17, new Integer(0));
        this.dataWatcher.addObject(18, new Integer(1));
        this.dataWatcher.addObject(19, new Float(0.0F));
    }

    public boolean canBePushed()
    {
        return true;
    }
	
    protected void writeEntityToNBT  (NBTTagCompound par1NBTTagCompound) {}
    protected void readEntityFromNBT (NBTTagCompound par1NBTTagCompound) {}
}