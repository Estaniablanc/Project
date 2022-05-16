package edu.monmouth.lab1;

public class Student {
	private int id,age;
    private String name;
    
    
    public Student (int id,int age,String name) {
   	 this.id=id;
   	 this.age=age;
   	 this.name=name;
    }
    public int getId() {
   	 return id;
    }
    public int getAge() {
   	 return age;
    }
    public String getName() {
   	 return name;
    }
    public void setId(int id) {
   	 this.id=id;
    }
    public void setAge(int age) {
   	 this.age=age;
    }
    public void setName(String name) {
   	 this.name=name;
    }
    public boolean equals(boolean Object) {
		return Object;
   	 
    }
    public String toString() {
   	 return "Student name: "+name+"\nStudent Id: "+id+"\nStudent age: "+age;
    }
}
