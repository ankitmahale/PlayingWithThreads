/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

/**
 *
 * @author Ankit Mahale
 */
public class IsPrime {
    
    public IsPrime()
    {
        deLogger.writeMessage("IsPrime Constructor is called \n", deLogger.DebugLevel.CONSTRUCTOR);
    }
    
    public int prime_checker(int num)
    {
        if(num%2==1)
        return num;
        return -1;
    
    }        
    
    
    
    
    
}
