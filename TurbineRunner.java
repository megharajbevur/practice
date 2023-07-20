class TurbineRunner{
	public static void main(String[] info)
	{
		Turbine turbine=new Turbine();
		Turbine turbine1=new Turbine("123","blue",4);
		System.out.println("*************************************");
		System.out.println("The cost of the Turbine="+turbine.cost);
		System.out.println("The colour of the Turbine="+turbine.colour);
		System.out.println("The colour of the Turbine="+turbine.blades);
		System.out.println("***************************************");
		System.out.println("The cost of the Turbine="+turbine1.cost);
		System.out.println("The colour of the Turbine="+turbine1.colour);
		System.out.println("The colour of the Turbine="+turbine1.blades);

	
}
}