class Camera {

    static boolean isOn = false;
    static int zoomLevel = 2;
    static int minZoom = 1;
    static int maxZoom = 10;

    static void on(){
        isOn = true;
        System.out.println("Camera ON");
    }

    static void off(){
        isOn = false;
        System.out.println("Camera OFF");
    }

    static void zoomIn(){
        if(isOn){
            if(zoomLevel < maxZoom){
                zoomLevel++;
                System.out.println("Zoom increased: " + zoomLevel);
            }
        }
    }

    static void zoomOut(){
        if(isOn){
            if(zoomLevel > minZoom){
                zoomLevel--;
                System.out.println("Zoom decreased: " + zoomLevel);
            }
        }
    }
}
