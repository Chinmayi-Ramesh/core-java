class WashingMachine {

    static boolean isOn = false;
    static int waterLevel = 3;
    static int minWater = 0;
    static int maxWater = 10;

    static void on(){
        isOn = true;
        System.out.println("Washing Machine ON");
    }

    static void off(){
        isOn = false;
        System.out.println("Washing Machine OFF");
    }

    static void increaseWater(){
        if(isOn){
            if(waterLevel < maxWater){
                waterLevel++;
                System.out.println("Water Level increased: " + waterLevel);
            }
        }
    }

    static void decreaseWater(){
        if(isOn){
            if(waterLevel > minWater){
                waterLevel--;
                System.out.println("Water Level decreased: " + waterLevel);
            }
        }
    }
}