package ramog.firstmod.proxy;

import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import ramog.firstmod.Reference;
import ramog.firstmod.handlers.GuiHandler;
import ramog.firstmod.handlers.RegistryHandler;
import net.minecraft.util.text.translation.I18n;

public class CommonProxy {
	public String localize(String unlocalized, Object... args) {
			return I18n.translateToLocalFormatted(unlocalized, args);
	}
	
	public void registerRenders() {
	}

	public void preInit(FMLPreInitializationEvent event) {
		RegistryHandler.Common();

	}
	
	
	public void init(FMLInitializationEvent event) {
		
	}
	
	
	public void postInit(FMLPostInitializationEvent event) {
		
	}

	public void registerRenderers() {
		// TODO Auto-generated method stub
		
	}
	
	
}
