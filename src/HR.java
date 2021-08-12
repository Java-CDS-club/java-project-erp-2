import java.util.Date;

/**
 * Class HR contains the main method. Creates 3 Employees, a manager, a part time employee, and a full time employee.
 * 
 * @author Allison Mackenzie Johnson
 * @version August 12th, 2021
 */
public class HR {

    //boolean managerFlag, boolean isPartTime, String name, Date dateHired, int id
    public static void main(String[] args) {
        Employee john = new Manager(false, "John Goodman", "31-08-1982 10:20:56", 10201);
        Employee lisa = new PartTimeEmployee("Lisa Kendrick", "31-08-2016 13:30:42", 62421);
        Employee matthew = new FullTimeEmployee("Matthew Harris", "22-02-1999 12:10:21" ,89654);        
    }
    
}
