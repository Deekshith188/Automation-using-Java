package com.sgtesting.absassign;
abstract class Sample1
{
	abstract void ShowStudentName();
	abstract void ShowStudentMarks();
	void Show1(String s)
	{
		System.out.println(s);
	}
}
class Student extends Sample1
{
	int Marks=0;
	String s;
	Student(String s,int Marks)
	{
		this.Marks=Marks;
		this.s=s;
	}
	void ShowStudentName()
	{
		super.Show1("Darshan");
		System.out.println("Student name is: "+s);
	}
	void ShowStudentMarks()
	{
		super.Show1("Deekshith");
		System.out.println("Students Marks are: "+Marks);
	}
}
class Student2 extends Student
{
	Student2()
	{
		super("Deekshith",95);
	}
	void Display1(String School)
	{
		System.out.println("School Name is: "+School);
	}
}
public class Assign1 {

	public static void main(String[] args) {
		Student2 ob=new Student2();
		ob.Show1("Darshan");
		ob.ShowStudentName();
		ob.ShowStudentMarks();
		ob.Display1("Vivekanand School");
	}
}