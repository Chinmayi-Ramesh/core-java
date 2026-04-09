class ShowRoom {

    String managerNames[] = new String[8];
    int index;

    public boolean addManagerName(String managerName){
        boolean isAdded = false;

        if(index < managerNames.length){
            if(managerName != null && !managerName.isEmpty()){
                managerNames[index++] = managerName;
                isAdded = true;
            } else System.out.println(managerName + " is not valid");
        } else System.out.println("Managers are full");

        return isAdded;
    }

    public void getManagerNames(){
        System.out.println("The ManagerNames are:");
        for(String managerName : managerNames){
            System.out.println(managerName);
        }
    }
}