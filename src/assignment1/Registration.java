
    

package assignment1;

import java.util.Scanner;

public class Registration 
{

  
    public static void main(String[] args) 
    {
        String UserName ;
        String PassWord;
        String FirstName;
        String LastName;
        boolean LoginStatus = false;
        
        
        Login ll = new Login();
        System.out.print(ll.RegisterUser());
        
        LoginStatus = ll.LoginUser();
        ll.ReturnLoginStatus(LoginStatus);
        
        {
        Scanner scan = new Scanner(System.in);
        int numberOfTasks;
        
        System.out.print("Welcome to EasyKanban");
        System.out.print("\n\nHow many tasks do you wish to enter : ");
        numberOfTasks = scan.nextInt();
        if(numberOfTasks > 0)
        {
            Task task1 = new Task(numberOfTasks);
        
            System.out.print("\n\nThank you, You may now start capturing the tasks,\n should you wish to Quit just press 3..");
            for(int a = 0; a < numberOfTasks; a++)
            {
                System.out.print("\n\n1). Add tasks");
                System.out.print("\n2). Show report");
                System.out.print("\n3). Quit\n\nPick and option : ");
            
                int option = scan.nextInt();
                if(option == 1)
                {                  
                    task1.taskNum = a;
                    System.out.print("Enter this task's name : ");
                    task1.tName[a] = scan.next();
                    System.out.print("Enter this task's description : ");
                    task1.taskDescript[a] = scan.next();
                    while(!task1.checkTaskDescription(task1.taskDescript[a]))
                    {
                        System.out.print("Description shouldn't be more than 50 characters, Please try again : ");
                        task1.taskDescript[a] = scan.next();                    
                    }                 
                    
                    System.out.print("Enter this task's developer details : ");
                    task1.developDetails[a] = scan.next();
                    System.out.print("Enter this task's duration (in hours) : ");
                    task1.taskDuration[a] = scan.nextInt();
                    System.out.print("Enter this task status, Choose one from the below \n");
                    System.out.print("\n1. To Do");
                    System.out.print("\n2. Done");
                    System.out.print("\n3. Doing");
                    System.out.print("\nenter number before the option of your choice : ");
                    int choice = scan.nextInt();
                    while(choice < 1 || choice > 3)
                    {
                        System.out.print("\nRange is between 1 and 3, please try again : ");
                        choice = scan.nextInt();                    
                    }
                    if(choice == 1)
                        task1.tStatus[a] = "To Do";
                    if(choice == 2)
                        task1.tStatus[a] = "Done";
                    if(choice == 3)
                        task1.tStatus[a] = "Doing";
                    
                    task1.creareTaskID(a);                        
                }
                if(option == 2)
                {
                    task1.printTaskDeatils(a);
                    a--;
                }
                if(option == 3)
                {
                    a = numberOfTasks;
                }            
            }    
        }
        // TODO code application logic here
    }

       
    }
    
}
 