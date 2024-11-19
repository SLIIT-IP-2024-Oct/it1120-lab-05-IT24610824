import java.util.Scanner;
public class IT24610824Lab5Q2 {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter number of members :");
		int numOFmem;
		numOFmem = scanner.nextInt();
		
		if(numOFmem<0){
			System.out.println("Input must be a number 0 or greater");
			return;
		}
			

		String prize;
		switch(numOFmem){
			case 0:
				prize = "No prize";
				break;
			case 1:
				prize = "pen";
				break;
			case 2:
				prize = "Umbrella";
				break;
			case 3:
				prize = "Bag";
				break;
			case 4:
				prize = "Travelling chair";
				break;
			default:
				prize = "Headphone";
				break;
		}
		if(numOFmem==0)
			System.out.println(prize);
		else
			System.out.println("Prize is :"+ prize);
		

	}
}
