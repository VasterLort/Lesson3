
public class Cross {
	public void start(double[][] masXY, double[] mas) {
		searchСross(masXY, mas);
	}
	
	private void searchСross(double[][] masXY, double[] mas){
		int count = countCircle(masXY, mas);
		int j = 0;
		double[][] masEnd = new double[count][2];
		for(int i = 0; i < masXY.length; i++) {
			double y = ySet(masXY[i][0], mas[0], mas[1]);
			if(y == masXY[i][1]) {
				masEnd[j][0] = masXY[i][0];
				masEnd[j][1] = masXY[i][1];
				j++;
			}
		}
		conclusion(masEnd, count);
	}
	
	private int countCircle(double[][] masXY, double[] mas){
		int count = 0;
		for(int i = 0; i < masXY.length; i++) {
			double y = ySet(masXY[i][0], mas[0], mas[1]);
			if(y == masXY[i][1]) {
				count++;
			}
		}
		return count;
	}
	
	private double ySet(double x, double k, double b){
		return k * x + b;
	}
	
	private void conclusion(double[][] mas, int count){
		if(count > 0) {
			finish(mas);
		}else if(count == 0) {System.out.println("Нет совпадений");}
	}
	
	private void finish(double[][] mas){
		System.out.println("Круги, у которых прямая пересекает центр:");
		for(int i = 0; i < mas.length; i++) {
			System.out.println("x = " + mas[i][0] + ", " + "y = " + mas[i][1] );
		}
	}
	
}
