package fakultet;
import static javax.swing.JOptionPane.*;

public class Fakultet {

	public static void main(String[] args) {
		String input = showInputDialog("Skriv inn tall for å beregne fakultet her:");
		int fakultet = 0;
		int fakultetResult = 1;
		try
		{
			fakultet = Integer.parseInt(input);
		}
		catch(NumberFormatException ex)
		{
			showMessageDialog(null, "Pass på at du skriver tallet i tallformat og ikke i tekst, 5 og ikke fem!");
		}
		
		if(fakultet > 0)
		{
			for(int i = 1; i < fakultet; i++)
			{
				fakultetResult += fakultetResult*i;
			}
			
			showMessageDialog(null, "Fakultetet er: " + fakultetResult);
		}
		else
		{
			showMessageDialog(null, "Vennligst oppgi et heltall over 0");
		}
	}

}
