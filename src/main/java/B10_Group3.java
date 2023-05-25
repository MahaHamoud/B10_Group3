
import java.io.File;
import java.io.FileNotFoundException;


import java.io.PrintWriter;


                        

public class B10_Group3 {

    public static void main(String[] args) {
        System.out.println("Hello, I'm Maha :) ");
        System.out.println("Hello, I'm Razan <3 ");      
        System.out.println("Hello, I'm Fatimah <3 ");
        System.out.println("Hello, I'm Renad <3 ");
        System.out.println("Hello, I'm Sarah ");
        
        System.out.println("Hello, I'm Lala");
       
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
    
 

    
}
