package project09;

public class class42_Students {
	// String name;
	// int age;
	
	
	// class42_Students(){
	// 	name = "unknown";
	// 	age = 0;			
	// }
	
	// class42_Students(String name, int age){
	// 	this.name = name;
	// 	this.age = age;	
	// }
	
	// void printStudent() {
	// 	System.out.println("이름: "+name+", 나이: "+age);
	// }
	private String name;
	private String studentNumber;
	private int grade;
	
	class42_Students() {
		name = "";
		studentNumber = "";
		grade = 0;
	}	
	
	class42_Students(String studentNumber, int grade) {
		name = "학생";
		this.studentNumber = studentNumber;
		this.grade = grade;
	}
	
	class42_Students(String name, String studentNumber, int grade) {
		this.name = name;
		this.studentNumber = studentNumber;
		this.grade = grade;
	}
	
	String getName() {
		return name;
	}
	
	int getGrade() {
		return grade;
	}
	
	public String toString() {
		return "이름 : " + name + ", 학년 : " + grade + ", 학번 : " + studentNumber;
	}


}
