class Gym{
	int    prize  ;
	String name   ;
	int    workOut;
	String place  ;
	String time   ;

  public static void main(String[] info)
{
	Gym gym=new Gym();
	
	System.out.println(gym.prize  );
	System.out.println(gym.name   );
	System.out.println(gym.workOut);
	System.out.println(gym.place  );
	System.out.println(gym.time   );
	gym.prize=1500;
	gym.name  ="smart fit gym";
	gym.workOut=90;
	gym.place  ="savi bakery";
	gym.time ="6-8"; 
	
	System.out.println(gym.prize  );
	System.out.println(gym.name   );
	System.out.println(gym.workOut);
	System.out.println(gym.place  );
	System.out.println(gym.time   );
	
	
	System.out.println("****************************************" );
	
	Gym gym1=new Gym();
	System.out.println(gym1.prize  );
	System.out.println(gym1.name   );
	System.out.println(gym1.workOut);
	System.out.println(gym1.place  );
	System.out.println(gym1.time   );
	gym1.prize=6000;
	gym1.name  ="fit gym";
	gym1.workOut= 120;
	gym1.place  ="basavanagudi";
	gym1.time ="7-8"; 
	
	System.out.println(gym1.prize  );
	System.out.println(gym1.name   );
	System.out.println(gym1.workOut);
	System.out.println(gym1.place  );
	System.out.println(gym1.time   );
	

	
	
}

}