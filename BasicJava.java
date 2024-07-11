package basicjava;

import java.util.ArrayList;
import java.util.Scanner;

public class BasicJava {

	public static void main(String[] args) {
		 
		//System.out.println("hello");
		
		//----------------DATA TYPE DEFINE-----------------
		/* int number= 10;
		float number1= (float) 12.9;
		double number2= 1000;
		boolean  result = true;
		
		String text = "Sultana";
		
		System.out.println("INT: "+number);
		System.out.println("FLOAT: "+number1);
		System.out.println("DOUBLE: "+number2);
		System.out.println("BOOLEAN: "+result);
        System.out.println("STRING: "+text);
        */
		//------------------USER INPUT TAKEN--------------
		/*
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your number:");
		int number = input.nextInt();
		 */
		
		//-------------------CONDITION--------------------
		/*Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your 1st number:");
		int number = input.nextInt();
		System.out.println("Enter your 2nd number:");
		int number2 = input.nextInt();
		if(number>number2) {
			System.out.println(  number+"  is grater than "+number2);
		}
		else if(number<number2) {
			System.out.println(  number+"  is less than "+number2);
		}
		else
		{
			System.out.println(  number+"  is equal to "+number2);
		}*/
		//---------------------------------------Condition--------------------------
        /*Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your  text:");
		String text = input.nextLine();
		System.out.println("Enter your text2:");
		String text2 = input.nextLine();
		if(text.equals(text2)){
			System.out.println(  text+"  is exact similar  "+text2);
		}
		else if(text.equalsIgnoreCase(text2) ) {
			System.out.println( text+"  is partially similar "+text2);
		}
		else {
			System.out.println( text+"  is  not similar "+text2);
		}*/
		//-----------------------------------LOOP--------------------------
		/*String[] names= {"Kazi","Sultana","Margia"};
		System.out.println(names[0]);
		System.out.println(names.length);
		
		for(int i=0; i<=names.length; i++) {
			System.out.println(names[i]);
		}*/
		//---------------------ARRAYLIST-----------------
		ArrayList<String> names = new ArrayList<String>();
		System.out.println(names);
		names.add("Kazi");
		names.add("Sultana");
		names.add("Margia");
		names.add("Richi");
		System.out.println(names);
		
		System.out.println(names.get(0));
		
		names.remove(1);
		System.out.println(names);
		
		names.clear();
		System.out.println(names);
	}

}
