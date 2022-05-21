package flightmanegmentsystem;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.regex.*;  
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
public class Flightmanegmentsystem 
{
    static int x,c,pin;
    static Signup obj1=new Signup();
    static InputStreamReader ss=new InputStreamReader(System.in);
    static BufferedReader sd=new BufferedReader(ss);
    static Scanner sc=new Scanner(System.in);
    static Signup lp=new  Signup(); 
    static routes ro=new  routes(); 
    static Class co=new  Class(); 
    static seats se=new  seats();
    
    public static boolean isValid(String email)
    {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+
                            "[a-zA-Z0-9_+&*-]+)*@" +
                            "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                            "A-Z]{2,7}$";
        String regex = "^(.+)@(.+)$"; 
                              
        Pattern pat = Pattern.compile(emailRegex);
        if (email == null)
            return false;
        return pat.matcher(email).matches();
    }
    public static void main(String[] args) throws IOException 
    {
        //JOptionPane.showMessageDialog(null,"hello");
        do
        {
            System.out.println("Welcome to ONLINE FLIGHT BOOKING SYSTEM");
            System.out.println("Please sign up if you are new to website \n if you already have an account for our website then sign in to your account");
            do
            {
                System.out.println("for sign up please press 1 or for sign in 2");
                c=sc.nextInt();
		if(c==1)
		{
                    System.out.println("Name: ");
                    Signup.name=sd.readLine();
                    System.out.println("emailId: ");
                    String email=sd.readLine();
                    /*while(!isValid(Signup.emailid)){
                        
                        System.out.println("please enter valid email id: "+!isValid(Signup.emailid));
                        email=sd.readLine();
                    }*/
                    Signup.emailid=email;
                    System.out.println("phone number: ");
                    Signup.phno=sd.readLine();
                    System.out.println("Enter pin code for your login code");
                    Signup.no=sc.nextInt();
                    Signup.store();
                    
                }
		else if(c==2)
		{
                    Signup obj2=new Signup();
                    System.out.println("secrete pin ");
                    pin=sc.nextInt();
                    if(obj1.check(pin)) 
                    {
                        do
                        {
                            System.out.println("1.To see flight routes\n2.To book flight tickets Tickets");
                            int csa;
                            csa=sc.nextInt();
                            switch(csa)
                            {
				case 1:
                                    System.out.println("available flight routes are");
                                    routes.displayflightroutes();
                                    break;
                                case 2:
                                    System.out.println("To book flight tickets Tickets");
                                    routes.route();
                                    break;
                                default:
                                    System.out.println("Enter correct option");
                                    break;
				}
                                
                        }while(true);
                    }
                    else
                    {
			System.out.println("sorry your secrete pin is wrong");
                    }
		}
                else{
                    
                }
                if(c!=1 && c!=2)
		{
		    System.out.println("please You sould create or login to account");	
                }
            }while(c!=1 && c!=2);
                
        }while(true);
    }
}
