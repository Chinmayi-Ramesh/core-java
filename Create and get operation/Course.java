class Course {

    String technologyNames[] = new String[15];
    int index;

    public boolean addTechnologyName(String technologyName){
        boolean isAdded = false;

        if(index < technologyNames.length){
            if(technologyName != null && !technologyName.isEmpty()){
                technologyNames[index++] = technologyName;
                isAdded = true;
            } else System.out.println(technologyName + " is not valid");
        } else System.out.println("Technologies are full");

        return isAdded;
    }

    public void getTechnologyNames(){
        System.out.println("The TechnologyNames are:");
        for(String technologyName : technologyNames){
            System.out.println(technologyName);
        }
    }
}