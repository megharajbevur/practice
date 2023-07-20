class PowerBank{
	int    prize          ;
	String name           ;
	int    batteryCapacity;
	String brand          ;
	String time           ;

		public static void main(String[] info)

{
		PowerBank powerBank=new PowerBank();
 
		System.out.println(powerBank.prize  );
		System.out.println(powerBank.name   );
		System.out.println(powerBank. batteryCapacity);
		System.out.println(powerBank.brand   );
		System.out.println(powerBank.time   );
		powerBank.prize=1500;
		powerBank.name  ="lenova";
		powerBank.batteryCapacity=5000;
		powerBank.brand  ="leno";
		powerBank.time ="5-8"; 
 
		System.out.println(powerBank.prize);
		System.out.println(powerBank.name);
		System.out.println(powerBank. batteryCapacity);
		System.out.println(powerBank.brand);
		System.out.println(powerBank.time);
 
		System.out.println("******************************************************");
 
 
		PowerBank powerBank1=new PowerBank();
		System.out.println(powerBank1.prize);
		System.out.println(powerBank1.name   );
		System.out.println(powerBank1. batteryCapacity);
		System.out.println(powerBank1.brand);
		System.out.println(powerBank1.time);
	powerBank.prize=2000;
	powerBank1.name  ="realme";
	powerBank1.batteryCapacity=1000;
	powerBank1.brand  ="real";
    powerBank1.time ="6-8"; 

		System.out.println(powerBank1.prize  );
	System.out.println(powerBank1.name   );
	System.out.println(powerBank1. batteryCapacity);
	System.out.println(powerBank1.brand   );
	System.out.println(powerBank1.time   );
 
 
 
	}
}
