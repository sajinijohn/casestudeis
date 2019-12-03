package sajini;
import java.util.Scanner;
public class caseviewregister {
  int id;
String name;
String address;
String ph;
String email;
String ptype;
String pid;
//public static int i=1;
public void register(int id,String n,String a,String p,String e,String pt,String pi)
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
}//i++;
    void display()
    {
     System.out.println(id+"\t\t\t"+name);
    }
   
  }
