class demo
{
  int x;
  public void fun(int x)
   {
     this.x=x;
   }
  public void disp()
   {
     System.out.println(x);
   }
}
class thiskeyword
  {
  public static void main(String args[])
   {
    demo d=new demo();
    d.fun(132);
    d.disp();
    }
  }