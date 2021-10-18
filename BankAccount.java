public class BankAccount
{
	public static void main(String[] args) {
		System.out.println("Hello Java ");
	}
	void foo() { }
}
abstract class Far {
	abstract void fun(); //<-- declared
	void fee() { } // <-- defined
}

/*
  		
  		Java Programming Language
  						 - with Vishhal
  						 
  		

				Java Technology
						|
				-----------------
				|		|		|
				JSE		JEE		JME
  				|		|
  			Standard	Enterprise
			Core Java			|
			|				-------------------
		-------					|			|RMI
		|						WEB			EJBeans(class/component)
	Language Fundamentals		|					|
	OOPS concepts			servlets		------------------------------
		Association				JSP				|				|PK		|
		isA hasA usesA producesA  Angular	Session			Entity   Message (SMS | MAil)
	packages					  React			|Spring			|Hibernate/JPA persistence
	exception handling					----------------	-----------
		custom exception				|			|		|		|JPA
	multi-threading					Stateless    Stateful	BMP		CMP
	generics				flightEnquiry		register			persist
	collections f/w													merge
	JDBC															delete/remove
																	find				
	'Enterprise' <--- application
1. Remote capability 
	socket programming/networking in java
	
2. High Availability - 24 x 7 
		cluster 
	
3. Multi-threading
	
4. Pooling of resources
		sharing of resources
		guest user
		- flight enquiry process
		- all the 3 flights are shown to 
		1000 users a given point in time
		
		
5. Caching of resources			
		login as a registered user
		- registration process
			
6. Transaction management
			Atomic Consistency Isolation Durable
			
7. SEcurity management 
		- AA
		
			
	JVM1					JVM2
	machine1				machine2
	|						|    SavingsAccount saObj = new SavingsAccount(101,"Julie",5000);		
	|						|			saObj.withdraw();<==		
	+-----------------------+
	Local stub			Remote stub
	(proxy)				
	|
	withdraw() ---------> withdraw()
							
					
					
					
Fundamental unit of programming in java is to write a class
					
					
	
					
	Top to Bottom
	
	procedure <--- data
	
	
	
	Bottom to Top
	
	data <--- procedure
	
	

				
	Object = state(data) <--- behaviour (functions)
	
	
 OOPS concepts
 
 			1. Abstraction
 			
 				it is the "what is?" part of an object
 				hides the complexity of an object
 				and provides its simplicity by USAGE - public functions
 				
 				i. data abstraction
 				ii. procedural abstraction
 				iii. class abstraction
 				
 			2. Encapsulation
 				it is the "How is it?" part of an object
 				bind the data with concerned functions
 
 				class SavingsAccount {
 					 double balance;
 							void withdraw(double amountToWithdraw)
 							{
 								balance = balance - amountToWithdraw;
 							}
 				}
 				class Test {
 					main() {
 						SavingsAccount saObj = new SavingsAccount();
 						saObj.balance = 9820443464;
 						
 					}
 				}
 				
 		
 				
 				
 			3. Polymorphism
 					ability of a business entity to have multiple forms
 					
 					early binding vs late binding
 					
 					1. class extension
 					
 					
 			Doctor d = new Doctor();
 			d.diagnose(); // early binding - known to the compiler
 			
 			Doctor d = new Surgeon();
 			
 			d.diagnose(); // bound with Doctor's diagnose()
 					//but at runtime it would be changed
 			
 			d = new HeartSurgeon();
 			d.diagnose(); // bound with Doctor's diagnose
 			
 			d.cut();// invalid
 					
 					Doctor
 					| diagnose();
 			----------------
 			|
 			|  Surgery
 			|   |cut(); stitch();
 			|	|
 			Surgeon --   class Surgeon extends Doctor implements Surgery { }
 			| diagnose is inherited here (2)
 			| doSurgery();  <-- (1)
 			| diagnose() { }// overriding (3)
 			| cut(){ } stitch() { } (4) implemented
 		----------
 		|
 	HeartSurgeon
 	
 	
 	1. exclusive
 	2. inherited
 	3. overridden
 	4. implemented
 	
 	
 	
 	
 	
 	
 	James Gosling - The Java Programming Language
 	
 					2. function overloading
 					3. function overriding
 					
 			4. Inheritance
 				derivation		vs		implementation
 				ordinary 				abstract/interfaces
 				
 			5. Object communication
 
 */


















