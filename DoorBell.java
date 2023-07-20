class DoorBell{
	String item;
	float price;
	String song;
	int size;
	String brand;
	int frequency;
	String typeOfBell;
	
	DoorBell(){
		System.out.println("item is" + this .item);
		System.out.println("item is" + this.price);
		System.out.println("item is" + this .song);
		System.out.println("item is" + this .size);
		System.out.println("item is" + this.brand);
		System.out.println("item is" + this.frequency);
		System.out.println("item is" + this.typeOfBell);
	    System.out.println("**********************************");
		
		
		this.item= "Brand";
		this.price= 444f;
		
		
		
	
	}
	
	public static void main(String [] asd){
		DoorBell doorbell = new DoorBell( );
		
		System.out.println("item is" + doorbell.item);
		System.out.println("item is" + doorbell.price);
		System.out.println("item is" + doorbell.song);
		System.out.println("item is" + doorbell.size);
		System.out.println("item is" + doorbell.brand);
		System.out.println("item is" + doorbell.frequency);
		System.out.println("item is" + doorbell.typeOfBell);
		
	}
	
	
	
}