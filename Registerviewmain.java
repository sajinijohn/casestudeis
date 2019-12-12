package sajini;
import java.util.Scanner;
public class caseviewmain 
 {
   public static void main(String args[])throws NullPointerException
   {
     Scanner ob=new Scanner(System.in);
     int r;
     String op1,op2,op3,op4;
     caseviewregister c[]=new caseviewregister[20];
     casehotelbook d[]=new casehotelbook[20];
     int i=0,s=101,k=0,j;
     int id=1;
     do {
	System.out.print("1.Registration\n2.View\n3.Exit\n");
	r=ob.nextInt();
	switch(r)
	 {
			//first case to register 
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
             c[i]=new caseviewregister();
	     c[i].register(id,n,a,p,e,pt,pi);
	     System.out.println("Thank you for registering.Your id is :"+id);
	     id++;
	     i++;
 	     System.out.println("Do you want to continue registration (yes/no)");
	     op4=ob.next();
	     }while(op4.equals("yes"));
	     break;
			//second case for displaying customer list and id
    	  case 2:System.out.println("Customer List");
      	  System.out.println("The Registerd customers are");
       	  System.out.println("Customer ID\t\tcustomer Name");
          for(j=0;j<i;j++)
      	   {
    	     c[j].display();
            }
            break;
			//third case for exit
	  case 3:
	  System.exit(0);
       }
       System.out.println("Do you want to continue (yes/no)");
       op1=ob.next();
       }while(op1.equals("yes"));
  }
}
