package duotai;

public class Main {
	public static void main (String[] args) {
		GrandFather a1 = new GrandFather();  
		GrandFather a2 = new Father();
		Father b = new Father();  
		Son c = new Son();
		Daughter d = new Daughter();
		Father e = new Son();

		System.out.println(a1.show(b)); 
		System.out.println(a1.show(c)); 
		System.out.println(a1.show(d));
		System.out.println(a1.show(a1));
		System.out.println("*************");
		System.out.println(a2.show(b)); 		
		System.out.println(a2.show(c));
		System.out.println(a2.show(d));
		System.out.println(a2.show(a1));
		System.out.println("*************");
		System.out.println(b.show(b));
		System.out.println(b.show(c));
		System.out.println(b.show(d));
		System.out.println("*************");
		System.out.println(e.show(a1));
		System.out.println(e.show(d));
	}
}
