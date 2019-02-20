import java.util.ArrayList;
import java.util.List;

public class Plate {
	double[] weight = new double[7];
	double barWeight;
	
	public Plate(String a, double b) {
		barWeight = b;
		if (a.equalsIgnoreCase("kg")) {
			weight[0] = 1.25;
			weight[1] = 2.5;
			weight[2] = 5;
			weight[3] = 10;
			weight[4] = 15;
			weight[5] = 20;
			weight[6] = 25;
		} else if (a.equalsIgnoreCase("lb")) {
			weight[0] = 5;
			weight[1] = 10;
			weight[2] = 15;
			weight[3] = 20;
			weight[4] = 25;
			weight[5] = 35;
			weight[6] = 45;
		}
	}
	
	public List<Double> Calculate(double a) {
		double remaining = a - barWeight;
		List<Double> result = new ArrayList<Double>();
		
		//Divide, keep it even on both sides
		remaining /= 2;
		
		for(int i = weight.length - 1; i >= 0; i--) {
			while (remaining - weight[i] >= 0) {
				result.add(weight[i]);
				remaining -= weight[i];
			}
		}
		return result;
	}
}
