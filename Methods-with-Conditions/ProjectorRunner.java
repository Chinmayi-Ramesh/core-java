class ProjectorRunner {

    public static void main(String[] args){

        Projector.on();

        Projector.increaseBrightness();
        int bright = Projector.brightness;
        System.out.println("Brightness: " + bright);

        Projector.decreaseBrightness();
        int brightAfter = Projector.brightness;
        System.out.println("Brightness After: " + brightAfter);

        Projector.off();
    }
}