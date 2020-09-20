package christmasCookies;

public class AddSprinkles extends assembleCookie {

	public AddSprinkles(baking c) {
		super(c);
	}

	public void assemble(){
		super.assemble();
		System.out.print(" Last we will add sprinkles to your cookie.");
	}
}