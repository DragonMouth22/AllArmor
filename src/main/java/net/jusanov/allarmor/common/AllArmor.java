package net.jusanov.allarmor.common;

import org.apache.logging.log4j.Level;

import net.jusanov.allarmor.handlers.LogHandler;
import net.jusanov.allarmor.handlers.OreDictionaryHandler;
import net.jusanov.allarmor.init.ModCrafting;
import net.jusanov.allarmor.init.ModItems;
import net.jusanov.allarmor.init.ModTabArmor;
import net.jusanov.allarmor.init.ModTabMaterials;
import net.jusanov.allarmor.init.ModTabTools;
import net.jusanov.allarmor.proxy.ClientProxy;
import net.jusanov.allarmor.proxy.CommonProxy;
import net.jusanov.allarmor.proxy.ServerProxy;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION, acceptedMinecraftVersions = Reference.ACCEPTED_VERSIONS)
public class AllArmor {
	
	@Instance
	public static AllArmor instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
	public static ClientProxy clientProxy;
	public static ServerProxy serverProxy;
	
	public static CreativeTabs allarmorArmorTab = new ModTabArmor(12, "allarmorArmorTab");
	public static CreativeTabs allarmorToolsTab = new ModTabTools(13, "allarmorToolsTab");
	public static CreativeTabs allarmorMaterialsTab = new ModTabMaterials(14, "allarmorMaterialsTab");
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		
		LogHandler.logHandler.info("Pre-Inilitization Started!");
		
		ModItems.init();
		ModItems.register();
		
		LogHandler.logHandler.info("Pre-Inilitization Complete!");
		
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
		
		LogHandler.logHandler.info("Inilitization Started!");
		
		proxy.init();
		proxy.registerModelBakeryVariants();
		
		ModCrafting.register();
//		ModEntity.registerEntity();
		
		OreDictionaryHandler.registerOreDictionary();
		
		LogHandler.logHandler.info("Inilitization Complete!");
		
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		
		LogHandler.logHandler.info("Post-Inilitization Started!");
		LogHandler.logHandler.info("Post-Inilitization Complete!");
		
	}
	
}
