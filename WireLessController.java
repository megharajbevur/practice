class WireLessController{
	int price;
	String name;
	int warrenty;
	int duration;
	String quality;

  public static void main(String[] info){
	WireLessController wireLessController = new WireLessController();
	
	System.out.println(wireLessController.price);
	System.out.println(wireLessController.name);
	System.out.println(wireLessController.warrenty);
	System.out.println(wireLessController.duration);
	System.out.println(wireLessController.quality);
	wireLessController.price=2500;
	wireLessController.name  ="Remote";
    wireLessController.warrenty=2;
    wireLessController.duration = 3;
    wireLessController.quality="best"; 
	
	System.out.println(wireLessController.price);
	System.out.println(wireLessController.name);
	System.out.println(wireLessController.warrenty);
	System.out.println(wireLessController.duration);
	System.out.println(wireLessController.quality);
	
	System.out.println("************************************************" ); 
	 
	WireLessController wireLessController1 = new WireLessController();
	System.out.println(wireLessController1.price);
	System.out.println(wireLessController1.name);
	System.out.println(wireLessController1.warrenty);
	System.out.println(wireLessController1.duration);
	System.out.println(wireLessController1.quality);
	
	wireLessController1.price=1500;
	wireLessController1.name  =" Mouse";
	wireLessController1.name  =" Mouse";
    wireLessController1.warrenty=90;
    wireLessController1.duration = 5;
    wireLessController1.quality="NO 1"; 
	
	System.out.println(wireLessController1.price);
	System.out.println(wireLessController1.name);
	System.out.println(wireLessController1.warrenty);
	System.out.println(wireLessController1.duration);
	System.out.println(wireLessController1.quality);
}
}
