class Printer {

    static boolean isOn = false;
    static int paperCount = 10;
    static int minPaper = 0;
    static int maxPaper = 100;

    static void on(){
        isOn = true;
        System.out.println("Printer ON");
    }

    static void off(){
        isOn = false;
        System.out.println("Printer OFF");
    }

    static void addPaper(){
        if(isOn){
            if(paperCount < maxPaper){
                paperCount = paperCount + 10;
                System.out.println("Paper added: " + paperCount);
            }else{
                System.out.println("Paper tray full");
            }
        }
    }

    static void removePaper(){
        if(isOn){
            if(paperCount > minPaper){
                paperCount = paperCount - 5;
                System.out.println("Paper used: " + paperCount);
            }else{
                System.out.println("No paper left");
            }
        }
    }
}