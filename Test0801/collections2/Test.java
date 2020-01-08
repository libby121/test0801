package collections2;

import java.util.ArrayList;


public class Test {

	public static void main(String[] args) {

		ArrayList<Circle> circles = new ArrayList<Circle>();


		int randomRadius = 0;

		int randomRad=0;
		while(randomRad!=90){
			randomRad=(int)(Math.random()*101+10);
			System.out.println(randomRad);
			if(randomRad!=90)
			circles.add(new Circle(randomRad, "white"));
			//else
			//break;
		}
		System.out.println(circles);
			
//			
//		int circlesCount = 0;
//		do {
//
//			randomRadius = (int) ((Math.random() * 101 + 10));
//			if (randomRadius != 90)// how to make it shorter?
//				circles.add(new Circle(randomRadius));
//			circlesCount++;
//		} while (randomRadius != 90);
//		System.out.println(circles);
//		System.out.println(circlesCount);
//
//		for (Circle circle : circles) {
//			System.out.println("radius length:" + circle.getRadius()
//					+ " and its calculated area is " + circle.circleArea());
//			// System.out.println(circle.circleArea());
//
//		}
//
//	}
	// public static int circleArea(){//how can i call the parameter from here.
	// can i create a static method
	// circleArea=radius*
		}	}

