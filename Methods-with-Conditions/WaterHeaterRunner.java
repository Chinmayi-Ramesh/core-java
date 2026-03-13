class WaterHeaterRunner {

    public static void main(String[] args){

        WaterHeater.on();

        WaterHeater.increaseTemp();
        int temp = WaterHeater.temperature;
        System.out.println("Temperature: " + temp);

        WaterHeater.decreaseTemp();
        int tempAfter = WaterHeater.temperature;
        System.out.println("Temperature After: " + tempAfter);

        WaterHeater.off();
    }
}