import java.util.HashMap;


public class MainClass {

	public static void main(String[] args) {
		Menu menu = new Menu();
		HashMap<Double, Double> list1 = new HashMap<Double, Double>();
		HashMap<Double, Double> list2 = new HashMap<Double, Double>();
		menu.start(list1, list2);
	}
}
