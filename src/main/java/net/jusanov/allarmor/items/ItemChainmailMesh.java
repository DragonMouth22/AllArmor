package net.jusanov.allarmor.items;

import net.jusanov.allarmor.common.AllArmor;
import net.jusanov.allarmor.common.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemChainmailMesh extends Item {

	public ItemChainmailMesh() {
		setUnlocalizedName(Reference.AllArmorItems.CHAINMAILMESH.getUnlocalizedName());
		setRegistryName(Reference.AllArmorItems.CHAINMAILMESH.getRegistryName());
		this.setCreativeTab(AllArmor.allarmorMaterialsTab);
	}
	
}