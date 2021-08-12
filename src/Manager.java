public class Manager extends Employee {
    //Employee constructor params: boolean managerFlag, boolean isPartTime, String name, Date dateHired, int id

    /**
     * Managers can be part time or full time, but are not considered standard employees by the system, but still are
     * employees, obviously. 
     * 
     * @param isPartTime boolean - is the employee part time or full time?
     * @param name String - their name.
     * @param dateHired String - Date Hired in Format dd-M-yyyy hh:mm:ss
     * @param id int - employee id number
     */
    public Manager(boolean isPartTime, String name, String dateHired, int id) {
        super(true, isPartTime, name, dateHired, id);
    }
    
}
