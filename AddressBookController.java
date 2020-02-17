
import javax.swing.JOptionPane;

public class AddressBookController{

	private AddressBookManager addBookManager;
	
	
	public AddressBookController(){
		addBookManager = new AddressBookManager();
	}
	
	
	private String showOptions(){
	
		return JOptionPane.showInputDialog(null, "Press 1 to add Person\nPress 2 to Search\nPress 3 to Remove\nPress 0 to exit");
	}
	
	private void addPerson(){
		String name =  JOptionPane.showInputDialog(null, "Please enter the name");
		String address =  JOptionPane.showInputDialog(null, "Please enter the address");
		String phNo =  JOptionPane.showInputDialog(null, "Please enter the ph #");
		addBookManager.addPerson(name, address, phNo);
	}
	
	private void searchPerson(){
		String keyword =  JOptionPane.showInputDialog(null, "Please enter the keyword which you want to search");
		String res = addBookManager.searchPersons(keyword);
		JOptionPane.showMessageDialog(null, res);
	}
	
	private void removePerson(){
		String name =  JOptionPane.showInputDialog(null, "Please enter the name which you want to remove");
		boolean isRemoved = addBookManager.removePerson(name);
		if(isRemoved)
			JOptionPane.showMessageDialog(null, "Record successfully removed");
		else
			JOptionPane.showMessageDialog(null, "No Record found matching '" + name + "'");
	}


	public void startAddressBook(){
	
		boolean flag = true;
		
		while(flag){
		
			String opt =  showOptions();
			switch(opt){
				case "1":
					addPerson();
					break;
				case "2":
					searchPerson();
					break;
				case "3":
					removePerson();
					break;
				case "0":
					return;
				default:
					JOptionPane.showMessageDialog(null, "Invalid option");
			
			} //end of switch block
		
		}// end of while
	
	
	
	}
}