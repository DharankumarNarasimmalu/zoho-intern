import java.util.*;
class Employee
{
    String name;
    int id;
    String address;
    String mail;
    long mobile;
    public void getEmployeeDetails(Scanner sc)
    {
        name=sc.nextLine();
        id=Integer.parseInt(sc.nextLine());
        address=sc.nextLine();
        mail=sc.nextLine();
        mobile=Long.parseLong(sc.nextLine());
    }
}
class Programmer extends Employee
{
    double basicpay;
    public void getBasicPay(Scanner sc)
    {basicpay=Double.parseDouble(sc.nextLine());}
    public void printPaySlip()
    {
        double DA,HRA,PF,staffclubfund;
        double gross,net;
        DA=basicpay*0.97;
        HRA=basicpay*0.10;
        PF=basicpay*0.12;
        staffclubfund=basicpay*0.001;
        gross=basicpay+HRA+DA;
        net=gross-PF-staffclubfund;
        System.out.println("EMPLOYEE DETAILS");
        System.out.println("Name: "+name);
        System.out.println("Id: "+id);
        System.out.println("Address: "+address);
        System.out.println("Mail: "+mail);
        System.out.println("Mobile: "+mobile);
        System.out.println("PAY SLIP FOR PROGRAMMER");
        System.out.printf("BP: Rs. %.1f\n",basicpay);
        System.out.printf("DA: Rs. %.1f\n",DA);
        System.out.printf("HRA: Rs. %.1f\n",HRA);
        System.out.printf("PF: Rs. %.1f\n",PF);
        System.out.printf("Staff Club Fund: Rs. %.1f\n",staffclubfund);
        System.out.printf("Gross Salary: Rs. %.1f\n",gross);
        System.out.printf("Net Salary: Rs. %.1f\n",net);
    }
}
class AssistantProfessor extends Employee
{  
    double basicpay;
    public void getBasicPay(Scanner sc)   
    {basicpay=Double.parseDouble(sc.nextLine());} 
    public void printPaySlip()  
    {     
        double DA,HRA,PF,staffclubfund;       
        double gross,net;    
        DA=basicpay*0.97;      
        HRA=basicpay*0.10;   
        PF=basicpay*0.12;     
        staffclubfund=basicpay*0.001;  
        gross=basicpay+HRA+DA;      
        net=gross-PF-staffclubfund;   
        System.out.println("EMPLOYEE DETAILS");   
        System.out.println("Name: "+name);   
        System.out.println("Id: "+id);  
        System.out.println("Address: "+address);
        System.out.println("Mail: "+mail);    
        System.out.println("Mobile: "+mobile);  
        System.out.println("PAY SLIP FOR ASSISTANT PROFESSOR");     
        System.out.printf("BP: Rs. %.1f\n",basicpay);     
        System.out.printf("DA: Rs. %.1f\n",DA);   
        System.out.printf("HRA: Rs. %.1f\n",HRA);
        System.out.printf("PF: Rs. %.1f\n",PF);   
        System.out.printf("Staff Club Fund: Rs. %.1f\n",staffclubfund);       
        System.out.printf("Gross Salary: Rs. %.1f\n",gross);   
        System.out.printf("Net Salary: Rs. %.1f\n",net);   
        }
    
}
class AssociateProfessor extends Employee
{  
    double basicpay;  
    public void getBasicPay(Scanner sc) 
    {basicpay=Double.parseDouble(sc.nextLine());} 
    public void printPaySlip() 
    {       
        double DA,HRA,PF,staffclubfund;     
        double gross,net;   
        DA=basicpay*0.97;     
        HRA=basicpay*0.10;   
        PF=basicpay*0.12;    
        staffclubfund=basicpay*0.001;     
        gross=basicpay+HRA+DA;    
        net=gross-PF-staffclubfund;    
        System.out.println("EMPLOYEE DETAILS");  
        System.out.println("Name: "+name);
        System.out.println("Id: "+id);
        System.out.println("Address: "+address);
        System.out.println("Mail: "+mail);
        System.out.println("Mobile: "+mobile);
        System.out.println("PAY SLIP FOR ASSOCIATE PROFESSOR");
        System.out.printf("BP: Rs. %.1f\n",basicpay);
        System.out.printf("DA: Rs. %.1f\n",DA);
        System.out.printf("HRA: Rs. %.1f\n",HRA);
        System.out.printf("PF: Rs. %.1f\n",PF);
        System.out.printf("Staff Club Fund: Rs. %.1f\n",staffclubfund);
        System.out.printf("Gross Salary: Rs. %.1f\n",gross); 
        System.out.printf("Net Salary: Rs. %.1f\n",net);
        
    }
    
}
class Professor extends Employee
{   
    double basicpay;  
    public void getBasicPay(Scanner sc) 
    {basicpay=Double.parseDouble(sc.nextLine());}   
    public void printPaySlip()  
    {     
        double DA,HRA,PF,staffclubfund;       
        double gross,net;   
        DA=basicpay*0.97;      
        HRA=basicpay*0.10;    
        PF=basicpay*0.12;    
        staffclubfund=basicpay*0.001;  
        gross=basicpay+HRA+DA;     
        net=gross-PF-staffclubfund;     
        System.out.println("EMPLOYEE DETAILS"); 
        System.out.println("Name: "+name);     
        System.out.println("Id: "+id);   
        System.out.println("Address: "+address);
        System.out.println("Mail: "+mail);    
        System.out.println("Mobile: "+mobile);    
        System.out.println("PAY SLIP FOR PROFESSOR");  
        System.out.printf("BP: Rs. %.1f\n",basicpay);  
        System.out.printf("DA: Rs. %.1f\n",DA);     
        System.out.printf("HRA: Rs. %.1f\n",HRA);   
        System.out.printf("PF: Rs. %.1f\n",PF);     
        System.out.printf("Staff Club Fund: Rs. %.1f\n",staffclubfund);      
        System.out.printf("Gross Salary: Rs. %.1f\n",gross);
        System.out.printf("Net Salary: Rs. %.1f\n",net);   
        }
    
}


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        for (int ctr = 1; ctr <= N; ctr++) {
            int employeeType = Integer.parseInt(sc.nextLine());
            switch (employeeType) {
                case 1:
                    Programmer programmer = new Programmer();
                    if (!(programmer instanceof Employee)) {
                        System.out.println("Employee Not Inherited");
                    }
                    programmer.getEmployeeDetails(sc);
                    programmer.getBasicPay(sc);
                    programmer.printPaySlip();
                    break;

                case 2:
                    AssistantProfessor assistantProfessor = new AssistantProfessor();
                    if (!(assistantProfessor instanceof Employee)) {
                        System.out.println("Employee Not Inherited");
                    }
                    assistantProfessor.getEmployeeDetails(sc);
                    assistantProfessor.getBasicPay(sc);
                    assistantProfessor.printPaySlip();
                    break;
                case 3:
                    AssociateProfessor associateProfessor = new AssociateProfessor();
                    if (!(associateProfessor instanceof Employee)) {
                        System.out.println("Employee Not Inherited");
                    }
                    associateProfessor.getEmployeeDetails(sc);
                    associateProfessor.getBasicPay(sc);
                    associateProfessor.printPaySlip();
                    break;
                case 4:
                    Professor professor = new Professor();
                    if (!(professor instanceof Employee)) {
                        System.out.println("Employee Not Inherited");
                    }
                    professor.getEmployeeDetails(sc);
                    professor.getBasicPay(sc);
                    professor.printPaySlip();
                    break;
            }
        }
    }
}