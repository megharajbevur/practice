class Drone{
	static double getDistanceByFlight(String operator, String event){
		
		System.out.println("Running in drones");
		if (operator!=null){
		
			System.out.println("Operator name is: ");
			
			if(operator== "Megharaj"){
				System.out.println("name is  :" +operator);
				return 1;
			}
			if(event == "prewedding"){
				System.out.println("name is  :" +event);
				return 5000;
			}	
		}
		else{
			System.out.println("operator name is in-vaild");
			return 5;	
		}
		return 2;
	}
	
	static double getPriceByFlight(String eventName){
		System.out.println("Running in drones");
		if (eventName != null){
			if (eventName == "Birthday"){
				System.out.println("Event name is : " + eventName);
			}
		}
		else{
			System.out.println("eventName is in-vaild");
		}
		return 1000000;
		
	}
	
	static int getDiscountByFlight(String eventName, String refPerson){
		System.out.println("Running in drones");
		if(eventName !=null){
			if(eventName== "Marrige"){
				System.out.println("Event name is : "+ eventName);
			}
			if(refPerson == "Sumanth"){
				System.out.println("refPerson is : "+ refPerson);
			}
		}
		else{
			System.out.println("eventName and refPerson are in-vaild");
		}
		return 545545;
		
	}
	
	public static void main (String [] ags){
		Drone.getDistanceByFlight("Megharaj" , "prewedding");
		Drone.getPriceByFlight("Birthday");
		Drone.getDiscountByFlight("Marrige", "Sumanth");
	}
	
}