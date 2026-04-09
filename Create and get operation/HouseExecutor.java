class HouseExecutor {
    public static void main(String[] args){

        House house = new House();

        boolean added;

        added = house.addIndoorGame("Chess");
        System.out.println(added);

        added = house.addIndoorGame("Carrom");
        System.out.println(added);

        added = house.addIndoorGame("Ludo");
        System.out.println(added);

        added = house.addIndoorGame("Cards");
        System.out.println(added);

        added = house.addIndoorGame("SnakesAndLadders");
        System.out.println(added);

        added = house.addIndoorGame("TableTennis");
        System.out.println(added);

        house.getIndoorGames();
    }
}