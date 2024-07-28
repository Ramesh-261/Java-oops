// public class Emps {
//     int eid;
//     String nm;
//     String cmp;
//     Emps(int eid,String nm,String cmp){
//         this.eid=eid;
//         this.nm=nm;
//         this.cmp=cmp;
//     }
//    void disp(){
//     System.out.println(eid+" "+nm+" "+cmp);
//    }

//    public static void main(String args[]){
//     Emps e1=new Emps(101,"Ramesh","uit");
//     e1.disp();
//     Emps e2=new Emps(102,"Nikhil","uit");
//     e2.disp();
//    }

// }

public class Emps {
    int eid;
    String nm;
    static String cmp="uit";
    Emps(int eid,String nm){
        this.eid=eid;
        this.nm=nm;
    }
   void disp(){
    System.out.println(eid+" "+nm+" "+cmp);
   }

   public static void main(String args[]){
    Emps e1=new Emps(101,"Ramesh");
    e1.disp();
    Emps e2=new Emps(102,"Nikhil");
    e2.disp();
   }

}
