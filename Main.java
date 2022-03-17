abstract class figure{
    double dim1,dim2;
    figure(double x,double y){
        dim1=x;
        dim2=y;
    }
    abstract double area();
}
class rectangle extends figure{
    rectangle(double a,double b){
        super(a,b);
    }
    double area(){
        System.out.println("rec area");
        return dim1*dim2;
    }
}
class triangle extends figure{
    triangle(double x,double y){
        super(x,y);
    }
    double area(){
        System.out.println("triangle area");
        return dim1*dim2/2;
    }
}
class Main{
    public static void main(String[] args){
        rectangle obj=new rectangle(5,3);
        System.out.println("rec Area:"+obj.area());
        triangle tri=new triangle(10,8);
        System.out.println("tri area:"+tri.area());
    }
}
