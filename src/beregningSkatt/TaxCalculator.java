package beregningSkatt;
import static javax.swing.JOptionPane.*;

public class TaxCalculator {

	public static void main(String[] args) {
		String input = showInputDialog("Skriv inn inntekten din her:");
		double income = Double.parseDouble(input);
		double taxRate = 0;
		double incomeAfterTax = 0;
		
		if(income <= 0)
		{
			System.out.println("Error, enten har du ikke inntekt eller så gav du feil input");
		}
		else if(income <= 164100)
		{
			taxRate = 0.0;
			incomeAfterTax = income - (income*taxRate);
			System.out.println("Skatten din er på: " + taxRate*100 + "%" + " og inntekt etter skatt er: " + incomeAfterTax);
		}
		else if(income <= 230950)
		{
			taxRate = 0.093;
			incomeAfterTax = income - (income*taxRate);
			System.out.println("Skatten din er på: " + taxRate*100 + "%" + " og inntekt etter skatt er: " + incomeAfterTax);
		}
		else if(income <= 580650)
		{
			taxRate = 0.0241;
			incomeAfterTax = income - (income*taxRate);
			System.out.println("Skatten din er på: " + taxRate*100 + "%" + " og inntekt etter skatt er: " + incomeAfterTax);
		}
		else if(income <= 934050)
		{
			taxRate = 0.1152;
			incomeAfterTax = income - (income*taxRate);
			System.out.println("Skatten din er på: " + taxRate*100 + "%" +  " og inntekt etter skatt er: " + incomeAfterTax);
		}
		else if(income >= 934051)
		{
			taxRate = 0.1452;
			incomeAfterTax = income - (income*taxRate);
			System.out.println("Skatten din er på: " + taxRate*100 + "%" + " og inntekt etter skatt er: " + incomeAfterTax);
		}

	}

}
