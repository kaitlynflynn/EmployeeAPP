package employeeApp;

public class Company 
{
    private static int maxId = 0;
    public int id;
    public String name;
    public int debt;

    public final static double match401K = 0.05; // final meaning no one can change it, a constant which is part of a class

    public Company (String name, int debt)
    {
        maxId++;
        id = maxId;
        this.name = name;
        this.debt = debt;
    }
}