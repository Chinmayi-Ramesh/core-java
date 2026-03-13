class AirPurifier {

    static boolean isOn = false;
    static int fanSpeed = 2;
    static int minSpeed = 0;
    static int maxSpeed = 5;

    static void on(){
        isOn = true;
        System.out.println("Air Purifier ON");
    }

    static void off(){
        isOn = false;
        System.out.println("Air Purifier OFF");
    }

    static void increaseSpeed(){
        if(isOn){
            if(fanSpeed < maxSpeed){
                fanSpeed++;
                System.out.println("Speed increased: " + fanSpeed);
            }
        }
    }

    static void decreaseSpeed(){
        if(isOn){
            if(fanSpeed > minSpeed){
                fanSpeed--;
                System.out.println("Speed decreased: " + fanSpeed);
            }
        }
    }
}
