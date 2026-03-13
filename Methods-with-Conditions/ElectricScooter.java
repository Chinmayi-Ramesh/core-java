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