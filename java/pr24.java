// Write a java program which implements method overriding


class student{

//method to be overriden 
public void rollno()

{
System.out.println("The roll no is:");
}

}

class Aadil extends student{

	public void rollno()
	{
		System.out.println("The roll no of Aadil is 102");
	}

}

class  Saeed extends student{

	public void rollno()
	{
		System.out.println("The roll no of Aadil is 122");
	}

}

class pr24{

public static void main(String args[])
{
//Creating objects
student s1 = new student();
Aadil a = new Aadil();
Saeed s = new Saeed();
//Calling the overriden methods
s1.rollno();
a.rollno();
s.rollno();
}
}
