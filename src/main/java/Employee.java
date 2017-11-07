/**
 * Class implementing an employee.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/10/">Lab 10 Description</a>
 */
public class Employee {

    /**
     * name.
     */
    private String name;
    /**
     * manager.
     */
    private String manager;

    /**
     * Constructor for initialization.
     * @param pName name
     * @param pManager manager
     */
    public Employee(final String pName, final String pManager) {
        this.name = pName;
        this.manager = pManager;
    }

    /**
     * Getter for name.
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Setter for name.
     * @param pName name
     */
    public void setName(final String pName) {
        this.name = pName;
    }

    /**
     * Getter for manager.
     * @return manager
     */
    public String getManager() {
        return manager;
    }

    /**
     * Setter for manager.
     * @param pManager manager.
     */
    public void setManager(final String pManager) {
        this.manager = pManager;
    }
}
