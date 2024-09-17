
//create a Student class and generate result of student (Total, Per, Grade)

class Student
{
	int roll_no,sub1,sub2,sub3,total,obtained,result;
	float per;
	String name;
	void getdata(int r,String n,int s1,int s2,int s3)
	{
		roll_no=r;
		name=n;
		sub1=s1;
		sub2=s2;
		sub3=s3;

	}
	void calc()
	{
		total=sub1+sub2+sub3;
			System.out.println("total="+total);
		per=total/3;
		if(sub1<29 || sub2<29 || sub3<29)
	     {
		System.out.println("fail");
		return;
         }
     	else
       	{
		  per=(float)total/3;

  		System.out.println("percentage="+per);
		if(per>=70)
		{
		 System.out.println("distinction");
		}
		else if(per>=60)
		{
		 System.out.println("a grade");
		}
		else if(per>=50)
		{
		System.out.println("b grade");
		}
		else
		{
		System.out.println("pass");
		}
	   }
	}

	void display()
	{

	System.out.println("name="+name);

	System.out.println("rollno="+roll_no);

	System.out.println("sub1="+sub1);

	System.out.println("sub2="+sub2);

	System.out.println("sub3="+sub3);


	}
}
	class student_result
	{
		public static void main(String args[])
		{
			 Student s1=new Student();
			 s1.getdata(122,"saeed",90,90,90);
			 s1.display();
			 s1.calc();
		}
	}