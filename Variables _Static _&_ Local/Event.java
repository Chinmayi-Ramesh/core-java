class Event {

    static String eventName = "Annual Fest";
    static String date = "10-09-2024";
    static String venue = "Auditorium";
    static String coordinator = "Prof. Meena";
    static int participants = 300;
    static boolean isCultural = true;
    static double budget = 200000;
    static String sponsor = "ABC Pvt Ltd";
    static boolean isOpen = true;

    public static void main(String[] args) {

        String eventName = "Tech Symposium";
        String date = "15-10-2024";
        String venue = "Seminar Hall";
        String coordinator = "Prof. Ravi";
        int participants = 150;
        boolean isCultural = false;
        double budget = 100000;
        String sponsor = "XYZ Ltd";
        boolean isOpen = true;

        System.out.println("Event Name is " + eventName);
        System.out.println("Event Name (static) is " + Event.eventName);

        System.out.println("Date is " + date);
        System.out.println("Date (static) is " + Event.date);

        System.out.println("Venue is " + venue);
        System.out.println("Venue (static) is " + Event.venue);

        System.out.println("Coordinator is " + coordinator);
        System.out.println("Coordinator (static) is " + Event.coordinator);

        System.out.println("Participants are " + participants);
        System.out.println("Participants (static) are " + Event.participants);

        System.out.println("Is Cultural: " + isCultural);
        System.out.println("Is Cultural (static): " + Event.isCultural);

        System.out.println("Budget is " + budget);
        System.out.println("Budget (static) is " + Event.budget);

        System.out.println("Sponsor is " + sponsor);
        System.out.println("Sponsor (static) is " + Event.sponsor);

        System.out.println("Is Open: " + isOpen);
        System.out.println("Is Open (static): " + Event.isOpen);
    }
}
