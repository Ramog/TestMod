package ramog.firstmod.init;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.common.registry.GameRegistry;
import ramog.firstmod.FirstMod;
import ramog.firstmod.init.blocks.CustomBlock;
import ramog.firstmod.init.blocks.CustomOre;

public class BlockInit {
	public static Block tutorial_ore, tutorial_ore_end, tutorial_ore_nether;
	
	public static Block tutorial_ingot_block;
	
	public static void init() {
		//                             name    hardness    resistence mininglevel
		tutorial_ore = new CustomOre("tutorial_ore", 2.0F, 4.0F, 2);
		tutorial_ore_end = new CustomOre("tutorial_ore_end", 3.0F, 1.5F , 3);
		tutorial_ore_nether = new CustomOre("tutorial_ore_nether", 3.0F, 4.0F, 3);
		
		tutorial_ingot_block = new CustomBlock("tutorial_ingot_block", 2.0F, 4.0F);
	}
	
	public static void register() {
		registerBlock(tutorial_ore);
		registerBlock(tutorial_ore_nether);
		registerBlock(tutorial_ore_end);
		
		registerBlock(tutorial_ingot_block);
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
