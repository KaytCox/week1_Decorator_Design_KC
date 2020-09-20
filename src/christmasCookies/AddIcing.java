package christmasCookies;

public class AddIcing extends assembleCookie {

	public AddIcing(baking c) {
		super(c);
	}

	public void assemble(){
		super.assemble();
		System.out.print(" Now add icing to your cookie.");
	}
}