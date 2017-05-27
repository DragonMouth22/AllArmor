package net.jusanov.allarmor.common;

public class Reference {
	public static final String MODID = "allarmor";
	public static final String NAME = "AllArmor";
	public static final String VERSION = "0.3.2";
	public static final String ACCEPTED_VERSIONS = "[1.10,1.10.2]";
	
	public static final String CLIENT_PROXY_CLASS = "net.dragonmouth.allarmor.proxy.ClientProxy";
	public static final String SERVER_PROXY_CLASS = "net.dragonmouth.allarmor.proxy.ServerProxy";
	
	public static enum AllArmorItems {
		WOODCHUNK("woodChunk", "woodChunk"),
		STONECHUNK("stoneChunk", "stoneChunk"),
		CLOTH("cloth", "cloth"),
		CHAIN("chain", "chain"),
		CHAINMAILMESH("chainmailMesh", "chainmailMesh"),
		LEAF("leaf", "leaf");
		
		private String unlocalizedName;
		private String registryName;
		
		AllArmorItems(String unlocalizedName, String registryName) {
			this.unlocalizedName = unlocalizedName;
			this.registryName = registryName;
		}
		
		public String getUnlocalizedName() {
			return unlocalizedName;
		}
		
		public String getRegistryName() {
			return registryName;
		}
		
	}
}
