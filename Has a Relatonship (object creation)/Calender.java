class Calender{

Event event;

boolean addEvent(Event event){
boolean isEventAdded = false;
if (event != null){
this.event = event;
}
else{
System.out.println("invalid event");
}

return isEventAdded;

}

public void getEvent(){
event.getEventDetails();
}

}