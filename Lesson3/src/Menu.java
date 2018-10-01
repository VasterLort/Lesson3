import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;


public class Menu {
	public void start(HashMap<Double, Double> list1, HashMap<Double, Double> list2){
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		Fraction fr = new Fraction();
		Circle circ = new Circle();
		check_select(read, fr, circ, list1, list2);
	}
	
	private void check_select(BufferedReader read, Fraction fr, Circle circ, HashMap<Double, Double> list1, HashMap<Double, Double> list2){
		int controler = 0;
		while(controler!=6){
			controler = menu(controler, read);
			if(controler == 1){fr.start(1, list1);}
			else if(controler == 2){fr.start(2, list1);}
			else if(controler == 3){fr.start(3, list1);}
			else if(controler == 4){fr.start(4, list1);}
			else if(controler == 5){circ.start(list1, list2);}
		}
	}
	
	private int input(BufferedReader read){
		int cou = 0;
		try{
			cou = Integer.parseInt(read.readLine());
		}catch(IOException e){e.printStackTrace();}
		return cou;
	}
	
	private int menu(int sel, BufferedReader read){
			System.out.println();
			System.out.println("ѕо какой рациональной дроби искать центр окружности: ");
			System.out.println("1 - A/(x-a)");
			System.out.println("2 - A/(x-a)^n");
			System.out.println("3 - (M*x + N)/(x^2 + px + q)");
			System.out.println("4 - (M*x + N)/(x^2 + px + q)^n");
			System.out.println("5 - ¬ывести номера окружностей, центры которых лежат на одной пр€мой ");
			System.out.println("6 - ¬ыход");
			return sel = input(read);
	}
	
}
