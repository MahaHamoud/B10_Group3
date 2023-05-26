
import java.io.File;
import java.io.FileNotFoundException;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.PrintWriter;


                        

public class B10_Group3 {

    public static void main(String[] args) {
        System.out.println("Hello, I'm Maha :) ");
        System.out.println("Hello, I'm Razan <3 ");      
        System.out.println("Hello, I'm Fatimah <3 ");
        System.out.println("Hello, I'm Renad <3 ");
        System.out.println("Hello, I'm Sarah ");
        
        System.out.println("Hello, I'm Lala");
        
        placeOrder();
       
    }
      public void generateReport(Customer customer,Freelancer freelancer,Order order,Service service,Payment payment ) throws FileNotFoundException {
  
        File outputfile=new File("AdminReport.txt");
        PrintWriter report= new PrintWriter(outputfile);
        report.println("-----------ADMIN REPORT-----------");
        report.println("--ORDER DATA--");
        report.println("ORDER NUMBER : "+order.OrderNumber);
        report.println("ORDER STATUS : "+order.OrderStatus);
        report.println();// for order date 
        report.println("--SERVICE DATA--");
        report.println("SERVICE NAME : "+service.ServiceName);
        report.println("--CUSTOMER DATA--");
        report.println("CUSTOMER NAME : "+customer.customerName);
        report.println("CUSTOMER ID : "+customer.customerID);
        report.println("CUSTOMER EMAIL : "+customer.customerEmail);
        report.println("--FREELANCER DATA--");
        report.println("FREELANCER NAME : "+freelancer.FreelancerName);
        report.println("FREELANCER ID : "+freelancer.FreelancerID);
        report.println("FREELANCER EMAIL : "+freelancer.FreelancerEmail);
        report.println("--PAYMENT DATA--");
        report.println();
        //i want to add somthing telling the price of the service 
        report.println("----------END OF THE REPORT----------");
        report.close();
   
   System.out.println("Report generated successfully.");
}
    
 
  
        
    
    public static void placeOrder (){
        System.out.println("              Hello dear Customer , Welcome to Sanad!                 ");
        System.out.println("     From here you can choose whatever services you wish to order     ");
        System.out.println("**********************************************************************"+'\n');
        //------------------------------------------------------------------------------------------------------------------ displaying menu
        // Read the menu from the file
        File menuFile = new File("C:\\Users\\RAZAN\\OneDrive\\سطح المكتب//menu.txt");
        Scanner menuScanner = new Scanner(menuFile);
        // Display the menu options to the user
        
        System.out.println(" - Services menu Options:");
        while (menuScanner.hasNextLine()) {
            String menuItem = menuScanner.nextLine();
            System.out.println("------------------------");
            System.out.println(menuItem);
            
        }
        //--------------------------------------------------------------------------------------------------------------------- selection
        // Prompt the user to select an item from the menu
        Scanner userInputScanner = new Scanner(System.in);
        System.out.print('\n'+"  - Please enter your selection: ");
        String userSelection = userInputScanner.nextLine();
        while (menuScanner.hasNext()) {
            
            String command = userInputScanner.next();
            
            if (command.equals("Quit"))
                break;
            
            switch (command) {
                
                case "1":
                    
                    break;
                
                case "2":
                    
                    break;
                
                case "3":
                    
                    break;
                
                case "4":
                    
                    break;
                
                case "5":
                    
                    break;
                
                case "6":
                   
                    break;
                case "7":
                   
                    break;
                case "8":
                   
                    break;
                case "9":
                   
                    break;
                case "10":
                   
                    break;
                
            }
            System.out.println("Wrong input");
            
            
            
        }
        //--------------------------------------------------------------------------------------------------------------------- payment
        System.out.print("     Great choice, Would you like to proceed to checkout? [ Yes or No] ");
        // Read the payment options from the file
        File paymentFile = new File("C:\\Users\\RAZAN\\OneDrive\\سطح المكتب//payment.txt");
        Scanner paymentScanner = new Scanner(paymentFile);
        String userPaymentApproval = userInputScanner.next();
        if ( userPaymentApproval.equals("Yes") && userPaymentApproval.equals("yes")){
            
            
            
            // Display the payment options to the user
            System.out.println('\n'+"     Payment Options:");
            while (paymentScanner.hasNextLine()) {
                String paymentOption = paymentScanner.nextLine();
                System.out.println('\n'+"  - "+paymentOption);
            }

            // Prompt the user to select a payment method
            System.out.print('\n'+"    Please enter your payment method: ");
            String paymentMethod = userInputScanner.next();
            
//--------------------------------------------------------------------------------------------------------------- closing with payment
// Display order summary to the user
System.out.println('\n'+"********************* Thank you for your order! *********************");
System.out.println("*********************************************************************");
System.out.println("   - You ordered option " + userSelection);
System.out.println("   - Your payment method is " + paymentMethod);

// Close all the scanners
menuScanner.close();
paymentScanner.close();
userInputScanner.close();

//--------------------------------------------------------------------------------------------------------------- end
        }else if ( userPaymentApproval.equals("No") && userPaymentApproval.equals("no")){
            System.out.println("************ Thank you for visiting Sanad Website *****************");
            System.out.println("************ we hope that you enjoyed your experience<3 *************");
        }else System.out.println("Wrong input");
        }

    }



    
}
