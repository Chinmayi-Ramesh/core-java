class Hungama {

    String showNames[] = new String[14];
    int index;

    public boolean addShowName(String showName){
        boolean isAdded = false;

        if(index < showNames.length){
            if(showName != null && !showName.isEmpty()){
                showNames[index++] = showName;
                isAdded = true;
            } else System.out.println(showName + " is not valid");
        } else System.out.println("Shows are full");

        return isAdded;
    }

    public void getShowNames(){
        System.out.println("The ShowNames are:");
        for(String showName : showNames){
            System.out.println(showName);
        }
    }
}