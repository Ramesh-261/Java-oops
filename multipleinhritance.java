interface I1 {
    public void show();
 }
 
 interface I2 {
    public void disp();
 }
 
 class MultipleInheritance implements I1, I2 {
     public void disp() {
         System.out.println("Sandeep");
     }
     public void show() {
         System.out.println("Hello");
     }
     public static void main(String[] args) {
         MultipleInheritance t = new MultipleInheritance();
         t.show();
         t.disp();
     }
 }
 