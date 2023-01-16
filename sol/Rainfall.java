package sol;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Class representing Rainfall data
 */
public class Rainfall {

    /**
     * Field representing the rainfall data readings
     */
    private List<Integer> data;

    /**
     * Constructor for a Rainfall
     *
     * @param data  the list of rainfall data readings
     */
    public Rainfall(List<Integer> data) {
        // TODO: Javadoc
        // Copies over data into a new list
        this.data = new LinkedList<Integer>(data);
    }

    /**
     * Method to compute the average rainfall according to these rules:
     *   - Only readings before the first -999 are considered
     *   - Negative readings are discarded
     * Assumes that there is at least one non-negative number before -999 in the data
     *
     * @return  The average rainfall for the relevant readings in the data
     */
    // UNCOMMENT WHEN READY TO IMPLEMENT
    // public double getAverage() { }
}
