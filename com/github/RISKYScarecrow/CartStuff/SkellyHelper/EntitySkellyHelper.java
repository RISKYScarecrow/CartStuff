package com.github.RISKYScarecrow.CartStuff.SkellyHelper;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.world.World;

public class EntitySkellyHelper extends EntityAnimal
{
    public EntitySkellyHelper(World par1World)
    {
        super(par1World);
        this.setSize(0.9F, 1.3F);
    }

    protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        this.setHealth(10.0F);
        //this.getEntityAttribute(SharedMonsterAttributes.maxHealth)).setHealth(10.0F);//.setAttribute(10.0D);
        //this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setAttribute(0.20000000298023224D);
    }

    protected String getLivingSound()
    {
        return null;//"yourmod:YourSound";//this refers to:yourmod/sound/YourSound
    }

    protected String getHurtSound()
    {
        return null;//"yourmod:optionalFile.YourSound";//this refers to:yourmod/sound/optionalFile/YourSound
    }

    protected String getDeathSound()
    {
        return null;//"yourmod:optionalFile.optionalFile2.YourSound";//etc.
    }

    protected float getSoundVolume()
    {
        return 0.4F;
    }

	@Override
	public EntityAgeable createChild(EntityAgeable p_90011_1_)
	{
		return null;
	}
}