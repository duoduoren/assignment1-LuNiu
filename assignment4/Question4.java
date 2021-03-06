package assignment4;

import java.util.ArrayList;

class Student { // score 1
	String studentName;
	int studentId;
	
	public Student(String studentName, int studentId) {
		this.studentName = studentName;
		this.studentId = studentId;
	}
	
	public void setStudentName(String name) {
		this.studentName = name;
	}
	
	public void setStudentId(int id) {
		this.studentId = id;
	}
	
	public String getStudentName() {
		return this.studentName;
	}
	
	public int getStudentId() {
		return this.studentId;
	}
	
	public String getStudent() {
		return ("this.studentName:" + " this.studentId");
	}
}

class Course {
	String courseName;
	int numberOfStudents = 0;
	ArrayList<Student> registeredStudents;
	
	public Course(String title) {
		this.courseName = title;
		
		// Max 10 students are allowed in one course.
		this.registeredStudents = new ArrayList<Student>();
	}
	
	public ArrayList<Student> getStudents() {
		return this.registeredStudents;	
	}
	
	public void setNumberOfStudents(int numberOfStudents) {
		this.numberOfStudents = numberOfStudents;
	}
	
	public int getNumberOfStudents() {
		return this.numberOfStudents;
	}
	
	public String getCourseName() {
		return this.courseName;
	}
	
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
	public boolean courseIsFull() {
		if (numberOfStudents >= 10) {
			return true;
		} else {
			return false;
		}
	}
	
	void registerStudent(Student student) { // you missed to update numberOfStudents after adding to course.
		if (!this.courseIsFull()) {// you didn't check if same student is registering multiple times
			this.registeredStudents.add(student);
		}
	}
	
	public static void main(String[] args) {
		Student newStudent = new Student("Jason", 123);
		Course newCourse = new Course("Math");
		newCourse.registerStudent(newStudent);
	}
}

