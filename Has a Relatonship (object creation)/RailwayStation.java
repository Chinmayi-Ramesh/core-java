class RailwayStation {

    int stationId;
    String stationName;
    String location;
    boolean hasWifi;
    Platform platform;

    public void getStationDetails() {
        System.out.println("RailwayStation Details");
        System.out.println("Station Id: " + stationId);
        System.out.println("Station Name: " + stationName);
        System.out.println("Location: " + location);
        System.out.println("Has Wifi: " + hasWifi);
        platform.getPlatformDetails();
        
    }
}