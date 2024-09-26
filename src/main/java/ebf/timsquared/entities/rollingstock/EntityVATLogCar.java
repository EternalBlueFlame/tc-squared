package ebf.timsquared.entities.rollingstock;

import ebf.tim.api.SkinRegistry;
import ebf.timsquared.TiMSquared;
import ebf.timsquared.entities.trains.EntityBrigadelok080;
import ebf.timsquared.models.bogies.VATLogCarBogie;
import ebf.timsquared.models.rollingstock.VATLogCar;
import fexcraft.tmt.slim.ModelBase;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import train.client.render.Bogie;
import train.common.api.Freight;
import train.common.items.ItemRollingStock;


import static ebf.tim.utility.CommonUtil.DefineStack;


/**
 * <h1>V.A.T Log Car entity</h1>
 * For more information on the overrides and functions:
 * @see EntityBrigadelok080
 * @author Eternal Blue Flame
 */
public class EntityVATLogCar extends Freight {

    /*public static final String[] itemDescription = new String[]{
            "\u00A77" + StatCollector.translateToLocal("menu.item.weight") +": 2" + StatCollector.translateToLocal("menu.item.tons"),
            "\u00A77" + StatCollector.translateToLocal("menu.item.sizeof") +": 27" + StatCollector.translateToLocal("menu.item.slots")};*/
    public static final Item thisItem = new ItemRollingStock(new EntityVATLogCar(null), TiMSquared.MODID, TiMSquared.creativeTab);

    public EntityVATLogCar(World world){
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
                new Bogie(new VATLogCarBogie(),1.3f,0,0),
                new Bogie(new VATLogCarBogie(),-1.3f,0,0)};
    }
    @Override
    public float[] rotationPoints(){return new float[]{1.3f, -1.3f};}

    @Override
    public float[][] modelOffsets() {
        return null;
    }

    @Override
    public void registerSkins() {
        SkinRegistry.addSkin(this.getClass(), TiMSquared.MODID, "textures/stock/VATLogCar.png",
                new String[]{"textures/hd/rollingstock/VATLogCar_bogie.png"},
                "V.A.T Logcar",
                "Fictional log car from \"Railroads!\" used for carrying entire logs but would be good for planks too");
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
                DefineStack(Blocks.log, 1), null, null,
                null, null, null,
                null, null, null
        };
    }

    @Override
    public String transportName() {
        return "V.A.T Logcar";
    }

    @Override
    public String transportcountry() {
        return "US";
    }

    @Override
    public String transportYear() {
        return "1850-1970";
    }

    @Override
    public String transportFuelType() {
        return "Steam-Electric";
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
    public int getInventoryRows(){return 3;}/**
     * <h2>Rider offsets</h2>
     */
    @Override
    public float[][] getRiderOffsets(){return null;}

    @Override
    public float[] getHitboxSize() {
        return new float[]{4.3f,1.5f,1.2f};
    }

    @Override
    public ModelBase[] getModel(){return new ModelBase[]{new VATLogCar()};}

    /**
     * <h2>pre-asigned values</h2>
     */
    @Override
    public Item getItem(){
        return thisItem;
    }
}
