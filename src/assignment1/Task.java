/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;

/**
 *
 * @author st10220249
 */
public class Task 
{ 
    String[] tName;
    int taskNum;
    String[] taskDescript;
    String[] developDetails;
    int[] taskDuration;
    String[] taskId;
    String[] tStatus;
    
    public Task(int numberOfTask)
    {
        tName = new String[numberOfTask];
        taskNum = 0;
        taskDescript = new String[numberOfTask];
        developDetails = new String[numberOfTask];
        taskDuration = new int[numberOfTask];
        taskId = new String[numberOfTask];
        tStatus = new String[numberOfTask];       
    }
    
    public boolean checkTaskDescription(String description)
    {
         return (description.length() <= 50);                
    }
    public String creareTaskID(int taskNumber)
    {
        taskId[taskNumber] = tName[taskNumber].substring(0, 2).toUpperCase() + ":" + taskNumber + ":" + developDetails[taskNumber].substring(developDetails[taskNumber].length() - 3).toUpperCase(); 
        return taskId[taskNumber];
    }
    public void printTaskDeatils(int TotalTasks)
    {
        System.out.print("\n\nTasks saved so far....\n");
        System.out.print("\n\ttaskID\ttaskName\tDuration\tStatus\tDescription\tDeveloper\n");
        for(int a = 0; a < TotalTasks; a++)
        {
            System.out.print("\n" + (a+1) + ".\t" + taskId[a] + "\t" + tName[a] + "\t" + taskDuration[a] + "\t" + tStatus[a] + "\t" + taskDescript[a] + "\t" + developDetails[a]);            
        }
        System.out.print("\n\nTotal tasks duration : " + returnTotalhours(TotalTasks) + "\n\n");
    }
    
    public int returnTotalhours(int TotalTasks)
    {
        int totalHours = 0;
        for(int a = 0; a < TotalTasks;a++)
            totalHours = totalHours + taskDuration[a];        
        return totalHours;
    }
    
}
