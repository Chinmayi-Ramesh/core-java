class AirConditioner {

    static boolean isOn = false;
    static int currentTemp = 24;
    static int minTemp = 16;
    static int maxTemp = 30;

    static void on(){
        isOn = true;
        System.out.println("AC is ON");
    }

    static void off(){
        isOn = false;
        System.out.println("AC is OFF");
    }

    static void increaseTemp(){
        if(isOn){
            if(currentTemp < maxTemp){
                currentTemp = currentTemp + 1;
                System.out.println("Temperature increased: " + currentTemp);
            }else{
                System.out.println("Max temperature reached");
            }
        }
    }

    static void decreaseTemp(){
        if(isOn){
            if(currentTemp > minTemp){
                currentTemp = currentTemp - 1;
                System.out.println("Temperature decreased: " + currentTemp);
            }else{
                System.out.println("Min temperature reached");
            }
        }
    }
}