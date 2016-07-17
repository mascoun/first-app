package tn.ensi.springProject;

public class Car {
	String Brand;
	int age, number;
	public Car(String Brand, int age,int number) {
		this.Brand = Brand;
		this.age = age;
		this.number = number;
		System.out.println("Car Created");
		System.out.println("Brand: "+Brand+"\nAge: "+age+"\n Number: "+number);
	}
}
