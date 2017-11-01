package duotai;

public class Father extends GrandFather{
	public String show(Father obj) {
		return ("Father love mother");
	}
	
	public String show(PrivateSon obj) {
		return ("Father love private-son");
	}
	
	@Override
	public String show(GrandFather obj) {
		return ("Father respect grandFather");
	}
}
