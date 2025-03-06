package StudentManagementSystem;

public class Student {
	
	int rollno, age;
	String name, course;
//	Student()
//	{
//	rollno=0;
//	name=null;
//	age=0;
//	course=null;
//	}
//	
	Student (int r, String n, int a, String c)
	{
		rollno=r;
		a = age;
		course=c;
		int temp=0;
		
		//Name validation
		
		for(int i=0;i<n.length();i++)
		{
			char ch;
			ch=n.charAt(i);
			
			if(ch<'A' || ch>'Z' && ch<'a' || ch>'z')
			{
				temp=1;
			}
		}
		
		try {
			if(temp==1)
			{	
				throw new NameNotValidException();
			}else 
				
				name=n;
			}catch(NameNotValidException e1)
		{
				e1.namevalid();
			System.out.println("Name should not contain special symbols or numbers");
		}
		
		//Age validation
		try {
			
			if(a >= 15 && a <= 21)
				a=age;
				
			else 
				throw new AgeNotWithinRangeException();
		}
		catch(AgeNotWithinRangeException e2)
		{
			System.out.println("Age Should be between 15 and 21");
		}
		
	}
	
	void display() {
		System.out.println("Roll No: " +rollno);
		System.out.println("Name: " +name);
		System.out.println("Age: " +age);
		System.out.println("Course: " +course);
	}
	

}
