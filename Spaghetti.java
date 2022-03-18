package pasta;

public class Spaghetti extends Noodle{
	
	Spaghetti() {//default constructor
	    
	  	super(30.0, 0.2, "round", "semolina flour");
	    //length, width, shape, ingredients are passed to the parent class to be assigned for the Child.
	  }
	 
//	  public double getLength() {
//		  return this.lengthInCentimeters;
//	  }
//	  public double getWidth() {
//		  return this.widthInCentimeters;
//	  }
	  public String getCookPrep() {
	    
	    return "Boil spaghetti for 8 - 12 minutes and add sauce, cheese, or oil and garlic.";
	    
	  }
	  
}
