class A 
{
    public void fun()
    {
        System.out.println("i am Fun Method");
    }
}
 class B extends A 
{
    public void fun1()
    {
        System.out.println("i am Fun1 Method");
    }
}
public class multiple extends B
{
	public static void main(String[] args) {
		multiple mn=new multiple();
		mn.fun();
		mn.fun1();
	}
}