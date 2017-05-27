package net.jusanov.allarmor.init;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModTabTools extends CreativeTabs {

	public ModTabTools(int index, String label) {
		super(index, label);
	}

	@Override
	public Item getTabIconItem() {
		return ModItems.coalPickaxe;
	}

}
