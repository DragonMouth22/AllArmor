package net.dragonmouth.allarmor.common;

import net.dragonmouth.allarmor.handlers.OreDictionaryHandler;
import net.dragonmouth.allarmor.init.ModCrafting;
import net.dragonmouth.allarmor.init.ModItems;
import net.dragonmouth.allarmor.init.ModTabArmor;
import net.dragonmouth.allarmor.init.ModTabMaterials;
import net.dragonmouth.allarmor.init.ModTabTools;
import net.dragonmouth.allarmor.proxy.ClientProxy;
import net.dragonmouth.allarmor.proxy.CommonProxy;
import net.dragonmouth.allarmor.proxy.ServerProxy;
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
		System.out.println("PreInit");
		
		ModItems.init();
		ModItems.register();
		
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
		System.out.println("Init");
		
		proxy.init();
		proxy.registerModelBakeryVariants();
		
		ModCrafting.register();
//		ModEntity.registerEntity();
		
		OreDictionaryHandler.registerOreDictionary();
		
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		System.out.println("PostInit");
	}
	
}
