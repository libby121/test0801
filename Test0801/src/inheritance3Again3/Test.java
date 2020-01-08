package inheritance3Again3;

public class Test {

	public static void main(String[] args) {

		Furniture[] furnitures = new Furniture[20];

		for (int i = 0; i < furnitures.length; i++) {
			char[] chars = { 'a', 'b', 'c' };
			char randomNum = chars[(int) (Math.random() * 3 )];
			switch (randomNum) {

			case 'a':
				furnitures[i] = new Bed(randomInt(), randomDouble(),
						randomDouble(), randomColor(),
						(int) (Math.random() * 2) == 0 ? false : true);

				break;

			case 'b':
				furnitures[i] = new Chair(randomInt(), randomDouble(),
						randomDouble(), randomColor(), randomInt());
				break;

			case 'c':
				furnitures[i] = new Table(randomInt(), randomDouble(),
						randomDouble(), randomColor(), randomInt());
				break;

			}
		}
		for (Furniture furniture : furnitures) {
			System.out.println(furniture);
			furniture.draw();

		}
		for (Furniture furniture : furnitures) {
			if (furniture instanceof Bed) {
				Bed b = (Bed) furniture;
				System.out.println("double ? "+b.isDouble());

			}
			else if(furniture instanceof Chair){
				Chair c= (Chair)furniture;
				System.out.println(c.getLegsNum());
			}
			else if(furniture instanceof Table){
			//	Table t= (Table)furniture;
				System.out.println("*** " + ((Table)furniture).getNumSeats()+ " ***");
			}
		}

	}

	public static int randomInt() {
		return (int) (Math.random() * 30 + 1);
	}

	public static double randomDouble() {
		return (Math.random() * 30 + 1);

	}

	public static String randomColor() {
		String[] colors = { "blue", "yellow", "red", "purple" };
		return colors[(int) (Math.random() * 4)];

	}
}
