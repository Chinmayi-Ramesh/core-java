class PoliceStationExecutor {
    public static void main(String[] args){

        PoliceStation ps = new PoliceStation();

        boolean added;

        added = ps.addCaseName("Theft");
        System.out.println(added);

        added = ps.addCaseName("Fraud");
        System.out.println(added);

        added = ps.addCaseName("Accident");
        System.out.println(added);

        added = ps.addCaseName("Murder");
        System.out.println(added);

        added = ps.addCaseName("Robbery");
        System.out.println(added);

        added = ps.addCaseName("CyberCrime");
        System.out.println(added);

        added = ps.addCaseName("Kidnapping");
        System.out.println(added);

        added = ps.addCaseName("Assault");
        System.out.println(added);

        added = ps.addCaseName("DomesticViolence");
        System.out.println(added);

        added = ps.addCaseName("DrugCase");
        System.out.println(added);

        added = ps.addCaseName("Smuggling");
        System.out.println(added);

        added = ps.addCaseName("Bribery");
        System.out.println(added);

        added = ps.addCaseName("Forgery");
        System.out.println(added);

        added = ps.addCaseName("Trespassing");
        System.out.println(added);

        added = ps.addCaseName("Harassment");
        System.out.println(added);

        added = ps.addCaseName("Vandalism");
        System.out.println(added);

        ps.getCaseNames();
    }
}