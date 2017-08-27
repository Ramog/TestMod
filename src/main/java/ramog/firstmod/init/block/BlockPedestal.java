package ramog.firstmod.init.block;

import javax.annotation.Nullable;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.IItemHandler;
import ramog.firstmod.FirstMod;
import ramog.firstmod.handlers.GuiHandler;
import ramog.firstmod.init.block.tileEntitys.BlockTileEntity;
import ramog.firstmod.init.block.tileEntitys.TileEntityPedestal;

public class BlockPedestal extends BlockTileEntity<TileEntityPedestal> {
	
	
	public BlockPedestal(Material material, String name, float Hardness, float resistence, float maxRF) {
		super(material.ROCK, name, 2.0F, 4.0F);
		
	}
	
	@Override
	public void breakBlock(World world, BlockPos pos, IBlockState state) {
		TileEntityPedestal tile = getTileEntity(world, pos);
		IItemHandler itemHandler = tile.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, EnumFacing.NORTH);
		ItemStack stack = itemHandler.getStackInSlot(0);
		if (!stack.isEmpty()) {
			EntityItem item = new EntityItem(world, pos.getX(), pos.getY(), pos.getZ(), stack);
			world.spawnEntity(item);
		}
		super.breakBlock(world, pos, state);
	}
	
	
	
		@Override
		public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumHand hand, EnumFacing side, float hitX, float hitY, float hitZ) {
			if (!world.isRemote) {
				// ...
	 			if (!player.isSneaking()) {
	 				// ...
	  			} else {
	  				player.openGui(FirstMod.instance, GuiHandler.PEDESTAL, world, pos.getX(), pos.getY(), pos.getZ());
	  			}
	  		}
	  		return true;

		}

	

	@Override
	public Class<TileEntityPedestal> getTileEntityClass() {
		return TileEntityPedestal.class;
	}
	
	
	@Nullable
	@Override
	public TileEntityPedestal createTileEntity(World world, IBlockState state) {
		return new TileEntityPedestal();
	}
}
