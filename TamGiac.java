package basic.dev;

public class TamGiac  extends Shape {
	private double  a;
	private double  b;
	private double  c;
	public TamGiac(double a, double b, double c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}
	public double chuVi() {
		// TODO Auto-generated method stub
		return a + b + c;
	}

	public double dienTich() {
		// TODO Auto-generated method stub
		return (a + b + c) / 2;
	}

	@Override
	public String toString() {
		return "Triangle [a=" + a + ", b=" + b + ", c=" + c + "]";
	}
}
