package net.dragonmouth.allarmor.handlers;

import net.minecraft.util.IStringSerializable;

public class EnumHandler {

	public static enum LeafTypes implements IStringSerializable {
		OAK("oak", 0, "Oak"),
		SPRUCE("spruce", 1, "Spruce"),
		BIRCH("birch", 2, "Birch"),
		JUNGLE("jungle", 3, "Jungle"),
		ACACIA("acacia", 4, "Acacia"),
		DARKOAK("darkOak", 5, "BigOak");

		private int ID;
		private String name;
		private String resourceName;
		
		private LeafTypes(String name, int ID, String resourceName) {
			
			this.ID = ID;
			this.name = name;
			this.resourceName = resourceName;
			
		}
		
		@Override
		public String getName() {
			
			return this.name;
			
		}
		
		public int getID() {

			return ID;
			
		}
		
		public String getResourceName() {
			
			return this.resourceName;
			
		}
		
		@Override
		public String toString() {
			
			return getName();
			
		}
		
	}
	
}
