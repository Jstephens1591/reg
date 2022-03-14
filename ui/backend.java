package ui;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class backend {
	
	
	private String firstName;
	private String lastName;
	private String phone;
	private String password; 
	private int age;
	private String username; 
	//private String emailAddress;
	
	//regex stuff 
	private Pattern pattern; 
	public Matcher matcher;
	
	private static final String emailReg = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
            + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
	
	private static final String firstNamReg = "(\\\\.[A-Za-z])";
	
	
	//public Vadfname(){
	//pattern = Pattern.compile(firstNamReg);
	//	}
	
	//public boolean nameVad(final String firstName) {
		
	//	matcher = pattern.matcher(firstName);
		
		//	return matcher.matches();
		//}

	
	
	
	public String getFirstName(){
		return firstName;
		}
	
	public void setFristName(String firstName) {
		//Vadfname vadfname = new Vadfname();
		System.out.println(firstName);
		this.firstName = firstName;
		
				}
			
		
	public String getLastName() {
			return lastName;
		}
	public void setLastName(String lastName) {
		for(int i = 0 ; i < lastName.length(); i++) {
			if (Character.isLetter(i)) {
				this.lastName = lastName;				
				}
			else {
		System.out.println("Can not have number or Specail character");
			System.out.println(lastName);
				}
			
			}
		}
	public String getPhone() {
			return phone;
		}
	public void setPhone(String phone) {
			for (int i = 0; i <= phone.length(); i++ ) {
				if (Character.isDigit(phone.charAt(i))) {
					this.phone = phone;
					}
				else {					
					System.out.println("Must Contain all Numbers");
					}
			}
		}
	public String getPassword() {
			return password;
		}
	public void setPassword(String password) {
			for (int i = 0; i < password.length(); i++) {
				if(Character.isWhitespace(password.charAt(i))) {
				System.out.println("Password can not have spaces in it");
					}
				if(password.length() > 25) {
				System.out.println("Your password is to long");
					}
				if(password.length() < 6 ) {
				System.out.println("Your Password is to short");
					}
				if (Character.isUpperCase(password.charAt(i))) {
				System.out.println("Your password must have a capital letter");
					}
				else {
			this.password = password;
			System.out.println(password);
				}
			}
		}
	public int getAge() {
			return age;
		}
	public void setAge(int age) {
				if(age < 1) {
				System.out.println("Invalid Age");
					}
				if(age > 120) {
				System.out.println("Invalid Age");
					}
				else {
				this.age = age;
				System.out.println(age);
					}
		}
	public String getUsername() {
			return username;
		}
	public void setUsername(String username) {
			for (int i = 0; i < password.length(); i++) {
				if(Character.isWhitespace(username.charAt(i))) {
				System.out.println("Password can not have spaces in it");
					}
				else {
				this.username = username;
				System.out.println(username);
					}
			}
		}
	//public String getEmailAddress() {
		//return emailAddress;
	//}
	//public String setEmailAddress(String emailAddress){
		       // String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+"[a-zA-Z0-9_+&*-]+)*@" +"(?:[a-zA-Z0-9-]+\\.)+[a-z" +"A-Z]{2,7}$";                         
		       // Pattern pat = Pattern.compile(emailRegex);
		        //if (emailAddress == null) {
		        	//System.out.println("please enter Emial");
		        	//Pattern pat = Pattern.compile(emailRegex);
		          //  return pat.matcher(emailAddress).matches();
		        //}	   
		       // else {
		       // 	this.emailAddress = emailAddress;
		      //  }
		       // }
		        
		    }
		  

		    


