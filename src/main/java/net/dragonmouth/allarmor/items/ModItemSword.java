package net.dragonmouth.allarmor.items;

import net.dragonmouth.allarmor.common.AllArmor;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;

public class ModItemSword extends ItemSword {

	public ModItemSword(String unlocalizedName, ToolMaterial material) {
		super(material);
		this.setUnlocalizedName(unlocalizedName);
		this.setCreativeTab(AllArmor.allarmorToolsTab);
		this.setMaxStackSize(1);
	}

}
