package net.dragonmouth.allarmor.items;

import net.dragonmouth.allarmor.common.AllArmor;
import net.dragonmouth.allarmor.common.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemCloth extends Item {

	public ItemCloth() {
		setUnlocalizedName(Reference.AllArmorItems.CLOTH.getUnlocalizedName());
		setRegistryName(Reference.AllArmorItems.CLOTH.getRegistryName());
		this.setCreativeTab(AllArmor.allarmorMaterialsTab);
	}
	
}