// generics basics
import java.util.*;
class dharan<U,T>{
    U obj1;
    T obj2;
    dharan(U x,T y){
        obj1=x;
        obj2=y;
    }
    void printval(){
        System.out.print(obj1+" "+obj2);
    }
}
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        String g=sc.nextLine();
        dharan<Integer,String> d= new dharan<Integer,String>(s,g);
        d.printval();
    }
}
// we use same method or class for differnet data type using generics