package ui;
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
//import java.util.*;

public class backend {
	
	
	private String firstName;
	private String lastName;
	private String phone;
	private String password; 
	private int age;
	private String username; 
	//private String emailAddress;
	
	
	public String getFirstName(){
		return firstName;
	}
	public void setFristName(String firstName) {
			
			for(int i = 0; i <= firstName.length(); i++) {
				if (!Character.isLetter(firstName.charAt(i))) {
					System.out.println("Can not have number or Specail character");
				}
			if(firstName.length() > 24) {
				System.out.println("Must have less then 24 letters");		
				}
			else {
				this.firstName = firstName;
				}
				
				}
		}
			
		
	public String getLastName() {
			return lastName;
		}
	public void setLastName(String lastName) {
			for(int i = 0; i <= lastName.length(); i++) {
				if (!Character.isLetter(lastName.charAt(i))) {
					System.out.println("Can not have number or Specail character");
					}
				if(lastName.length() > 24) {
				System.out.println("Must have less then 24 letters");		
					}
				else {
				this.lastName = lastName;
					}
				
				}
		}
	public String getPhone() {
			return phone;
		}
	public void setPhone(String phone) {
			for (int i = 0; i <= phone.length(); i++ ) {
				if (!Character.isDigit(phone.charAt(i))) {
				System.out.println("Must Contain all Numbers");
					}
				if(phone.length() < 9) {
				System.out.println("Must be 10 digits");
					}
				else {
					this.phone = phone;
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
		  

		    


