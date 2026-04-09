class Movie {

    String casts[] = new String[9];
    int index;

    public boolean addCast(String cast){
        boolean isAdded = false;

        if(index < casts.length){
            if(cast != null && !cast.isEmpty()){
                casts[index++] = cast;
                isAdded = true;
            } else {
                System.out.println(cast + " is not valid");
            }
        } else {
            System.out.println("Cast list is full");
        }

        return isAdded;
    }

    public void getCasts(){
        System.out.println("Movie Casts:");
        for(String c : casts){
            System.out.println(c);
        }
    }
}