import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;


public class Fraction {
	public void start(int sel, HashMap<Double, Double> list1){
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		Circle circle = new Circle();
		
		if(sel == 1){first_view(read, circle, list1);}
		else if(sel == 2){second_view(read, circle, list1);}
		else if(sel == 3){third_view(read, circle, list1);}
		else if(sel == 4){fourth_view(read, circle, list1);}
	}
	
	private void first_view(BufferedReader read, Circle c, HashMap<Double, Double> list1){
		double A = 0;
		double a = 0;
		System.out.println();
		System.out.println("A/(x-a): ");
		System.out.print("¬ведите A: ");
		A = input(A, read);
		System.out.print("¬ведите a: ");
		a = input(a, read);
		System.out.println(A + "/(x-" + a + ")");
		get_y(A, a, read, c, list1);
	}
	
	private void second_view(BufferedReader read, Circle c, HashMap<Double, Double> list1){
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
		get_y(A, a, n, read, c, list1);
	}
	
	private void third_view(BufferedReader read, Circle c, HashMap<Double, Double> list1){
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
		get_y(M, N, p, q, read, c, list1);
	}
	
	private void fourth_view(BufferedReader read, Circle c, HashMap<Double, Double> list1){
		double M = 0;
		double N = 0;
		double p = 0;
		double q = 0;
		double n =0;
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
		get_y(M, N, p, q, n, read, c, list1);
	}
	
	private void get_y(double A, double a, BufferedReader read, Circle c, HashMap<Double, Double> list1){
		double x = input_x(read);
		double r = input_r(read);
		double y = (A)/(x-a);
		list1.put(x, y);
		System.out.println("y = " + y + ", " + "x = " + x );
		c.start(x, y, r);
	}
	
	private void get_y(double A, double a, double n, BufferedReader read, Circle c, HashMap<Double, Double> list1){
		double x = input_x(read);
		double r = input_r(read);
		double y = (A)/Math.pow(x-a, n);
		list1.put(x, y);
		System.out.println("y = " + y + ", " + "x = " + x );
		c.start(x, y, r);
	}
	
	private void get_y(double M, double N, double p, double q, BufferedReader read, Circle c, HashMap<Double, Double> list1){
		double x = input_x(read);
		double r = input_r(read);
		double y = (M*x + N)/(x*x + p*x + q);
		list1.put(x, y);
		System.out.println("y = " + y + ", " + "x = " + x );
		c.start(x, y, r);
	}

	private void get_y(double M, double N, double p, double q, double n, BufferedReader read, Circle c, HashMap<Double, Double> list1){
		double x = input_x(read);
		double r = input_r(read);
		double y = (M*x + N)/Math.pow(x*x + p*x + q, n);
		list1.put(x, y);
		System.out.println("y = " + y + ", " + "x = " + x );
		c.start(x, y, r);
	}
	
	private double input(double n, BufferedReader read){
		try{
			n = Double.parseDouble(read.readLine());
		}catch(IOException e){e.printStackTrace();}
		return n;
	}
	
	private double input_x(BufferedReader read){
		double n = 0;
		System.out.println();
		System.out.print("¬ведите x: ");
		return n = input(n, read);
	}
	
	private double input_r(BufferedReader read){
		double n = 0;
		System.out.print("¬ведите r: ");
		return n = input(n, read);
	}
}
