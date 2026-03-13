class MusicSystemRunner {

    public static void main(String[] args){

        MusicSystem.on();

        MusicSystem.increaseVolume();
        int volume = MusicSystem.volume;
        System.out.println("Volume: " + volume);

        MusicSystem.decreaseVolume();
        int volumeAfter = MusicSystem.volume;
        System.out.println("Volume After: " + volumeAfter);

        MusicSystem.off();
    }
}