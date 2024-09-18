// Write  a java program which implements the use of multiple interface


interface student 
{
int rno = 102;
String name = "AADILKHAN";
void putdata();
} 

interface marks extends student
{
int sub1 = 90, sub2 = 80;
void displayMarks();
}

class result implements marks
{
	int total;

	public void putdata()
	{
		System.out.println("ROLL NO: "+ " "+rno);

		System.out.println("NAME: "+ " "+name);
	}

	public void displayMarks()
	{
		System.out.println("SUBJECT 1:" + " "+sub1);
		
		System.out.println("SUBJECT 2:"+ " "+sub2);
	}
	void display()
	{
		total = sub1 + sub2;
		
		System.out.println("TOTAL:"+ " "+total);
	}

}

class pr28
{

public static void main(String []args)
{
		result r1 = new result();
		r1.putdata();
		r1.displayMarks();
		r1.display();
}

}
