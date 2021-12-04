// Ŭ���� : ���� ������ ������ �޼��带 �׷����ؼ� �̸��� ���� ���������� ���ڴ�.
// �ν��Ͻ� : �ϳ��� Ŭ������ �����ؼ� ���� ���� �޼���� ���� �ٸ� �������� ���� ���� �������� ����� ���̴�.
// 		    Ŭ������ �н��̴�.
// Ŭ������ �ؾ Ʋ�̶��, �ν��Ͻ��� �� �ؾ�̴�.

class Accounting{
	public double valueOfSupply;
	public double vatRate;
	public double expenseRate;
	
	void print() {
		System.out.println("Value of supply : " + valueOfSupply);
		System.out.println("VAT : " + getVAT());
		System.out.println("Total : " + getTotal());
		System.out.println("Expense : " + getExpense());
		System.out.println("Income : " + getIncome());
		System.out.println("Dividend1 : " + getDividend1());
		System.out.println("Dividend2 : " + getDividend2());
		System.out.println("Dividend3 : " + getDividend3());
	}

	private double getDividend3() {
		return getIncome() * 0.2;
	}

	private double getDividend2() {
		return getIncome() * 0.3;
	}

	private double getDividend1() {
		return getIncome() * 0.5;
	}

	private double getIncome() {
		return valueOfSupply - getExpense();
	}

	private double getExpense() {
		return valueOfSupply * expenseRate;
	}

	private double getTotal() {
		return valueOfSupply + getVAT();
	}

	//�޼��带 ����� �ڵ�
	private double getVAT() {
		return valueOfSupply * vatRate;
	}
}

public class AccountingClassApp {

	
	public static void main(String[] args) {
		
		// Instance -> �ν��Ͻ��� ����ϱ� ���ؼ��� Ŭ������ static Ű���� x
		Accounting a1 = new Accounting();
		a1.valueOfSupply = 10000.0;
		a1.vatRate = 0.1;
		a1.expenseRate = 0.3;
		a1.print();
		//...
		
		Accounting a2 = new Accounting();
		a2.valueOfSupply = 20000.0;
		a2.vatRate = 0.05;
		a2.expenseRate = 0.2;
		a2.print();

	}


}
