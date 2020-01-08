package Ineritance3again2;

public abstract class Furniture {
	protected int height;
	protected int length;
	protected int width;
	protected String color;

	public Furniture(int height, int length, int width, String color){
		this.height=height;
		this.length=length;
		this.width=width;
		this.color=color;
	}

	public abstract void draw ();

}
