import java.util.Scanner;
public class SumAndAverage {  
  public static void main(String[] args){       
    int i,number=0,sumNumber=0;
	double averageNumber;
    System.out.println("Insert 5 numbers...");     
	for (i=0;i<5;i++){
		    Scanner console = new Scanner(System.in);
		    number = console.nextInt();
  		sumNumber+=number;
	}
	averageNumber=sumNumber/5;
	System.out.println("The sum of 5 number is..." +sumNumber+"...The Average is..." +averageNumber);
}
}