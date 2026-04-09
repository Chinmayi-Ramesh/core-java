class PetShopExecutor {
    public static void main(String[] args){

        PetShop petShop = new PetShop();

        boolean added = petShop.addAccessory("Collar");
        System.out.println(added);

        added = petShop.addAccessory("Leash");
        System.out.println(added);

        added = petShop.addAccessory("Bowl");
        System.out.println(added);

        added = petShop.addAccessory("Bed");
        System.out.println(added);

        added = petShop.addAccessory("Toy");
        System.out.println(added);

        added = petShop.addAccessory("Brush");
        System.out.println(added);

        added = petShop.addAccessory("Shampoo");
        System.out.println(added);

        added = petShop.addAccessory("Cage");
        System.out.println(added);

        added = petShop.addAccessory("Aquarium");
        System.out.println(added);

        added = petShop.addAccessory("Food");
        System.out.println(added);

        added = petShop.addAccessory("Treats");
        System.out.println(added);

        added = petShop.addAccessory("Harness");
        System.out.println(added);

        added = petShop.addAccessory("Clothes");
        System.out.println(added);

        added = petShop.addAccessory("Carrier");
        System.out.println(added);

        added = petShop.addAccessory("Mat");
        System.out.println(added);

        added = petShop.addAccessory("NailCutter");
        System.out.println(added);

        petShop.getAccessories();
    }
}