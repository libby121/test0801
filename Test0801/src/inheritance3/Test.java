package inheritance3;

import java.util.Arrays;

public class Test {
	public static void main(String[] args) {

		Furniture[] mySaloon = new Furniture[20];

		//int [] furnitures = new int[20];
		for (int i = 0; i < mySaloon.length; i++) {
			//furnitures[i]=(int)(Math.random()*4+1);
			int random=(int)(Math.random()*3+1);
			if(random==1){
				mySaloon[i]=new Bed();
				//mySaloon[i]=new Bed(randomDouble(),randomDouble(),randomDouble(),randomColor(),randomBoolean());
			}
		}

	}

	public static String randomColor(){
		String randomColors[] = { "Brown", "Dark", "beige", "White" };
		return randomColors[(int) (Math.random() * 4)];
	}

	public static double randomDouble(){

		return (Math.random() * 100)+1;
	}
	
	public static boolean randomBoolean(){
		int random=(int)(Math.random()*2);
		
		return random==0?false:true;
	}
}


