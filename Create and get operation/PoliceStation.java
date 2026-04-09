class PoliceStation {

    String caseNames[] = new String[16];
    int index;

    public boolean addCaseName(String caseName){
        boolean isAdded = false;

        if(index < caseNames.length){
            if(caseName != null && !caseName.isEmpty()){
                caseNames[index++] = caseName;
                isAdded = true;
            } else {
                System.out.println(caseName + " is not valid");
            }
        } else {
            System.out.println("Cases are full");
        }

        return isAdded;
    }

    public void getCaseNames(){
        System.out.println("Case Names are:");
        for(String c : caseNames){
            System.out.println(c);
        }
    }
}