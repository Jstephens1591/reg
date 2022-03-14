package ui;



public class front {

	public static void main(String[] args) {

		
		uidao curCus = new uidao();
		
		backend Johnathon = new backend();
		Johnathon.setFristName("john");
		Johnathon.setLastName("Stephens");
		Johnathon.setPhone("1111111111");
		Johnathon.setPassword("Thisismypassword");
		Johnathon.setAge(28);
		Johnathon.setUsername("johnsusername");
		
		
		curCus.addNewCustomer(Johnathon);		
	}
	

}
