 class test {
    void show()
    {
        System.out.println("I am Method of test class");
    }
}
class xyz {
    void show()
    {
        System.out.println("I am Method of xyz class");
    }
    public static void main(String args[]){
          //test t=new test();
          //t.show();
          xyz x=new xyz();
          x.show();
    }
}
