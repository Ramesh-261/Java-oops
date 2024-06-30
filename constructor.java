// public class Constructor {
//     String name;
//     int age;
//     public void disp()
//     {
//         System.out.println(name+" "+age);
//     }
//     public static void main(String args[])
//     {
//         Constructor c1=new  Constructor();
//         Constructor c2=new  Constructor();
//         c1.disp();
//         c2.disp();
//     }
// }
public class constructor {
    String name;
    int age;
    public constructor(String name,int age)
    {
        this.name=name;
        this.age=age;
    }
    public void disp()
    {
        System.out.println(name+" "+age);
    }
    public static void main(String args[])
    {
        constructor c1=new  constructor("Ramesh",22);
        constructor c2=new  constructor("Shruti",23);
        c1.disp();
        c2.disp();
    }
}
