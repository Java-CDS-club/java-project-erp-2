import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Employee {
    // Fields
    private boolean managerFlag;
    private boolean isPartTime;
    private String name;
    private Date dateHired;
    private int id;

    // Constructor for Employee
    public Employee(boolean managerFlag, boolean isPartTime, String name, String dateHired, int id) {
        this.managerFlag = managerFlag;
        this.isPartTime = isPartTime;
        this.name = name;
        SimpleDateFormat sdf = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
        try {
            this.dateHired = sdf.parse(dateHired);
        } catch (Exception e) {
            System.out.println(e);
        }        
        this.id = id;

        System.out.println(name + " is employee: #" + id + ". Manager Status: " + managerFlag + ". Part-Time Status: " + 
                isPartTime + ". They were hired on " + this.dateHired + ".");
    }
    
    // Methods
    public String getName() {
        return name;
    }

    public String getId() {
        return String.valueOf(id);
    }

    public Date getDateHired() {
        return dateHired;
    }

    public boolean isManager() {
        return managerFlag;
    }

    public boolean isPartTime() {
        return isPartTime;
    }
}
