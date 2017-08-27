package ramog.firstmod.init.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import ramog.firstmod.FirstMod;

public class CustomIngot extends Item {
	public CustomIngot(String name)
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(FirstMod.tutorialtab);
	}
}
