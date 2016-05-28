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
public class CreateWorkers {

    public FileProcessor fileParser;
    public IsPrime primeChecker;
    public Results results;
    int NUM_THREADS;
    
    
    CreateWorkers(FileProcessor fileParser, IsPrime primeChecker, Results results,int NUM_THREADS) {
       
        deLogger.writeMessage("CreateWorkers Constructor is called \n", deLogger.DebugLevel.CONSTRUCTOR);
        this.fileParser=fileParser;
        this.primeChecker=primeChecker;
        this.results=results;
        this.NUM_THREADS=NUM_THREADS;
    }
    
    public void startWorkers(int NUM_THREADS) throws IOException, InterruptedException
    {
         WorkerThread workerThread=new WorkerThread(fileParser,primeChecker,results);
      
        Thread t[]=new Thread[5];
        int j;
        for(j=0;j<5; j++)
        {
            t[j]=new Thread(workerThread);
            t[j].start();
        }
        for(j=1;j<5; j++)
        {
           
            t[j].join();
        }
         
       
         
    }        
    
    
    
    
    
}
