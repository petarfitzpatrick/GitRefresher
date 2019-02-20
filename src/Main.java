import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Plate weight;
		Scanner sc = new Scanner(System.in);
		String userResponse = "";
		double bar, target;
		List<Double> result = new ArrayList<Double>();
		
		while (!userResponse.equalsIgnoreCase("kg") && !userResponse.equalsIgnoreCase("lb")) {
			System.out.println("Are you using lb or kg?");
			userResponse = sc.nextLine();
		}
		
		System.out.println("How much does your bar weigh?");
		bar = sc.nextDouble();
		//Initialize Plate Class
		weight = new Plate(userResponse, bar);
		
		System.out.println("How much weight do you need?");
		target = sc.nextDouble();
		sc.close();
		
		//Notify user of max weight
		System.out.println("You need " + (target-bar)/2 + userResponse + " on both sides");
		System.out.println();
		
		result = weight.Calculate(target);
		
		System.out.println("Plates per side:");
		
		for(int i = 0; i < result.size(); i++) {
			System.out.println(result.get(i));
		}
	}

}
