package net.dragonmouth.allarmor.proxy;

import net.dragonmouth.allarmor.init.ModItems;

public class ClientProxy extends CommonProxy {

	@Override
	public void init() {
		ModItems.registerRenders();
//		RenderingRegistry.registerEntityRenderingHandler(EntityZombieChicken.class, new RenderEntityZombieChicken(Minecraft.getMinecraft().getRenderManager(), new ModelChicken(), 0));
//		RenderingRegistry.registerEntityRenderingHandler(EntityExplosiveChicken.class, new RenderEntityExplosiveChicken(Minecraft.getMinecraft().getRenderManager(), new ModelChicken(), 0));
	}
	
}
