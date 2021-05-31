
package ass3.mygame2;
/**
 * This class describe the features of a item
 * and also return the features
 * @author Anwaar and Aitzaz
 * @version 2021.05.26
 */
public class Item
{
    private String description;
    private String name;
    private int destructivePower;
    private double healingPower;
    
    /**
     * Create item and initialize the item properties
     * @param name to initialize the name of item
     * @param description to initialize the item description
     * @param destructivePower to initialize the item destruction power
     */
    public Item(String name, String description, int destructivePower)
    {
        this.name = name;
        this.description = description;
        this.destructivePower = destructivePower;
    }
    
    /**
     * Create another item and initialize the properties of second item
     * @param name to initialize the name of second item
     * @param description to initialize the description of second item
     * @param healingPower to initialize the healing power of second item
     */
    public Item(String name, String description, double healingPower)
    {
        this.name = name;
        this.description = description;
        this.healingPower = healingPower;
    }
    
    /**
     * to access the item name
     * @return the name of item 
     */
    public String getName(){
        return name;
    }
     /**
      * to access the description of item
      * @return description
      */
    public String getDescription(){
        return description;
    }
    // Sprint number 1
    /** 
     * to access the healing power of item
     * @return healing power
     */
    public double gethPower(){
        return healingPower;
    }
    /**
     * to access the destructive power of item
     * @return destructive power
     */
    public int getdPower(){
        return destructivePower;
    }
}
