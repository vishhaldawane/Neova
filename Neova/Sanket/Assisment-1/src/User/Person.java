package User;

public class Person {
	private String name;
	private String email;
	private String password;
	private int age;
	private String location;
	 
 	
		 	 public Person(String name, String email, String password, int age, String location) throws AgeInvalidException  {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
		
		this.location = location;

	 	if (age <=18 || age>=60)
		{
	         throw new AgeInvalidException("Age must be in between 18 to 60");
      	}
	 	else {
	 		this.age = age;
	 	}
	}












}