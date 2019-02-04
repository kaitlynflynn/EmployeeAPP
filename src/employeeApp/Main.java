package employeeApp;

public class Main
{
    private static void workWithData()
    {
        HealthPlan h1 = new HealthPlan("My Health 1"); // Creating a new object name
        HealthPlan h2 = new HealthPlan("My Health 2");

        Company c1 = new Company("Company A", 100); // inside params is company name and debt
        Company c2 = new Company("Company B", 100);

        Employee emp1 = new Employee("Kaitlyn", "Flynn", 45000, c1.id, h1.getId()); // inside params is fname, lname, salary, company id & health id
        Employee emp2 = new Employee("Comrade", "Pug", 80000, c1.id, h2.getId());
        Employee emp3 = new Employee("Clementine", "Pug", 75000, c2.id, h2.getId());

        // how we display something to console
        System.out.println("*** Query Data ***");
        System.out.println(c1); // this will print info for Company 1
    }
    public static void main(String[] args)
    {
        workWithData();
    }
}