
// Write a java program to create a employee class and create a salary slip of an employee

class emp{
double grossSalary = 50000.0;

double basicSalary = grossSalary *50 /100;
double hra = grossSalary *30 /100;
double pf = basicSalary * 12/100;


void display()
{
System.out.println("Gross Salary"+grossSalary );

System.out.println("Basic Salary"+ basicSalary);

System.out.println("House Rental Allowance = "+hra );

System.out.println("Provident fund = "+pf );
}
}
class pr14{
public static void main(String args[]){

employee e1 = new employee();
e1.display();
}

}
