class A
  {
    int i=10;
  }
class superkeywprd extends A
  {
    int i=20;
    void show(int i){
     System.out.println(i);//access the given user put the value.
     System.out.println(this.i);//access the value same class 
     System.out.println(super.i);//access the value parent class
    }
 public static void main(String args[])
   {
     superkeywprd b=new superkeywprd();
     b.show(30);
   }
}