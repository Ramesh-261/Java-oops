class singleinheritance {
     void show()
     {
        System.out.println("Hello");
     }
}
class B extends singleinheritance
{
    void showB()
    {
        System.out.println("Hi");
    }
    public static void main(String args[]){
        B b=new B();
        b.show();
        b.showB();
    }
}
