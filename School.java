package com.encapsulation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class School {
	String School_name;

	 List<Teacher> list=new ArrayList<Teacher>();
		Scanner sc=new Scanner(System.in);
		int id;
		String subject;
		
		int age;
		String name;
		public enum subjectlist { MATHS, CHEM, PHYSICS;}  

public  void Disp() {
	
	try {



	System.out.println("enter the ID");
	 id=sc.nextInt();

	System.out.println("enter the name");
	 name=sc.next();

	System.out.println("enter the subject");
	 subject=sc.next();

	System.out.println("enter the age");
     age=sc.nextInt();
     	
    
	try {
	    subjectlist.valueOf(subject);
	    list.add(new Teacher(id,name,subject, age));

	    System.out.println(list);

	} catch ( IllegalArgumentException e ){
		
	    System.out.println( "subject is not part of the ENUM list" );
	}
	
	
     
	}
	catch(Exception e) {
	
	System.out.print(e);
}
     


}
	
public  void ListTeacher() {
	try {
		
	
	for(Teacher t:list) {
		System.out.println("\n");

		System.out.println("Teacher ID:"+t.getID());
		System.out.println("Teacher name:"+t.getName());
		
		
		//Arrays.asList(String.valueOf(subject)).forEach(subject -> System.out.println("Teacher Subject is : "+subject));
		
	
		System.out.println("Teacher Subject:"+t.getSubject());
		System.out.println("Teacher Age:"+t.getAge());


	}
	
	System.out.println();
	System.out.println("Total Teachers:"+list.size());}
	//System.out.println("Removing list Of Teacher:"+list.remove(0));
	//System.out.println("Total Teachers:"+list.size());
	catch(Exception e){
		System.out.print(e);
	}

}
public void displayNameAndSubject() {
	
	list.stream().forEach(k-> System.out.print("Teacher name is"+k.getName()+"  Subject is "+ k.getSubject()+"\n"));
	
}
public void specificID() throws InvalidIdException  {
	
	System.out.println("Enter the Specific Id to get details");
	 id=sc.nextInt();
	 try {
		
	 
	 list=list.stream().filter(k->k.getID()==id).collect(Collectors.toList());
	 }
	 catch(Exception e) {
		 System.out.print(e);
	 }
	 System.out.print(list);
	 
	 }
	


    
public void remove() {
	
		
	System.out.println();
	System.out.println("Enter the Specific Id to remove");
	id=sc.nextInt();
	 
	 try {
	 for(Teacher t:list)
	 {
	 if(id==t.getID())
	 {
		System.out.println("Removing list Of Teacher:"+list.remove(t));
		
		specificID();
		
	 }
	 }}
	 catch(Exception e)
	 {
		 System.out.println("There is no specific ID present");
	 }
		 
	 }


public static void main(String args[]) throws InvalidIdException {
	School s=new School();
	s.Disp();
	s.displayNameAndSubject();
	s.ListTeacher();
	s.specificID();
	s.remove();
	
	
}
}