import java.util.*;
public class Main{//class
    void color(String c){//methods
        System.out.println("color:"+c);
    }
    void company(String f){//methods
        System.out.println("company:"+f);
    }
    void mileage(int k){//methods
        System.out.println("mileaeg:"+k);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Main k=new Main();//creating object k
        k.color(sc.nextLine());
        k.company(sc.nextLine());
        k.mileage(sc.nextInt());
    }
}
//by refering object we call methods