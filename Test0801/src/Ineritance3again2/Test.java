package Ineritance3again2;

import java.util.Arrays;

public class Test {
	public static void main(String[] args) {

		Furniture[] furnitures = new Furniture[20];
		
		int randomNum=0;
		for (int i = 0; i < furnitures.length; i++) {
			randomNum= (int)(Math.random()*3+1);
			if(randomNum==1){
				furnitures[i]=new Table(randomInt(), randomInt(), randomInt(),randomString(), randomInt() );
				
			}
			else if(randomNum==2){
				furnitures[i]=new Chair(randomInt(), randomInt(), randomInt(),randomString(), randomInt() );
				
			}
			else furnitures[i]= new Bed(randomInt(), randomInt(), randomInt(),randomString() ,yesOrNot() );
		}
	
	System.out.println(Arrays.toString(furnitures));
	
	for (int i = 0; i < furnitures.length; i++) {
		furnitures[i].draw();
		
	}
	
	for (int i = 0; i < furnitures.length; i++) {
		if (furnitures[i]instanceof Table){
			Table table= (Table)(furnitures[i]);
			System.out.println(table.getPlacesNum());
		}
		else if(furnitures[i]instanceof Chair){
			Chair chair = (Chair)(furnitures[i]);
			System.out.println(chair.getLegsNum());
		}
		else if(furnitures[i] instanceof Bed){
			Bed bed= (Bed)(furnitures[i]);
			System.out.println(bed.isDoubleSizeOrNot());
		
		}
		
		
	}
	}

public  static int randomInt(){
	return ((int)(Math.random()*25+10));
}

public static String randomString(){
	String [] randomColors= {"brown", "beige", "black", "green"};
	String randomString=randomColors[(int)(Math.random()*3)];
	return randomString;
}
public static boolean yesOrNot(){
	int random=(int)(Math.random()*2);
	return random==0?false:true;
	
}
}
