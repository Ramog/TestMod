package ramog.firstmod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import net.minecraftforge.fml.relauncher.Side;
import ramog.firstmod.handlers.GuiHandler;
import ramog.firstmod.network.PacketRequestUpdatePedestal;
import ramog.firstmod.network.PacketUpdatePedestal;
import ramog.firstmod.proxy.CommonProxy;
import ramog.firstmod.tabs.TutorialTab;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class FirstMod {
	
	public static final CreativeTabs tutorialtab = new TutorialTab("tutorialtab");
	
	public static SimpleNetworkWrapper network; //was wrapper but the tutorial seemse to have quite some mistakes
	
	@Mod.Instance(Reference.MODID)
	public static FirstMod instance;
	
	@SidedProxy(clientSide = Reference.CLIENTPROXY, serverSide = Reference.COMMONPROXY)
	public static CommonProxy proxy;
	
	
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		proxy.preInit(event);
		NetworkRegistry.INSTANCE.registerGuiHandler(this, new GuiHandler());
		
		
		
		
		network = NetworkRegistry.INSTANCE.newSimpleChannel(Reference.MODID);
		network.registerMessage(new PacketUpdatePedestal.Handler(), PacketUpdatePedestal.class, 0, Side.CLIENT);
		network.registerMessage(new PacketRequestUpdatePedestal.Handler(), PacketRequestUpdatePedestal.class, 1, Side.SERVER);
		
		proxy.registerRenders();
	}
	
	
	@EventHandler
	public static void init(FMLInitializationEvent event) {
		proxy.init(event);
	}
	
	@EventHandler
	public static void postInit(FMLPostInitializationEvent event) {
		proxy.postInit(event);
	}

}
