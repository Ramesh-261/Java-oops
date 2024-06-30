//to initialized the object thrugh reference variable
// public class inializedobj {
//      String color;
//      int age;
//      public static void main(String args[])
//      {
//         inializedobj obj=new inializedobj();
//         obj.color="red";
//         obj.age=22;
//         System.out.println(obj.color+" "+obj.age);
//      }
// }

//by method
public class inializedobj {
    String color;
    int age;
       public void fun(String str,int a)
       {
         color=str;
         age=a; 
       }
       public void disp()
       {
        System.out.println(color+" "+age);       }
    public static void main(String args[])
    {
       inializedobj obj=new inializedobj();
       obj.fun("black",23);
       obj.disp();
    }
}
