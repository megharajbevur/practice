class Rocket{
	String colour;
	int fuel;
	float cost;
Rocket()
{
	System.out.println("Running the no argument value");
	System.out.println("The colour is="           +this.colour);
	System.out.println("The fuel used is="        +this.fuel  );
	System.out.println("The cost of the fuel is=" +this.cost  );
	this.colour="yellow";
	this.fuel  =105;
    this.cost  =81912f;
}
Rocket(String waste,int weight)
{
	System.out.println("Running the argument program");
	this.colour=waste;
	this.fuel=weight;
}
}