class WeatherStationExecutor {
    public static void main(String[] args){

        WeatherStation ws = new WeatherStation();

        boolean added;

        added = ws.addTemperature(30);
        System.out.println(added);

        added = ws.addTemperature(32);
        System.out.println(added);

        added = ws.addTemperature(31);
        System.out.println(added);

        added = ws.addTemperature(29);
        System.out.println(added);

        added = ws.addTemperature(28);
        System.out.println(added);

        added = ws.addTemperature(33);
        System.out.println(added);

        added = ws.addTemperature(34);
        System.out.println(added);

        added = ws.addTemperature(35);
        System.out.println(added);

        added = ws.addTemperature(27);
        System.out.println(added);

        added = ws.addTemperature(26);
        System.out.println(added);

        added = ws.addTemperature(25);
        System.out.println(added);

        added = ws.addTemperature(36);
        System.out.println(added);

        added = ws.addTemperature(37);
        System.out.println(added);

        added = ws.addTemperature(38);
        System.out.println(added);

        added = ws.addTemperature(39);
        System.out.println(added);

        added = ws.addTemperature(40);
        System.out.println(added);

        added = ws.addTemperature(41);
        System.out.println(added);

        ws.getTemperatures();
    }
}