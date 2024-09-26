package ebf.timsquared.entities.rollingstock;

import ebf.tim.TrainsInMotion;
import ebf.tim.api.RollingstockBase;
import ebf.tim.api.SkinRegistry;
import ebf.tim.entities.GenericRailTransport;
import ebf.tim.items.ItemTransport;
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
import train.common.entity.rollingStock.PassengerIC4_DSB_FH;

import java.util.List;
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
    public static final Item thisItem = new ItemTransport(new EntityPullmansPalace(null), TiMSquared.MODID, TiMSquared.creativeTab);

    public EntityPullmansPalace(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }
    public EntityPullmansPalace(World world){
        super(world);
    }

    /**
     * <h1>Variable Overrides</h1>
     */

    @Override
    public float[][] bogieModelOffsets() {
        return null;
    }

    @Override
    public ModelBase[] bogieModels() {
        return null;
    }

    /**
     * <h2>Bogie Offset</h2>
     */
    @Override
    public float[] rotationPoints(){return new float[]{2,-2};}

    @Override
    public float getRenderScale() {
        return 0.0625f;
    }

    @Override
    public float[][] modelOffsets() {
        return null;
    }

    @Override
    public void registerSkins() {
        SkinRegistry.addSkin(this.getClass(), TiMSquared.MODID, "textures/stock/pullmanspalace.png",
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
    public String[][] getTankFilters() {
        return null;
    }

    @Override
    public void manageFuel() {

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
                null, null, null
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

    @Override
    public float getMaxFuel() {
        return 0;
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
