import java.util.Scanner;
public class IT24610824Lab5Q1 {
	public static void main (String [] arg){
		Scanner scanner = new Scanner (System.in);
		int fir_int,sec_int,thr_int,small_int,large_int;

		System.out.print("Enter the first number : ");
		fir_int = scanner.nextInt();
		System.out.print("Enter the second number : ");
		sec_int = scanner.nextInt();
		System.out.print("Enter the third number : ");
		thr_int = scanner.nextInt();

		small_int = fir_int;
		large_int = fir_int;

	//finding smallest
		if(sec_int < small_int)
			small_int = sec_int;
		else if(thr_int < small_int)
			small_int = thr_int;

	//finding highest
		if(sec_int > large_int)
			large_int = sec_int;
		else if(thr_int > large_int)
			large_int = thr_int;

		System.out.println("User entered numbers are : " + fir_int + " " + sec_int + " " + thr_int);
		System.out.println("The Smallest number is :" +small_int );
		System.out.println("The Largest number is :" +large_int );



		

	}
}
		