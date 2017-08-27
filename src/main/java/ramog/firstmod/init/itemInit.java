package ramog.firstmod.init;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import ramog.firstmod.Reference;
import ramog.firstmod.init.items.CustomIngot;

public class itemInit {
	public static Item tutorial_ingot;
	
	
	public static void init() {
		tutorial_ingot = new CustomIngot("tutorial_ingot");
	}
	
	public static void register() {
		registerItem(tutorial_ingot);
	}
	
	public static void registerItem(Item item) {
		ForgeRegistries.ITEMS.register(item);
		
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "Inventory"));
	}
}
