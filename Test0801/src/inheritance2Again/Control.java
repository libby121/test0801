package inheritance2Again;

public class Control {
	
	protected String label;
	
	public Control(String label){
		this.label=label;
	}
	
	
	public void Draw(){
		System.out.println(label);
	}


	public String getLabel() {
		return label;
	}


	public void setLabel(String label) {
		this.label = label;
	}

	
	
}
