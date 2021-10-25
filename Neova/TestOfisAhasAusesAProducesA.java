public class TestOfisAhasAusesAProducesA {
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		int ans = calc.calculate(100, 200);
		
		System.out.println("ans "+ans);
		
		System.out.println("-----------");
		
		Number n1 = new Number();
		n1.setI(100);
		n1.printI();
		
		Number n2 = new Number();
		n2.setI(200);
		n2.printI();
	
		Number n3 =  calc.calci(n1, n2);
				
		n3.printI();
		
	}
}
class Computes
{
	
}
class Calculator extends Computes //isA
{
	int calculate(int i, int j) { //primitive
		return i+j;
	}
//produce		useA		useA
	Number calci(Number i, Number j) { //UDT
		Number temp = new Number();
		temp.setI(  i.getI() + j.getI() );
		return temp;
	}
}


class Number // <-- a kind of encapsulation | box it
{
	private int i;

	public int getI() { //get the value
		return i;
	}

	public void setI(int i) { //mutate the value
		this.i = i;
	}
	void printI() {
		System.out.println("i "+i);
	}
}

