package sajini;
import java.util.Scanner;
public class casehotelmain
{
public static void main(String args[])throws NullPointerException
{
	String ac;
	 String cot;
	 String cable;
	 String wifi;
	 String laundry;
	 int date=0,d1,d2;
	
Scanner ob=new Scanner(System.in);
int r;
String op1,op2,op3,op4;
email c[]=new email[20];
casehotelbook d[]=new casehotelbook[20];
int i=0,s=101,k=0,j;
int id=1;
do {
System.out.print("1.Registration\n2.View\n3.Exit\n");
r=ob.nextInt();
switch(r)
{
case 1:
	do
	{
System.out.println("Enter your name:");
String n=ob.next();
System.out.println("Enter your address:");
String a=ob.next();
System.out.println("Contact Number:");
String p=ob.next();
System.out.println("Email ID:");
String e=ob.next();
System.out.println("Enter proof type:");
String pt=ob.next();
System.out.println("Enter proof id:");
String pi=ob.next();
c[i]=new email();
c[i].register(id,n,a,p,e,pt,pi);
System.out.println("Thank you for registering.Your id is :"+id);
System.out.println("Do you want to Book a room (yes/no)");
op2=ob.next();
if(op2.equals("yes"))
{
	System.out.println("Please choose the services required\n.AC/non-AC (Enter AC/nAC) :");
	ac=ob.next();
	System.out.println(".Cot(Enter Single/Double) :");
	cot=ob.next();
	System.out.println(".With cable connection/without cable connection(Enter C/nC) :");
	cable=ob.next();
	System.out.println(".Wi-Fi needed or not(Enter W/nW) :");
	wifi=ob.next();
	System.out.println(".Laundry service needed or not(Enter L/nL) :");
	laundry=ob.next();
	System.out.println("Enter the date of booking");
	date=ob.nextInt();
	d[i]=new casehotelbook();
	d[i].book(id,ac, cot, cable, wifi, laundry,date,s);
	
	System.out.println("Do you want to proceed (yes/no)");
	op3=ob.next();
	if (op3.equals("yes"))
	System.out.println("Thank you for Booking Your Room Number is "+s);
	s++;
}
else
{
	System.out.println("Thank You");
	
	}

i++;
id++;
System.out.println("Do you want to continue registration (yes/no)");
op4=ob.next();
	}while(op4.equals("yes"));
break;
case 2:System.out.println("View all bookings:");
       System.out.println("Enter the start date");
       d1=ob.nextInt();
       System.out.println("Enter the end date");
       d2=ob.nextInt();
       System.out.println("The bookings made from "+d1+" to "+d2+" are");
       System.out.println("Room number\t\tcustomer ID");
       for(j=0;j<i;j++)
       {
    	   
    	   if(d[j].date>=d1&&d[j].date<=d2)
    	   {
    		   d[j].viewbook();
    	   }
       }
case 3:
System.exit(0);
}
System.out.println("Do you want to continue (yes/no)");
       op1=ob.next();
}while(op1.equals("yes"));
}
}
