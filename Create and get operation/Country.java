class Country {

    String states[] = new String[29];
    int index;

    public boolean addState(String state){
        boolean isAdded = false;

        if(index < states.length){
            if(state != null && !state.isEmpty()){
                states[index++] = state;
                isAdded = true;
            } else System.out.println(state + " is not valid");
        } else System.out.println("States are full");

        return isAdded;
    }
	public void getStates(){
        System.out.println("States are:");
        for(String state : states){
            System.out.println(state);
        }
    }
}
