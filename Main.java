
public class Main{
	public static void main(String [] args){
		System.out.println("====Welcome to Java Project====");
		System.out.println("----Updated Java File---");
	    Customer customer1 = new Customer("John Doe", "john.doe@example.com", "123-456-7890", "123 Elm Street");
		Customer customer2 = new Customer("Jane Smith", "jane.smith@example.com", "098-765-4321", "456 Oak Avenue");
		
				// Print customer details
				System.out.println("Customer 1 Details:");
				customer1.displayCustomerDetails();
				System.out.println();
		
				System.out.println("Customer 2 Details:");
				customer2.displayCustomerDetails();
			}
		}
		
	