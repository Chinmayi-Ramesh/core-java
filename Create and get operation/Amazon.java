class Amazon {

    String categoryNames[] = new String[21];
    int index;

    public boolean addCategory(String category){
        boolean isAdded = false;

        if(index < categoryNames.length){
            if(category != null && !category.isEmpty()){
                categoryNames[index++] = category;
                isAdded = true;
            } else {
                System.out.println(category + " is not valid");
            }
        } else {
            System.out.println("Categories are full");
        }

        return isAdded;
    }

    public void getCategories(){
        System.out.println("Category Names are:");
        for(String c : categoryNames){
            System.out.println(c);
        }
    }
}