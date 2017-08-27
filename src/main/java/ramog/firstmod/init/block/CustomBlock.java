package ramog.firstmod.init.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class CustomBlock extends Block{
	

	public CustomBlock(Material material, String name, float hardness, float resistance) {
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setHardness(hardness);
		setResistance(resistance);
	}
}
