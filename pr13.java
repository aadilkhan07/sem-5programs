// Write a java program to create a satudent class that will generate a result for the student 

class student {
		int no;
		String name;
		void getData(int n , String na){
			no = n;
			name = na;
			
		}
	
}

class marks extends  student{
	
	int sub1, sub2,sub3, total , per;
	
	void getMarks(int s1,  int s2, int s3){
		sub1 = s1;
		sub2 = s2;
		sub3 = s3;
	}
void calculateResult(){
		total = sub1+sub2+sub3;
		per = total/3;
}
void display(){
	System.out.println("ROLL NO " + no);
	System.out.println("NAME =" + name);
	System.out.println("MARKS IN SUBJECT1 = "+ sub1);
	System.out.println("MARKS IN SUBJECT2 = "+ sub2);
	System.out.println("MARKS IN SUBJECT3 = "+ sub3);
	System.out.println("TOTAL = "+ total);
	System.out.println("PERCENTAGE= "+ per);
}
}
class calling{
	public static void main (String[] args) {
    marks m1 = new marks();
    
    m1.getData(102,"AADIL");
    m1.getMarks(90,87,66);
    m1.calculateResult();
    m1.display();
    }
}