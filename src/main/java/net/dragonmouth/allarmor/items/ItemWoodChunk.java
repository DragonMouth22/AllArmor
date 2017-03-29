package net.dragonmouth.allarmor.items;

import net.dragonmouth.allarmor.common.AllArmor;
import net.dragonmouth.allarmor.common.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemWoodChunk extends Item {

	public ItemWoodChunk() {
		setUnlocalizedName(Reference.AllArmorItems.WOODCHUNK.getUnlocalizedName());
		setRegistryName(Reference.AllArmorItems.WOODCHUNK.getRegistryName());
		this.setCreativeTab(AllArmor.allarmorMaterialsTab);
	}
	
}