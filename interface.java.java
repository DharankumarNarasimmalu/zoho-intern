interface it1{
    int x=10,y=25;
    public void add(int a,int b);
    public void sub(int a,int b);
}
class Main implements it1{
    public void add(int s,int y){
        System.out.println("Add:"+(s+y));
    }
    public void sub(int s,int y){
        System.out.println("sub:"+(s-y));
    }
    public static void main(String args[]){
        it1 obj=new Main();
        System.out.println(obj.x+obj.y);
        obj.add(x,y);
    }
}