class Animal
{
	Animal()
	{
		System.out.println("Animal cons");
	}
	final void eat()
	{
		System.out.println("Animal eats");
	}
}
class Cat extends Animal
{
	Cat()
	{
		System.out.println("Cat cons");
	}
	void eat1()
	{
		System.out.println("Cat eats");
	}
}
class FinalMet
{
	public static void main(String args[])
	{
		Cat c=new Cat();
		c.eat();
	}
}