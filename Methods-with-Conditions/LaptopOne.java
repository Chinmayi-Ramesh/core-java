class LaptopOne {

    public static void main(String[] args){

        Laptop.on();
        boolean state = Laptop.isOn;
        System.out.println("Laptop State: " + state);

        Laptop.increaseBrightness();
        int bright = Laptop.brightness;
        System.out.println("Brightness: " + bright);

        Laptop.decreaseBrightness();
        int brightAfter = Laptop.brightness;
        System.out.println("Brightness After Decrease: " + brightAfter);

        Laptop.off();
        state = Laptop.isOn;
        System.out.println("Laptop State: " + state);
    }
}