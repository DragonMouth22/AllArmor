/**package net.dragonmouth.allarmor.init;

import java.util.BitSet;

import net.dragonmouth.allarmor.AllArmor;
import net.minecraft.entity.EntityList;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class ModEntity {
	
	private static final ModEntity INSTANCE = new ModEntity();
	private BitSet availableIndicies;
	
	public static ModEntity instance() {
		return INSTANCE;
	}
	
	private ModEntity() {
		availableIndicies = new BitSet(256);
		availableIndicies.set(1, 255);
		for (Object id: EntityList.ID_TO_CLASS.keySet()) {
			availableIndicies.clear((Integer)id);
		}
	}
	
	public static int findGlobalUniqueEntityId() {
		int res = instance().availableIndicies.nextSetBit(0);
		if (res < 0) {
			throw new RuntimeException("No more entity indicies left");
		}
		return res;
	}
	
	public static void registerEntity() {
//		createEntity(EntityZombieChicken.class, "zombieChicken", 0x4db305 ,0x052eb3);
//		createEntity(EntityExplosiveChicken.class, "explosiveChicken", 0xed2121, 0xebebeb);
	}
	
	public static void createEntity(Class entityClass, String entityName, int solidColor, int spotColor) {
		int randomId = findGlobalUniqueEntityId();
		EntityRegistry.registerModEntity(entityClass, entityName, randomId, AllArmor.instance, 64, 1, true, solidColor, spotColor);
	}
	
}**/
