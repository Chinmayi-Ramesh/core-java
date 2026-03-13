class MicrowaveRunner {

    public static void main(String[] args){

        Microwave.on();

        Microwave.increaseTime();
        int time = Microwave.timer;
        System.out.println("Timer: " + time);

        Microwave.decreaseTime();
        int timeAfter = Microwave.timer;
        System.out.println("Timer After Decrease: " + timeAfter);

        Microwave.off();
    }
}