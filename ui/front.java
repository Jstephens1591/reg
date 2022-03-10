package ui;

public class front {

	public static void main(String[] args) {
		
		backend Johnathon = new backend();
		Johnathon.setFristName("John");
		Johnathon.setLastName("Stephens");
		Johnathon.setPhone("1111111111");
		Johnathon.setPassword("Thisismypassword");
		Johnathon.setAge(28);
		Johnathon.setUsername("johnsusername");
		
		System.out.println(Johnathon.getFirstName());
	}
	

}
