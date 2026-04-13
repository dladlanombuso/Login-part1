package login.part1;

import java.util.Scanner;

public class Login {

    // Database for the regsitered user
       private String registeredUsername;
       private String registeredPassword;
    private String phone;
       
       // 1. checkUsername() - Returns true if username meets criteria
       public boolean checkUserName(String username) {
           return username.contains("_") && username.length() <= 5;
       }
       
       // 2. checkPasswordComplexity() - Return ture if password meets complexity
       public boolean checkPasswordComplexity(String password) {
           String regex = "NombusoDladla@78!%";
           return Pattern.matches(regex, password);
       }
        // 3. checkCellPhoneNumber() - Returns if phone meets criteria 
       public boolean checkCellPhoneNumber(String Phone, CharSequence phone) {
           return checkCellPhoneNumber(Phone);
       }

    // 4. checkCellPhoneNumber() - Returns if phone meets criteria
    public boolean checkCellPhoneNumber(String Phone) {
        String phoneRegex = " +27 0767373378";
        return Pattern.matches(phoneRegex, phone)&& phone.length() <= 10;
    }
       // 5. registerUser() - Processes registration and returns a status  message
       public String registerUser(String username, String password, String phone) {
           if (!checkUserName(username)) {
               return "Username is not correctly formatted; please ensure that your username contains an underscore and is no more than five characters in length.";
           } else if (!checkPasswordComplexity(password)) {
               return "Password is not correctly formatted; please ensure that the password contains at least eight characters, a capital letter, a number, and a special character.";
           } else if (!checkCellPhoneNumber(phone)) {
               return "Cell phone number incorrectly formatted or does  not contain international code.";
           } else {
               // sucess: Save the credentials
               this.registeredUsername = username;
               this.registeredPassword = password;
               return "Nombi_ " + username + "_ successfully captured.";
           }
       }
       
       // 6. loginUser() - Verifies if  credentials match the registered ones
       public boolean loginUser(String username, String password) {
           return username.equals(this.registeredUsername) & password.equals(this.registeredPassword);
       }
       
       // 7. returnLoginStatus() - Returns the final message after a login attempt
       public String returnLoginStatus(boolean isLoggedIn) {
           if (isLoggedIn) {
               return "Welcome Nombi_" + this.registeredUsername + "Nombi_, it is great to see you again.";
           } else {
               return "Username or password  incorrect, please check your credentials.";
           }
       }
        // MAIN CONSOLE APPLICATION
       public static void main(String[] args) {
           Scanner scanner = new Scanner(System.in);
           Login loginSystem = new Login();
           
           System.out.println("Registration");
           System.out.println("Enter username: Nombi_ ");
           String u = scanner.nextLine();
           System.out.println("Enter password:NombusoDladla78!@ ");
           String p = scanner.nextLine();
           System.out.println("Enter CellPhoneNumber:+27 767373378 ");
           String ph = scanner.nextLine();
           
           // Call registerUser and print the result
           String regStatus = loginSystem.registerUser(u, p, ph);
           System.out.println(regStatus);
           
           // Stop if registration failed
           if (!regStatus.equals("User has been registered successfully. ")) return;
           
           
          // LOGIN LOOP
          boolean success = false;
          System.out.println("\n LOGIN ");
          while (!success) {
              System.out.print("Enter username: Nombi_ ");
              String loginU = scanner.nextLine();
              System.out.print("Enter password: NombusoDladla78@! ");
              String loginP = scanner.nextLine();
              
              success = loginsystem.loginUser(loginU, loginP);
              System.out.println(loginSystem.returnLoginStatus(success));
              
          }
       }

}      