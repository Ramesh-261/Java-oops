 class createobj
{ 
     public void eat()
    {
        System.out.println("i am Eating");
    }
     public static void main(String args[])
     {
        System.out.println("i am main");
        createobj obj=new createobj();
        obj.eat();
        obj.run();
     }
     public void run()
        {
         System.out.println("Dog is running behind the witch");
        }
}