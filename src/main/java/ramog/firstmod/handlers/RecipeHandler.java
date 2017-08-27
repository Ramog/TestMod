package ramog.firstmod.handlers;



import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;
import ramog.firstmod.init.BlockInit;
import ramog.firstmod.init.itemInit;


public class RecipeHandler {
	public static void registerCrafting() {
		//Block Crafting and decrafting
			//TutorialBlock
			GameRegistry.addShapedRecipe(new ResourceLocation("Firstmod:tutorial_ingot_block"), new ResourceLocation("Firstmod:tutorial_blocks"), new ItemStack(BlockInit.tutorial_ingot_block), 
					new Object[]{"III","III","III", 'I', itemInit.tutorial_ingot});
					
			GameRegistry.addShapelessRecipe(new ResourceLocation("Firstmod:tutorial_ingot"),new ResourceLocation("Firstmod:tutorial_items") , new ItemStack(itemInit.tutorial_ingot, 9), new Ingredient[] {Ingredient.fromItem(Item.getItemFromBlock(BlockInit.tutorial_ingot_block))});
		
	}
	
	public static void registerSmelting() {
		//ore melting
		GameRegistry.addSmelting(BlockInit.tutorial_ore, new ItemStack(itemInit.tutorial_ingot), 10);
		GameRegistry.addSmelting(BlockInit.tutorial_ore_end, new ItemStack(itemInit.tutorial_ingot), 15);
		GameRegistry.addSmelting(BlockInit.tutorial_ore_nether, new ItemStack(itemInit.tutorial_ingot), 12);
		
	}
	
	private static void registerToolCrafting(Item axe, Item hoe, Item pickaxe, Item shovel, Item sword, Item ingot) {
		//axe
		GameRegistry.addShapedRecipe(new ResourceLocation("" + axe.getRegistryName()), new ResourceLocation("tm:tutorial_tools"), new ItemStack(axe),
				new Object[]{"II","IS"," S", 'I', ingot, 'S', Items.STICK});
		
		//hoe
		GameRegistry.addShapedRecipe(new ResourceLocation("" + hoe.getRegistryName()), new ResourceLocation("tm:tutorial_tools"), new ItemStack(hoe),
				new Object[]{"II"," S"," S", 'I', ingot, 'S', Items.STICK});
		
		//pickaxe
		GameRegistry.addShapedRecipe(new ResourceLocation("" + pickaxe.getRegistryName()), new ResourceLocation("tm:tutorial_tools"), new ItemStack(pickaxe),
				new Object[]{"III"," S "," S ", 'I', ingot, 'S', Items.STICK});
		
		//shovel
		GameRegistry.addShapedRecipe(new ResourceLocation("" + shovel.getRegistryName()), new ResourceLocation("tm:tutorial_tools"), new ItemStack(shovel),
				new Object[]{"I","S","S", 'I', ingot, 'S', Items.STICK});
		
		//sword
		GameRegistry.addShapedRecipe(new ResourceLocation("" + sword.getRegistryName()), new ResourceLocation("tm:tutorial_tools"), new ItemStack(sword),
				new Object[]{"I","I","S", 'I', ingot, 'S', Items.STICK});
	}
	
	private static void registerArmorCrafting(Item helmet, Item chestplate, Item leggings, Item boots, Item ingot) {
		//helmet
		GameRegistry.addShapedRecipe(new ResourceLocation("" + helmet.getRegistryName()), new ResourceLocation("tm:tutorial_armor"), new ItemStack(helmet),
				new Object[]{"III","I I","" , 'I', ingot});
		
		//chestplate
		GameRegistry.addShapedRecipe(new ResourceLocation("" + chestplate.getRegistryName()), new ResourceLocation("tm:tutorial_armor"), new ItemStack(chestplate),
				new Object[]{"I I","III","III", 'I', ingot});
		
		//leggins
		GameRegistry.addShapedRecipe(new ResourceLocation("" + leggings.getRegistryName()), new ResourceLocation("tm:tutorial_armor"), new ItemStack(leggings),
				new Object[]{"III","I I", "I I", 'I', ingot});
		
		//boots
		GameRegistry.addShapedRecipe(new ResourceLocation("" + boots.getRegistryName()), new ResourceLocation("tm:tutorial_armor"), new ItemStack(boots),
				new Object[]{"I I","I I", "", 'I', ingot});
	}
}
