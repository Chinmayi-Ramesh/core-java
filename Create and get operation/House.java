class House {

    String indoorGames[] = new String[6];
    int index;

    public boolean addIndoorGame(String game){
        boolean isAdded = false;

        if(index < indoorGames.length){
            if(game != null && !game.isEmpty()){
                indoorGames[index++] = game;
                isAdded = true;
            } else System.out.println(game + " is not valid");
        } else System.out.println("Games are full");

        return isAdded;
    }

    public void getIndoorGames(){
        System.out.println("The IndoorGames are:");
        for(String game : indoorGames){
            System.out.println(game);
        }
    }
}