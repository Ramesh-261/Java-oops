//1. 
// class demo
// {
//   int x;  //instance variable
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
// class demo
// {
//   public void fun()
//    {
//      System.out.println("hello");
//    }
//   public void disp()
//    {
//       this.fun();
//    }
// }
// class thiskeyword
//   {
//   public static void main(String args[])
//    {
//     demo d=new demo();
//     d.fun();
//    // d.disp();
//     }
//   }

//3. this keyword used to invoke current class constructor

// class demo
// {
//    demo()
//    {
//      System.out.println("no arg constructor");
//    }
//   demo(int a)
//    {
//     this();
//     System.out.println("paramitrazied const");
//    }
// }
// class thiskeyword
//   {
//   public static void main(String args[])
//    {
//     demo d=new demo(12);
//     }
//   }
