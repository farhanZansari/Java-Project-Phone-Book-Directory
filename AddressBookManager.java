
import java.util.ArrayList;

public class AddressBookManager{

	private ArrayList<Person> persons;

	public AddressBookManager(){
		persons = new ArrayList<Person>();
	}
	
	public void addPerson(String name, String add, String ph){
		persons.add(new Person(name, add, ph));
	}
	
	public String searchPersons(String nameKeyWord){
	
		String result = "";
		for(Person p: persons){
			if(p.getName().toLowerCase().contains(nameKeyWord.toLowerCase()))
				result += p.toString() + "\n";
		
		}
		
		if(result == "")
			result = "No Record Found";
			
		return result;
	}
	
	
	public boolean removePerson(String name){
	
		for(Person p: persons){
			if(p.getName().equals(name)){
				persons.remove(p);
				return true;
			}
		
		}
		return false;
	}






	/*
			String name = p.getName();
			name = name.toLowerCase();
			nameKeyWord = nameKeyWord.toLowerCase();
			if(name.contains(nameKeyWord))
				result += p.toString() + "\n";
			*/



} //end of class