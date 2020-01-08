package inheritance1Again;

public class PlasticBox extends Box {//why cant it inherit in toString the method boxData

	private double length;
	private double width;
	public double height;
	
	public PlasticBox(){
		super();
		label="plastic Box for food lovers";
	}
	
	public PlasticBox(String label){
		super(label);
	}
	
	public PlasticBox(String label, double length, double width, double height){
		super(label);
		this.length=length;
		this.width=width;
		this.height=height;
		capacity = length * width * height;
	}
	public double getCapacity() {// what if i dont want anyone to change the
									// calculation of capacity-private?
		//System.out.println("test");
		capacity = length * width * height;
		return capacity;

	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public String toString() {
		return "PlasticBox [length=" + length + ", width=" + width
				+ ", height=" + height + ", label=" + label + "]";
	}


	


}
