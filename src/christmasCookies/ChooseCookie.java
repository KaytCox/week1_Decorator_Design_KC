package christmasCookies;

public class ChooseCookie {

	public static void main(String[] args) {
		baking AddIcing = new AddIcing(new cookieShape());
		AddIcing.assemble();
		System.out.println("\n*****");
		
		baking icingAddSprinkles = new AddSprinkles(new AddIcing(new cookieShape()));
		icingAddSprinkles.assemble();
	}

}