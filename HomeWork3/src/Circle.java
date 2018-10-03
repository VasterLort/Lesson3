import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Circle {
	public void start(double x, double y, double[][] masXY, int len){
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		masXY[len][0] = x;
		masXY[len][1] = y;
		double r = inputRad(read);
		double p = perimeter(r);
		double a = area(r);
		message(p, a);
	}
	
	private double perimeter(double r){
		return 3.14 * 2 * r;
	}
	
	private double area(double r){
		return 3.14 * r * r;
	}
	
	private void message(double p, double a){
		System.out.println("Периметр: " + p);
		System.out.println("Площадь: " + a);
	}
	
	private double input(double n, BufferedReader read){
		try{
			n = Double.parseDouble(read.readLine());
		}catch(IOException e){e.printStackTrace();}
		return n;
	}
	
	private double inputRad(BufferedReader read){
		double n = 0;
		System.out.print("Введите радиус: ");
		return n = input(n, read);
	}
}
