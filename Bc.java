 class A{
    public void fun()
    {
        System.out.println("Hello");
    }
}
class BC extends A
{
    public static void main(String args[])
    {
        BC bc=new BC();
        bc.fun();
    }
}
