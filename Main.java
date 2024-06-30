class Animal
{
    public void eat()
    {
        System.out.println("1");
    }
}
class bird extends Animal
{
    public void fly()
    {
      System.out.println("12");  
    }
}
class Main extends bird
{
	public static void main(String[] args) {
		Main sc=new Main();
		sc.eat();
		sc.fly();
	}
}