import java.util.Scanner;

public class Grade {
	public static void main(String args[]){
		String input_IDnumber;
		int input_ch, input_ma, input_en, total;
		float average;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Your input data:");
		System.out.print("Enter your number:");
		input_IDnumber = scanner.nextLine();
		System.out.print("Enter your Chinese grade:");
		input_ch = Integer.parseInt(scanner.nextLine());
		System.out.print("Enter your Math grade:");
		input_ma = Integer.parseInt(scanner.nextLine());
		System.out.print("Enter your English grade:");
		input_en = Integer.parseInt(scanner.nextLine());
		System.out.println("----------------------------------");
		GradeBook ChargeGB = new GradeBook(input_IDnumber, input_ch, input_ma, input_en);
		System.out.println("Your Grade data:" );
		System.out.println("Your number is:" + ChargeGB.getIDnumber());
		System.out.println("Your Chinese Grade is:" + ChargeGB.getChinese());
		System.out.println("Your Math Grade is:" + ChargeGB.getMath());
		System.out.println("Your English Grade is:" + ChargeGB.getEnglish());
		total = ChargeGB.getChinese() + ChargeGB.getMath() + ChargeGB.getEnglish();
		System.out.println("Your Total Grade is:" + total);
		average = total / 3;
		System.out.println("Your Average Grade is:" + average);
	
	}
}