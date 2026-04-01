class Rain {
    String type;
    double intensity;
    String season;
    boolean heavy;
    int duration;

    Rain() { }

    Rain(String type) {
        this.type = type;
    }

    Rain(String type, double intensity) {
        this.type = type;
        this.intensity = intensity;
    }

    Rain(String type, double intensity, String season) {
        this.type = type;
        this.intensity = intensity;
        this.season = season;
    }

    Rain(String type, double intensity, String season, boolean heavy) {
        this.type = type;
        this.intensity = intensity;
        this.season = season;
        this.heavy = heavy;
    }

    Rain(String type, double intensity, String season, boolean heavy, int duration) {
        this.type = type;
        this.intensity = intensity;
        this.season = season;
        this.heavy = heavy;
        this.duration = duration;
    }

    void display() {
        System.out.println("Type:" + type);
		System.out.println("Intensity:" + intensity);
		System.out.println("Season:" + season);
		System.out.println("heavy:" + heavy);
		System.out.println("duration:" + duration);
		
    }
}