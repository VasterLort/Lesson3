import java.util.HashMap;

public class Circle {
	public void start(double x, double y, double r){
		double p = perimeter(r);
		double a = area(r);
		message(p, a);
	}
	
	public void start(HashMap<Double, Double> list1, HashMap<Double, Double> list2){
		for (HashMap.Entry<Double, Double> entry : list1.entrySet())
		{
		    
		}
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
}
