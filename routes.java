package flightmanegmentsystem;
import java.io.IOException;
import java.util.Scanner;
public class routes
{
    static Payment fpay=new Payment();
    static int xi,ns,check=0,totalamt=0;;
    static int ect,fct;
    static int f1[]=new int[60];
    static int f2[]=new int[60];
    static int f3[]=new int[60];
    static int f4[]=new int[60];
    static int f5[]=new int[60];
    static int f6[]=new int[60];
    public static int counter;
    static Scanner sc=new Scanner(System.in);
    static Class cl=new Class();
    static seats se=new  seats();
    public static void route() throws IOException
    {
        int x;
	for(int i=0;i<60;i++)
	{
	    f1[i]=1;f2[i]=1;f3[i]=1;f4[i]=1;f5[i]=1;f6[i]=1;		
	}	
	System.out.println("Welcome to online flight booking");
	do
        {
		System.out.println("1.hyderbad\n2.bangarole\n3.goa\n4.ooty\n5.vizag  \n6.kerala  \n7.Exit ");
                x=sc.nextInt();      
		switch(x)
		{
		        case 1:
				System.out.println("You selected Route is \n	1.hyderbad");
				System.out.println("which type of class do u want \n\t 1.first class \n\t 2.economy class ");
                                int section;
                                section = sc.nextInt();		
				if( section ==1)
				{
                                    Class.firstClass();
                                    System.out.println("Ticket cost of each seat in first class is 1000 only");
				    seats.firstclassseat(f1);
				    firstclassbook(f1,1000,800);
                                    System.out.println("TOTAL AMMOUNT IS "+totalamt);
				}
                                else if(section==2)
			        {
				    Class.economyclass();
                                    System.out.println("Ticket cost of each seat in economy class is 800 only");
                                    seats.economyclassseat(f1);
                                    economyclassbook(f1,1000,800);
                                    System.out.println("TOTAL AMMOUNT IS "+totalamt);
                                }
                                else
                                {
                                    System.out.println(" Please Enter only 1 or 2 ");
                                }
                                break;
			case 2:
				System.out.println("You selected Route is \n 2.bangarole");
				System.out.println("which type of class do u want \n\t 1.first class \n\t 2.economy class ");
				section = sc.nextInt();
				if ( section == 1 )
                                {
                                    Class.firstClass();
                                    System.out.println("Ticket cost of each seat in first class  is  2000");
                                    seats.firstclassseat(f2);
                                    firstclassbook(f2,2000,1800);
                                    System.out.println("TOTAL AMMOUNT IS "+totalamt);
                                }
                                else if(section==2)
                                {
                                    Class.economyclass();
                                    System.out.println("Ticket cost of each seat in economy class is  1800 only");
                                    seats.economyclassseat(f2);
                                    economyclassbook(f2,2000,1800);
                                    System.out.println("TOTAL AMMOUNT IS "+totalamt);
                                }
                                else
                                {
                                    System.out.println(" Please Enter only 1 or 2 ");
                                }
				break;
			case 3:
				System.out.println("You selected Route is \n	3.goa");
				System.out.println("which type of class do u want \n\t 1.first class \n\t 2.economy class ");
				section = sc.nextInt();
                                if ( section == 1 )
                                {
                                    Class. firstClass();
                                    System.out.println("Ticket cost of each seat in first class is 5000");
                                    seats.firstclassseat(f3);
                                    firstclassbook(f3,5000,4500);  
                                    System.out.println("TOTAL AMMOUNT IS "+totalamt);
                                }
                                else if(section==2)
                                {
                                    Class.economyclass();
                                    System.out.println("Ticket cost of each seat in economy class is  4500 only");
                                    seats.economyclassseat(f3);
                                    economyclassbook(f3,5000,4500);
                                    System.out.println("TOTAL AMMOUNT IS "+totalamt);
                                }
                                else
                                {
                                    System.out.println(" Please Enter only 1 or 2 ");
                                }
				break;
			case 4:
				System.out.println("You selected Route is \n	4.ooty");
				System.out.println("which type of class do u want \n\t 1.first class \n\t 2.economy class ");
				section = sc.nextInt();
                                if ( section == 1 )
				{
				    Class.firstClass();
                                    System.out.println("Ticket cost of each seat in first class is 6000");
                                    seats.firstclassseat(f4);
                                    firstclassbook(f4,6000,5500);
                                    System.out.println("TOTAL AMMOUNT IS "+totalamt);
                                }
                                else if(section==2)
                                {
                                    Class.economyclass();
                                    System.out.println("Ticket cost of each seat in economy class is  5500 only");
                                    seats.economyclassseat(f4);
                                    economyclassbook(f4,6000,5500);
                                    System.out.println("TOTAL AMMOUNT IS "+totalamt);
                                }
                                else
                                {
                                    System.out.println(" Please Enter only 1 or 2 ");
                                }
				break;
			case 5:
				System.out.println("You selected Route is \n	5.vizag ");
				System.out.println("which type of class do u want \n\t 1.first class \n\t 2.economy class ");
				section = sc.nextInt();
                                if ( section == 1 )
				{
                                    Class.firstClass();
                                    System.out.println("Ticket cost of each seat in first class is 7000");
                                    seats.firstclassseat(f5);
                                    firstclassbook(f5,7000,500);
                                    System.out.println("TOTAL AMMOUNT IS "+totalamt);
                                }
                                else if(section==2)
			        {
                                    Class.economyclass();
                                    System.out.println("Ticket cost of each seat in economy class is  5000 only");
                                    seats.economyclassseat(f5);
                                    economyclassbook(f5,7000,5000);  
                                    System.out.println("TOTAL AMMOUNT IS "+totalamt);
                                }
                                else
                                {
                                    System.out.println(" Please Enter only 1 or 2 ");
                                }
                                break;
			case 6:
				System.out.println("You selected Route is \n	1.kerala");
				System.out.println("which type of class do u want \n\t 1.first class \n\t 2.economy class ");
                		section = sc.nextInt();
				if ( section == 1 )
                                {
                                    Class.firstClass();
                                    System.out.println("Ticket cost of each seat in first class is 4000");
                                    seats.firstclassseat(f6);
                                    firstclassbook(f6,4000,3500);
                                    System.out.println("TOTAL AMMOUNT IS "+totalamt);
                                }
                                else if(section==2)
                                {
                                    Class.economyclass();
                                    System.out.println("Ticket cost of each seat in economy class is  3500 only");
                                    seats.economyclassseat(f6);
                                    economyclassbook(f6,4000,3500);
                                    System.out.println("TOTAL AMMOUNT IS "+totalamt);
                                }
                                else
                                {
                                    System.out.println(" Please Enter only 1 or 2 ");
                                }	
				break;
                        case 7:
                             System.exit(0);
			default:
				System.out.println("you entered wrong choice try again");
			}
			}while(x!=1 || x!=2 || x!=3 || x!=4 || x!=5 || x!=6 );
			
		}
    public static void displayflightroutes()
    {
        System.out.println("1.hyderbad\n2.bangarole\n3.goa\n4.ooty\n5.vizag  \n6.kerala ");	
    }
    public static void firstclassbook(int a[],int fct,int ect) throws IOException
    {
        counter=0;
        for(int i=0;i<30;i++)
        {				
           if(a[i]==1)
           {
                counter=counter+1;
	   }
	}
	System.out.println("There are only " +counter + "seats Available in this class");
	System.out.println("How Many Seats do You Want");
	ns=sc.nextInt();
        if(counter>=ns)
        {
            totalamt=ns*fct;
            if(ns<=30)
            {
	        System.out.println("Which Seats Do You Want");
	        for(int i=0;i<ns;i++)
	        {
                    int cs;
                    cs=sc.nextInt();
                    do
                    {
                        if(cs<30)
                        {
                            break;
			}
                        else
			{
                            System.out.println("INVALID SEAT NUMBER\nPLEASE ENTER CORRECT NUMBER...");
                            cs=sc.nextInt();
                        }
		    }while(cs>30);
                    for(int g=0;g<=30;g++)
                    {
		        if(a[cs-1]==0)
		        {
                            System.out.println("The Seat Number You Have Choosen Is Already Booked So Please Select Another Seat");
                            cs=sc.nextInt();
                            g=0;
                        }
		    }
                    a[cs-1]=0;	  
                }			
	        System.out.println();
                seats.firstclassseat(a);
                System.out.println("Total amount should be paid is"+totalamt);
                seats.details();
                int card = Payment.card(totalamt);
            }
            else
            {
                totalamt=fct*ns;
                System.out.println("In firstclass there is only 30 seats");
                counter=0;
                firstclassbook(a,fct,ect);
            }
        }
        else
        {
            System.out.println(" SORRY  "+ns+" no.of seats are not avaliable in this class ");
            counter=0;
            int efsection;
            System.out.println(" Would you like to go for Economy class? 1 for Yes 2 for No");
            efsection = sc.nextInt();
            if ( efsection == 1 )
            {
                Class.economyclass();
		seats.economyclassseat(a);
                economyclassbook(a,fct,ect);
            }
            else
            {
                seats.firstclassseat(a);
		firstclassbook(a,fct,ect);   
            }
	}
    }
    public static void economyclassbook(int a[],int fct,int ect) throws IOException
    {
        counter=0;
        for(int i=30;i<60;i++)
        {				
           if(a[i]==1)
           {
                counter=counter+1;
	   }
	}
	System.out.println("There are only " +counter + "seats are available in this class");
	System.out.println("How many seats do u want");
	ns=sc.nextInt();
        if(counter>=ns)
        {
            totalamt=ect*ns;
            if(ns<=30)
            {
	        System.out.println("which seats do u want");
	        for(int i=0;i<ns;i++)
	        {
                    int cs;
                    cs=sc.nextInt();
                    do
                    {
                        if(cs<60&&cs>30)
                        {
                            break;
			}
                        else
			{
                            System.out.println("INVALID SEAT NUMBER\nPLEASE ENTER CORRECT NUMBER...");
                            cs=sc.nextInt();
                        }
		    }while(cs>60);
                    for(int g=30;g<=60;g++)
                    {
		        if(a[cs-1]==0)
		        {
                            System.out.println("the seats you have choosen is already booked so please select another seat");
                            cs=sc.nextInt();
                            g=0;
                        }
		    }
                    a[cs-1]=0;	  
                }			
	        System.out.println();
                seats.economyclassseat(a);
                System.out.println("Total amount should be paid is " +totalamt+ " only");
                seats.details();
                int card = Payment.card(totalamt);
            }
            else
            {
                totalamt=ect*ns;
                System.out.println("In firstclass there is only 30 seats are there in this class please selete valid");
                counter=0;
                economyclassbook(a,fct,ect);
            }
        }
        else
        {
            totalamt=ect*ns;
            System.out.println(" SORRY  "+ns+" no.of seats are not avaliable in this class ");
            counter=0;
            int efection;
            System.out.println(" Would you like to go for first class? 1 for Yes 2 for No");
            efection = sc.nextInt();
            if ( efection == 1 )
            {
                Class.firstClass();
		seats.firstclassseat(a);
                firstclassbook(a,fct,ect);
            }
            else
            {
                seats.economyclassseat(a);
		economyclassbook(a,fct,ect);  
            }  
	} 
    }
}
 