package ramog.firstmod.init.block.tileEntitys;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;

public class TileEntityEnergyGen extends TileEntity {
	private int energyValue;
	
	@Override
	public NBTTagCompound writeToNBT(NBTTagCompound compound) {
		compound.setInteger("energy", energyValue);
		return super.writeToNBT(compound);
	}
	
	@Override
	public void readFromNBT(NBTTagCompound compound) {
		energyValue = compound.getInteger("energyValue");
		super.readFromNBT(compound);
	}
	
	public int getenergyValue() {
		return energyValue;
	}
	public void incrementenergyValue() {
		energyValue++;
		markDirty();
	}
	
	public void decrementenergyValue() {
		energyValue--;
		markDirty();
	}
}
