public class FullTimeEmployee extends Employee {
    //Employee constructor params: boolean managerFlag, boolean isPartTime, String name, String dateHired, int id

    /**
     * Full Time employees are set isPartTime to false automatically.
     * 
     * @param name String - their name.
     * @param dateHired String - Date Hired in Format dd-M-yyyy hh:mm:ss
     * @param id int - employee id number
     */
    public FullTimeEmployee(String name, String dateHired, int id) {
        super(false, false, name, dateHired, id);
    }
    
}
