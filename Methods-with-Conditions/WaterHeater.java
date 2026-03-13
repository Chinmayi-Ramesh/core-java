class WaterHeater {

    static boolean isOn = false;
    static int temperature = 40;
    static int minTemp = 20;
    static int maxTemp = 80;

    static void on(){
        isOn = true;
        System.out.println("Heater ON");
    }

    static void off(){
        isOn = false;
        System.out.println("Heater OFF");
    }

    static void increaseTemp(){
        if(isOn){
            if(temperature < maxTemp){
                temperature++;
                System.out.println("Temperature increased: " + temperature);
            }
        }
    }

    static void decreaseTemp(){
        if(isOn){
            if(temperature > minTemp){
                temperature--;
                System.out.println("Temperature decreased: " + temperature);
            }
        }
    }
}