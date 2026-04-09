class Trip {

    String places[] = new String[13];
    int index;

    public boolean addPlace(String place){
        boolean isAdded = false;

        if(index < places.length){
            if(place != null && !place.isEmpty()){
                places[index++] = place;
                isAdded = true;
            } else {
                System.out.println(place + " is not valid");
            }
        } else {
            System.out.println("Places are full");
        }

        return isAdded;
    }

    public void getPlaces(){
        System.out.println("Places are:");
        for(String p : places){
            System.out.println(p);
        }
    }
}