/*
 * 
 * 			Think	Feel	time	Action	Result
 * 			|		|				|			|
 * 			invisible				eclipse		outputscreen
 * 
 * 
 */

class Report
{
	
}

class Person {
	
}
class Trick
{

}
class Magic { 
	
}
class Stick { }
class MagicStick extends Stick { }
class Magician extends Person //isA
{
	MagicStick  ms = new MagicStick(); //hasA

	//producesA		//usesA
	Magic perform(Trick t) {
			
		Magic theMagic = new Magic();
		return theMagic;
	}
}

class Show { }
class MagicShow
{
	Magician theMagician = new Magician();
	
	void runTheShow()
	{
			Trick t = new Trick();
			Magic mag = theMagician.perform(t);
			
	}
}
class City
{
	CircusShow c;
	MagicShow  m;
}



class Student extends Person
{
	Report rpt = new Report();
	
}


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
		
		
		Cloth c2 = new Cloth();
		c2.setClothType("T-Shirt");
		c2.setClothBrand("Benetton");
		c2.setClothColor("White");
		c2.setClothCost(3000);
		c2.setClothStatus("Very Dirty");
		
		System.out.println("Before wash : myJeans : "+c1); //will invoke toString()
		System.out.println("Before wash : tshirt  : "+c2); //will invoke toString()
		
		
	//The method fuzzyWash(int, String) in the type 
	//WashingMachine is not applicable for 
		//the arguments (int, Cloth)
				
		//sysout <-- ctrl+space bar
		WashingMachine washMach = new WashingMachine();
		
		c1 = washMach.fuzzyWash(30, c1);
		c2 = washMach.fuzzyWash(30, c2);
		
		System.out.println("After wash :  myJeans : "+c1); //will invoke toString()
		System.out.println("After wash :  tshirt  : "+c2); //will invoke toString()
		
		
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
	int capacity; //9kg
	String company; //samsung/ LG
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
		//producesA				//usesA (int,    String)
		Cloth fuzzyWash(int minutes, Cloth theCloth) {
			System.out.println("Fuzzy wash program set for "+minutes+" minutes");
			System.out.println("Washing... "+theCloth.getClothType()+ " which is "+theCloth.getClothStatus());
			washTub.wash();
			theCloth.setClothStatus("Washed");
			return theCloth;
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


class Player
{
	
}
class Cricketer extends Player
{
	
}

class Over
{
	int numberOfBalls; // 6
	int numberOfWides; //3 
	int numberOfNoBalls;
	int numberOfDeadBalls;
	int numberOfRuns;
	int numberOfSixers;
	int numerOfFourRuns;
	int numberOfWickets;
	int numerOfDotBalls;
	float economy;
	
	
}
class Baller extends Cricketer //isA
{
	Over o1 = new Over(); //hasA
	Over o2 = new Over();
	Over o3 = new Over();
	Over o4 = new Over();
	Over o5 = new Over();
	
	
	
	
}


class Team
{
	Baller b1 = new Baller();
	Baller b1 = new Baller();
	Baller b1 = new Baller();
		
}

class Match
{
	Team team1 = new Team();
	Team team2 = new Team();
	
}









