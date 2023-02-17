import java.util.Scanner;

public class Salary {

	public static void main(String[] args) {
		double currentSalary;	// employee's current salary
		double raise;			// amount of the raise
		double newSalary;		// new salary for the employe
		String rating;			// performance rating
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the current salary: ");
		currentSalary = scan.nextDouble();
		System.out.print("Enter the performance raitng (Excellent or Good or Poor): ");
		rating = scan.next();
		System.out.print(rating);
		
		if (rating.equals("Excellent")) {
			raise = 0.06 * currentSalary;
			newSalary = currentSalary + raise;
			System.out.printf("Current Salary: $%s", newSalary);
			System.out.printf("\nAmount of your raise: $%s", raise);
			System.out.printf("\nYour new salary: $%s", newSalary);
			
		} 
		else if (rating.equals("Good")) {
			raise = 0.04 * currentSalary;
			newSalary = currentSalary + raise;
			System.out.printf("Current Salary: $%s", newSalary);
			System.out.printf("\nAmount of your raise: $%s", raise);
			System.out.printf("\nYour new salary: $%s", newSalary);
			
		} 
		else if (rating.equals("Poor")){
			raise = 0.015 * currentSalary;
			newSalary = currentSalary + raise;
			System.out.printf("Current Salary: $%s", currentSalary);
			System.out.printf("\nAmount of your raise: $%s", raise);
			System.out.printf("\nYour new salary: $%s", newSalary);
		
		} 
		else {
			System.out.println("Invalid input");
		}
			
	}

}
