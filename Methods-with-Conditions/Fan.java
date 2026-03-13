class Television {

    static boolean isOn = false;
    static int currentVolume = 5;
    static int minVolume = 0;
    static int maxVolume = 10;

    static void on(){
        isOn = true;
        System.out.println("TV is ON");
    }

    static void off(){
        isOn = false;
        System.out.println("TV is OFF");
    }

    static void increaseVolume(){
        if(isOn){
            if(currentVolume < maxVolume){
                currentVolume = currentVolume + 1;
                System.out.println("Volume increased: " + currentVolume);
            }else{
                System.out.println("Max volume reached");
            }
        }
    }

    static void decreaseVolume(){
        if(isOn){
            if(currentVolume > minVolume){
                currentVolume = currentVolume - 1;
                System.out.println("Volume decreased: " + currentVolume);
            }else{
                System.out.println("Min volume reached");
            }
        }
    }
}
