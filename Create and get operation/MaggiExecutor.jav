class MaggiExecutor {
    public static void main(String[] args){

        Maggi maggi = new Maggi();

        boolean added;

        added = maggi.addIngredient("Noodles");
        System.out.println(added);

        added = maggi.addIngredient("Salt");
        System.out.println(added);

        added = maggi.addIngredient("Oil");
        System.out.println(added);

        added = maggi.addIngredient("Masala");
        System.out.println(added);

        added = maggi.addIngredient("Water");
        System.out.println(added);

        added = maggi.addIngredient("Carrot");
        System.out.println(added);

        added = maggi.addIngredient("Beans");
        System.out.println(added);

        added = maggi.addIngredient("Peas");
        System.out.println(added);

        added = maggi.addIngredient("Corn");
        System.out.println(added);

        added = maggi.addIngredient("Onion");
        System.out.println(added);

        added = maggi.addIngredient("Capsicum");
        System.out.println(added);

        added = maggi.addIngredient("Spices");
        System.out.println(added);

        maggi.getIngredients();
    }
}