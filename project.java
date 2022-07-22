import java.util.Scanner;
import java.util.*;

class project{
    public static void main(String args[])
{
Customer c;
c=new Customer();
Scanner  sc=new Scanner(System.in);
int Atm=2310;
String name="kushal";
System.out.println("Welcome to Our Atm!!");
System.out.println("Enter Your Card");
System.out.print("Enter Your name:");
c.name=sc.next();
System.out.print("Enter Your Atm no:");
c.atmNo=sc.nextInt();


if(c.atmNo==Atm&& (c.name).equals(name))
{
    System.out.println("\n-----------:validation Successful\n");
    while(true)
    {
        System.out.println("Enter Your Choice:\n1.View Account Balance*\n2.Withdraw Money------*\n3.Deposit-------------*\n4.\n5.Exit----------------*");
        int choice=sc.nextInt();
        switch(choice)
        {
            case 1:
                    System.out.println("\nAvailable Balance: "+c.getView()+"\n");
                    continue;
            case 2:
                    System.out.print("Enter Amount to be Withdrawn:");
                    c.withdraw=sc.nextDouble();
                    if(c.withdraw>c.viewBalance)
                    {
                        System.out.println("\nInsufficient Balance!!!!\n");
                        System.out.print("Deposit some money\n\n");
                        continue;
                    }
                    else{
                        
                    c.viewBalance=c.viewBalance-c.withdraw;
                    System.out.println("Collect Your Money");
                    continue;
                    }
                    
            case 3 :
                    System.out.print("Enter Amount:");
                    c.deposit=sc.nextDouble();
                    System.out.print(c.getDepo()+"\n");
                    System.out.println();
                    continue;



            case 4:

            case 5:
            System.out.println("---------Thank u For Coming! Visit Again----------");

              return ;
        }
    }
   
}
 else{
        System.out.print("Incorrect! Atm No Or Name");
        return;
    }



}
}
class Customer{
    int atmNo;
    double viewBalance;
    double deposit;
    double withdraw;
    String name;
    // double total;

    public void setDepo(int dep)
    {
        deposit=dep;
    }
    public double getDepo()
    {
        System.out.print("Amount Added Successfully!\nAvailable Balance:");
         viewBalance=viewBalance + deposit;
        return viewBalance;
    }

public void setAtmNo(int atm)
{
    atmNo=atm;
}
public int getAtmNo()
{
    return atmNo;
}
public void setView(double view)
{
    viewBalance=view;
}
public double getView()
{
    return viewBalance;
}
}