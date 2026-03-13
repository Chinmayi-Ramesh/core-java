class MusicSystem {

    static boolean isOn = false;
    static int volume = 4;
    static int minVolume = 0;
    static int maxVolume = 10;

    static void on(){
        isOn = true;
        System.out.println("Music System ON");
    }

    static void off(){
        isOn = false;
        System.out.println("Music System OFF");
    }

    static void increaseVolume(){
        if(isOn){
            if(volume < maxVolume){
                volume++;
                System.out.println("Volume increased: " + volume);
            }
        }
    }

    static void decreaseVolume(){
        if(isOn){
            if(volume > minVolume){
                volume--;
                System.out.println("Volume decreased: " + volume);
            }
        }
    }
}