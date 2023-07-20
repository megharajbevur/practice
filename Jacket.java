class Jacket{
	String color;
	int size;
	String brand;
	String type;
	float price;

 public static void main(String []args)
 {
	System.out.println(" invoking main in jacketKiller");
 
    Jacket jacket = new Jacket();
    System.out.println(jacket.color); //null
    System.out.println(jacket.size ); //0
    System.out.println(jacket.brand); //null
    System.out.println(jacket.type);//null
	System.out.println(jacket.price);//null
  
    
  
    jacket.color = "pink";
    jacket.size=36;
    jacket.brand = "peter";
	jacket.type = "Water proof";
	jacket.price = 1500f;
  
    System.out.println(jacket.color); 
    System.out.println(jacket.size ); 
    System.out.println( jacket.brand); 
    System.out.println( jacket.type); 
    System.out.println( jacket.price); 
	
	System.out.println("***************************************")

    Jacket jacket1 = new Jacket();
    System.out.println(jacket1.color); //null
    System.out.println(jacket1.size ); //0
    System.out.println(jacket1.brand); //null
	System.out.println(jacket1.type);//null
	System.out.println(jacket1.price);//null
  
    jacket1.color = "black";
    jacket1.size=34;
    jacket1.brand = "zudio";
	jacket1.type = "Without Waterproof";
    jacket1.price  = 1000f;
	
	
	
    System.out.println( jacket1.color); 
    System.out.println(jacket1.size ); 
    System.out.println(jacket1.brand); 
    System.out.println(jacket1.type); 
	System.out.println(jacket1.price); 
 }
}