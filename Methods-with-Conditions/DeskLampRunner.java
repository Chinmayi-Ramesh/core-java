class DeskLampRunner {

    public static void main(String[] args){

        DeskLamp.on();

        DeskLamp.increaseBrightness();
        int bright = DeskLamp.brightness;
        System.out.println("Brightness: " + bright);

        DeskLamp.decreaseBrightness();
        int brightAfter = DeskLamp.brightness;
        System.out.println("Brightness After: " + brightAfter);

        DeskLamp.off();
    }
}