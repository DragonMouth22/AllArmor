package net.jusanov.allarmor.items;

import net.jusanov.allarmor.common.AllArmor;
import net.jusanov.allarmor.common.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemCloth extends Item {

	public ItemCloth() {
		setUnlocalizedName(Reference.AllArmorItems.CLOTH.getUnlocalizedName());
		setRegistryName(Reference.AllArmorItems.CLOTH.getRegistryName());
		this.setCreativeTab(AllArmor.allarmorMaterialsTab);
	}
	
}