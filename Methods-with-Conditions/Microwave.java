class Microwave {

    static boolean isOn = false;
    static int timer = 2;
    static int minTime = 0;
    static int maxTime = 10;

    static void on(){
        isOn = true;
        System.out.println("Microwave ON");
    }

    static void off(){
        isOn = false;
        System.out.println("Microwave OFF");
    }

    static void increaseTime(){
        if(isOn){
            if(timer < maxTime){
                timer++;
                System.out.println("Timer increased: " + timer);
            }
        }
    }

    static void decreaseTime(){
        if(isOn){
            if(timer > minTime){
                timer--;
                System.out.println("Timer decreased: " + timer);
            }
        }
    }
}