public class PartTimeEmployee extends Employee {
    //Employee constructor params: boolean managerFlag, boolean isPartTime, String name, String dateHired, int id

    /**
     * Part Time employees automatically have isPartTime set to true. 
     * 
     * @param name String - their name.
     * @param dateHired String - Date Hired in Format dd-M-yyyy hh:mm:ss
     * @param id int - employee id number
     */
    public PartTimeEmployee(String name, String dateHired, int id) {
        super(false, true, name, dateHired, id);
    }
    
}
