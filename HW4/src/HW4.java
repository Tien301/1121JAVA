import java.util.*;

class Animal{
	public int age;
	public Animal() {age=1; System.out.print("2");}
	public String toString() { return "3";}
}

class Dog extends Animal{
	public int age;
	public Dog() {age=4; System.out.print("5");}
	public String toString() { return "6";}
}
class Cat extends Animal{
	public int age;
	public Cat() {age=7; System.out.print("8");}
	public String toString() { return "9";}
}



public class HW4 {
	public static void main(String[] args) {
		           
		Animal a =new Animal();//1 
		           System.out.println(" 一");
		System.out.print(a);   //2
		
		           System.out.println(" 二");
		Dog d =new Dog();      //3
		           System.out.println(" 三");
		System.out.print(d);   //4
		           System.out.println(" 四");
		System.out.print(d.age);//5
		           System.out.println(" 五");
		a = new Cat();
		           System.out.println(" 六");
		System.out.print(a);
		           System.out.println(" 七");
		System.out.print(a.age);
		           System.out.println(" 八");
		
		Cat c =(Cat)a;
		           
		System.out.print(c);
		           System.out.println(" 九");
		System.out.print(c.age);
	System.out.println(" 十");
		
		
		

	}

}
