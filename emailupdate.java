package sajini;
import java.util.Scanner;
public class email
  //data members
 {
  int id;
  String name;
  String address;
  String ph;
  String email;
  String ptype;
  String pid;
//public static int i=1;
  public void register(int id,String n,String a,String p,String e,String pt,String pi)//defining constuctor
   {
    Scanner ob=new Scanner(System.in);
    String op1,op2;
    this.name=n;
    this.address=a;
    this.ph=p;
    this.email=e;
    this.ptype=pt;
    this.pid=pi;
    this.id=id;
   }
  //method for diplaying details
   void display()
    {
     System.out.println("Your details are as follows :");
     System.out.println("Name: "+name);
     System.out.println("Address: "+address);
     System.out.println("Contact NO: "+ph);
     System.out.println("Email ID: "+email);
     System.out.println("Proof Type: "+ptype);
     System.out.println("Proof ID: "+pid);
    }
  //method for upadting email
    void update(String e)
    {
    this.email=e;
    }
    // return 0;   
  }

