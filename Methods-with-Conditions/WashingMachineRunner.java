class WashingMachineRunner {

    public static void main(String[] args){

        WashingMachine.on();

        WashingMachine.increaseWater();
        int water = WashingMachine.waterLevel;
        System.out.println("Water Level: " + water);

        WashingMachine.decreaseWater();
        int waterAfter = WashingMachine.waterLevel;
        System.out.println("Water Level After Decrease: " + waterAfter);

        WashingMachine.off();
    }
}