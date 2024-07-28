public class staticvar {
     static int a=10;//class level variable
    //  void fun(){
    //    static int b=20; //compile time error
    //  }
}

class test{
    public static void main(String args[]){
        System.out.println(staticvar.a);
    } 
}
