class WeatherStation {

    int temperatureReadings[] = new int[17];
    int index;

    public boolean addTemperature(int temp){
        boolean isAdded = false;

        if(index < temperatureReadings.length){
            temperatureReadings[index++] = temp;
            isAdded = true;
        } else {
            System.out.println("Readings are full");
        }

        return isAdded;
    }

    public void getTemperatures(){
        System.out.println("Temperature Readings:");
        for(int t : temperatureReadings){
            System.out.println(t);
        }
    }
}