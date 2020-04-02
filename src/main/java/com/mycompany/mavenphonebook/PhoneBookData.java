/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenphonebook;

import java.util.ArrayList;
import java.util.Observable;


/**
 *
 * @author Stiv
 */
public class PhoneBookData extends Observable{
    
    ArrayList<PhoneBookItem> contactList;
    
    PhoneBookData()
    {
        contactList = new  ArrayList<PhoneBookItem>();
    }
    
    public boolean addContact(String _contactName, String _contactNumber)
    {
        //if is a phone number it must be at least 7 digits
        //for name it 
        if (_contactName==null||_contactNumber==null) return false;
        if (_contactName.equals("")) return false;
        if (_contactNumber.length()<7) return false;
        if (!_contactNumber.matches("[0-9]+")) return false;
        if (findContactAt(_contactName, _contactNumber)>-1) return false;
        PhoneBookItem pbi = new PhoneBookItem(_contactName, _contactNumber);
        contactList.add(pbi);
        setChanged();
        notifyObservers(this);
        return true;
    }
    
    public int getSize()
    {
        return contactList.size();
    }
    
    public int findContactAt(String _contactName, String _contactNumber)
    {
        for (int i=0;i<contactList.size();i++)
        {
            if (contactList.get(i).equals(_contactName,_contactNumber)) return i;
        }
        return -1;
    }
    
    
    public boolean deleteContact(String _contactName, String _contactNumber)
    {
        int at = findContactAt(_contactName,_contactNumber);
        if (at<0) return false;
        contactList.remove(at);
        setChanged();
        notifyObservers(this);
        return true;
        
    }
    

            
    
}



