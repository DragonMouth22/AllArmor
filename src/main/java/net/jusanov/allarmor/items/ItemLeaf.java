package net.jusanov.allarmor.items;

import java.util.List;

import net.jusanov.allarmor.common.AllArmor;
import net.jusanov.allarmor.common.Reference;
import net.jusanov.allarmor.handlers.EnumHandler.LeafTypes;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemLeaf extends Item {

	public ItemLeaf() {
		setUnlocalizedName(Reference.AllArmorItems.LEAF.getUnlocalizedName());
		setRegistryName(Reference.AllArmorItems.LEAF.getRegistryName());
		this.setCreativeTab(AllArmor.allarmorMaterialsTab);
		this.setHasSubtypes(true);
	}
	
	@Override
	public void getSubItems(Item item, CreativeTabs tab, List<ItemStack> items) {
		
		for(int i = 0; i < LeafTypes.values().length; i++) {
			
			items.add(new ItemStack(item, 1, i));
			
		}
		
	}
	
	public String getUnlocalizedName(ItemStack stack) {
		
		for(int i = 0; i < LeafTypes.values().length; i++) {
			
			if(stack.getItemDamage() == i) {
				
				return this.getUnlocalizedName() + "." + LeafTypes.values()[i].getName();
				
			}
			else {
				continue;
			}
			
		}
		
		return this.getUnlocalizedName() + "." + LeafTypes.OAK.name();
		
	}
	
}
