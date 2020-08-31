package karakterer;
import java.util.Scanner;

public class Karakterer {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int gradeNumber = 0;
		String grade = "";
		System.out.println("Skriv in poengsum:");
		
		for(int i = 1; i<= 10; i++)
		{
			gradeNumber = Integer.parseInt(input.nextLine());
			
			if(gradeNumber > 100 || gradeNumber < 0)
			{
				grade = "Error, prøv igjen med et heltall mellom 0 og 100!";
				i--;
			}
			else if (gradeNumber >= 90)
			{
				grade = "A";
			}
			else if (gradeNumber >= 80)
			{
				grade = "B";
			}
			else if(gradeNumber >= 60)
			{
				grade = "C";
			}
			else if(gradeNumber >= 50)
			{
				grade = "D";
			}
			else if(gradeNumber >= 40)
			{
				grade = "E";
			}
			else if(gradeNumber >= 0)
			{
				grade = "F";
			}
			
			
			System.out.println("Karakteren din er: " + grade);
			if(i < 10)
			{
				System.out.println("Skriv in poengsum:");
			}
			else
			{
				System.out.println("Karakterene ble prossesert uten feil!");
				input.close();
			}
		
		}
		
		
		

	}

}
