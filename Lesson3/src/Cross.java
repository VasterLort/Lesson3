import java.util.ArrayList;
import java.util.Map;

public class Cross {
	public void start(ArrayList<Double> listX, ArrayList<Double> listY, Map<Double, Double> map) {
		searchСross(listX, listY, map);
	}
	
	private void searchСross(ArrayList<Double> listX, ArrayList<Double> listY, Map<Double, Double> map){
		int j = 0;
		double k = Key(map);
		double b = Value(map);
		System.out.println("Круги, у которых прямая пересекает центр:");
		for(int i = 0; i < listX.size(); i++) {
			double y = ySet(listX.get(i), k, b);
			if(y == listY.get(i)) {
				j++;
				System.out.print("x = " + listX.get(i) + ", " + "y = " + listY.get(i));
				System.out.println();
			}
		}
		if(j == 0) {System.out.println("Нет совпадений");}
	}
	
	private double ySet(double x, double k, double b){
		return k * x + b;
	}
	
	private double Key(Map<Double, Double> map){
		double k = 0;
		for (Map.Entry<Double, Double> pair : map.entrySet()) {
		    if (pair.getKey() != null) {
		        k = pair.getKey();
		        break;
		    }
		}
		return k;
	}
	
	private double Value(Map<Double, Double> map){
		double b = 0;
		for (Map.Entry<Double, Double> pair : map.entrySet()) {
		    if (pair.getKey() != null) {
		        b = pair.getValue();
		        break;
		    }
		}
		return b;
	}
}
