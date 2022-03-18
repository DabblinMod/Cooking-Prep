package pasta;

public class Ramen extends Noodle{
	Ramen() {
		super(32.0, 0.3, "flat", "wheat flour");
		    
	}
//	  public double getLength() {
//		  return this.lengthInCentimeters;
//	  }
//	  public double getWidth() {
//		  return this.widthInCentimeters;
//	  }
	@Override
	public String getCookPrep() {
		return "Boil ramen for 5 minutes in broth, then add meat, mushrooms, egg, and vegetables.";
		
	}
}
