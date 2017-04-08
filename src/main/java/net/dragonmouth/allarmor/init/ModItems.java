package net.dragonmouth.allarmor.init;

import net.dragonmouth.allarmor.common.Reference;
import net.dragonmouth.allarmor.handlers.EnumHandler.LeafTypes;
import net.dragonmouth.allarmor.items.ItemChain;
import net.dragonmouth.allarmor.items.ItemChainmailMesh;
import net.dragonmouth.allarmor.items.ItemCloth;
import net.dragonmouth.allarmor.items.ItemLeaf;
import net.dragonmouth.allarmor.items.ItemStoneChunk;
import net.dragonmouth.allarmor.items.ItemWoodChunk;
import net.dragonmouth.allarmor.items.ModItemArmor;
import net.dragonmouth.allarmor.items.ModItemAxe;
import net.dragonmouth.allarmor.items.ModItemHoe;
import net.dragonmouth.allarmor.items.ModItemPickaxe;
import net.dragonmouth.allarmor.items.ModItemShovel;
import net.dragonmouth.allarmor.items.ModItemSword;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {
	
	//Crafting Items
	public static Item woodChunk;
	public static Item stoneChunk;
	public static Item cloth;
	public static Item chain;
	public static Item chainmailMesh;
	public static Item leaf;
	
	//Tool Materials
	public static ToolMaterial toolCoal = EnumHelper.addToolMaterial("toolCoal", 1, 750, 3.0f, 0.5f, 11);
	
	//Tools
	public static Item coalSword;
	public static Item coalPickaxe;
	public static Item coalAxe;
	public static Item coalShovel;
	public static Item coalHoe;
	
	//Armor Materials
	public static ArmorMaterial Runeleather = EnumHelper.addArmorMaterial("Runeleather", "allarmor:runeleather", 12, new int[] {2,4,3,1}, 14, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 0.0f);
	public static ArmorMaterial Cloth = EnumHelper.addArmorMaterial("Cloth", "allarmor:cloth", 14, new int[] {1,2,2,1}, 12, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0f);
	public static ArmorMaterial Wood = EnumHelper.addArmorMaterial("Wood", "allarmor:wood", 7, new int[] {2,5,4,2}, 7, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 1.0f);
	public static ArmorMaterial Stone = EnumHelper.addArmorMaterial("Stone", "allarmor:stone", 13, new int[] {2,5,4,3}, 6, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 1.5f);
	public static ArmorMaterial Coal = EnumHelper.addArmorMaterial("Coal", "allarmor:coal", 10, new int[] {1,4,3,1}, 11, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.5f);
	
	//Armor
	public static Item runeleatherHelmet;
	public static Item runeleatherChestplate;
	public static Item runeleatherLeggings;
	public static Item runeleatherBoots;
	public static Item woodHelmet;
	public static Item woodChestplate;
	public static Item woodLeggings;
	public static Item woodBoots;
	public static Item stoneHelmet;
	public static Item stoneChestplate;
	public static Item stoneLeggings;
	public static Item stoneBoots;
	public static Item coalHelmet;
	public static Item coalChestplate;
	public static Item coalLeggings;
	public static Item coalBoots;
	public static Item clothHelmet;
	public static Item clothChestplate;
	public static Item clothLeggings;
	public static Item clothBoots;
	
	public static void init() {
		
		//Items
		woodChunk = new ItemWoodChunk();
		stoneChunk = new ItemStoneChunk();
		cloth = new ItemCloth();
		chain = new ItemChain();
		chainmailMesh = new ItemChainmailMesh();
		leaf = new ItemLeaf();
		
	}
	
	public static void register() {
		
		//Crafting Items
		GameRegistry.register(woodChunk);
		GameRegistry.register(stoneChunk);
		GameRegistry.register(cloth);
		GameRegistry.register(chain);
		GameRegistry.register(chainmailMesh);
		GameRegistry.register(leaf);
		
		//Tools
		GameRegistry.registerItem(coalSword = new ModItemSword("coalSword", toolCoal), coalSword.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(coalPickaxe = new ModItemPickaxe("coalPickaxe", toolCoal), coalPickaxe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(coalAxe = new ModItemAxe("coalAxe", toolCoal), coalAxe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(coalShovel = new ModItemShovel("coalShovel", toolCoal), coalShovel.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(coalHoe = new ModItemHoe("coalHoe", toolCoal), coalHoe.getUnlocalizedName().substring(5));
		
		//Armor
		GameRegistry.registerItem(runeleatherHelmet = new ModItemArmor("runeleatherHelmet", Runeleather, 1, EntityEquipmentSlot.HEAD), runeleatherHelmet.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(runeleatherChestplate = new ModItemArmor("runeleatherChestplate", Runeleather, 1, EntityEquipmentSlot.CHEST), runeleatherChestplate.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(runeleatherLeggings = new ModItemArmor("runeleatherLeggings", Runeleather, 1, EntityEquipmentSlot.LEGS), runeleatherLeggings.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(runeleatherBoots = new ModItemArmor("runeleatherBoots", Runeleather, 1, EntityEquipmentSlot.FEET), runeleatherBoots.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(woodHelmet = new ModItemArmor("woodHelmet", Wood, 1, EntityEquipmentSlot.HEAD), woodHelmet.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(woodChestplate = new ModItemArmor("woodChestplate", Wood, 1, EntityEquipmentSlot.CHEST), woodChestplate.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(woodLeggings = new ModItemArmor("woodLeggings", Wood, 1, EntityEquipmentSlot.LEGS), woodLeggings.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(woodBoots = new ModItemArmor("woodBoots", Wood, 1, EntityEquipmentSlot.FEET), woodBoots.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(stoneHelmet = new ModItemArmor("stoneHelmet", Stone, 1, EntityEquipmentSlot.HEAD), stoneHelmet.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(stoneChestplate = new ModItemArmor("stoneChestplate", Stone, 1, EntityEquipmentSlot.CHEST), stoneChestplate.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(stoneLeggings = new ModItemArmor("stoneLeggings", Stone, 1, EntityEquipmentSlot.LEGS), stoneLeggings.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(stoneBoots = new ModItemArmor("stoneBoots", Stone, 1, EntityEquipmentSlot.FEET), stoneBoots.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(coalHelmet = new ModItemArmor("coalHelmet", Coal, 1, EntityEquipmentSlot.HEAD), coalHelmet.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(coalChestplate = new ModItemArmor("coalChestplate", Coal, 1, EntityEquipmentSlot.CHEST), coalChestplate.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(coalLeggings = new ModItemArmor("coalLeggings", Coal, 1, EntityEquipmentSlot.LEGS), coalLeggings.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(coalBoots = new ModItemArmor("coalBoots", Coal, 1, EntityEquipmentSlot.FEET), coalBoots.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(clothHelmet = new ModItemArmor("clothHelmet", Cloth, 1, EntityEquipmentSlot.HEAD), clothHelmet.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(clothChestplate = new ModItemArmor("clothChestplate", Cloth, 1, EntityEquipmentSlot.CHEST), clothChestplate.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(clothLeggings = new ModItemArmor("clothLeggings", Cloth, 1, EntityEquipmentSlot.LEGS), clothLeggings.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(clothBoots = new ModItemArmor("clothBoots", Cloth, 1, EntityEquipmentSlot.FEET), clothBoots.getUnlocalizedName().substring(5));
		
	}
	
	public static void registerRenders() {
		
		//Items
		registerRender(woodChunk);
		registerRender(stoneChunk);
		registerRender(cloth);
		registerRender(chain);
		registerRender(chainmailMesh);
		
		//Leaf Item
		for(int i = 0; i < LeafTypes.values().length; i++) {
			registerRender(leaf, i, "leaf" + LeafTypes.values()[i].getResourceName());
		}
		
		//Tools
		registerRender(coalSword);
		registerRender(coalPickaxe);
		registerRender(coalAxe);
		registerRender(coalShovel);
		registerRender(coalHoe);
		
		//Armor
		registerRender(runeleatherHelmet);
		registerRender(runeleatherChestplate);
		registerRender(runeleatherLeggings);
		registerRender(runeleatherBoots);
		registerRender(woodHelmet);
		registerRender(woodChestplate);
		registerRender(woodLeggings);
		registerRender(woodBoots);
		registerRender(stoneHelmet);
		registerRender(stoneChestplate);
		registerRender(stoneLeggings);
		registerRender(stoneBoots);
		registerRender(coalHelmet);
		registerRender(coalChestplate);
		registerRender(coalLeggings);
		registerRender(coalBoots);
		registerRender(clothHelmet);
		registerRender(clothChestplate);
		registerRender(clothLeggings);
		registerRender(clothBoots);
		
	}
	
	private static void registerRender(Item item) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
	
	private static void registerRender(Item item, int meta, String filename) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, meta, new ModelResourceLocation(new ResourceLocation(Reference.MODID, filename), "inventory"));
	}
	
}
