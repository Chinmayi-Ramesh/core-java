class SpeakerOne {

    public static void main(String[] args){

        Speaker.on();
        boolean speakerState = Speaker.isOn;
        System.out.println("Speaker State: " + speakerState);

        Speaker.increaseVolume();
        int volume = Speaker.currentVolume;
        System.out.println("Current Volume: " + volume);

        Speaker.decreaseVolume();
        int volumeAfterDecrease = Speaker.currentVolume;
        System.out.println("Volume After Decrease: " + volumeAfterDecrease);

        Speaker.off();
        speakerState = Speaker.isOn;
        System.out.println("Speaker State: " + speakerState);
    }
}