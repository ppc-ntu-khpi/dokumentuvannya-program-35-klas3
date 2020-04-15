package domain;

/**
 * Represents an employee of the company
 * @author Ivan Shapovalov
 */
public class Employee {
    /**
     * Method that returns full information about the employee
     * @return full employee information
     */
    @Override
    public String toString() {
        return "\nEmployee ID= " + ID + "\nName= " + name + "\nJobTitle= " + jobTitle + "\nLevel= " + level + "\nDept= " + dept;
    }

    private String name;
    private String jobTitle;
    private int ID;
    private int level;
    private String dept;

   // private static int employeesCount = 0;

    /**
     * Constructor with full employee's information
     * @param name name of the employee
     * @param jobTitle job title of the employee
     * @param level level of the employee
     * @param dept department of the employee
     */
    public Employee(String name, String jobTitle, int level, String dept) {
        this();
        setName(name);
        this.jobTitle = jobTitle;
        switch (level) {
            case 1:
            case 2:
            case 3:
                this.level = level;
                break;
            default:
                this.level = 1;
        }
        this.dept = dept;
    }

    /**
     * Default constructor of the employee
     */
    public Employee() {
        ID = (int)(Math.random()*1000);
//        if (ID > 10000) {
//            throw new NumberFormatException("ERROR! Employee's ID cannot be greater than 10000. Employee is not created!");
//        }
    }

    /**
     * Method that assign job title to the employee
     * @param job job title of the employee
     */
    public void setJobTitle(String job) {
        jobTitle = job;
    }

    /**
     * Method that returns job title of the employee
     * @return job title of the employee
     */
    public String getJobTitle() {
        return jobTitle;
    }

    /**
     * Method that returns name of the employee
     * @return name of the employee
     */
    public String getName() {
        return name;
    }

    /**
     * Method that assign level to the employee
     * @param level level of the employee
     */
    public void setLevel(int level) {
        switch (level) {
            case 1:
            case 2:
            case 3:
                this.level = level;
                break;
            default:
                this.level = 1;
        }
    }

    /**
     * Method that returns level of the employee
     * @return level of the employee
     */
    public int getLevel() {
        return level;
    }

    /**
     * Method that returns department of the employee
     * @return department of the employee
     */
    public String getDept() {
        return dept;
    }

    /**
     * Method that assign department to the employee
     * @param dept department of the employee
     */
    public void setDept(String dept) {
        this.dept = dept;
    }

    /**
     * Method that assign name to the employee
     * @param name name of the employee
     */
    public void setName(String name) {
//        boolean correctName = true;
//        for (int i = 0; i < name.length(); i++) {
//            char s = name.charAt(i);
//            if (Character.isDigit(s)) {
//                correctName = false;
//            }
//        }
//        if (correctName) {
//            this.name = name;
//        } else {
//            this.name = "John Doe";
//        }
        if (name.matches("^([a-zA-Z]+[\\'\\,\\.\\-]?[a-zA-Z ]*)+[ ]([a-zA-Z]+[\\'\\,\\.\\-]?[a-zA-Z ]+)+$")) {
            this.name = name;
        } else {
            this.name = "John Doe";
        }
    }
}
