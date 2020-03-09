package Adapter_pattern;

public class Adpter_Driver {
	public Adpter_Driver() {
		System.out.println();
		System.out.println("Adapter Pattern");
		Sparrow sparrow = new Sparrow(); 
	    ToyDuck toyDuck = new PlasticToyDuck(); 
	    ToyAdapter ToyAdapter =  new ToyAdapter(sparrow); 
	    System.out.println("ToyDuck..."); 
	    toyDuck.squeak(); 
	    System.out.println("BirdAdapter..."); 
	    ToyAdapter.squeak(); 
	    System.out.println("Sparrow..."); 
	    sparrow.fly(); 
	    sparrow.makeSound(); 
	}
}