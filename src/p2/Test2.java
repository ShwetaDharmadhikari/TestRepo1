package p2;

public class Test2 {
	
	void m1(String str) {
		try {
			System.out.println(str);
			str=str.substring(9);
			System.out.println(str.charAt(6));
			
		}catch(StringIndexOutOfBoundsException ab) {
			System.out.println("Hi");
			try {
				System.out.println(str.charAt(str.length()));
			}catch(Exception e) {
				System.out.println("In exception");
			}
			System.out.println(10);
		}finally {
			try {
			int x=10/(str.length()-4);
			System.out.println(x);
			}catch(NullPointerException ne) {
				System.out.println(15);
			}
			
		}
		System.out.println(4);
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Test2().m1("technocredits");
	}

}
