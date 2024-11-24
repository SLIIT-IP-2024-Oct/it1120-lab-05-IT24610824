import java.util.Scanner;

public class IT24610824Lab5Q3 {
    	public static void main(String[] args) {
        	double roomchrg_PERday = 48000.0;
        	int dis10_days = 10; 
        	int dis20_days = 20; 

        	Scanner scanner = new Scanner(System.in);

        	System.out.print("Enter Start Date (1-31): ");
        	int start_date = scanner.nextInt();

        	System.out.print("Enter End Date (1-31): ");
        	int end_date = scanner.nextInt();

        	if (start_date < 1 || start_date > 31 || end_date < 1 || end_date > 31) {
            	System.out.println("Error: Days must be between 1 and 31");
            	return;
        	}

        	if (start_date >= end_date) {
            	System.out.println("Error: Start Date must be less than End Date");
            	return;
        	}

        	int numberOfDays = end_date - start_date;

        	double totalAmount;
        	if (numberOfDays < 3) {
            	totalAmount = numberOfDays * roomchrg_PERday;
        	} 
        
        	else if (numberOfDays <= 4) {
            	totalAmount = numberOfDays * roomchrg_PERday * (1 - dis10_days / 100.0);
        	} 
        
        	else {
            	totalAmount = numberOfDays * roomchrg_PERday * (1 - dis20_days / 100.0);
        	}

        	System.out.println("Room Charge Per Day: Rs. " + roomchrg_PERday + "/=");
        	System.out.println("Number of Days Reserved: " + numberOfDays);
        	System.out.println("Total Amount to be Paid: " + totalAmount);
    	}
}
