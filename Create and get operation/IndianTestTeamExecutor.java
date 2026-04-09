class IndianTestTeamExecutor {
    public static void main(String[] args){

        IndianTestTeam indianTestTeam = new IndianTestTeam();

        boolean added;

        added = indianTestTeam.addPlayerName("Rohit Sharma");
        System.out.println(added);

        added = indianTestTeam.addPlayerName("Virat Kohli");
        System.out.println(added);

        added = indianTestTeam.addPlayerName("Shubman Gill");
        System.out.println(added);

        added = indianTestTeam.addPlayerName("KL Rahul");
        System.out.println(added);

        added = indianTestTeam.addPlayerName("Rishabh Pant");
        System.out.println(added);

        added = indianTestTeam.addPlayerName("Ravindra Jadeja");
        System.out.println(added);

        added = indianTestTeam.addPlayerName("Ravichandran Ashwin");
        System.out.println(added);

        added = indianTestTeam.addPlayerName("Jasprit Bumrah");
        System.out.println(added);

        added = indianTestTeam.addPlayerName("Mohammed Shami");
        System.out.println(added);

        added = indianTestTeam.addPlayerName("Mohammed Siraj");
        System.out.println(added);

        added = indianTestTeam.addPlayerName("Shreyas Iyer");
        System.out.println(added);

        indianTestTeam.getPlayerNames();
    }
}