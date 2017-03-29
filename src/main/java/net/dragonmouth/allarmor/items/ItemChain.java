package net.dragonmouth.allarmor.items;

import net.dragonmouth.allarmor.common.AllArmor;
import net.dragonmouth.allarmor.common.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemChain extends Item {

	public ItemChain() {
		setUnlocalizedName(Reference.AllArmorItems.CHAIN.getUnlocalizedName());
		setRegistryName(Reference.AllArmorItems.CHAIN.getRegistryName());
		this.setCreativeTab(AllArmor.allarmorMaterialsTab);
	}
	
}