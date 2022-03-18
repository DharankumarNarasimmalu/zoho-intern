class Hello{
    Hello(int x,int y){
        System.out.println(x+y);
    }
    static int count=0;
    static void getvalue(){
        count+=1;
        System.out.println(count);
    }
}
class Main{
    public static void main(String [] args){
        Hello b=new Hello(8,2);
        Hello.getvalue();
    }
}
/*staitc method and variable is directly reference with class not object
so only we use main method as static when JVM compiles code it only call by class not object,so  the main memory initilized first 
instance variable will not operate under static method*/

