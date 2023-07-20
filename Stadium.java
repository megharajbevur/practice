class Stadium{
  String name;
  int players;
  String game ;
  int seat;
  String place;
 
 
 public static void main(String []args)
 {
    System.out.println(" invoking main in StadiumUser");
 
    Stadium stdium= new Stadium();
	System.out.println(stdium.name); //null
    System.out.println(stdium.players); //null
	System.out.println(stdium.game); //null
    System.out.println(stdium.seat ); //0
    System.out.println(stdium.place); //null
  
    
	stdium.name="M Chinnaswami Stadium";
    stdium.players=11;
    stdium.game = "cricket";
    stdium.seat=200;
    stdium.place= "bengloru";
  
    System.out.println(stdium.name); //null
    System.out.println(stdium.players); //null
    System.out.println(stdium.game); //null
    System.out.println(stdium.seat ); //0
    System.out.println(stdium.place); //null
	
	System.out.println(" ***************************************************");
  
    Stadium stdium1= new Stadium();
    System.out.println(stdium1.name); 
    System.out.println(stdium1.players); 
    System.out.println(stdium1.game); 
    System.out.println(stdium1.seat ); 
    System.out.println(stdium1.place); 
  
   
    stdium1.name="Eden gardens";
    stdium1.players=11;
    stdium1.game = "cricket";
    stdium1.seat=150;
    stdium1.place = "kolkatha";
  
    System.out.println(stdium1.name); 
    System.out.println(stdium1.players); 
    System.out.println(stdium1.game); 
    System.out.println(stdium1.seat ); 
    System.out.println(stdium1.place); 
  
  
  
   
  
 }
   
 
    
}