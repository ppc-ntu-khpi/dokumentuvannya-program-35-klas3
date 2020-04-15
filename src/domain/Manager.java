package domain;

/**
 * Represents a manager of the company
 * @author Ivan Shapovalov
 */
public class Manager extends Employee {
    /**
     * Constructor with full information about manager
     * @param employees employees of the manager
     * @param name name of the manager
     * @param jobTitle job title of the manager
     * @param level level of the manager
     * @param dept department of the manager
     */
    public Manager(Employee[] employees, String name, String jobTitle, int level, String dept) {
        super(name, jobTitle, level, dept);
        this.employees = employees;
    }

    /**
     * Method that returns information about manager's employees
     * @return information about manager's employees
     */
    @Override
    public String toString() {
        return super.toString()+"\nEmployees: "+getEmployees(); 
    }

    /**
     * Constructor with only information about manager's employees
     * @param employees employees of the manager
     */
    public Manager(Employee[] employees) {
        super();
        this.employees = employees;
    }
    
    /**
     * Default constructor for the manager
     */
    public Manager() {
        super();
        employees = new Employee[10];
    }

    private Employee[] employees;

    /**
     * Method that returns manager's employees information
     * @return manager's employees as a string
     */
    public String getEmployees() {
        String s = "";
        for (Employee e : employees) {
            s = s + e.getName() + ", ";
        }
        s=s.substring(0, s.length() - 2);
        return s;
    }

    /**
     * Method that assign employees to the manager
     * @param employees employees of the manager
     */
    public void setEmployees(Employee[] employees) {
        this.employees=employees;
    }

    /**
     * Method that returns employees of the manager
     * @return array of the manager employees
     */
    public Employee[] getEmployeesList() {
        return employees;
    }

    
}
