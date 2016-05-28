

CS542 Design Patterns
Spring 2016
PROJECT 2 README FILE

Due Date: Friday, January 29, 2016
Submission Date: Friday, January 29, 2016
Grace Period Used This Project: 0 Days
Grace Period Remaining: 0 Days
Author(s): Ankit R Mahale
e-mail(s): amahale2@binghamton.edu


PURPOSE:

[
     To better understand the concept of Multithreading by scheduling n threads(upto 5) each of them doing the same sort of work.

]

PERCENT COMPLETE:

[
  I believe I have completed 100% of this project.
  
]

PARTS THAT ARE NOT COMPLETE:

[
  No parts of the projects are incomplete.
]

BUGS:

[
	None

  ]

FILES:

[
  Document here a list of the files that are necessary for the project to run.
  Here is a sample:

  Included with this project are 5 files:

  Driver.java, contains main file.
  FileProcessor.java, processes the input file line-by-line.
  Isprime to find the prime numbers.
  Logger to print the system output line to Stdout.
  Create Workers to create NUM_THREADS no of threads.
  WorkerThread to run the threads. 
  Results to display the elements in vector and to print the sum          of elements.
  README, the text file you are presently reading
]

SAMPLE OUTPUT:

[
  Copy and paste a recent CORRECT output from your test runs, ALONG with the
  command line. Cut it short if more than 10 lines. Here is a sample:

bingsuns2% ant -buildfile src/build.xml run -Darg0=input.txt -Darg1=5 -Darg2=3
Buildfile: src/build.xml

jar:
      [jar] Building jar: /u0/users/7/dladwa1/ankitmahale/ankit_mahale_assign2/primeThreads/BUILD/jar/primeThreads.jar

run:
     [java] RUN IS CALLED FOR Thread-3
     [java] RUN IS CALLED FOR Thread-1
     [java] RUN IS CALLED FOR Thread-0
     [java] RUN IS CALLED FOR Thread-2
     [java] RUN IS CALLED FOR Thread-4

BUILD SUCCESSFUL
Total time: 3 seconds
bingsuns2% 


]

TO COMPILE:

[

   bingsuns2% ant -buildfile src/build.xml all
Buildfile: src/build.xml

prepare:

primeThreads:
    [javac] Compiling 7 source files to /u0/users/7/dladwa1/ankitmahale/ankit_mahale_assign2/primeThreads/BUILD/classes
    [javac] Note: /u0/users/7/dladwa1/ankitmahale/ankit_mahale_assign2/primeThreads/src/primeThreads/store/Results.java uses unchecked or unsafe operations.
    [javac] Note: Recompile with -Xlint:unchecked for details.

compile_all:

all:

BUILD SUCCESSFUL
Total time: 5 seconds  

]

TO RUN:

[

    The program can be run by command:bingsuns2% ant -buildfile src/build.xml run -Darg0=input.txt -Darg1=4 -Darg2=3


]

EXTRA CREDIT:

[
"N/A"
]


BIBLIOGRAPHY:

This serves as evidence that we are in no way intending Academic Dishonesty.
ANKIT R MAHALE

[
  
  Here are some samples:

  

  * Head First Java, 2nd Edition.

ACKNOWLEDGEMENT:

[
  
]

Reason for using specific Data STructures
[
 
I have used Vector because it is the synchronized data structure and as we are using the threads its the best data structure to schedule the threads as the start.

Time complexity

    remove: O(1)
    size: O(1)
    values: O(n) ]


