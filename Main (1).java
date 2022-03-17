class person{
    private int age;
    private int getage(int age){
        return age;
    }
    private void setage(int age){
        this.age=age;
    }
}
class Main{
    public static void main(String args[]){
        person p=new person();
        p.setage(14);
        System.out.println(p.getage());
    }
    
}