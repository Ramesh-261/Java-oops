 abstract class abstractclass {
    abstract void start();
}
class car extends abstractclass{
    void start(){
        System.out.println("start with key");
    }
}
class scooter extends abstractclass{
    void start(){
        System.out.println("start with kick");
    }
    public static void main(String args[]){
        //abstractclass v=new abstractclass(); //not create object due to abstract
        car c=new car();
        c.start();
        scooter s=new scooter();
        s.start()
    }
}
