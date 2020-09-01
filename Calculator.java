package calculator;
import java.util.*;
public class Calculator {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		boolean continueTheCalculation=true;
		
		
		
		while(continueTheCalculation){
			
			System.out.println(" *** Basic Calculator In Java *** ");
			System.out.println(" Enter 1 For Addition.");
			System.out.println(" Enter 2 For Subtraction.");
			System.out.println(" Enter 3 For Multiplication.");
			System.out.println(" Enter 4 For Divison.");
			System.out.print(" Please Choose  The Opeartion:-");
			int ans=0;
			int chooseoperation=s.nextInt();
			System.out.println();
			switch(chooseoperation){
			
			case 1:
				System.out.print(" Enter The First Number:-");
				int firstnumadd=s.nextInt();
				System.out.print(" Enter The Second Number:-");
				int secondnumadd=s.nextInt();
				System.out.println();
				Addition obj1=new Addition(firstnumadd,secondnumadd);
				ans=obj1.addResult(firstnumadd,secondnumadd);
				System.out.println(" Addition Of The Numbers Is:"+ans);
				System.out.println();
				break;
			case 2:
				System.out.print(" Enter The First Number:-");
				int firstnumsub=s.nextInt();
				System.out.print(" Enter The Second Number:-");
				int secondnumsub=s.nextInt();
				System.out.println();
				Subtraction obj2=new Subtraction(firstnumsub,secondnumsub);
				ans=obj2.subResult(firstnumsub,secondnumsub);
				System.out.println(" Subtraction Of The Numbers Is:"+ans);
				System.out.println();
				break;
			case 3:
				System.out.print(" Enter The First Number:-");
				int firstnummultiply=s.nextInt();
				System.out.print(" Enter The Second Number:-");
				int secondnummultiply=s.nextInt();
				System.out.println();
				Multiplication obj3=new Multiplication(firstnummultiply,secondnummultiply);
				ans=obj3.multiplyResult(firstnummultiply,secondnummultiply);
				System.out.println(" Multiplication Of The Numbers Is:"+ans);
				System.out.println();
				break;
			case 4:
				System.out.print(" Enter The First Number:-");
			    int firstnumdivide=s.nextInt();
			    System.out.print(" Enter The Second Number:-");
			    int secondnumdivide=s.nextInt();
			    System.out.println();
				Divison obj4=new Divison(firstnumdivide,secondnumdivide);
				ans=obj4.divideResult(firstnumdivide,secondnumdivide);
				System.out.println(" Division Of The Numbers Is:"+ans);
				System.out.println();
				break;
				default:
					System.out.println(" *** Please Enter Valid Operation ***");
				}
			
			
			System.out.println("Do you Wish To Continue ?");
			System.out.println("Enter 'Yes' For Continue.");
			System.out.println("Enter 'No' To Exit");
			String str=s.next();
			if(str.equals("Yes"))
				continueTheCalculation=true;
			else{
				continueTheCalculation=false;
			
			}
			   
			  
		}
		
		
		
		
		
	}
	
	

}
