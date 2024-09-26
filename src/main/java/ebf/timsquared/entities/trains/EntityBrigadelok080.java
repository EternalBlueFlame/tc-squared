package ebf.timsquared.entities.trains;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import ebf.tim.api.SkinRegistry;
import ebf.tim.api.TransportSkin;
import ebf.timsquared.TiMSquared;
import ebf.timsquared.models.trains.ModelBrigadelok_080;
import fexcraft.tmt.slim.ModelBase;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntityFurnace;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import train.common.api.Locomotive;
import train.common.api.SteamTrain;
import train.common.items.ItemRollingStock;

import java.util.List;
import java.util.UUID;

/**
 * <h1>Brigadelok 0-8-0 entity</h1>
 * designed after the : Henschel No.15968
 * This class is intended to serve as the primary example for API use.
 * @author Eternal Blue Flame
 */
public class EntityBrigadelok080 extends SteamTrain {

    /**
     * <h2>Basic Train Constructor</h2>
     * To make your own custom train or rollingstock, create a new class that is a copy of the train or rollingstockShapeBox that is closest to what you are adding,
     *     in that copy, you will need to go through the variables and overrides and change them to match the class/transport.
     * lastly you have to register the class in
     * @see TiMGenericRegistry#listTrains(int)
     *
     * The fluid tank has 2 values, one for water/RF/fuel/uranium and another for steam, the second one is ONLY used with steam and nuclear steam trains.
     *     The first part is how much fluid it can store, a bucket is worth 1000.
     *     The second part is the fluid filter, this is the list of fluids to either use specifically, or never use.
     *     The third part is the blacklist/whitelist. True means it will ONLY use the fluids defined in the array, false means it will use any fluids EXCEPT the ones in the array.
     *
     *
     * thisItem is the item for this train that will get registered.
     *     The String array defines the extra text added to the item description, each entry makes a new line
     *     The second variable is the class constructor, they are defined from top to bottom in order they are written, and the one used for this function must ALWAYS be the one that is like this
     *     @see #EntityBrigadelok080(UUID, World, double, double, double)
     *     The last part defines the unlocalized name, this is used for the item name, entity name, and language file entries.
     */


    public static final Item thisItem = new ItemRollingStock(new EntityBrigadelok080(null), TiMSquared.MODID, TiMSquared.creativeTab);

    /**
     * these basic constructors only need to have their names changed to that of this class, that is assuming your editor doesn't automatically do that.
     * Be sure the one that takes more than a world is always first, unless you wanna compensate for that in the item declaration.
     * @see EntityTrainCore
     */
    public EntityBrigadelok080(World world, double xPos, double yPos, double zPos) {
        super(world, xPos, yPos, zPos);
    }
    public EntityBrigadelok080(World world){
        super(world);
    }

    @Override
    public String transportName(){return "Henschel Brigadelok";}
    @Override
    public String transportcountry(){return "Germany";}
    @Override
    public String transportYear(){return "1918";}
    @Override
    public String transportFuelType(){return "Steam";}
    @Override
    public boolean isFictional(){return false;}
    @Override
    public float transportTractiveEffort(){return 0;}

    @Override
    public void registerSkins(){
        //make base TransportSkin and register
        TransportSkin s ;

        SkinRegistry.addSkin(this.getClass(),new TransportSkin(TiMSquared.MODID,"textures/train/brigadelok_080.png","default",
                "DescriptionBrigadelokBlue"));

        //add recolor so current, and register new TransportSkin
        s = new TransportSkin(TiMSquared.MODID,"textures/train/brigadelok_080.png", "red",
                "A fictional TransportSkin created for testing the recolor system,\n and the paint bucket TransportSkin selector. \n Might keep it long run\nto pay homage to the development of the mod.")
        .setRecolorsFrom(0x68939E).setRecolorsTo(0xcc0000);
        SkinRegistry.addSkin(this.getClass(),s);

        //remove recolors, then set new name and texture
        s= new TransportSkin(TiMSquared.MODID, "textures/hd/train/brigadelok_080.png", "hd",
                "Used by Germany in WWI\nas a transport for solders and equipment\nthis incomplete HD TransportSkin was done by LunarTales");
        SkinRegistry.addSkin(this.getClass(),s);
    }

    @Override
    public String getDefaultSkin(){
        return "timsquared:default";
    }
    /*
     * <h1>Variable Overrides</h1>
     * We override the functions defined in the super here, to give them different values.
     * This is more efficient than having to store them in the super, or actual variables, because we won't have to store them in the NBT or RAM.
     */


    /**
     * <h2>Max speed</h2>
     * @return the value of the max speed in km/h
     */
    @Override
    public float transportTopSpeed(){return forwardPressed?70.81f:30f;}

    /**
     * <h2>Inventory Size</h2>
     * @return the size of the inventory not counting any fuel or crafting slots, those are defined by the type.
     */
    @Override
    public int getInventoryRows(){return 1;}
    /**
     * <h2>Type</h2>
     * @return the type which will define it's features, GUI, a degree of storage (like crafting slots), and a number of other things.
     */
    @Override
    public List<TrainsInMotion.transportTypes> getTypes(){return TrainsInMotion.transportTypes.STEAM.singleton();}
    /**
     * <h2>Max Fuel</h2>
     * @return the maxstorage of fuel the train can store.
     * @see GenericRailTransport#getMaxFuel() for more info.
     * @see FuelHandler for information on fuel consumption.
     */
    @Override
    public float getMaxFuel(){return 1;}

    @Override
    public ItemStackSlot fuelSlot(){
        return new ItemStackSlot(this, 400,114,32).setOverlay(Items.coal);
    }

    @Override
    public ItemStackSlot waterSlot(){
        return new ItemStackSlot(this, 401,150,32).setOverlay(Items.water_bucket);
    }

    /**
     * <h2>Rider offset</h2>
     * @return defines the offsets of the riders in blocks, the first value is how far back, and the second is how high.
     *     Negative values are towards the front, ground, or right. In that order.
     *     Each set of floats represents a different rider.
     *     Only the first 3 values of each set of floats are actually used.
     */
    @Override
    public float[][] getRiderOffsets(){return new float[][]{{1.3f,1.2f, 0f}};}

    @Override
    public float[] getHitboxSize() {
        return new float[]{3.6f,2.1f,1.3f};
    }

    /**
     * <h2>Acceleration</h2>
     * <h4>TRAINS ONLY.</h4>
     * @return defines the acceleration.
     */
    @Override
    public float transportMetricHorsePower(){return 75f;}

    @Override
    public String[] additionalItemText() {
        return null;
    }

    @Override
    public float weightKg(){return 10886.2169f;}

    @Override
    public ItemStack[] getRecipe() {
        return new ItemStack[]{
                null, null, null,
                null, null, null,
                null, null, null
        };
    }


    @SideOnly(Side.CLIENT)
    public float[] getAnimationData(int id) {
        switch (id) {
            case 1:{return new float[]{90, 5, 0};}//valve gear up position
            case 2:{return new float[]{270, 5, 0};}//valve gear back position
            case 3:{return new float[]{180, 5, 0};}//valve gear down position
            case 4:{return new float[]{0, 5, 0};}//valve gear forward position

            default:{return new float[]{0,0,0};}
        }
    }

    @Override
    public float[][] bogieModelOffsets() {
        return null;
    }

    @Override
    public ModelBase[] bogieModels() {
        return null;
    }

    @Override
    public float[] rotationPoints() {
        return new float[]{0.5f, -1.5f};
    }

    @Override
    public float getRenderScale() {
        return  0.0625f;
    }

    @Override
    public float[][] modelOffsets() {
        return null;
    }

    /**
     * <h2>rider sit or stand</h2>
     * @return true if the rider(s) should be sitting, false if the rider should be standing.
     */
    @Override
    public boolean shouldRiderSit(){
        return false;
    }

    /**
     * <h2>reinforced transport</h2>
     * this returns if this specific entity is reinforced (explosion proof and damage resistant).
     * since this is a function it can be conditional as well, for instance if it has a specific skin.
     */
    @Override
    public boolean isReinforced(){return false;}

    /**
     * <h2>Fluid Tank Capacity</h2>
     */
    @Override
    public int[] getTankCapacity(){return new int[]{9161, 800};}


    /**
     * <h2>fluid filter</h2>
     * defines what fluids can and can't be stored in the tank.
     * for instance if you have a wooden tanker car, you can deny fluids that are fire sources (like lava).
     */
    @Override
    public String[][] getTankFilters(){
        return FuelHandler.DefaultTanks.STEAM.value();
    }

    //todo: maybe make some util functions or something to simplify this stuff?
    //seems kinda complicated for something that should be the difficulty of a config file.
    @Override
    public boolean isItemValidForSlot(int slot, ItemStack stack){
        if (slot == 400) {
            return TileEntityFurnace.getItemBurnTime(stack) > 0;
        } else if (slot ==401) {
            return FuelHandler.getUseableFluid(stack, this) != null;
        } else {
            return true;
        }
    }

    /**
     * <h2>fuel management</h2>
     * defines how the transport manages burnHeat, both in consuming items, and in managing the burnHeat.
     */
    @Override
    public void manageFuel(){
        fuelHandler.manageSteam(this);
    }

    /**
     * <h2>pre-assigned values</h2>
     * These return values are defined from the top of the class.
     * These should only need modification for advanced users, and even that's a stretch.
     */
    public Item getItem(){
        return thisItem;
    }

    @Override
    public ModelBase[] getModel(){return new ModelBase[]{new ModelBrigadelok_080()};}

    /**
     * <h2>sets the resource location for sounds, like horn and the sound made for the engine running</h2>
     */
    @SideOnly(Side.CLIENT)
    @Override
    public ResourceLocation getHorn(){return URIRegistry.SOUND_HORN.getResource("h080brigadelok.ogg");}
    @SideOnly(Side.CLIENT)
    @Override
    public ResourceLocation getRunningSound(){return URIRegistry.SOUND_RUNNING.getResource("r080brigadelok.ogg");}
}
