class VacuumCleanerRunner {

    public static void main(String[] args){

        VacuumCleaner.on();

        VacuumCleaner.increasePower();
        int power = VacuumCleaner.suctionPower;
        System.out.println("Power: " + power);

        VacuumCleaner.decreasePower();
        int powerAfter = VacuumCleaner.suctionPower;
        System.out.println("Power After: " + powerAfter);

        VacuumCleaner.off();
    }
}