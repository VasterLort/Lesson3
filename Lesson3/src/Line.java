import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Line {
	public void start(HashMap<Double, Double> map) {
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in)); 
		equation(read, map);
	}
	
	private double input(double n, BufferedReader read){
		try{
			n = Double.parseDouble(read.readLine());
		}catch(IOException e){e.printStackTrace();}
		return n;
	}
	
	private void equation(BufferedReader read, HashMap<Double, Double> map){
		int n = 0;
		System.out.println();
		System.out.println("y=kx+b");
		System.out.print("¬ведите k: ");
		double k = input(n, read);
		System.out.print("¬ведите b: ");
		double b = input(n, read);
		System.out.println("y= "+ k + "x + " + b);
		System.out.println();
		contentArr(map, k, b);
		
	}
	
	private void contentArr(HashMap<Double, Double> map, double k, double b){
		map.put(k, b);
	}

}
