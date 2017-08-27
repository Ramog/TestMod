package ramog.firstmod.handlers;

import net.minecraftforge.fml.common.registry.GameRegistry;
import ramog.firstmod.Reference;
import ramog.firstmod.gen.TutorialOreGen;
import ramog.firstmod.init.BlockInit;
//import ramog.firstmod.init.entityInitobsolete;
import ramog.firstmod.init.itemInit;





public class RegistryHandler {
	public static void Client() {
		RecipeHandler.registerCrafting();
		RecipeHandler.registerSmelting();
	}
	
	
	public static void Common() {
		itemInit.init();
		itemInit.register();
		
		
		BlockInit.init();
		BlockInit.register();	
		GameRegistry.registerWorldGenerator(new TutorialOreGen(), 0);
	}
}
