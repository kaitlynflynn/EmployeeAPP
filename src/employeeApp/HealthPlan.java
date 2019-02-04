package employeeApp;

// set our class for HealthPlan as public
public class HealthPlan
{
    private static int maxId = 0; // same value throughout all the objects
    private int id; // id set specific to this object
    private String name;

    // set contructor
    public HealthPlan (String name)
    {
        this.name = name; // 'this.name' refers to the name which is part of the object, 'name' referes to our constructor in params
    }

    // method to get ID
    public int getId()
    {
        return id;
    }

    // method to get name
    public String getName()
    {
        return name;
    }
}