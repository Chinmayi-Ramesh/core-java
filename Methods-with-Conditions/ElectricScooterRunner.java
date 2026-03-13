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