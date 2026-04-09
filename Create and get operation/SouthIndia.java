class SouthIndia {

    String airportNames[] = new String[9];
    int index;

    public boolean addAirportName(String airportName){
        boolean isAdded = false;

        if(index < airportNames.length){
            if(airportName != null && !airportName.isEmpty()){
                airportNames[index++] = airportName;
                isAdded = true;
            } else System.out.println(airportName + " is not valid");
        } else System.out.println("Airports are full");

        return isAdded;
    }

    public void getAirportNames(){
        System.out.println("The AirportNames are:");
        for(String airportName : airportNames){
            System.out.println(airportName);
        }
    }
}