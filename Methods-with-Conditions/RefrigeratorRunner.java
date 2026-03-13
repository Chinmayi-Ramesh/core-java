class RefrigeratorRunner {

    public static void main(String[] args){

        Refrigerator.on();

        Refrigerator.increaseCooling();
        int cool = Refrigerator.coolingLevel;
        System.out.println("Cooling Level: " + cool);

        Refrigerator.decreaseCooling();
        int coolAfter = Refrigerator.coolingLevel;
        System.out.println("Cooling After Decrease: " + coolAfter);

        Refrigerator.off();
    }
}