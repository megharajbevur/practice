class NammaMetro{
	double ticketPrice ;
	int numOfPerson;
	String checking;
	float voltage;
	String name;
	
	
	
	public static void main(String [] arfs){
	System.out.println("Invoking main in metro");
	NammaMetro metro = new NammaMetro();
	System.out.println(metro.ticketPrice);
	System.out.println(metro.numOfPerson);
	System.out.println(metro.checking);
	System.out.println(metro.voltage);
	System.out.println(metro.name);
	
	
	metro.ticketPrice = 25d;
	metro.numOfPerson = 100;
	metro.checking = "person";
	metro.voltage = 120f;
	metro.name= "sumanth";
	System.out.println(  "ticketPrice :" + metro.ticketPrice);
	System.out.println(  "numOfPerson  :"+ metro.numOfPerson);
	System.out.println( "checking :" + metro.checking);
	System.out.println( "voltage  :" + metro.voltage);
	System.out.println( "name  :"+ metro.name);
	
	System.out.println("******************************************");
	 
	NammaMetro metro1 = new NammaMetro();
	System.out.println(metro1.ticketPrice);
	System.out.println(metro1.numOfPerson);
	System.out.println(metro1.checking);
	System.out.println(metro1.voltage);
	System.out.println(metro1.name);
	
	metro1.ticketPrice = 50d;
	metro1.numOfPerson = 200;
	metro1.checking = "person";
	metro1.voltage = 240f;
	metro1.name= "yash";
	
	System.out.println(  "ticketPrice :" + metro1.ticketPrice);
	System.out.println(  "numOfPerson  :"+ metro1.numOfPerson);
	System.out.println( "checking :" + metro1.checking);
	System.out.println( "voltage  :" + metro1.voltage);
	System.out.println( "name  :"+ metro1.name);
	 
	 
	 
	}

}