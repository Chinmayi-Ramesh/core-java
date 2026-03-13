class Laptop {

    static boolean isOn = false;
    static int brightness = 50;
    static int minBrightness = 0;
    static int maxBrightness = 100;

    static void on(){
        isOn = true;
        System.out.println("Laptop is ON");
    }

    static void off(){
        isOn = false;
        System.out.println("Laptop is OFF");
    }

    static void increaseBrightness(){
        if(isOn){
            if(brightness < maxBrightness){
                brightness = brightness + 10;
                System.out.println("Brightness increased: " + brightness);
            }else{
                System.out.println("Max brightness reached");
            }
        }
    }

    static void decreaseBrightness(){
        if(isOn){
            if(brightness > minBrightness){
                brightness = brightness - 10;
                System.out.println("Brightness decreased: " + brightness);
            }else{
                System.out.println("Min brightness reached");
            }
        }
    }
}