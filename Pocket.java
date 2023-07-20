class Pocket{
	String brand;
	String colour;
	int size;
	double price;
	String shape;
	
	
public static void main (String [] args){
	System.out.println("Invoking main in pocket");
	Pocket Pocket= new Pocket();
	System.out.println(Pocket.size);
	System.out.println(Pocket.brand);
	System.out.println(Pocket.colour);
	System.out.println(Pocket.price);
	System.out.println(Pocket.shape);
	Pocket.brand= "Puma";
	Pocket.colour = "Black";
	Pocket.size = 30;
	Pocket.price = 500;
	Pocket.shape= "XL";
	
	System.out.println("The brand name is :"+ Pocket.brand );
	System.out.println("The colour name is :"+ Pocket.colour);

	System.out.println("The size name is :"+ Pocket.size);

	System.out.println("The price name is :"+ Pocket.price);
	
	System.out.println("The shape name is :"+Pocket.shape );
	
}	
}