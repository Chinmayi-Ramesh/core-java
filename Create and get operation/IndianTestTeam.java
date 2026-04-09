class IndianTestTeam {

    String playerNames[] = new String[11];
    int index;

    public boolean addPlayerName(String playerName){
        boolean isAdded = false;

        if(index < playerNames.length){
            if(playerName != null && !playerName.isEmpty()){
                playerNames[index++] = playerName;
                isAdded = true;
            } else System.out.println(playerName + " is not valid");
        } else System.out.println("Players are full");

        return isAdded;
    }

    public void getPlayerNames(){
        System.out.println("The PlayerNames are:");
        for(String playerName : playerNames){
            System.out.println(playerName);
        }
    }
}