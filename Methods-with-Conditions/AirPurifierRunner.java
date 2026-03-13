class AirPurifierRunner {

    public static void main(String[] args){

        AirPurifier.on();

        AirPurifier.increaseSpeed();
        int speed = AirPurifier.fanSpeed;
        System.out.println("Fan Speed: " + speed);

        AirPurifier.decreaseSpeed();
        int speedAfter = AirPurifier.fanSpeed;
        System.out.println("Speed After: " + speedAfter);

        AirPurifier.off();
    }
}