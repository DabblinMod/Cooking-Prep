package pasta;

public class Noodle {
	 protected double lengthInCentimeters;
	  protected double widthInCentimeters;
	  protected String shape;
	  protected String ingredients;
	  protected String texture = "brittle";
	  
	  Noodle(double lenInCent, double wthInCent, String shp, String ingr) {
	    
	    this.lengthInCentimeters = lenInCent;
	    this.widthInCentimeters = wthInCent;
	    this.shape = shp;
	    this.ingredients = ingr;
	    
	  }
	  
	  public double getLength() {
		  return this.lengthInCentimeters;
	  }
	  public double getWidth() {
		  return this.widthInCentimeters;
	  }
	  public String getCookPrep() {
	    
	    return "Boil noodle for 7 minutes and add sauce.";
	    
	  }
	  
	  public static void main(String[] args) {
	    //Noodle is the superclass to Spaghet, Ramen, Pho
	    //each of these threee classes extend to Noodle individually

	   // if I say Noodle food1=new Spaghetti()
		  //then I've created a spaghetti object that is a noodle object also. 
		  //This only works because Spaghetti extends to Noodle. Otherwise you'd get an error.
	    Noodle food1, food2, food3;
	    food1= new Spaghetti();
	    food2= new Ramen();
	    food3= new Pho();
	    System.out.println(food1.getCookPrep());
	    
	    System.out.println("Width of spaghett is: " +food1.getWidth());
	    
	    System.out.println(food2.getCookPrep());
	    System.out.println(food3.getCookPrep());
	  }
}
