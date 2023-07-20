class CarromClass{
	
	String name;
	int points;
	String brand;
	int coins;
	int size;
	
	CarromClass (){
		System.out.println("Invoking main in from carrom");
		System.out.println("carrom name in :"+this.name);
		System.out.println(" carrom points in:"+this.points);
		System.out.println(" carrom brand in:"+this.brand);
		System.out.println(" carrom coins in:"+this.coins);
		System.out.println(" carrom size in:"+this.size);
		
		this.name="synco carrom board"; 
		this.points=10;
		this.brand="rabbits board";
        this.coins=12;
        this.size=36;
	 }
	  CarromClass(String name,int points){
		System.out.println("Invoking arguments from carrom");
		this.name=name; 
		this.points=points;
	  }
	  CarromClass(String name,int points,String brand){
		System.out.println("Invoking arguments from carrom");
        this.name=name ; 
		this.points=points;
		this.brand=brand;
	  }
      CarromClass(String name,int points,String brand ,int coins){
		System.out.println("Invoking arguments from carrom");
        this.name=name; 
		this.points=points;
		this.brand=brand;
        this.coins=coins;
	  }
      CarromClass(String name,int points,String brand ,int coins,int size){
		System.out.println("Invoking arguments from carrom");
        this.name=name; 
		this.points=points;
		this.brand=brand;
        this.coins=coins;
        this.size=size;

	
	}
	
}