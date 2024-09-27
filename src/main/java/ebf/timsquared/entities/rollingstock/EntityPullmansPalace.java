package ebf.timsquared.entities.rollingstock;

import ebf.tim.api.SkinRegistry;
import ebf.timsquared.TiMSquared;
import ebf.timsquared.entities.trains.EntityBrigadelok080;
import ebf.timsquared.models.rollingstock.PullmansPalace;
import fexcraft.tmt.slim.ModelBase;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import train.common.api.EntityRollingStock;
import train.common.api.IPassenger;
import train.common.items.ItemRollingStock;

import java.util.UUID;

import static ebf.tim.utility.CommonUtil.DefineStack;

/**
 * <h1>Pullman's Palace entity</h1>
 * For more information on the overrides and functions:
 * @see EntityBrigadelok080
 * @author Eternal Blue Flame
 */
public class EntityPullmansPalace extends EntityRollingStock implements IPassenger {
    /*private static final String[] itemDescription = new String[]{
            "\u00A77" + StatCollector.translateToLocal("menu.item.weight") +": 2 " + StatCollector.translateToLocal("menu.item.tons"),
            "\u00A77" + StatCollector.translateToLocal("menu.item.seats") +": 4 " + StatCollector.translateToLocal("menu.item.players")};*/
    public static final Item thisItem = new ItemRollingStock(new EntityPullmansPalace(null), TiMSquared.MODID, TiMSquared.creativeTab);
    public EntityPullmansPalace(World world, double d, double d1, double d2) {
        super(world, d, d1, d2);
    }
    public EntityPullmansPalace(World world){
        super(world);
    }

    /**
     * <h1>Variable Overrides</h1>
     */
    /**
     * <h2>Bogie Offset</h2>
     */
    @Override
    public float[] rotationPoints(){return new float[]{2,-2};}

    @Override
    public float[][] modelOffsets() {
        return null;
    }

    @Override
    public void registerSkins() {
        SkinRegistry.addSkin(this.getClass(), TiMSquared.MODID, "textures/stock/pullmanspalace", new String[]{},
                "Pullman's Palace", "A fictional passenger car from \"Railroads!\", based off the Federal #98 Pullman Private Car");
    }

    @Override
    public boolean isReinforced() {
        return false;
    }

    @Override
    public int[] getTankCapacity() {
        return null;
    }

    @Override
    public float weightKg() {
        return 1814.3f;
    }

    @Override
    public ItemStack[] getRecipe() {
        return new ItemStack[]{
                DefineStack(Items.bed, 1), null, null,
                null, null, null,
                null, null, null, null
        };
    }

    @Override
    public String transportName() {
        return "Pullman's Palace";
    }

    @Override
    public String transportcountry() {
        return "US";
    }

    @Override
    public String transportYear() {
        return "1911";
    }

    @Override
    public String transportFuelType() {
        return "Steam";
    }

    @Override
    public float transportTopSpeed() {
        return 0;
    }

    @Override
    public boolean isFictional() {
        return true;
    }

    @Override
    public float transportTractiveEffort() {
        return 0;
    }

    @Override
    public float transportMetricHorsePower() {
        return 0;
    }

    @Override
    public String[] additionalItemText() {
        return null;
    }

    /**
     * <h2>Inventory Size</h2>
     */
    @Override
    public int getInventoryRows(){return 0;}/**
     * <h2>Rider offsets</h2>
     */
    @Override
    public float[][] getRiderOffsets(){return new float[][]{{2f,0.5f, 0.2f},{0.75f,0.5f, 0.2f},{-0.75f,0.5f, 0.2f},{-2f,0.5f, 0.2f}};}

    @Override
    public float[] getHitboxSize() {
        return new float[]{6.25f,2,1.5f};
    }

    @Override
    public ModelBase[] getModel(){return new ModelBase[]{new PullmansPalace()};}

    /**
     * <h2>pre-asigned values</h2>
     */
    @Override
    public Item getItem(){
        return thisItem;
    }
}
