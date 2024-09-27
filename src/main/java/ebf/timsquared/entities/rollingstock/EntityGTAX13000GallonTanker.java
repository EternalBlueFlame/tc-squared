package ebf.timsquared.entities.rollingstock;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import ebf.tim.api.SkinRegistry;
import ebf.timsquared.TiMSquared;
import ebf.timsquared.entities.trains.EntityBrigadelok080;
import ebf.timsquared.models.bogies.CMDBogie;
import fexcraft.tmt.slim.ModelBase;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import train.client.render.Bogie;
import train.common.api.LiquidTank;
import train.common.items.ItemRollingStock;

import static ebf.tim.utility.CommonUtil.DefineStack;

/**
 * <h1>V.A.T Log Car entity</h1>
 * For more information on the overrides and functions:
 * @see EntityBrigadelok080
 * @author Eternal Blue Flame
 */
public class EntityGTAX13000GallonTanker extends LiquidTank {

/*    public static final String[] itemDescription = new String[]{
            "\u00A77" + StatCollector.translateToLocal("menu.item.weight") +": 4" + StatCollector.translateToLocal("menu.item.tons"),
            "\u00A77" + StatCollector.translateToLocal("menu.item.sizeof") +": 13.4" + StatCollector.translateToLocal("gui.buckets")};*/
    public static final Item thisItem = new ItemRollingStock(new EntityGTAX13000GallonTanker(null), TiMSquared.MODID, TiMSquared.creativeTab);
    public EntityGTAX13000GallonTanker(World world, double d, double d1, double d2) {
        super(world, d, d1, d2);
    }
    public EntityGTAX13000GallonTanker(World world){
        super(world);
    }

    /*
     * <h1>Variable Overrides</h1>
     */
    @Override
    public Bogie[] bogies(){
        return new Bogie[]{
                new Bogie(new CMDBogie(),5.1f,0,0),
                new Bogie(new CMDBogie(),-5.1f,0,0)};
    }

    @Override
    public float[] rotationPoints(){return new float[]{5,-5};}

    @Override
    public float[][] modelOffsets() {
        return null;
    }

    @Override
    public void registerSkins() {
        SkinRegistry.addSkin(this.getClass(), TiMSquared.MODID, "textures/stock/GATX13000GallonTanker",
                "textures/hd/rollingstock/cmd_bogie",
                "GATX 13000 Gallon Tanker",
                "One of their smaller tanker cars, usually used for commodities such as molten sulfur, clay slurry, caustic soda and corn syrup.");
    }

    @Override
    public boolean isReinforced() {
        return false;
    }

    @Override
    public int getInventoryRows(){return 0;}
    @Override
    public float[][] getRiderOffsets(){return null;}

    @Override
    public float[] getHitboxSize() {
        return new float[]{6,1.5f,1.2f};
    }

    @Override
    public Item getItem(){
        return thisItem;
    }
    @Override
    public int[] getTankCapacity(){return new int[]{13400};}

    @Override
    public float weightKg() {
        return 29900f;
    }

    @Override
    public ItemStack[] getRecipe() {
        return new ItemStack[]{
                DefineStack(Items.bucket, 1), null, null,
                null, null, null,
                null, null, null, null
        };
    }

    @Override
    public String transportName() {
        return "GATX 13000 Gallon Tanker";
    }

    @Override
    public String transportcountry() {
        return "US";
    }

    @Override
    public String transportYear() {
        return "2000";
    }

    @Override
    public String transportFuelType() {
        return "Diesel";
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

    @Override
    @SideOnly(Side.CLIENT)
    public int[] getParticleData(int id) {
        switch (id){
            case 1: {return new int[]{1,200,0xFF0000};}
            default: {return new int[]{1,10,0xCCCC11};}
        }
    }


    @Override
    public ModelBase[] getModel(){return new ModelBase[]{new ebf.timsquared.models.rollingstock.ModelGATX1300GallonTanker()};}
}
