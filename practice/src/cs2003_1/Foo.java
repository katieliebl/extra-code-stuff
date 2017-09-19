package cs2003_1;

public class Foo {
	public double crazyCalc(int x, int y) {
		x *=  y=87 * x++ + ++x;
		return (double) y % x;
	}

	public static void main(String... args) {
		// TODO Auto-generated method stub
		Foo foo = new Foo();
		int a = 73, b = 6;
		double c;
		c = foo.crazyCalc(b, a);
		System.out.printf("%2d %3d %3.5f ",a, b, c);
	}

}
