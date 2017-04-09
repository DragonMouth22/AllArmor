package net.dragonmouth.allarmor.items;

import net.dragonmouth.allarmor.common.AllArmor;
import net.dragonmouth.allarmor.init.ModItems;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ModItemArmor extends ItemArmor {

	public ModItemArmor(String unlocalizedName, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
		super(materialIn, renderIndexIn, equipmentSlotIn);
		this.setUnlocalizedName(unlocalizedName);
		this.setCreativeTab(AllArmor.allarmorArmorTab);
		this.setMaxStackSize(1);
	}
	
/*	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack stack) {
		
		/*if(stack.getItem() == ModItems.stoneHelmet) {
			
			effectPlayer(player, Potion.getPotionById(2), 1);
			
		}
		
		if(player.inventory.armorItemInSlot(3) != null && player.inventory.armorItemInSlot(3).getItem() == ModItems.stoneHelmet && player.inventory.armorItemInSlot(2) != null && player.inventory.armorItemInSlot(2).getItem() == ModItems.stoneChestplate && player.inventory.armorItemInSlot(1) != null && player.inventory.armorItemInSlot(1).getItem() == ModItems.stoneLeggings && player.inventory.armorItemInSlot(0) != null && player.inventory.armorItemInSlot(0).getItem() == ModItems.stoneBoots) {
			
			this.effectPlayer(player, Potion.getPotionById(2), 1);
			
		}
		
	}

	private void effectPlayer(EntityPlayer player, Potion potion, int amplifier) {
		
		if(player.getActivePotionEffect(potion) == null || player.getActivePotionEffect(potion).getDuration() <= 1) {
			
			player.addPotionEffect(new PotionEffect(potion, 159, amplifier, true, true));
			
		}
		
	}*/

}
