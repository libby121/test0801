package inheritance1Again;


public class Test {

	public static void main(String[] args) {

		PlasticBox p = new PlasticBox("cookies", 3.1, 2.3, 3.2);

		CanBox c = new CanBox("tuna", 6, 3.1);

		// System.out.println("cookies box capacity: "+p.getCapacity());
		// System.out.println("tuna canBox capacity : "+ c.getCapacity());

		// System.out.println(p.toString());

		System.out.println(c.toString());// parameter capacity alone=o

		// p.BoxData();
		// c.BoxData();
		System.out.println(p.getCapacity());
		System.out.println(p.height);

		System.out.println("----------casting example--------");

		Box py = new PlasticBox("cookies", 3.1, 2.3, 3.2);
		Box cy = new CanBox("tuna", 6, 3.1);
		Box cc = new CanBox("tuna", 6, 3.1);
		Box pp = new PlasticBox("some2", 3.1, 21.4, 23.1);
		Box ccc = new CanBox("tuna", 6, 3.1);

		Box[] boxes = { py, cy, cc, pp, ccc };

		for (int i = 0; i < boxes.length; i++) {
			System.out.println(boxes[i].getCapacity());//when i call it from "box"
			//i need "getcapacity". when i call it from specific type(can/plastic), i can use the var

			if (boxes[i] instanceof PlasticBox) {// casting
				PlasticBox plasticbox = (PlasticBox) (boxes[i]);//create a reference of the casting type
				//which is assigned to the casted object
				System.out.println(plasticbox.getHeight());

			}

		}
	}
}
