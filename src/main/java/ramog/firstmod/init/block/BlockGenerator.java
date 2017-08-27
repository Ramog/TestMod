package ramog.firstmod.init.block;

import javax.annotation.Nullable;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.world.World;
import ramog.firstmod.init.block.tileEntitys.BlockTileEntity;
import ramog.firstmod.init.block.tileEntitys.TileEntityEnergyGen;

public class BlockGenerator extends BlockTileEntity<TileEntityEnergyGen> {

	public BlockGenerator(Material material, String name, float Hardness, float resistence, float maxRF) {
		super(material.ROCK, name, 2.0F, 4.0F);
		
	}

	@Override
	public Class<TileEntityEnergyGen> getTileEntityClass() {
		return TileEntityEnergyGen.class;
	}
	
	
	@Nullable
	@Override
	public TileEntityEnergyGen createTileEntity(World world, IBlockState state) {
		return new TileEntityEnergyGen();
	}
}

