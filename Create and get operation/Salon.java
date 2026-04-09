class Salon {

    String services[] = new String[7];
    int index;

    public boolean addService(String service){
        boolean isAdded = false;

        if(index < services.length){
            if(service != null && !service.isEmpty()){
                services[index++] = service;
                isAdded = true;
            } else System.out.println(service + " is not valid");
        } else System.out.println("Services are full");

        return isAdded;
    }

    public void getServices(){
        System.out.println("The Services are:");
        for(String service : services){
            System.out.println(service);
        }
    }
}