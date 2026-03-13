class TelevisionRunner {

    public static void main(String[] args){

        Television.on();
        boolean tvState = Television.isOn;
        System.out.println("TV State: " + tvState);

        Television.increaseVolume();
        int volume = Television.currentVolume;
        System.out.println("Current Volume: " + volume);

        Television.decreaseVolume();
        int volumeAfterDecrease = Television.currentVolume;
        System.out.println("Volume After Decrease: " + volumeAfterDecrease);

        Television.off();
        tvState = Television.isOn;
        System.out.println("TV State: " + tvState);
    }
}