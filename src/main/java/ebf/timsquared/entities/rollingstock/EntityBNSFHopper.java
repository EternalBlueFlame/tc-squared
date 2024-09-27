package ebf.timsquared.entities.rollingstock;

import ebf.tim.api.SkinRegistry;
import ebf.timsquared.TiMSquared;
import ebf.timsquared.entities.trains.EntityBrigadelok080;
import ebf.timsquared.models.bogies.CMDBogie;
import ebf.timsquared.models.rollingstock.BNSFHopper;
import fexcraft.tmt.slim.ModelBase;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import train.client.render.Bogie;
import train.common.api.Freight;
import train.common.items.ItemRollingStock;

import java.util.List;
import java.util.UUID;

import static ebf.tim.utility.CommonUtil.DefineStack;


/**
 * <h1>BNSF 3-Bay 100-Ton Hopper entity</h1>
 * For more information on the overrides and functions:
 * @see EntityBrigadelok080
 * @author Eternal Blue Flame
 */
public class EntityBNSFHopper extends Freight {

    /*public static final String[] itemDescription = new String[]{
            "\u00A77" + StatCollector.translateToLocal("menu.item.weight") +": 2" + StatCollector.translateToLocal("menu.item.tons"),
            "\u00A77" + StatCollector.translateToLocal("menu.item.sizeof") +": 27" + StatCollector.translateToLocal("menu.item.slots")};*/
    public static final Item thisItem = new ItemRollingStock(new EntityBNSFHopper(null), TiMSquared.MODID, TiMSquared.creativeTab);
    public EntityBNSFHopper(World world, double d, double d1, double d2) {
        super(world, d, d1, d2);
    }
    public EntityBNSFHopper(World world){
        super(world);
    }

     /**
     * <h1>Variable Overrides</h1>
     */

    /**
     * <h2>Bogie Offset</h2>
     */
    @Override
    public Bogie[] bogies(){
        return new Bogie[]{
                new Bogie(new CMDBogie(),2.4375f,0,0),
                new Bogie(new CMDBogie(),-2.4375f,0,0)};
    }

    @Override
    public float[] rotationPoints(){return new float[]{2.4375f,-2.4375f};}

    @Override
    public float[][] modelOffsets() {
        return new float[][]{{0.0f,-0.16f,0.0f}};
    }

    @Override
    public void registerSkins() {
        SkinRegistry.addSkin(this.getClass(), TiMSquared.MODID, "textures/stock/BNSFHopper.png",
                new String[]{"textures/hd/rollingstock/cmd_bogie.png"},
                "BNSF 3 Bay hopper", "Primarily used for transporting coal");
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
        return 9071.847f;
    }

    @Override
    public ItemStack[] getRecipe() {
        return null;
    }

    @Override
    public String transportName() {
        return "Burlington Northern & Santa Fe 3-bay Hopper";
    }

    @Override
    public String transportcountry() {
        return "US";
    }

    @Override
    public String transportYear() {
        return "1960";
    }

    @Override
    public String transportFuelType() {
        return "Steam-Diesel";
    }

    @Override
    public float transportTopSpeed() {
        return 0;
    }

    @Override
    public boolean isFictional() {
        return false;
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
    public int getInventoryRows(){return 3;}
    /**
     * <h2>Rider offsets</h2>
     */
    @Override
    public float[][] getRiderOffsets(){return null;}

    @Override
    public float[] getHitboxSize() {
        return new float[]{6.0625f,1.4375f, 1.0f};
    }


    @Override
    public ModelBase[] getModel(){return new ModelBase[]{new BNSFHopper()};}

    /**
     * <h2>pre-asigned values</h2>
     */
    @Override
    public Item getItem(){
        return thisItem;
    }
}
