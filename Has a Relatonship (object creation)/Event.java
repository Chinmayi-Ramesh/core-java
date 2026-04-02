class Event{

EventTypes eventTypes;
String title;
String startDate;
String enddate;
String username;
boolean isAllDayEvent;

public void getEventDetails(){

System.out.println("Event types is :" +eventTypes);
System.out.println("Event title is :" +title);
System.out.println("Event startDate is :" +startDate);
System.out.println("Event enddate is :" +enddate);
System.out.println("Event username is :" +username);
System.out.println("Event isAllDayEvent is :" +isAllDayEvent);
}

}