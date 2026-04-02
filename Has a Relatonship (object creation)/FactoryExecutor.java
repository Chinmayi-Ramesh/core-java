class FactoryExecutor {
    public static void main(String[] args) {

        
        Factory f1 = new Factory();
        f1.factoryId = 1;
        f1.name = "Factory1";
        f1.location = "Bangalore";
        f1.isOpen = true;

        Machine m1 = new Machine();
        m1.machineId = 101;
        m1.type = "Cutter";
        m1.capacity = 50;
        m1.isWorking = true;

        f1.machine = m1;

        
        Factory f2 = new Factory();
        f2.factoryId = 2;
        f2.name = "Factory2";
        f2.location = "Mysore";
        f2.isOpen = true;

        Machine m2 = new Machine();
        m2.machineId = 102;
        m2.type = "Drill";
        m2.capacity = 40;
        m2.isWorking = true;

        f2.machine = m2;

        
        Factory f3 = new Factory();
        f3.factoryId = 3;
        f3.name = "Factory3";
        f3.location = "Hubli";
        f3.isOpen = false;

        Machine m3 = new Machine();
        m3.machineId = 103;
        m3.type = "Lathe";
        m3.capacity = 30;
        m3.isWorking = false;

        f3.machine = m3;

        
        Factory f4 = new Factory();
        f4.factoryId = 4;
        f4.name = "Factory4";
        f4.location = "Tumkur";
        f4.isOpen = true;

        Machine m4 = new Machine();
        m4.machineId = 104;
        m4.type = "Press";
        m4.capacity = 60;
        m4.isWorking = true;

        f4.machine = m4;

        
        Factory f5 = new Factory();
        f5.factoryId = 5;
        f5.name = "Factory5";
        f5.location = "Mangalore";
        f5.isOpen = true;

        Machine m5 = new Machine();
        m5.machineId = 105;
        m5.type = "Grinder";
        m5.capacity = 35;
        m5.isWorking = true;

        f5.machine = m5;

        
        Factory f6 = new Factory();
        f6.factoryId = 6;
        f6.name = "Factory6";
        f6.location = "Udupi";
        f6.isOpen = false;

        Machine m6 = new Machine();
        m6.machineId = 106;
        m6.type = "Welder";
        m6.capacity = 45;
        m6.isWorking = false;

        f6.machine = m6;

        
        Factory f7 = new Factory();
        f7.factoryId = 7;
        f7.name = "Factory7";
        f7.location = "Belagavi";
        f7.isOpen = true;

        Machine m7 = new Machine();
        m7.machineId = 107;
        m7.type = "Assembler";
        m7.capacity = 70;
        m7.isWorking = true;

        f7.machine = m7;

        
        Factory f8 = new Factory();
        f8.factoryId = 8;
        f8.name = "Factory8";
        f8.location = "Dharwad";
        f8.isOpen = true;

        Machine m8 = new Machine();
        m8.machineId = 108;
        m8.type = "Robot";
        m8.capacity = 80;
        m8.isWorking = true;

        f8.machine = m8;

        
        Factory f9 = new Factory();
        f9.factoryId = 9;
        f9.name = "Factory9";
        f9.location = "Shimoga";
        f9.isOpen = false;

        Machine m9 = new Machine();
        m9.machineId = 109;
        m9.type = "Cutter";
        m9.capacity = 20;
        m9.isWorking = false;

        f9.machine = m9;

        
        Factory f10 = new Factory();
        f10.factoryId = 10;
        f10.name = "Factory10";
        f10.location = "Chitradurga";
        f10.isOpen = true;

        Machine m10 = new Machine();
        m10.machineId = 110;
        m10.type = "Press";
        m10.capacity = 55;
        m10.isWorking = true;

        f10.machine = m10;

        
        Factory f11 = new Factory();
        f11.factoryId = 11;
        f11.name = "Factory11";
        f11.location = "Hassan";
        f11.isOpen = true;

        Machine m11 = new Machine();
        m11.machineId = 111;
        m11.type = "Drill";
        m11.capacity = 65;
        m11.isWorking = true;

        f11.machine = m11;

        
        Factory f12 = new Factory();
        f12.factoryId = 12;
        f12.name = "Factory12";
        f12.location = "Mandya";
        f12.isOpen = false;

        Machine m12 = new Machine();
        m12.machineId = 112;
        m12.type = "Lathe";
        m12.capacity = 25;
        m12.isWorking = false;

        f12.machine = m12;

        
        Factory f13 = new Factory();
        f13.factoryId = 13;
        f13.name = "Factory13";
        f13.location = "Raichur";
        f13.isOpen = true;

        Machine m13 = new Machine();
        m13.machineId = 113;
        m13.type = "Welder";
        m13.capacity = 45;
        m13.isWorking = true;

        f13.machine = m13;

        
        Factory f14 = new Factory();
        f14.factoryId = 14;
        f14.name = "Factory14";
        f14.location = "Bidar";
        f14.isOpen = true;

        Machine m14 = new Machine();
        m14.machineId = 114;
        m14.type = "Grinder";
        m14.capacity = 38;
        m14.isWorking = true;

        f14.machine = m14;

        
        Factory f15 = new Factory();
        f15.factoryId = 15;
        f15.name = "Factory15";
        f15.location = "Gadag";
        f15.isOpen = false;

        Machine m15 = new Machine();
        m15.machineId = 115;
        m15.type = "Cutter";
        m15.capacity = 33;
        m15.isWorking = false;

        f15.machine = m15;

        
        Factory f16 = new Factory();
        f16.factoryId = 16;
        f16.name = "Factory16";
        f16.location = "Bagalkot";
        f16.isOpen = true;

        Machine m16 = new Machine();
        m16.machineId = 116;
        m16.type = "Press";
        m16.capacity = 60;
        m16.isWorking = true;

        f16.machine = m16;

        
        Factory f17 = new Factory();
        f17.factoryId = 17;
        f17.name = "Factory17";
        f17.location = "Kolar";
        f17.isOpen = true;

        Machine m17 = new Machine();
        m17.machineId = 117;
        m17.type = "Robot";
        m17.capacity = 85;
        m17.isWorking = true;

        f17.machine = m17;

        
        Factory f18 = new Factory();
        f18.factoryId = 18;
        f18.name = "Factory18";
        f18.location = "Chikmagalur";
        f18.isOpen = false;

        Machine m18 = new Machine();
        m18.machineId = 118;
        m18.type = "Assembler";
        m18.capacity = 75;
        m18.isWorking = false;

        f18.machine = m18;

        
        Factory f19 = new Factory();
        f19.factoryId = 19;
        f19.name = "Factory19";
        f19.location = "Karwar";
        f19.isOpen = true;

        Machine m19 = new Machine();
        m19.machineId = 119;
        m19.type = "Drill";
        m19.capacity = 48;
        m19.isWorking = true;

        f19.machine = m19;

        
        Factory f20 = new Factory();
        f20.factoryId = 20;
        f20.name = "Factory20";
        f20.location = "Bellary";
        f20.isOpen = true;

        Machine m20 = new Machine();
        m20.machineId = 120;
        m20.type = "Lathe";
        m20.capacity = 42;
        m20.isWorking = true;

        f20.machine = m20;


        
        f1.getFactoryDetails();
        f2.getFactoryDetails();
        f3.getFactoryDetails();
        f4.getFactoryDetails();
        f5.getFactoryDetails();
        f6.getFactoryDetails();
        f7.getFactoryDetails();
        f8.getFactoryDetails();
        f9.getFactoryDetails();
        f10.getFactoryDetails();
        f11.getFactoryDetails();
        f12.getFactoryDetails();
        f13.getFactoryDetails();
        f14.getFactoryDetails();
        f15.getFactoryDetails();
        f16.getFactoryDetails();
        f17.getFactoryDetails();
        f18.getFactoryDetails();
        f19.getFactoryDetails();
        f20.getFactoryDetails();
    }
}