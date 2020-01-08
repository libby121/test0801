package oopExtra2;

import java.util.Arrays;

public class Driver {
	
	private int age;
	private String name;
	private Medal[]medals=new Medal[4];
	//do i have to initialize to 4 here,i initialize it in main
	
	
	public int getAge() {
		return age;
	}
	public Driver(int age, String name, Medal[] medals) {
		super();
		this.age = age;
		this.name = name;
		this.medals = medals;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Medal[] getMedals() {
		return medals;
	}
	public void setMedals(Medal[] medals) {
		this.medals = medals;
	}
	@Override
	public String toString() {
		return "Driver [age=" + age + ", name=" + name + ", medals="
				+ Arrays.toString(medals) + "]";
	}
	
	

}
