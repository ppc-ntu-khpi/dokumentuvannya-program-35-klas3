package domain;

/**
 * Represents an artist of the company
 * @author Ivan Shapovalov
 */
public class Artist extends Employee {
    /**
     * Constructor with full information of artist
     * @param skiils skills that artist have
     * @param name name of the artist
     * @param jobTitle job title of the artist
     * @param level level of the artist
     * @param dept department name where the artist works
     */
    public Artist(String[] skiils, String name, String jobTitle, int level, String dept) {
        super(name, jobTitle, level, dept);
        this.skiils = skiils;
    }

    /**
     * Constructor with only skills of the artist
     * @param skiils skills that artist have
     */
    public Artist(String[] skiils) {
        super();
        this.skiils = skiils;
    }
    
    /**
     * Default constructor for the artist
     */
    public Artist() {
        super();
        this.skiils = new String[10];
    }

    /**
     * Method for getting information about the artist
     * @return string with the artist information
     */
    @Override
    public String toString() {
        return super.toString()+"\nSkills: "+getSkills();
    }

    private String[] skiils;

    /**
     * Method which returns the artist's skills as a single string
     * @return skills of the artist
     */
    public String getSkills() {
        String s = "";
        for (String e : skiils) {
            s = s + e + ", ";
        }
       s=s.substring(0, s.length() - 2);
        return s;
    }

    /**
     * Method that assign skills to the artist
     * @param skills skills that artist have 
     */
    public void setSkills(String[] skills) {
        this.skiils=skills;
    }

    /**
     * Method which returns the artist's skills as a array of strings
     * @return skills of the artist
     */
    public String[] getSkillsLSist() {
        return skiils;
    }
}
