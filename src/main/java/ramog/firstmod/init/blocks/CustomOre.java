package ramog.firstmod.init.blocks;

import net.minecraft.block.Block;

public class CustomOre extends CustomBlock {
	public CustomOre(String name, float hardness, float resistance, int haverstLevel) {
		super(name, hardness, resistance);
		setHarvestLevel("pickaxe", haverstLevel);
	}
}
