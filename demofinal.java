// final keyword is used only with vriable,meyhod and class only..

//1.with variable used.. and used with pi,gravity etc.
// class demofinal {
//     public static void main(String[] args) {
//      final int i = 10; //can't assign again
//       //i = i + 20;
//       System.out.println(i);
//     }
//   }

// with method..
//2.if i want no body can override my method so we can define our method is final
// class demo{
//  final void fun(){
//     System.out.println("my main method");
//   }
// }
// class demofinal extends demo{
//     void fun(){
//     System.out.println("no one overide");
//   }
//   // public static void main(String args[]){
//   //   demofinal df=new demofinal(); //no need it bcoz it shows compile time error
//   //   df.fun();
//   // }
// }

//with class..
//3. final can't inherit other class
final class demo{
   void fun(){
     System.out.println("my main method");
   }
 }
 class demofinal extends demo{
     void fun(){
     System.out.println("no one overide");
   }
   // public static void main(String args[]){
   //   demofinal df=new demofinal(); //no need it bcoz it shows compile time error
   //   df.fun();
   // }
 }
  
