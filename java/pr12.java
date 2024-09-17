// 12.Write a java program to sort the elements of an array in 
// Ascending order
    

///sort elements in ascending order

class pr12
{
	 public static void main(String args[])
	 {
	 	int x[]={10,50,90,70,20,80,40,60,30,1};
	 	int i,j,temp;
	 	System.out.println("before sorting");
	 	for(i=0;i<x.length;i++)
	 	{
	 		System.out.println(x[i]+" ");
	 	}
	 	for(i=0;i<x.length;i++)
	 	{
	 		for(j=0;j<i;j++)
	 		{
	 			if(x[i]<x[j])
	 			{
	 				temp=x[i];
	 				x[i]=x[j];
	 				x[j]=temp;
	 		    }
	 	    }
	    }
	    System.out.println("\nafter sorting in ascending order");
	    for(i=0;i<x.length;i++)
	 	{
	 		System.out.println(x[i]+" ");
	 	}
    }
}

