package ebf.timsquared;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import ebf.timsquared.entities.rollingstock.*;
import ebf.timsquared.entities.trains.EntityBrigadelok080;
import ebf.timsquared.entities.trains.EntityBrigadelok080Diesel;
import ebf.timsquared.entities.trains.EntityBrigadelok080Electric;
import train.common.api.AbstractTrains;
import train.common.core.CreativeTabTraincraft;

@Mod(modid = TiMSquared.MODID, version = TiMSquared.MOD_VERSION, name = "TiM^2")
public class TiMSquared {
    public static final String MODID = "timsquared";
    public static final String MOD_VERSION = "0.01_pre-alpha";

    private static ItemTransport tabItem;

    public static CreativeTabTraincraft creativeTab;


    @Mod.Instance(MODID)
    public static TiMSquared instance;


    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {

        creativeTab = new CreativeTabTraincraft("timsquared", tabItem);

        TiMGenericRegistry.registerTransports(MODID, listSteamTrains(), null);
        TiMGenericRegistry.registerTransports(MODID, listFreight(), null);
        TiMGenericRegistry.registerTransports(MODID, listPassenger(), null);
        TiMGenericRegistry.registerTransports(MODID, listTanker(), null);
        creativeTab.tabItem = tabItem= (ItemTransport) TiMGenericRegistry.RegisterItem(
                new ItemTransport(new EntityBrigadelok080(null),MODID,null)
                ,MODID, "tab.timsquared.name",null,null,null,null);

    }



    public static AbstractTrains[] listSteamTrains() {
        return new AbstractTrains[]{new EntityBrigadelok080(null), new EntityBrigadelok080Electric(null),
        new EntityBrigadelok080Diesel(null)};
    }

    public static AbstractTrains[] listPassenger() {
        return new AbstractTrains[]{new EntityPullmansPalace(null)};
    }

    public static AbstractTrains[] listFreight() {
        return new AbstractTrains[]{new EntityVATLogCar(null), new EntityUP3Bay100TonHopper(null), new EntityBNSFHopper(null)};
    }

    public static AbstractTrains[] listTanker() {
        return new AbstractTrains[]{new EntityGTAX13000GallonTanker(null)};
    }



}
