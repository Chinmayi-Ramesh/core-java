class FanExecutor{
	public static void main(String[] args){
		
		Fan fan = new Fan ();
		
		fan.fanId = 1;
		fan.brand= "Bajaj";
		fan.price= 2500;
		fan.hasRemote= true;
		
		Fan fan1 = new Fan ();
		
		fan1.fanId = 1;
		fan1.brand= "Bajaj";
		fan1.price= 2500;
		fan1.hasRemote= true;
		
		Fan fan2 = new Fan();
        fan2.fanId = 2;
        fan2.brand = "Usha";
        fan2.price = 2600;
        fan2.hasRemote = false;
		
		Fan fan3 = new Fan();
        fan3.fanId = 3;
        fan3.brand = "Orient";
        fan3.price = 2700;
        fan3.hasRemote = true;
		
		Fan fan4 = new Fan();
        fan4.fanId = 4;
        fan4.brand = "Havells";
        fan4.price = 2800;
        fan4.hasRemote = false;
		
		Fan fan5 = new Fan();
        fan5.fanId = 4;
        fan5.brand = "Havells";
        fan5.price = 2800;
        fan5.hasRemote = false;
		
		Fan fan6 = new Fan();
        fan6.fanId = 4;
        fan6.brand = "Havells";
        fan6.price = 2800;
        fan6.hasRemote = false;
		
		
		
		Capacitor capacitor = new Capacitor();
		
		capacitor.capacitorId = 1 ;
		capacitor.brand = "motor";
		capacitor.price = 1000;
		capacitor.hasSpeed = false ;
		
		Capacitor capacitor1 = new Capacitor();
        capacitor1.capacitorId = 1;
        capacitor1.brand = "Motor1";
        capacitor1.price = 1000;
        capacitor1.hasSpeed = true;
		
		Capacitor capacitor2 = new Capacitor();
        capacitor2.capacitorId = 102;
        capacitor2.brand = "Motor2";
        capacitor2.price = 600;
        capacitor2.hasSpeed = false;
        
		
		Capacitor capacitor3 = new Capacitor();
        capacitor3.capacitorId = 103;
        capacitor3.brand = "Motor3";
        capacitor3.price = 700;
        capacitor3.hasSpeed = true;
        
		
		Capacitor capacitor4 = new Capacitor();
        capacitor4.capacitorId = 104;
        capacitor4.brand = "Motor4";
        capacitor4.price = 800;
        capacitor4.hasSpeed = false;
        
		
		Capacitor capacitor5 = new Capacitor();
        capacitor5.capacitorId = 105;
        capacitor5.brand = "Motor5";
        capacitor5.price = 900;
        capacitor5.hasSpeed = true;
        
		
		Capacitor capacitor6 = new Capacitor();
        capacitor6.capacitorId = 105;
        capacitor6.brand = "Motor5";
        capacitor6.price = 900;
        capacitor6.hasSpeed = true;
        

		
		
		
		fan.capacitor = capacitor;
		fan1.capacitor = capacitor1;
		fan2.capacitor = capacitor2;
		fan3.capacitor = capacitor3;
		fan4.capacitor = capacitor4;
		fan5.capacitor = capacitor5;
		fan6.capacitor = capacitor6;
		
		fan.getFanDetails();
		fan1.getFanDetails();
		fan2.getFanDetails();
		fan3.getFanDetails();
		fan4.getFanDetails();
		fan5.getFanDetails();
		fan6.getFanDetails();
		
		
	}
}