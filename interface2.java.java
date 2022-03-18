interface it1{
    int x=10,y=20;
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
        Main obj=new Main();
        it1 ref;
        ref=obj;
        obj.add(25,35);
        System.out.println(ref.x+ref.y);
    }
}