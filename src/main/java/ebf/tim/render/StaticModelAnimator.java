package ebf.tim.render;

public class StaticModelAnimator {
    public static String tagWheel="wheel";
    public static String tagSimpleRotate="rotate";
    public static String tagAdvancedPiston ="piston-complex";
    public static String tagCouplingRod="couplingrod";

    public static String tagConnectingRodOffset(int i) {
        return "rod,"+ i;
    }

    public static String tagLamp(int i, int i1) {
        return"lamp,"+ i +","+i1;
    }

    public static String tagSmoke(int i) {
        return "smoke,"+ i;
    }
}
