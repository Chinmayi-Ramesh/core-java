class CameraRunner {

    public static void main(String[] args){

        Camera.on();

        Camera.zoomIn();
        int zoom = Camera.zoomLevel;
        System.out.println("Zoom Level: " + zoom);

        Camera.zoomOut();
        int zoomAfter = Camera.zoomLevel;
        System.out.println("Zoom After: " + zoomAfter);

        Camera.off();
    }
}