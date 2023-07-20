class Badminton{
  String name;
  int players;
  String game ;
  int seat;
  String place;
    
public static void main(String []args)
 {
	System.out.println(" invoking main in BadmintonKiller");
 
    Badminton badminton= new Badminton();
	System.out.println(badminton.name); //null
    System.out.println(badminton.players); //null
	System.out.println(badminton.game); //null
    System.out.println(badminton.seat ); //0
    System.out.println(badminton.place); //null
  
  
	badminton.name="PV sindhu";
    badminton.players=2;
    badminton.game = " Badminton ";
	badminton.seat=200;
    badminton.place = "bengalore";
  
	System.out.println(badminton.name); 
    System.out.println(badminton.players); 
	System.out.println(badminton.game); 
    System.out.println(badminton.seat ); 
    System.out.println(badminton.place); 
	System.out.println(" *****************************************"); 
	Badminton badminton1= new Badminton();
	System.out.println(badminton1.name); //null
    System.out.println(badminton1.players); //null
	System.out.println(badminton1.game); //null
    System.out.println(badminton1.seat ); //0
    System.out.println(badminton1.place); //null
  
    
	badminton1.name="srikanth kidambi";
    badminton1.players=2;
    badminton1.game = "Badminton";
	badminton1.seat=150;
    badminton1.place = "kolkatha";
  
	System.out.println(badminton1.name); 
    System.out.println(badminton1.players); 
	System.out.println(badminton1.game); 
    System.out.println(badminton1.seat ); 
    System.out.println(badminton1.place); 
  
 
 }
}