package ramog.firstmod.init;

import javax.annotation.Nullable;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.common.registry.GameRegistry;
import ramog.firstmod.FirstMod;
import ramog.firstmod.init.block.BlockCounter;
import ramog.firstmod.init.block.BlockPedestal;
import ramog.firstmod.init.block.CustomBlock;
import ramog.firstmod.init.block.CustomOre;

public class BlockInit {
	public static Block tutorial_ore, tutorial_ore_end, tutorial_ore_nether;
	
	public static Block tutorial_ingot_block;
	
	//public static Block tutorial_generator;
	
	public static BlockCounter counter_block;

	public static BlockPedestal pedestal_block;


	
	public static void init() {
		//                             name    hardness    resistence mininglevel
		tutorial_ore = new CustomOre("tutorial_ore", 2.0F, 4.0F, 2);
		tutorial_ore_end = new CustomOre("tutorial_ore_end", 3.0F, 1.5F , 3);
		tutorial_ore_nether = new CustomOre("tutorial_ore_nether", 3.0F, 4.0F, 3);
		
		tutorial_ingot_block = new CustomBlock(Material.IRON, "tutorial_ingot_block", 2.0F, 4.0F);
	
		counter_block = new BlockCounter("counter_block");
		pedestal_block = new BlockPedestal(Material.IRON, "pedestal_block", 2.0F, 4.0F, 10);
		
		//tutorial_generator = new CustomGenerator("tutorial_generator");
	}
	
	public static void register() {
		registerBlock(tutorial_ore);
		registerBlock(tutorial_ore_nether);
		registerBlock(tutorial_ore_end);
		
		registerBlock(tutorial_ingot_block);
		
		//registerBlock(tutorial_generator);
		
		registerBlock(counter_block);
		registerBlock(pedestal_block);
	
		GameRegistry.registerTileEntity(counter_block.getTileEntityClass(), counter_block.getRegistryName().toString());
		GameRegistry.registerTileEntity(pedestal_block.getTileEntityClass(), pedestal_block.getRegistryName().toString());
	}
	
	
	public static void registerBlock(Block block) {
		ForgeRegistries.BLOCKS.register(block);
		block.setCreativeTab(FirstMod.tutorialtab);
		ItemBlock item = new ItemBlock(block);
		item.setRegistryName(block.getRegistryName());
		ForgeRegistries.ITEMS.register(item);
					
		ModelLoader.setCustomModelResourceLocation(item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "Inventory"));
	}
}
