package net.dragonmouth.allarmor.init;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModCrafting {

	public static void register() {
		
		//Item Crafting
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.woodChunk, 9, 0), "W", "W", "W", 'W', Blocks.LOG);
		GameRegistry.addShapedRecipe(new ItemStack(Blocks.LOG, 1, 0), "WWW", "WWW", "WWW", 'W', ModItems.woodChunk);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.stoneChunk, 9, 0), "S", "S", "S", 'S', Blocks.STONE);
		GameRegistry.addShapedRecipe(new ItemStack(Blocks.STONE, 1, 0), "SSS", "SSS", "SSS", 'S', ModItems.stoneChunk);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.cloth, 2, 0), " S", "SS", 'S', Items.STRING);
		GameRegistry.addShapedRecipe(new ItemStack(Items.STRING, 2, 0), "C", 'C', ModItems.cloth);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.chain, 10, 0), "I I", " I ", "I I", 'I', Items.IRON_INGOT);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.chain, 8, 0), " I ", "I I", " I ", 'I', Items.IRON_INGOT);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.chainmailMesh, 1, 0), "CC", "CC", 'C', ModItems.chain);
		
		//Chainmail Armor Crafting
		GameRegistry.addShapedRecipe(new ItemStack(Items.CHAINMAIL_HELMET), "CCC", "C C", 'C', ModItems.chainmailMesh);
		GameRegistry.addShapedRecipe(new ItemStack(Items.CHAINMAIL_CHESTPLATE), "C C", "CCC", "CCC", 'C', ModItems.chainmailMesh);
		GameRegistry.addShapedRecipe(new ItemStack(Items.CHAINMAIL_LEGGINGS), "CCC", "C C", "C C", 'C', ModItems.chainmailMesh);
		GameRegistry.addShapedRecipe(new ItemStack(Items.CHAINMAIL_BOOTS), "C C", "C C", 'C', ModItems.chainmailMesh);
		
		//Runeleather Armor Crafting
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.runeleatherHelmet), "C", "L", 'C', Items.CHAINMAIL_HELMET, 'L', Items.LEATHER_HELMET);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.runeleatherChestplate), "C", "L", 'C', Items.CHAINMAIL_CHESTPLATE, 'L', Items.LEATHER_CHESTPLATE);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.runeleatherLeggings), "C", "L", 'C', Items.CHAINMAIL_LEGGINGS, 'L', Items.LEATHER_LEGGINGS);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.runeleatherBoots), "C", "L", 'C', Items.CHAINMAIL_BOOTS, 'L', Items.LEATHER_BOOTS);
		
		//Wood Armor Crafting
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.woodHelmet), "WWW", "W W", 'W', ModItems.woodChunk);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.woodChestplate), "W W", "WWW", "WWW", 'W', ModItems.woodChunk);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.woodLeggings), "WWW", "W W", "W W", 'W', ModItems.woodChunk);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.woodBoots), "W W", "W W", 'W', ModItems.woodChunk);
		
		//Stone Armor Crafting
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.stoneHelmet), "SSS", "S S", 'S', ModItems.stoneChunk);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.stoneChestplate), "S S", "SSS", "SSS", 'S', ModItems.stoneChunk);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.stoneLeggings), "SSS", "S S", "S S", 'S', ModItems.stoneChunk);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.stoneBoots), "S S", "S S", 'S', ModItems.stoneChunk);
		
		//Cloth Armor Crafting
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.clothHelmet), "CCC", "C C", 'C', ModItems.cloth);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.clothChestplate), "C C", "CCC", "CCC", 'C', ModItems.cloth);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.clothLeggings), "CCC", "C C", "C C", 'C', ModItems.cloth);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.clothBoots), "C C", "C C", 'C', ModItems.cloth);
		
		//Extra Useful Crafting
		GameRegistry.addShapedRecipe(new ItemStack(Blocks.WOOL, 2, 0), "CC", "CC", 'C', ModItems.cloth);
		
	}
	
}
