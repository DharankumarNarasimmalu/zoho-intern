// generics basics
import java.util.*;
class dharan<T>{
    T kumar;
    dharan(T obj){
        kumar = obj;
    }
    public T getobj(){
        return kumar;
    }
}
class Main{
    public static void main(String args[]){
        dharan<Integer> d= new dharan <Integer>(50);
        System.out.println(d.getobj());
        dharan<String> h=new dharan<String>("dharan is good boy");
        System.out.println(h.getobj());
    }
}
// we use same method or class for differnet data type using generics