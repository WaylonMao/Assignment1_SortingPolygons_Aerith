1. Program: SORTING OUT SORTING

2. This application uses to analyse the performance experimental analyst of six sort algorithms by compared between two shapes.
   The program can sort by compared volume, base area and height of each shape. The program will display time to complete each
   sort algorithm on a screen.

 	- Bubble sort algorithm [b]
	- Insertion sort algorithm [i]
	- Selection sort algorithm [s]
	- Merge sort algorithm [m]
	- Quick sort algorithm [q]
	- Shell sort algorithm [z]

3. Date completed: October 07, 2022

4. Author: Weilong Mao, Hoa Le, Chris Wang, Hu Peng

5. Please check a program package to see all following files use to run

	- Sort.jar file: it uses to run program on command line.
	- readMe.txt file: the instruction on how to run this program 

6. Command line format explanation: to run program properly, user need to key command line correctly
   to avoid any disrupt from a program. The format command line is used on this application base on following:

    java -jar sort.jar -f"polyfor1.txt" -Tv -Sb
   
    + java -jar is used to run An executable Java Archive file
    + sort.jar is this program's jar file name
    + -f is defined starting txt file, the program will show error when user miss - or f.
    + polyfor1.txt is txt file name use for test algorithms, user can change to different files using txt format
    + -t is defined starting type of sort: a program can sort by volume, base area and height of shape. The
      program will show error when miss - or f.
    + v is defined compare type by volume of shape
    + a is defined compare type by base area of shape
    + h is defined compared type by height of shape
    + -s is defined starting which sort algorithms is used to sort. There are six sort algorithms can use on this
      program. The program will show error when miss either - or s
    + following "-s", user can select one of following keyword to choose the sort algorithm b,i,s,m,q,z. The program
	  will show error when miss or typo those keywords

6. How to run program: the program should need txt file places on your machine in order to run.	
   There are three ways you can place txt file in your machine:

    a/ store txt file at a place sort.jar is: in this case, key command line following format
		
        java -jar sort.jar -fpolyfor1.txt -Tv -Sb

    b/ store txt file at res source folder: in this case, key command line following format
		
        java -jar sort.jar -ta -sQ -f"res\polyfor3".txt
	
	    **Please note that make sure place " " similar on the command line as format above

    c/ store txt file at assigned directory in your machine: in this case, key command line following format
		
	    java -jar sort.jar -tH -F"C:\temp\polyfor5.txt" –sB

	    **Please note that make sure place " " similar on the command line as format above

        ***PLEASE PAY ATTENTION TO command line explanation on 6 to key correctly command line ***

7. The program is already handle all exceptions and unchecked errors. Therefore, user can get information to
   solve error that may encounter. In case of having issues with running this program, please contact us for
   more assistant.

   We hope you are enjoying with this program.

   Thank you for your patient.

