package edu.monmouth.lab1;

import java.io.FileNotFoundException;
import java.io.PrintStream;


public class Lab1 {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		//throws FileNotFoundException
		// try {
		 //   PrintStream newIO = new
		  //  PrintStream(Lab1Constants.LOGFILENAME); 
		  // System.setOut(newIO); System.setErr(newIO);
		//} catch (FileNotFoundException e) { 
		//	System.err.println("Cannot redirect STDERR or STDOUT "); 
		//	e.printStackTrace(); 
		//	System.exit(Lab1Constants.REDIRECTFAILURE);
		//}
	
		
		Student students [] = new Student []{
			new Student(100,18,"John"),
            new Student(101,19,"Jane"),
            new Student(102,20,"Larry"),
            new Student(103,20,"Karen"),
            new Student(104,21,"Karl")};
            
		System.out.println("There are "+students.length+" student/s  in this array");
		
		System.out.println("\n-------------student in the array-------------");
            for (int i=0;i<students.length;i++) {
            	System.out.println(students[i].toString());
            	System.out.println();
            	
            }
            students[2]= new Student(102,21,"Larry");
	
            System.out.println("-------------student/s under 20-------------");
            for (int i=0;i<students.length;i++) {
            	if(students[i].getAge()<20) {
            	System.out.println(students[i].toString());
            	System.out.println();
            }
            	}
             Student newStudents [] = new Student[Lab1Constants.STUDENTSIZE] ;
            
             System.arraycopy(students, 2, newStudents, 0, 3);
             //System.ar
             
             System.out.println("-------------New student array-------------");
             for (int i=0;i<newStudents.length;i++) {
             	System.out.println(newStudents[i].toString());
             	System.out.println();
             
             	
             	
             	
            }
            
}}
	        
	        

