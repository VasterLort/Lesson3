import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;


public class Menu {
	public void start(){
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Double> listX = new ArrayList<Double>();
		ArrayList<Double> listY = new ArrayList<Double>();
		checkSelect(read, listX, listY);
	}
	
	private void checkSelect(BufferedReader read, ArrayList<Double> listX, ArrayList<Double> listY){
		int controler = 0;
		Fraction fr = new Fraction();
		Line line = new Line();
		Cross cross = new Cross();
	
		
		while(controler!=9){
			controler = menuOne(controler, read);
			
			if(controler == 1){fr.start(1, listX, listY);}
			else if(controler == 2){fr.start(2, listX, listY);}
			else if(controler == 3){fr.start(3, listX, listY);}
			else if(controler == 4){fr.start(4, listX, listY);}
			else if(controler == 5){
				HashMap<Double, Double> map = new HashMap<Double, Double>();
				line.start(map);
				cross.start(listX, listY, map);
			}
		}
	}
	
	private int input(BufferedReader read){
		int cou = 0;
		try{
			cou = Integer.parseInt(read.readLine());
		}catch(IOException e){e.printStackTrace();}
		return cou;
	}
	
	private int menuOne(int sel, BufferedReader read){
		System.out.println();
		System.out.println("—оставление формулы и нахождение периметра и площади");
		System.out.println("1 - A/(x-a)");
		System.out.println("2 - A/(x-a)^n");
		System.out.println("3 - (M*x + N)/(x^2 + px + q)");
		System.out.println("4 - (M*x + N)/(x^2 + px + q)^n");
		System.out.println("5 - ¬ывести номера окружностей, центры которых лежат на одной пр€мой ");
		System.out.println("9 - ¬ыход");
		return sel = input(read);
	}
}
