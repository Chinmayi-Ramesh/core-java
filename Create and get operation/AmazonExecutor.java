class AmazonExecutor {
    public static void main(String[] args){

        Amazon am = new Amazon();

        boolean added;

        added = am.addCategory("Electronics");
        System.out.println(added);

        added = am.addCategory("Clothing");
        System.out.println(added);

        added = am.addCategory("HomeAppliances");
        System.out.println(added);

        added = am.addCategory("Books");
        System.out.println(added);

        added = am.addCategory("Toys");
        System.out.println(added);

        added = am.addCategory("Groceries");
        System.out.println(added);

        added = am.addCategory("Beauty");
        System.out.println(added);

        added = am.addCategory("Furniture");
        System.out.println(added);

        added = am.addCategory("Footwear");
        System.out.println(added);

        added = am.addCategory("Sports");
        System.out.println(added);

        added = am.addCategory("Jewellery");
        System.out.println(added);

        added = am.addCategory("Watches");
        System.out.println(added);

        added = am.addCategory("Bags");
        System.out.println(added);

        added = am.addCategory("Kitchen");
        System.out.println(added);

        added = am.addCategory("OfficeSupplies");
        System.out.println(added);

        added = am.addCategory("PetSupplies");
        System.out.println(added);

        added = am.addCategory("Automotive");
        System.out.println(added);

        added = am.addCategory("BabyProducts");
        System.out.println(added);

        added = am.addCategory("Health");
        System.out.println(added);

        added = am.addCategory("Music");
        System.out.println(added);

        added = am.addCategory("Garden");
        System.out.println(added);

        am.getCategories();
    }
}