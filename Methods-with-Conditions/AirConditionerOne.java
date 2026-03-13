class AirConditionerOne {

    public static void main(String[] args){

        AirConditioner.on();
        boolean acState = AirConditioner.isOn;
        System.out.println("AC State: " + acState);

        AirConditioner.increaseTemp();
        int temp = AirConditioner.currentTemp;
        System.out.println("Current Temperature: " + temp);

        AirConditioner.decreaseTemp();
        int tempAfterDecrease = AirConditioner.currentTemp;
        System.out.println("Temperature After Decrease: " + tempAfterDecrease);

        AirConditioner.off();
        acState = AirConditioner.isOn;
        System.out.println("AC State: " + acState);
    }
}