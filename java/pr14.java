// 14. Write a Java Program to create an Employee class and generate Salary Slip for the employee. 
// employee salary slip
// e_no,name,basic_salary
//Da 90% of basic_salary
//hra 10% of basic_salary
//ma 300 rs
//pf 10% of basic_salary
//gross_salary=basic_salary+da+hra+ma
//net_salary=gross_salary-pf

class Employee
{
	int eno,basic_salary;
	String name;
	float da,hra,ma,pf,gross_salary,net_salary;
    void getdata(int a, String s, int b)
    {
    	eno=a;
    	name=s;
    	basic_salary=b;
    }
    void calc()
    {
    	da=90*basic_salary/100;
    	hra=10*basic_salary/100;
    	ma=300;
    	pf=10*basic_salary/100;
    	gross_salary= basic_salary + da + hra + ma;
    	net_salary=gross_salary-pf;
    }
    void display()
    {
      System.out.println("employee no="+eno);

      System.out.println("name="+name);
      System.out.println("basic salary="+basic_salary);
      System.out.println("da="+da);
      System.out.println("hra="+hra);
      System.out.println("ma="+ma);
      System.out.println("pf="+pf);
      System.out.println("gross salary="+gross_salary);
      System.out.println("net salary="+net_salary);
    }
}
    class employee_salary
	{
		public static void main(String args[])
		{
		  Employee E1=new Employee();
		  E1.getdata(122,"saeed",25000);
		   E1.calc();
		  E1.display();

		}
	}