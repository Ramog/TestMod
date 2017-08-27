package ramog.firstmod.proxy;


import net.minecraft.client.resources.I18n;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import ramog.firstmod.handlers.RegistryHandler;
import ramog.firstmod.init.block.entitySpecialRender.TESRPedestal;
import ramog.firstmod.init.block.tileEntitys.TileEntityPedestal;

public class ClientProxy extends CommonProxy {
	@Override
	public String localize(String unlocalized, Object... args) {
		return I18n.format(unlocalized, args);
	}
	
	@Override
	public void registerRenderers() {
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityPedestal.class, new TESRPedestal());
	}


	

	
	public void preInit(FMLPreInitializationEvent event) {
		super.preInit(event);
	}
	
	
	public void init(FMLInitializationEvent event) {
		super.init(event);
		RegistryHandler.Client();
	}
	
	
	public void postInit(FMLPostInitializationEvent event) {
		super.postInit(event);
	}
}
