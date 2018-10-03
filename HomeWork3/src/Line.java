import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Line {
	public void start(double[] mas) {
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in)); 
		equation(read, mas);
	}
	
	private double input(double n, BufferedReader read){
		try{
			n = Double.parseDouble(read.readLine());
		}catch(IOException e){e.printStackTrace();}
		return n;
	}
	
	private void equation(BufferedReader read, double[] mas){
		int n = 0;
		System.out.println();
		System.out.println("y=kx+b");
		System.out.print("¬ведите k: ");
		double k = input(n, read);
		System.out.print("¬ведите b: ");
		double b = input(n, read);
		System.out.println("y= "+ k + "x + " + b);
		System.out.println();
		contentArr(mas, k, b);
		
	}
	
	private void contentArr(double[] mas, double k, double b){
		mas[0] = k;
		mas[1] = b;
	}

}
