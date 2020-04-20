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
public class PhoneBookItemTest {
    
    public PhoneBookItemTest() {
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
     * Test of getContactName method, of class PhoneBookItem.
     */
    @Test
    public void testGetContactName() {
        System.out.println("getContactName");
        PhoneBookItem instance = null;
        String expResult = "";
        String result = instance.getContactName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class PhoneBookItem.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        String _contactName = "";
        String _contactNumber = "";
        PhoneBookItem instance = null;
        boolean expResult = false;
        boolean result = instance.equals(_contactName, _contactNumber);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    @Test
    public void testNonEqualEntriesComeOutAsNonEqual() {
        
    }
    
    @Test
    public void testNonEqualEntries() {
        
    }

    /**
     * Test of setContactName method, of class PhoneBookItem.
     */
    @Test
    public void testSetContactName() {
        System.out.println("setContactName");
        String ContactName = "";
        PhoneBookItem instance = null;
        instance.setContactName(ContactName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getContactNumber method, of class PhoneBookItem.
     */
    @Test
    public void testGetContactNumber() {
        System.out.println("getContactNumber");
        PhoneBookItem instance = null;
        String expResult = "";
        String result = instance.getContactNumber();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setContactNumber method, of class PhoneBookItem.
     */
    @Test
    public void testSetContactNumber() {
        System.out.println("setContactNumber");
        String ContactNumber = "";
        PhoneBookItem instance = null;
        instance.setContactNumber(ContactNumber);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
