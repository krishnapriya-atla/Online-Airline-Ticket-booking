package flightmanegmentsystem;
import static flightmanegmentsystem.Flightmanegmentsystem.sd;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
public class seats 
{ 
    static String name="",emailid="";
    static String phno="";
    static String emailId[]=new String[40];
    static String phoneno[]=new String[40];
    static Scanner sc=new Scanner(System.in);
    static int count=0;
    static InputStreamReader ss=new InputStreamReader(System.in);
    static BufferedReader sd=new BufferedReader(ss);
    public static void details() throws IOException{
        System.out.println("Name: ");
        name=sd.readLine();
        System.out.println("emailId: ");
        emailid=sd.readLine();
        System.out.println("phone number: ");
        phno=sd.readLine();                             
    }
    public static void firstclassseat(int a[])
    {
	System.out.println("\t\t\t\t\tFirst class");
        for(int i=0;i<30;i++)
	{
            System.out.print(i+1+" ");
            if(a[i]==1)
            {
		System.out.print("      	");
            }
            else
            {
		System.out.print("filled	");
            }
				
            if((i+1)%6==0)
            {
                 System.out.println("");
            }
            if(a[i]==0)
            {
		count=count+1;
		if(count==30)
                {
                    int esection;
                    System.out.println("First Class is fully booked. Would you like Economy? 1 for Yes 2 for No");
                    esection = sc.nextInt();
                    if ( esection == 1 )
		    {
			Class.economyclass();
		        economyclassseat(a);
		    }
		    else
		    {
		        System.out.println("Next flight is in 3 hours.");     
		    }
                }
            }
					
	}
		 
    }
    public static void economyclassseat(int a[])
    {
	System.out.println("\t\t\t\t\teconomy class");
	for(int i=30;i<60;i++)
	{
	    System.out.print(i+1+" ");
            if(a[i]==1)
            {
		System.out.print("      	");
            }
            else
            {
		System.out.print("filled	");
            }	
            if((i+1)%6==0)
            {
		System.out.println("");
            }
            if(a[i]==0)
            {
		count=count+1;
		if(count==30)
                {
                    int fsection;
                    System.out.println("economy Class is fully booked. Would you like flassclass? 1 for Yes 2 for No");
                    fsection=sc.nextInt();
                    if ( fsection == 1 )
                    {
			Class.firstClass();
			firstclassseat(a);
			            
                    }
                    else
                    {
			System.out.println("Next flight is in 3 hours.");    
                    }
		}
	    }
        }			
    }
}
