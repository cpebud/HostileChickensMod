package cpebud.hcm.entity.render;

import cpebud.hcm.entity.EntityChickenGhastly;
import cpebud.hcm.entity.model.ModelChickenBase;
import cpebud.hcm.entity.model.ModelChickenGhastly;
import cpebud.hcm.util.Reference;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;

public class RenderChickenGhastly extends RenderLiving<EntityChickenGhastly>
{
	public static final ResourceLocation GHASTLY_TEXTURES = new ResourceLocation(Reference.MODID + ":textures/entity/chicken_ghastly.png");
    public static final ResourceLocation GHASTLY_SHOOTING_TEXTURES = new ResourceLocation(Reference.MODID + ":textures/entity/chicken_ghastly_shooting.png");
    
    public RenderChickenGhastly(RenderManager manager)
    {
        super(manager, new ModelChickenGhastly(), 0.3F);
    }
    
    public void doRender(EntityChickenGhastly entity, double x, double y, double z, float entityYaw, float partialTicks)
    {
    	ModelChickenGhastly modelchickenghastly = (ModelChickenGhastly) this.getMainModel();
    	modelchickenghastly.isAttacking = entity.isAttacking();
        
    	super.doRender(entity, x, y, z, entityYaw, partialTicks);
    }

    /**
     * Returns the location of an entity's texture. Doesn't seem to be called unless you call Render.bindEntityTexture.
     */
    protected ResourceLocation getEntityTexture(EntityChickenGhastly entity)
    {
        return entity.isAttacking() ? GHASTLY_SHOOTING_TEXTURES : GHASTLY_TEXTURES;
    }

    /**
     * Defines what float the third param in setRotationAngles of ModelBase is
     */
    protected float handleRotationFloat(EntityChickenGhastly livingBase, float partialTicks)
    {
        float f = livingBase.oFlap + (livingBase.wingRotation - livingBase.oFlap) * partialTicks;
        float f1 = livingBase.oFlapSpeed + (livingBase.destPos - livingBase.oFlapSpeed) * partialTicks;
        return (MathHelper.sin(f) + 1.0F) * f1;
    }

}
