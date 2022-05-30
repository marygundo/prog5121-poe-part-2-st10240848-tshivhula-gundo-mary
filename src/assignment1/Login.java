
package assignment1;

import java.util.Scanner;

public class Login 
{
   
    
    
    
    
      static boolean checkPasswordComplexity(String Pword)
    {
        boolean PassWordPassed;
        PassWordPassed = false;
        boolean accurate;
        accurate = false;
        boolean right;
        right = false;
        boolean absolute;
        absolute = false;
        boolean correct;
        correct = false;
        
        if(Pword.length() <= 8)
        {
            accurate= true;
           if(Pword.length() <= 8)
        {
             right = true;
        }
        char[] alphabets = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        for(int a = 0; a < Pword.length(); a++)
        {
            for(int b = 0; b < 26; b++)
            {
                if(Pword.charAt(a) == alphabets[b])
                {
                    right = true;
                    b=28;
                    a = Pword.length()+2;
                }
            }
        }
        char[] numbers = {'0','1','2','3','4','5','6','7','8','9'};
        for(int a = 0; a < Pword.length(); a++)
        {
            for(int b = 0; b < 10; b++)
            {
                if(Pword.charAt(a) == numbers[b])
                {
                    absolute = true;
                }
            }
        }
        char[] SpecialChar = {'#','~','!','@','$','%','^','&','*','(',')','_','-','+','{','[','}',']','|','?',',','.','/'};
         for(int a = 0; a < Pword.length(); a++)
         {
             for(int b = 0; b < 23; b++)
             {
                 if(Pword.charAt(a) == SpecialChar[b])
                 {
                     correct = true;
                 }
             }
         }
        if(accurate==true && right==true && absolute==true && correct==true)
        {
            PassWordPassed = true;
        }
        }
    return PassWordPassed;
    }
    
     boolean checkUserName(String handonce)
     {  
         boolean Username;
         Username = true;
         boolean C1;
         C1= false;
           if(handonce.length() <= 8)
        {
           C1 = true;
              char[] SpecialChar = {'#','~','!','@','$','%','^','&','*','(',')','_','-','+','{','[','}',']','|','?',',','.','/'};
         for(int a = 0; a < handonce.length(); a++)
         {
             for(int b = 0; b < 23; b++)
             {
                 if(handonce.charAt(a) == SpecialChar[b])
                 {
                     C1 = true;
                 }
             }
         }
       
        {
         boolean  checkUserName = true;
         }
    
     } 
           return true;
     }
     String registerUser()
     {  String username;
        String password;
        String firstname;
        String lastname;
         Scanner scan = new Scanner(System.in); 
         System.out.println("\n\n\t\tRegistration\n\n");
         
         System.out.println("Enter username");
         username = scan.next();
         System.out.println("Enter password");
         password = scan.next();
         System.out.println("Enter firstname");
         firstname = scan.next();
         System.out.println("Enter lastname");
         lastname = scan.next();
         
 while(!checkUserName(username))
 { 
     System.out.println("Enter username");
     username = scan.next();
 }
         
 while(!checkPasswordComplexity(password))
 { 
     System.out.println("Enter password");
     password = scan.next();
 }
 while(!checkUserName(firstname))
 { 
     System.out.println("Enter firstname");
     firstname = scan.next();
 }

while(!checkUserName(lastname))
{ 
    System.out.println("Enter lastname");
    lastname = scan.next();
          
}
            return"\n\n\t\tRegistration\n\n" ;
}      
Boolean loginUser()
{
boolean loginUser;
loginUser = false;
String password ;
String username;
Scanner scan = new Scanner(System.in);
    System.out.println("Enter password");
       password = scan.next();
    System.out.println("Enter username");   
       username = scan.next();
       if(username.equals("Handonce")&&(password.equals("12345")))
       { System.out.println("successful login");
       
       }
       else
       { 
           System.out.println("failed to login");
       }
   return true;
}

    public String ReturnLoginStatus( String BF);
    
    public String UserName = "";
    public String PassWord = ""; 
    
    boolean CheckUserName(String UN)
    {
        
        
        
        
        
        
        return true;
    }
       boolean CheckPasswordComplexity(String PW)
    {
        
        
        
        return true;
    }
        boolean LoginUser()
    {
        boolean LoginSuccess = false;
        
        
        return LoginSuccess;
    }
        String RegisterUser()
    {
        Scanner scan = new Scanner(System.in);
        String username;
        String password;
        String FirstName;
        String LastName;
        
        System.out.print("\n\n\t\tRegistration\n\n");
        System.out.print("Enter username : ");
        username = scan.next();
        System.out.print("Enter password : ");
        password = scan.next(); 
        System.out.print("Enter your first name : ");
        FirstName = scan.next();
        System.out.print("Enter your last name : ");
        LastName = scan.next();
        
        while(!CheckUserName(UserName))
        {
            System.out.print("Enter user name : ");
            UserName = scan.next();        
        }
        while(!CheckPasswordComplexity(PassWord))
        {
            System.out.print("Enter your desired password : ");
            PassWord = scan.next();        
        }
        
        
        return "\n\n\t\tUser Successfully Registered !!\n\n";
    }
        String ReturnLoginStatus(boolean Status)
    {
        String ReturnStatus = "";
        if(true)
        {
            ReturnStatus = "You have successfully logged in to the system!";
        }
        else
        {
            ReturnStatus = "Login failed!!!";
        }
        
        return ReturnStatus;
    }
}
  

