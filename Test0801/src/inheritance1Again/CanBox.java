package inheritance1Again;

public class CanBox extends Box {
	
	private int height;
	private double diameter;
	
	public CanBox(){
		label= "Canbox for canned goods ";
	}
	public CanBox(String label){
		super(label);
	}
	public CanBox(String label, int height, double diameter){
		super(label);
		this.height=height;
		this.diameter=diameter;
	}
	
	public double getCapacity(){
		capacity=(Math.pow((diameter/2), 2))*(Math.PI);
		return capacity;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public double getDiameter() {
		return diameter;
	}

	public void setDiameter(double diameter) {
		this.diameter = diameter;
	}
	public String toString() {
		return "CanBox [height=" + height + ", diameter=" + diameter
				+ ", label=" + label + "]";
	}

	
	

}
