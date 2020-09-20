package christmasCookies;

public class assembleCookie implements baking {

	protected baking cookie;
	
	public assembleCookie(baking c){
		this.cookie=c;
	}
	
	public void assemble() {
		this.cookie.assemble();
	}

}