class CalenderRunner{

public static void main(String[] a){

Calender calender = new Calender();

Event event = new Event();
event.eventTypes = EventTypes.LEAVES;
event.title = " ";



calender.addEvent(event);
calender.getEvent();
}

}