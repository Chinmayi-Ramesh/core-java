class DeskLamp {

    static boolean isOn = false;
    static int brightness = 3;
    static int minBrightness = 0;
    static int maxBrightness = 10;

    static void on(){
        isOn = true;
        System.out.println("Lamp ON");
    }

    static void off(){
        isOn = false;
        System.out.println("Lamp OFF");
    }

    static void increaseBrightness(){
        if(isOn){
            if(brightness < maxBrightness){
                brightness++;
                System.out.println("Brightness increased: " + brightness);
            }
        }
    }

    static void decreaseBrightness(){
        if(isOn){
            if(brightness > minBrightness){
                brightness--;
                System.out.println("Brightness decreased: " + brightness);
            }
        }
    }
}