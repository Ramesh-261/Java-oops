//1. 
// class demo
// {
//   int x;
//   public void fun(int x)
//    {
//      this.x=x;
//    }
//   public void disp()
//    {
//      System.out.println(x);
//    }
// }
// class thiskeyword
//   {
//   public static void main(String args[])
//    {
//     demo d=new demo();
//     d.fun(132);
//     d.disp();
//     }
//   }

//2. this keyword can be used to invoked current class method(implicitly)
class demo
{
  public void fun()
   {
     System.out.println("hello");
   }
  public void disp()
   {
      this.fun();
   }
}
class thiskeyword
  {
  public static void main(String args[])
   {
    demo d=new demo();
    d.fun();
   // d.disp();
    }
  }