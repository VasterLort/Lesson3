import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Menu {
	public void start(){
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		int len = 0;
		double[][] masXY = amountCircle(read);
		checkSelect(read, masXY, len);
	}
	
	private void checkSelect(BufferedReader read, double[][] masXY, int len){
		int controler = 0;
		int allFr = masXY.length;
		Fraction fr = new Fraction();
		Line line = new Line();
		Cross cross = new Cross();
	
		
		while(controler!=9){
			if(allFr > 0 && controler!=9) {
				controler = menuOne(controler, read);
				allFr--;
			}else if(allFr == 0 ) {
				controler = menuTwo(controler, read);
			}
			
			if(controler == 1){
				fr.start(1, masXY, len);
				len++;
			}
			else if(controler == 2){
				fr.start(2, masXY, len);
				len++;  
			}
			else if(controler == 3){
				fr.start(3, masXY, len);
				len++; 
			}
			else if(controler == 4){
				fr.start(4, masXY, len);
				len++; 
			}
			else if(controler == 5){
				double[] mas = new double[2];
				line.start(mas);
				cross.start(masXY, mas);
			}else if(controler == 6){
				masXY = amountCircle(read);
				len = 0;
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
		System.out.println("Составление формулы и нахождение периметра и площади");
		System.out.println("1 - A/(x-a)");
		System.out.println("2 - A/(x-a)^n");
		System.out.println("3 - (M*x + N)/(x^2 + px + q)");
		System.out.println("4 - (M*x + N)/(x^2 + px + q)^n");
		System.out.println("9 - Выход");
		return sel = input(read);
	}
	
	private int menuTwo(int sel, BufferedReader read){
		System.out.println();
		System.out.println("5 - Вывести номера окружностей, центры которых лежат на одной прямой ");
		System.out.println("6 - Ввести количество кругов ");
		System.out.println("9 - Выход");
		return sel = input(read);
}
	
	private double[][] amountCircle(BufferedReader read){
		System.out.println();
		System.out.print("Количество кругов: ");
		int amount = input(read);
		double[][] mas = new double[amount][2];
		return mas;
	}
}
