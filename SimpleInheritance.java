class Animal{
	void eat(){
		System.out.println("Animal Is Eating");
	}
	void walk(){
		System.out.println("Animal Is Walking");
	}
	void sleep(){
		System.out.println("Animal Is Sleeping");
	}
}
class Tiger extends Animal{
	void attack(){
		System.out.println("Tiger Is Attacking");
	}
	void roar(){
		System.out.println("Tiger Is Roaring");
	}
}
class SimpleInheritance{
	public static void main(String args[]){
		Tiger tg=new Tiger();
		tg.eat();
		tg.walk();
		tg.sleep();
		tg.roar();
		tg.attack();
	}
}