class StateElection {

    String partyNames[] = new String[7];
    int index;

    public boolean addPartyName(String partyName){
        boolean isAdded = false;

        if(index < partyNames.length){
            if(partyName != null && !partyName.isEmpty()){
                partyNames[index++] = partyName;
                isAdded = true;
            } else {
                System.out.println(partyName + " is not valid");
            }
        } else {
            System.out.println("Parties are full");
        }

        return isAdded;
    }

    public void getPartyNames(){
        System.out.println("Party Names are:");
        for(String p : partyNames){
            System.out.println(p);
        }
    }
}