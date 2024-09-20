// Write a java program which implements the use of try catch


class pr40
{
public static void main(String args[])
{
int a[] = {1,3,4,5};
{
try{
System.out.println("The element at fourth index is:"+" "+a[4]);
}catch(ArrayIndexOutOfBoundsException e)
{
System.out.println("Bad index error");
}

System.out.println("The element at first index is:"+" "+a[1]);

System.out.println("The element atsecond index is:"+" "+a[2]);
}
}
}
