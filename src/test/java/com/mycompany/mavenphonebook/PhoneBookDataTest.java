/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenphonebook;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Stiv
 */
public class PhoneBookDataTest {
    
    public PhoneBookDataTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of addContact method, of class PhoneBookData.
     */
    
    
    
            
            
            
            
            
    @Test
    public void testAddContact() {
        System.out.println("addContact");
        String _contactName = "";
        String _contactNumber = "";
        PhoneBookData instance = new PhoneBookData();
        boolean expResult = false;
        boolean result = instance.addContact(_contactName, _contactNumber);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSize method, of class PhoneBookData.
     */
    @Test
    public void testGetSize() {
        System.out.println("getSize");
        PhoneBookData instance = new PhoneBookData();
        int expResult = 0;
        int result = instance.getSize();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findContactAt method, of class PhoneBookData.
     */
    

    /**
     * Test of deleteContact method, of class PhoneBookData.
     */
    @Test
    public void testDeleteContact() {
        System.out.println("deleteContact");
        String _contactName = "";
        String _contactNumber = "";
        PhoneBookData instance = new PhoneBookData();
        boolean expResult = false;
        boolean result = instance.deleteContact(_contactName, _contactNumber);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
