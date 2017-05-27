package net.jusanov.allarmor.items;

import net.jusanov.allarmor.common.AllArmor;
import net.jusanov.allarmor.common.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemStoneChunk extends Item {

	public ItemStoneChunk() {
		setUnlocalizedName(Reference.AllArmorItems.STONECHUNK.getUnlocalizedName());
		setRegistryName(Reference.AllArmorItems.STONECHUNK.getRegistryName());
		this.setCreativeTab(AllArmor.allarmorMaterialsTab);
	}
	
}