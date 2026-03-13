class VacuumCleaner {

    static boolean isOn = false;
    static int suctionPower = 2;
    static int minPower = 0;
    static int maxPower = 5;

    static void on(){
        isOn = true;
        System.out.println("Vacuum Cleaner ON");
    }

    static void off(){
        isOn = false;
        System.out.println("Vacuum Cleaner OFF");
    }

    static void increasePower(){
        if(isOn){
            if(suctionPower < maxPower){
                suctionPower++;
                System.out.println("Power increased: " + suctionPower);
            }
        }
    }

    static void decreasePower(){
        if(isOn){
            if(suctionPower > minPower){
                suctionPower--;
                System.out.println("Power decreased: " + suctionPower);
            }
        }
    }
}

class VacuumCleanerRunner {

    public static void main(String[] args){

        VacuumCleaner.on();

        VacuumCleaner.increasePower();
        int power = VacuumCleaner.suctionPower;
        System.out.println("Power: " + power);

        VacuumCleaner.decreasePower();
        int powerAfter = VacuumCleaner.suctionPower;
        System.out.println("Power After: " + powerAfter);

        VacuumCleaner.off();
    }
}
1️⃣6️⃣ Projector
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

class ProjectorRunner {

    public static void main(String[] args){

        Projector.on();

        Projector.increaseBrightness();
        int bright = Projector.brightness;
        System.out.println("Brightness: " + bright);

        Projector.decreaseBrightness();
        int brightAfter = Projector.brightness;
        System.out.println("Brightness After: " + brightAfter);

        Projector.off();
    }
}
1️⃣7️⃣ ElectricScooter
class ElectricScooter {

    static boolean isOn = false;
    static int speed = 20;
    static int minSpeed = 0;
    static int maxSpeed = 80;

    static void on(){
        isOn = true;
        System.out.println("Scooter ON");
    }

    static void off(){
        isOn = false;
        System.out.println("Scooter OFF");
    }

    static void increaseSpeed(){
        if(isOn){
            if(speed < maxSpeed){
                speed += 5;
                System.out.println("Speed increased: " + speed);
            }
        }
    }

    static void decreaseSpeed(){
        if(isOn){
            if(speed > minSpeed){
                speed -= 5;
                System.out.println("Speed decreased: " + speed);
            }
        }
    }
}

class ElectricScooterRunner {

    public static void main(String[] args){

        ElectricScooter.on();

        ElectricScooter.increaseSpeed();
        int speed = ElectricScooter.speed;
        System.out.println("Speed: " + speed);

        ElectricScooter.decreaseSpeed();
        int speedAfter = ElectricScooter.speed;
        System.out.println("Speed After: " + speedAfter);

        ElectricScooter.off();
    }
}
1️⃣8️⃣ PowerBank
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

class PowerBankRunner {

    public static void main(String[] args){

        PowerBank.on();

        PowerBank.charge();
        int charge = PowerBank.chargeLevel;
        System.out.println("Charge Level: " + charge);

        PowerBank.useCharge();
        int chargeAfter = PowerBank.chargeLevel;
        System.out.println("Charge After: " + chargeAfter);

        PowerBank.off();
    }
}
1️⃣9️⃣ SmartWatch
class SmartWatch {

    static boolean isOn = false;
    static int battery = 60;
    static int minBattery = 0;
    static int maxBattery = 100;

    static void on(){
        isOn = true;
        System.out.println("SmartWatch ON");
    }

    static void off(){
        isOn = false;
        System.out.println("SmartWatch OFF");
    }

    static void charge(){
        if(battery < maxBattery){
            battery += 10;
            System.out.println("Battery charged: " + battery);
        }
    }

    static void useBattery(){
        if(isOn){
            if(battery > minBattery){
                battery -= 10;
                System.out.println("Battery used: " + battery);
            }
        }
    }
}

class SmartWatchRunner {

    public static void main(String[] args){

        SmartWatch.on();

        SmartWatch.useBattery();
        int battery = SmartWatch.battery;
        System.out.println("Battery: " + battery);

        SmartWatch.charge();
        int batteryAfter = SmartWatch.battery;
        System.out.println("Battery After: " + batteryAfter);

        SmartWatch.off();
    }
}

If you want, I can also give the last few gadgets (Drone, GamingConsole, AirCooler, ElectricIron) so your practice set becomes 25+ Java programs, which is excellent practice for methods + conditions + runner classes.