import java.util.Scanner;

public class Arithmetic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
        double mealCost = scan.nextDouble(); // original meal price
        float tipPercent = scan.nextInt(); // tip percentage
        float taxPercent = scan.nextInt(); // tax percentage
        scan.close();
        
        double tip1,tax1,tip,tax;
        System.out.println(mealCost);
        tip1 = (tipPercent/100);
        tip= mealCost*tip1;
        System.out.println(tip);
        tax = mealCost*(taxPercent/100);
        System.out.println(tax);
        double  total;
        total = mealCost + tip +tax;
        
        int totalCost = (int) Math.round(total);
        
        System.out.println("The Total Bill is :- "+ totalCost );
        
        		
	}

}
