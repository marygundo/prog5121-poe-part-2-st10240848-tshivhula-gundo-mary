/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.Test;

/**
 *
 * @author ST10240848
 */
public class LoginTest 
{
    Login response = new Login();
    public LoginTest() 
    {
        
    }

    @Test
    public void CheckPasswordComplexity()
    {
        String expectedString = "Please enter Password";
        String actual = response.ReturnLoginStatus(true);
        assertEquals(expectedString,actual);
    }
    
@Test
public void testCalculationNumResponse (String pw)
     {
         int expected = 50;
         
         boolean actual = response.CheckPasswordComplexity(pw);
         assertEquals(expected,actual);
     }
}