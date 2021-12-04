
public class AccountingArrayApp {
	public static void main(String[] args) {
		
		double valueOfSupply = Double.parseDouble(args[0]);
		double vatRate = 0.1;
		double expenseRate = 0.3;
		double vat = valueOfSupply * vatRate;
		double total = valueOfSupply + vat;
		double expense = valueOfSupply * expenseRate;
		double income = valueOfSupply - expense;
		
		
		System.out.println("Value of supply : " + valueOfSupply);
		System.out.println("VAT : " + vat);
		System.out.println("Total : " + total);
		System.out.println("Expense : " + expense);
		System.out.println("Income : " + income);
		
		//double dividendRate1 = 0.5;
		//double dividendRate2 = 0.3;
		//double dividendRate3 = 0.2;
		double[] dividendRates = new double[3];
				
		dividendRates[0] = 0.5;
		dividendRates[1] = 0.3;
		dividendRates[2] = 0.2;
				
		double dividend1 = income * dividendRates[0];
		double dividend2 = income * dividendRates[1];
		double dividend3 = income * dividendRates[2];
		
		//while문을 이용한 반복문
		int i=0;
		while(i < dividendRates.length) {
			System.out.println("Dividend : " + (income * dividendRates[i]));
			i++;
		}
		
		//for문을 이용한 반복문
		double[] dividend = new double[3];
		for(i=0; i<dividend.length; i++) {
			dividend[i] = income * dividendRates[i];
			System.out.println("Dividend : " + dividend[i]);
		}
		
		
//		System.out.println("Dividend : " + dividend1);
//		System.out.println("Dividend : " + dividend2);
//		System.out.println("Dividend : " + dividend3);
	}
}
