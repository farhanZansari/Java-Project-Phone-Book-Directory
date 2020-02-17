
public class Person{

	private String name;
	private String address;
	private String phNo;
	
	
	// Default constructor
	public Person(){
	
		name = "NA"; // new String("NA");
		address = "NA";
		phNo = "NA";		
	
	}
	
	// Parameterized constructor
	public Person(String name, String add, String ph){
		this.name = name;
		this.address = add;
		phNo = ph;
	}
	
	// Copy constructor
	public Person(Person p){
		name = p.name;
		address = p.address;
		this.phNo = p.phNo;
		
	}

	
	public String getName(){
		return name;
	}

	public String getAddress(){
		return this.address;
	}
	
	public String getPhNo(){
		return this.phNo;
	}

	public void setName(String name){
		this.name = name;
	}
	
	
	public String toString(){
		return "Name: " + name + " \nAddress: " + address + " \nPh #: " + phNo + "\n";
	}
	
	

}// end of class
