package net.dragonmouth.allarmor.proxy;

import net.dragonmouth.allarmor.common.Reference;
import net.dragonmouth.allarmor.init.ModItems;
import net.minecraft.client.renderer.block.model.ModelBakery;
import net.minecraft.util.ResourceLocation;

public class ClientProxy extends CommonProxy {

	@Override
	public void init() {
		ModItems.registerRenders();
//		RenderingRegistry.registerEntityRenderingHandler(EntityZombieChicken.class, new RenderEntityZombieChicken(Minecraft.getMinecraft().getRenderManager(), new ModelChicken(), 0));
//		RenderingRegistry.registerEntityRenderingHandler(EntityExplosiveChicken.class, new RenderEntityExplosiveChicken(Minecraft.getMinecraft().getRenderManager(), new ModelChicken(), 0));
	}
	
	public void registerModelBakeryVariants() {
		ModelBakery.registerItemVariants(ModItems.leaf, new ResourceLocation(Reference.MODID, "leafOak" ), new ResourceLocation(Reference.MODID, "leafSpruce" ), new ResourceLocation(Reference.MODID, "leafBirch" ), new ResourceLocation(Reference.MODID, "leafJungle" ), new ResourceLocation(Reference.MODID, "leafAcacia" ), new ResourceLocation(Reference.MODID, "leafBigOak" ));
	}
	
}
