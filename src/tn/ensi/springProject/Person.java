package tn.ensi.springProject;

public class Person {
	String FirstName, LastName;
	int age;
	Car car;
	public Person(String FirstName,String LastName,int age,Car car) {
		this.FirstName = FirstName;
		this.LastName = LastName;
		this.age = age;
		this.car = car;
	}
	public void swicthCarWith(Person p) {
		Car car3 = this.car;
		this.car = p.car;
		p.car = car3;
	}
}
