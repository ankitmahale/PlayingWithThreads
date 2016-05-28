/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

import java.io.IOException;

/**
 *
 * @author Ankit Mahale
 */
public class Driver {
     
   
   
    
    public static void main(String[] args) throws IOException, InterruptedException {
        int NUM_THREADS = 0;
        deLogger.setDebugValue(1);
        FileProcessor fileParser=new FileProcessor("C:\\Users\\Ankit Mahale\\Desktop\\Netbeans projects\\Assignment2\\src\\assignment2\\numbers");
        IsPrime primeChecker=new IsPrime();
        Results results=new Results();
        CreateWorkers createWorkers=new CreateWorkers(fileParser,primeChecker,results,NUM_THREADS);
        createWorkers.startWorkers(NUM_THREADS);
        results.contents();
        results.print();
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
