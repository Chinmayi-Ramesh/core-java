class Projector {

    static boolean isOn = false;
    static int brightness = 3;
    static int minBrightness = 0;
    static int maxBrightness = 10;

    static void on(){
        isOn = true;
        System.out.println("Projector ON");
    }

    static void off(){
        isOn = false;
        System.out.println("Projector OFF");
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