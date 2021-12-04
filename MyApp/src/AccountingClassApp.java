// 클래스 : 서로 연관된 변수와 메서드를 그룹핑해서 이름을 붙인 정리정돈의 상자다.
// 인스턴스 : 하나의 클래스를 복제해서 서로 같은 메서드와 서로 다른 데이터의 값을 가진 복제본을 만드는 것이다.
// 		    클래스의 분신이다.
// 클래스가 붕어빵 틀이라면, 인스턴스는 각 붕어빵이다.

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

	//메서드를 만드는 코드
	private double getVAT() {
		return valueOfSupply * vatRate;
	}
}

public class AccountingClassApp {

	
	public static void main(String[] args) {
		
		// Instance -> 인스턴스를 사용하기 위해서는 클래스에 static 키워드 x
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
