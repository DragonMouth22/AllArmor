package net.jusanov.allarmor.items;

import net.jusanov.allarmor.common.AllArmor;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemHoe;

public class ModItemHoe extends ItemHoe {

	public ModItemHoe(String unlocalizedName, ToolMaterial material) {
		super(material);
		this.setUnlocalizedName(unlocalizedName);
		this.setCreativeTab(AllArmor.allarmorToolsTab);
		this.setMaxStackSize(1);
	}

}