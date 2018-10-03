import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fraction {
	public void start(int sel, double[][] masXY, int len){
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		Circle circle = new Circle();
		
		if(sel == 1){firstView(read, circle, masXY, len);}
		else if(sel == 2){secondView(read, circle, masXY, len);}
		else if(sel == 3){thirdView(read, circle, masXY, len);}
		else if(sel == 4){fourthView(read, circle, masXY, len);}
	}
	
	private void firstView(BufferedReader read, Circle c, double[][] masXY, int len){
		double A = 0;
		double a = 0;
		System.out.println();
		System.out.println("A/(x-a): ");
		System.out.print("¬ведите A: ");
		A = input(A, read);
		System.out.print("¬ведите a: ");
		a = input(a, read);
		System.out.println(A + "/(x-" + a + ")");
		getY(A, a, read, c, masXY, len);
	}
	
	private void secondView(BufferedReader read, Circle c, double[][] masXY, int len){
		double A = 0;
		double a = 0;
		double n = 0;
		System.out.println();
		System.out.println("A/(x-a)^n");
		System.out.print("¬ведите A: ");
		A = input(A, read);
		System.out.print("¬ведите a: ");
		a = input(a, read);
		System.out.print("¬ведите n: ");
		n = input(n, read);
		System.out.println(A + "/(x-" + a + ")^" + n);
		getY(A, a, n, read, c, masXY, len);
	}
	
	private void thirdView(BufferedReader read, Circle c, double[][] masXY, int len){
		double M = 0;
		double N = 0;
		double p = 0;
		double q = 0;
		System.out.println();
		System.out.println("(M*x + N)/(x^2 + px + q)");
		System.out.print("¬ведите M: ");
		M = input(M, read);
		System.out.print("¬ведите N: ");
		N = input(N, read);
		System.out.print("¬ведите p: ");
		p = input(p, read);
		System.out.print("¬ведите q: ");
		q = input(q, read);
		System.out.println("(" + M + "*x + " + N + ")/(x^2 + " + p + "x + " + q + ")");
		getY(M, N, p, q, read, c, masXY, len);
	}
	
	private void fourthView(BufferedReader read, Circle c, double[][] masXY, int len){
		double M = 0;
		double N = 0;
		double p = 0;
		double q = 0;
		double n = 0;
		System.out.println();
		System.out.println("(M*x + N)/(x^2 + px + q)^n");
		System.out.print("¬ведите M: ");
		M = input(M, read);
		System.out.print("¬ведите N: ");
		N = input(N, read);
		System.out.print("¬ведите p: ");
		p = input(p, read);
		System.out.print("¬ведите q: ");
		q = input(q, read);
		System.out.print("¬ведите n: ");
		n = input(n, read);
		System.out.println("(" + M + "*x + " + N + ")/(x^2 + " + p + "x + " + q + ")^" + n);
		getY(M, N, p, q, n, read, c, masXY, len);
	}
	
	private void getY(double A, double a, BufferedReader read, Circle c, double[][] masXY, int len){
		double x = inputX(read);
		double y = (A)/(x-a);
		System.out.println("y = " + y + ", " + "x = " + x );
		c.start(x, y, masXY, len);
	}
	
	private void getY(double A, double a, double n, BufferedReader read, Circle c, double[][] masXY, int len){
		double x = inputX(read);
		double y = (A)/Math.pow(x-a, n);
		System.out.println("y = " + y + ", " + "x = " + x );
		c.start(x, y, masXY, len);
	}
	
	private void getY(double M, double N, double p, double q, BufferedReader read, Circle c, double[][] masXY, int len){
		double x = inputX(read);
		double y = (M*x + N)/(x*x + p*x + q);
		System.out.println("y = " + y + ", " + "x = " + x );
		c.start(x, y, masXY, len);
	}

	private void getY(double M, double N, double p, double q, double n, BufferedReader read, Circle c, double[][] masXY, int len){
		double x = inputX(read);
		double y = (M*x + N)/Math.pow(x*x + p*x + q, n);
		System.out.println("y = " + y + ", " + "x = " + x );
		c.start(x, y, masXY, len);
	}
	
	private double input(double n, BufferedReader read){
		try{
			n = Double.parseDouble(read.readLine());
		}catch(IOException e){e.printStackTrace();}
		return n;
	}
	
	private double inputX(BufferedReader read){
		double n = 0;
		System.out.println();
		System.out.print("¬ведите x: ");
		return n = input(n, read);
	}
}
