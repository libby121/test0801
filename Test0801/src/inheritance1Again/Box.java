package inheritance1Again;

public class Box {
	
	protected String label;
	protected double capacity;
	
	
	public Box(String label){
		this.label=label;
	}
	
	public Box(){
		
	}
	public Box(String label, double capacity) {
		super();
		this.label = label;
		this.capacity = capacity;
	}


	public void BoxData (){
		System.out.println("box of  = "+ label +"\ncapacity : "+ getCapacity());//why cant it call only capacity
	}


	public String getLabel() {
		return label;
	}


	public void setLabel(String label) {
		this.label = label;
	}


	public double getCapacity() {
		return capacity;
	}


	public void setCapacity(double capacity) {
		this.capacity = capacity;
	}
	

}
