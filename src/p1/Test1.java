package p1;

public class Test1 {

	void m1() {
		try {
			System.out.println(1);
			int x = 10;
			int y = 3;
			try {
				System.out.println("Hi");
				int ans = x / (y - 3);
				System.out.println(ans);
			} catch (ArithmeticException ne) {
				System.out.println("In inner catch");
			}
			System.out.println(2);
		} catch (ArithmeticException a) {
			System.out.println(3);
		}
		System.out.println(4);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Test1().m1();
		System.out.println("end");
		System.out.println("                  ");
		System.out.println("endddd");
	}

}
