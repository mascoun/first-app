package tn.ensi.springProject;

public class mainApp {
	public static void main(String[] args) {
		Car car1 = new Car("BMW",10,1);
		Car car2 = new Car("Mini Cooper",20,2);
		Person person1 = new Person("Loez","GUETAT",21,car1);
		Person person2 = new Person("Med Salah","GUETAT",28,car2);
		person1.swicthCarWith(person2);
		System.out.println(person1.FirstName+"'s car: "+ person1.car.Brand);
		System.out.println(person2.FirstName+"Person2's car: "+ person2.car.Brand);
	}
}
