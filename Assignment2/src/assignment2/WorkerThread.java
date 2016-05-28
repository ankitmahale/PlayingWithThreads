/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Ankit Mahale
 */
public class WorkerThread implements Runnable{
    
    public FileProcessor fileParser;
    public IsPrime primeChecker;
    public Results results;
   
    
    WorkerThread() {
        
    }

    WorkerThread(FileProcessor fileParser, IsPrime primeChecker, Results results) {
        deLogger.writeMessage("WorkerThread Constructor is called \n", deLogger.DebugLevel.CONSTRUCTOR);
        this.fileParser=fileParser;
        this.primeChecker=primeChecker;
        this.results=results;
        
    }
    
    
    public void run(){
             
       
            deLogger.writeMessage("RUN IS CALLED\n", deLogger.DebugLevel.RUN_CALLED);
            int temp=10,number=0;
            String line;
            int is_prime_number;
            
        try {
            while((line=fileParser.readLineFromFile())!="")
            {   
                number=Integer.parseInt(line);
               
                is_prime_number=primeChecker.prime_checker(number);
                if(is_prime_number!=-1)
                { 
                    
                    results.add_to_list(is_prime_number);
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(WorkerThread.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
 
    
}
