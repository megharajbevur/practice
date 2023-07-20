class CarromKiller
{
	public static void main(String[] args){
		
     	System.out.println("Invoking main in carromKiller");
	    CarromClass carromClass=new CarromClass();
		System.out.println(" carrom  name in main method:"+carromClass.name);
		System.out.println(" carrom points in main method:"+carromClass.points);
		System.out.println(" carrom brand in main method:"+carromClass.brand);
		System.out.println(" carrom coins in main method:"+carromClass.coins);
		System.out.println(" carrom size in main method:"+carromClass.size);
		
	    System.out.println("***********");
	
        CarromClass carromClass1=new CarromClass( "synco carrom board",12);
        System.out.println(" carrom1  name in main method:"+carromClass1.name);
		System.out.println(" carrom1 points in main method:"+carromClass1.points);
		
    	System.out.println("***********");
	
	    CarromClass carromClass2=new CarromClass( "carrom board",15,"Synco");
        System.out.println(" carrom2  name in main method:"+carromClass2.name);
		System.out.println(" carrom2 points in main method:"+carromClass2.points);
		System.out.println(" carrom2 brand in main method:"+carromClass2.brand);
		
	   	System.out.println("***********");
		CarromClass carromClass3=new CarromClass( "carrom board1",10,"synco3",12);
        System.out.println(" carrom3  name in main method:"+carromClass3.name);
		System.out.println(" carrom3 points in main method:"+carromClass3.points);
		System.out.println(" carrom3 brand in main method:"+carromClass3.brand);
		System.out.println(" carrom3 coins in main method:"+carromClass3.coins);
	  
	    System.out.println("***********");
		
		CarromClass carromClass4=new CarromClass( "carrom board2",60,"synco4",9,36);
        System.out.println(" carrom4  name in main method:"+carromClass4.name);
		System.out.println(" carrom4 points in main method:"+carromClass4.points);
		System.out.println(" carrom4 brand in main method:"+carromClass4.brand);
		System.out.println(" carrom4 coins in main method:"+carromClass4.coins);
	  	System.out.println(" carrom4 sze in main method:"+carromClass4.coins);
	}
}

