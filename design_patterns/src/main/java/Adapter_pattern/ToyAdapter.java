package Adapter_pattern;

public class ToyAdapter {
		Bird bird; 
	    public ToyAdapter(Bird bird) 
	    {  
	        this.bird = bird; 
	    } 
	  
	    public void squeak() 
	    { 
	        bird.makeSound(); 
	    }
}