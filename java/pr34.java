// Write a java program which will find the occurences of a particular word from a string


import  java.util.Scanner;

class pr34{

public static void main(String args[])
{
Scanner s1 = new Scanner(System.in);


System.out.println("Enter Text:");
String text = s1.nextLine().toLowerCase();

System.out.println("Enter the word whose occurence do you want to count:");
String word = s1.nextLine().toLowerCase();

int count = 0;
int index = 0;

while((index = text.indexOf(word,index))!= -1)
{
count++;
index +=word.length();
}

System.out.println("The word "+" "+word+" "+"appers"+" "+count+" "+"times");

}
}
