class StateElectionExecutor {
    public static void main(String[] args){

        StateElection se = new StateElection();

        boolean added;

        added = se.addPartyName("BJP");
        System.out.println(added);

        added = se.addPartyName("Congress");
        System.out.println(added);

        added = se.addPartyName("JDS");
        System.out.println(added);

        added = se.addPartyName("AAP");
        System.out.println(added);

        added = se.addPartyName("TMC");
        System.out.println(added);

        added = se.addPartyName("ShivSena");
        System.out.println(added);

        added = se.addPartyName("BSP");
        System.out.println(added);

        se.getPartyNames();
    }
}