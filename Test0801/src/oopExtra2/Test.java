package oopExtra2;

public class Test {
	public static void main(String[] args) {

		Medal[] medals = new Medal[4];

		for (int i = 0; i < medals.length; i++) {

			medals[i] = new Medal((int) (Math.random() * 3 + 1),
					String.valueOf((int) (Math.random() * 100 + 1960)));
			
		}
		
		Car [] cars = new Car[10];
		for (int i = 0; i < cars.length; i++) {
			String [] model={"toyota","chevrolete","mitsubishi", "auto"};
			cars[i]= new Car(model[(int)(Math.random()*4+1)], (int)(Math.random()*200+1980), Driver[2]drivers);
			
		}
		
		Driver[]drivers=new Driver[2];
		for (int j = 0; j < drivers.length; j++) {
	
			drivers[j]=new Driver((int)(Math.random()*25+35, "driver "+(int)(Math.random()*100+1), )
			
		}
		
		
	}
}