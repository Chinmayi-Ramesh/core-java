class Universe {

    String galaxies[] = new String[11];
    int index;

    public boolean addGalaxy(String galaxy){
        boolean isAdded = false;

        if(index < galaxies.length){
            if(galaxy != null && !galaxy.isEmpty()){
                galaxies[index++] = galaxy;
                isAdded = true;
            } else System.out.println(galaxy + " is not valid");
        } else System.out.println("Galaxies are full");

        return isAdded;
    }

    public void getGalaxies(){
        System.out.println("The Galaxies are:");
        for(String galaxy : galaxies){
            System.out.println(galaxy);
        }
    }
}