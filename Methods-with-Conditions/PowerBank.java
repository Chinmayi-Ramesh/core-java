class PowerBank {

    static boolean isOn = false;
    static int chargeLevel = 50;
    static int minCharge = 0;
    static int maxCharge = 100;

    static void on(){
        isOn = true;
        System.out.println("PowerBank ON");
    }

    static void off(){
        isOn = false;
        System.out.println("PowerBank OFF");
    }

    static void charge(){
        if(isOn){
            if(chargeLevel < maxCharge){
                chargeLevel += 10;
                System.out.println("Charge increased: " + chargeLevel);
            }
        }
    }

    static void useCharge(){
        if(isOn){
            if(chargeLevel > minCharge){
                chargeLevel -= 10;
                System.out.println("Charge used: " + chargeLevel);
            }
        }
    }
}