package employeeApp; //must always create a package which is what we setup initially as our first folder

// our class must also be named the same as the file, in this case, Employee
// setting our variable to 'private' as only Employee is going to have access to this variable
public class Employee
{
    private static int maxId = 0; // static means maxId is going to remain the same across all objects
    private int id; // static is missing here so everyone will have a different id
    private String fname; // String is a class so it's capital, this is for first name
    private String lname; // last name
    private double salary; // double means real number which has to have a decimal part in JAVA
    private int companyID;
    private int healthPlanID;

    // we need a constuctor which has to be public and does not have a type; must have same name as the class
    public Employee (String fname, String lname, double salary, int companyID, int healthPlanID) // inside params is our params list
    {
        maxId++; // shortcut for maxId = maxId + 1
        id = maxId;

        this.fname = fname;
        this.lname = lname;
        this.salary = salary;
        this.companyID = companyID;
        this.healthPlanID = healthPlanID;
    }

    // getters and setters allowing us to get/set info from the object
    // method to get ID
    public int getId()
    {
        return id;
    }

    // method to get firstname
    public String getName()
    {
        return fname + " " + lname;
    }

    // method to set firstname; example if employee needed to change name after it was initially created
    public void setFname(String fname)
    {
        this.fname = fname;
    }

    // method to change last name
    public void setLname(String lname)
    {
        this.lname = lname;
    }

    // method to get salary
    public double getSalary()
    {
        return salary;
    }

    // method to change salary
    public void setSalary(double salary)
    {
        this.salary = salary;
    }
}