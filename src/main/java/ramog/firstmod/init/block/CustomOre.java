package ramog.firstmod.init.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class CustomOre extends CustomBlock {
	public CustomOre(String name, float hardness, float resistance, int haverstLevel) {
		super(Material.ROCK, name, hardness, resistance);
		setHarvestLevel("pickaxe", haverstLevel);
	}
}
