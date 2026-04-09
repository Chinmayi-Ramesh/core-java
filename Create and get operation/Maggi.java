class Maggi {

    String ingredients[] = new String[12];
    int index;

    public boolean addIngredient(String ingredient){
        boolean isAdded = false;

        if(index < ingredients.length){
            if(ingredient != null && !ingredient.isEmpty()){
                ingredients[index++] = ingredient;
                isAdded = true;
            } else System.out.println(ingredient + " is not valid");
        } else System.out.println("Ingredients are full");

        return isAdded;
    }

    public void getIngredients(){
        System.out.println("The Ingredients are:");
        for(String ingredient : ingredients){
            System.out.println(ingredient);
        }
    }
}