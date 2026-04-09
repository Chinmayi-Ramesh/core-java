class SouthIndiaExecutor {
    public static void main(String[] args){

        SouthIndia southIndia = new SouthIndia();

        boolean added;

        added = southIndia.addAirportName("Kempegowda Airport");
        System.out.println(added);

        added = southIndia.addAirportName("Chennai Airport");
        System.out.println(added);

        added = southIndia.addAirportName("Hyderabad Airport");
        System.out.println(added);

        added = southIndia.addAirportName("Kochi Airport");
        System.out.println(added);

        added = southIndia.addAirportName("Mangalore Airport");
        System.out.println(added);

        added = southIndia.addAirportName("Coimbatore Airport");
        System.out.println(added);

        added = southIndia.addAirportName("Madurai Airport");
        System.out.println(added);

        added = southIndia.addAirportName("Trichy Airport");
        System.out.println(added);

        added = southIndia.addAirportName("Vizag Airport");
        System.out.println(added);

        southIndia.getAirportNames();
    }
}