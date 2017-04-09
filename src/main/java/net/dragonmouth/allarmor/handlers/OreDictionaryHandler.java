package net.dragonmouth.allarmor.handlers;

import org.apache.logging.log4j.Level;

import net.dragonmouth.allarmor.init.ModItems;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class OreDictionaryHandler {

	public static void registerOreDictionary() {
		
		LogHandler.logHandler.info("Registering OreDictionary Values");
		
		// Crafting Materials
		OreDictionary.registerOre("chunkWood", ModItems.woodChunk);
		OreDictionary.registerOre("chunkStone", ModItems.stoneChunk);
		OreDictionary.registerOre("itemCloth", ModItems.cloth);
		OreDictionary.registerOre("itemChain", ModItems.chain);
		OreDictionary.registerOre("itemChainmailMesh", ModItems.chainmailMesh);
		
		// Leaves
		OreDictionary.registerOre("itemLeaf", new ItemStack(ModItems.leaf, 1, 0));
		OreDictionary.registerOre("itemLeafOak", new ItemStack(ModItems.leaf, 1, 0));
		OreDictionary.registerOre("itemLeaf", new ItemStack(ModItems.leaf, 1, 1));
		OreDictionary.registerOre("itemLeafSpruce", new ItemStack(ModItems.leaf, 1, 1));
		OreDictionary.registerOre("itemLeaf", new ItemStack(ModItems.leaf, 1, 2));
		OreDictionary.registerOre("itemLeafBirch", new ItemStack(ModItems.leaf, 1, 2));
		OreDictionary.registerOre("itemLeaf", new ItemStack(ModItems.leaf, 1, 3));
		OreDictionary.registerOre("itemLeafJungle", new ItemStack(ModItems.leaf, 1, 3));
		OreDictionary.registerOre("itemLeaf", new ItemStack(ModItems.leaf, 1, 4));
		OreDictionary.registerOre("itemLeafAcacia", new ItemStack(ModItems.leaf, 1, 4));
		OreDictionary.registerOre("itemLeaf", new ItemStack(ModItems.leaf, 1, 5));
		OreDictionary.registerOre("itemLeafDarkOak", new ItemStack(ModItems.leaf, 1, 5));
		
		LogHandler.logHandler.info("OreDictionary Registration Complete!");
		
	}
	
}
