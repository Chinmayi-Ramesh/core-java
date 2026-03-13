class MobilePhone {

    static boolean isOn = false;
    static int battery = 50;
    static int minBattery = 0;
    static int maxBattery = 100;

    static void on(){
        isOn = true;
        System.out.println("Mobile is ON");
    }

    static void off(){
        isOn = false;
        System.out.println("Mobile is OFF");
    }

    static void charge(){
        if(battery < maxBattery){
            battery = battery + 10;
            System.out.println("Battery charged: " + battery);
        }else{
            System.out.println("Battery Full");
        }
    }

    static void useBattery(){
        if(isOn){
            if(battery > minBattery){
                battery = battery - 10;
                System.out.println("Battery used: " + battery);
            }
        }
    }
}

