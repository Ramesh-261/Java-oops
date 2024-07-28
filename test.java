interface I1
{
   public void show(); //in interface always here declare abstract method.
}
class test implements I1
{
 public void show()
  {
     System.out.println("RaMeSh");
  }
    public static void main(String args[])
      {
        test t=new test();
        t.show();
      }
 }