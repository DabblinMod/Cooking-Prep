package pasta;

public class Pho extends Noodle{
	Pho() {
	    
	    super(30.0, 0.64, "flat", "rice flour");
	    
	  }
//	  public double getLength() {
//		  return this.lengthInCentimeters;
//	  }
//	  public double getWidth() {
//		  return this.widthInCentimeters;
//	  }
	  
	  @Override
	  public String getCookPrep() {
	    
	    return "Soak pho for 1 hour, then boil for 1 minute in broth. Then garnish with cilantro and jalapeno.";
	    
	  }
}
