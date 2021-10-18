
public class LaundryTest {
	//main  ctrl+spacebar
	public static void main(String[] args) {
		
		System.out.println("Laundry Begin...");
		Cloth c1 = new Cloth();
		c1.setClothType("Jeans");
		c1.setClothBrand("Levis");
		c1.setClothColor("Navy Blue");
		c1.setClothCost(4000);
		c1.setClothStatus("Dirty");
		
		System.out.println("myJeans : "+c1); //will invoke toString()
		
		//sysout <-- ctrl+space bar
		//WashingMachine washMach = new WashingMachine();
		//String whichCloth = "TShirt";
		//whichCloth = washMach.fuzzyWash(30, whichCloth);
		
		//System.out.println("Cloth status : "+whichCloth);
		
	}
}
/*
 * 		Naming convention
 * 
 * 		ClassName <-- PascalCase
 * 		variableName <-- camelCase
 * 		setLookAndFeel() <-- camelCase
 * 		MAX MIN PI
 * 		packages1.subpackage2.
 * 
 * 
 */
class Cloth //pojo - plain old java object 
{
	
	private String clothType; //jeans
	private String clothBrand; //levis
	private String clothColor; // blue
	private float clothCost; // 4000
	private String clothStatus;
	
	
	
	
	public String getClothStatus() {
		return clothStatus;
	}
	public void setClothStatus(String clothStatus) {
		this.clothStatus = clothStatus;
	}
	public String getClothType() {
		return clothType;
	}
	public void setClothType(String clothType) {
		this.clothType = clothType;
	}
	public String getClothBrand() {
		return clothBrand;
	}
	public void setClothBrand(String clothBrand) {
		this.clothBrand = clothBrand;
	}
	public String getClothColor() {
		return clothColor;
	}
	public void setClothColor(String clothColor) {
		this.clothColor = clothColor;
	}
	public float getClothCost() {
		return clothCost;
	}
	public void setClothCost(float clothCost) {
		this.clothCost = clothCost;
	}
	@Override
	public String toString() {
		return "Cloth [clothType=" + clothType + ", clothBrand=" + clothBrand + ", clothColor=" + clothColor
				+ ", clothCost=" + clothCost + ", clothStatus=" + clothStatus + "]";
	}
	
	
	
	
}

//Bulb hasA Filament

class Filament { }

class Bulb {
	Filament fila = new Filament(); //hasA
}

class Machine
{
	
}
class WashingMachine extends Machine //isA
{
	private WashingTub washTub = new WashingTub(); //hasA
	
	void fuzzyWash() {
		System.out.println("Fuzzy wash program set for undefined minutes");
		System.out.println("Washing...dont know... ");
		washTub.wash();
	}
	
	//producesA				//usesA (int,    String)
		String fuzzyWash(int minutes, String cloth) {
			System.out.println("Fuzzy wash program set for "+minutes+" minutes");
			System.out.println("Washing... "+cloth);
			washTub.wash();
			return "Washed "+cloth;
		}
		
	
	
}

class Tub 
{
	
}
class WashingTub  extends Tub {
	void wash() {
		System.out.println("Washing....");
		rinse();
	}
	void rinse () {
		System.out.println("Rinsing....");
		spin();
	}
	void spin() {
		System.out.println("Spinning....");
	}
}

