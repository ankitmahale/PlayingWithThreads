/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

import java.util.Enumeration;
import java.util.LinkedList;
import java.util.Vector;

/**
 *
 * @author Ankit Mahale
 */
public class Results implements StdoutDisplayInterface{
    
    Vector v1;
    
    public Results()
    {
        deLogger.writeMessage("Results Constructor is called \n", deLogger.DebugLevel.CONSTRUCTOR);
       v1=new Vector();
    }
    
    
     void add_to_list(int number)
    {
        deLogger.writeMessage("Value "+ number + " added to the data Structures \n", deLogger.DebugLevel.ENTRY_ADDED);
        v1.add(number);
        
       
    }
    public void print()
    {
           int sum=0;
           
           for(int i=0;i<v1.size();i++)
           {
              sum=sum + Integer.parseInt(v1.get(i).toString());
           }
           deLogger.writeMessage("The sum of all the prime numbers is:" + sum + "\n", deLogger.DebugLevel.NO_OUTPUT);
           deLogger.writeMessage("The sum of all the prime numbers is:" + sum + "\n", deLogger.DebugLevel.CONTENTS);
           deLogger.writeMessage("The sum of all the prime numbers is:" + sum + "\n", deLogger.DebugLevel.ENTRY_ADDED);
           deLogger.writeMessage("The sum of all the prime numbers is:" + sum + "\n", deLogger.DebugLevel.RUN_CALLED);
           deLogger.writeMessage("The sum of all the prime numbers is:" + sum + "\n", deLogger.DebugLevel.CONSTRUCTOR);
         
    }
    
    public void contents()
    {
        
        for(int i=0;i<v1.size();i++)
        {
             deLogger.writeMessage(v1.get(i).toString() + " ", deLogger.DebugLevel.CONTENTS);    
        }    
    
    }        
 
}
