/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package login.part1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Student
 */
public class LoginTest {
    
    public LoginTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of checkUserName method, of class Login.
     */
    @Test
    public void testCheckUserName() {
        System.out.println("checkUserName");
        String username = "";
        Login instance = new Login();
        boolean expResult = false;
        boolean result = instance.checkUserName(username);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkPasswordComplexity method, of class Login.
     */
    @Test
    public void testCheckPasswordComplexity() {
        System.out.println("checkPasswordComplexity");
        String password = "";
        Login instance = new Login();
        boolean expResult = false;
        boolean result = instance.checkPasswordComplexity(password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkCellPhoneNumber method, of class Login.
     */
    @Test
    public void testCheckCellPhoneNumber_String_CharSequence() {
        System.out.println("checkCellPhoneNumber");
        String Phone = "";
        CharSequence phone = null;
        Login instance = new Login();
        boolean expResult = false;
        boolean result = instance.checkCellPhoneNumber(Phone, phone);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkCellPhoneNumber method, of class Login.
     */
    @Test
    public void testCheckCellPhoneNumber_String() {
        System.out.println("checkCellPhoneNumber");
        String Phone = "";
        Login instance = new Login();
        boolean expResult = false;
        boolean result = instance.checkCellPhoneNumber(Phone);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of registerUser method, of class Login.
     */
    @Test
    public void testRegisterUser() {
        System.out.println("registerUser");
        String username = "";
        String password = "";
        String phone = "";
        Login instance = new Login();
        String expResult = "";
        String result = instance.registerUser(username, password, phone);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of loginUser method, of class Login.
     */
    @Test
    public void testLoginUser() {
        System.out.println("loginUser");
        String username = "";
        String password = "";
        Login instance = new Login();
        boolean expResult = false;
        boolean result = instance.loginUser(username, password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of returnLoginStatus method, of class Login.
     */
    @Test
    public void testReturnLoginStatus() {
        System.out.println("returnLoginStatus");
        boolean isLoggedIn = false;
        Login instance = new Login();
        String expResult = "";
        String result = instance.returnLoginStatus(isLoggedIn);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class Login.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Login.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
