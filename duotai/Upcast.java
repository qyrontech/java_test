package duotai;

public class Upcast {

	public static void main (String[] args) {
		GrandFather a1 = new GrandFather();  
//		GrandFather a2 = new GrandFather();
		GrandFather a2 = new Father();//父类指向子类对象
		if (a2 instanceof Father) {
			Father father = (Father) a2;
			System.out.println(father.show(a1));
		} else {
			System.out.println("不是对象");
		}
	}	
}
