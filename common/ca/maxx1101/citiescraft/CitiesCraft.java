package ca.maxx1101.citiescraft;

import java.util.Random;

import ca.maxx1101.citiescraft.proxies.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.SidedProxy;

@Mod(modid = CitiesCraft.MOD_ID, name = CitiesCraft.MOD_ID, version = CitiesCraft.VERSION, dependencies = CitiesCraft.DEPENDENCIES)
public class CitiesCraft {
	
	//Constants
	public static final String MOD_ID = "citiescraft";
	public static final String MOD_NAME = "CitiesCraft";
	public static final String VERSION = "@VERSION@";
	public static final String DEPENDENCIES = "required-after:forge@[14.21.1.2413,)";
	public static final String RESOURCE_PREVIX = MOD_ID.toLowerCase() + ":";	// citiescraft:	
	
	// Variables
	public static Random random = new Random();
	
	@Instance(MOD_ID)
	public static CitiesCraft instance;
	
	@SidedProxy(clientSide = "ca.maxx1101.citiescraft.proxies.ClientProxy", serverSide = "ca.maxx1101.citiescraft.proxies.CommonProxy")
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		proxy.preInit(event);
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
		proxy.init(event);
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		proxy.postInit(event);
	}
}
