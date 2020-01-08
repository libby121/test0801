package Exceptions;

import java.util.Scanner;
import java.util.*;

public class Demo {

	public static void main(String[] args) {

		
		int x = 1;

		do {
			
			try {
				Scanner sc = new Scanner(System.in);	//scanner obj should be in try scope.scanner closes whenever it reaches exception		
				System.out.println("first num");
				int userNum = sc.nextInt();

				System.out.println("second num");
				int userNum2 = sc.nextInt();

				int divisions = ( userNum / userNum2);//if its double then its no exception to divide by zero

				System.out.println(divisions);
				x++;

			} catch (Exception e) {//infinity ignores the msg and the exception
				System.out.println(" you cant do that");
			}
			finally{
				System.out.println("program continues");
			}
		} 
		while (x == 1);
	}
}