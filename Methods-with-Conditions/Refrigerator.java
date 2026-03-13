class Refrigerator {

    static boolean isOn = false;
    static int coolingLevel = 3;
    static int minCooling = 0;
    static int maxCooling = 10;

    static void on(){
        isOn = true;
        System.out.println("Refrigerator ON");
    }

    static void off(){
        isOn = false;
        System.out.println("Refrigerator OFF");
    }

    static void increaseCooling(){
        if(isOn){
            if(coolingLevel < maxCooling){
                coolingLevel++;
                System.out.println("Cooling increased: " + coolingLevel);
            }
        }
    }

    static void decreaseCooling(){
        if(isOn){
            if(coolingLevel > minCooling){
                coolingLevel--;
                System.out.println("Cooling decreased: " + coolingLevel);
            }
        }
    }
}