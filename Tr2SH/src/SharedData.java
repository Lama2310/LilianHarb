import java.util.ArrayList;
/**
 * The {@code SharedData} class is used to store and manage an array of integers, 
 * a target value (b), and a flag indicating the result of a calculation.
 * It also holds an array of boolean values that indicate whether a specific element
 * of the integer array has contributed to a valid solution.
 */
public class SharedData 
{
	 /** 
     * The array of integers to be processed.
     */
	private ArrayList<Integer> array; 
	/** 
     * The array that stores whether each index of the {@code array} is part of the valid solution.
     */
	private boolean [] winArray;
	 /** 
     * A flag that indicates whether a solution has been found. 
     */
	private boolean flag;
	/** 
     * The target value to be matched with a subset sum of {@code array}.
     */
	private final int b;

    /**
     * Constructs a new {@code SharedData} object with the specified array and target value.
     * 
     * @param array The array of integers.
     * @param b The target sum to be matched.
     */
	public SharedData( ArrayList<Integer> array , int b) {
		
		this.array = array;
		this.b = b;
        //this.winArray = new boolean[array.size()];
	}
	/**
     * Gets the array of boolean values that indicates the solution.
     * 
     * @return A boolean array where each index corresponds to whether the corresponding index
     *         in the integer array is part of the valid solution.
     */

	public boolean[] getWinArray() 
	{
		return winArray;
	}
	 /**
     * Sets the array of boolean values that indicates the solution.
     * 
     * @param winArray A boolean array where each index corresponds to whether the corresponding
     *                 index in the integer array is part of the valid solution.
     */

	public void setWinArray(boolean [] winArray) 
	{
		this.winArray = winArray;
	}
	/**
     * Gets the integer array that holds the input values for processing.
     * 
     * @return The array of integers.
     */
	public ArrayList<Integer> getArray() 
	{
		return array;
	}

    /**
     * Gets the target value {@code b}.
     * 
     * @return The target value {@code b}.
     */
	public int getB() 
	{
		return b;
	}
	/**
     * Gets the flag that indicates whether a solution has been found.
     * 
     * @return {@code true} if a solution has been found, {@code false} otherwise.
     */
	public boolean getFlag() 
	{
		return flag;
	}
	 /**
     * Sets the flag that indicates whether a solution has been found.
     * 
     * @param flag The flag value to set. {@code true} if a solution has been found, 
     *             {@code false} otherwise.
     */
	public void setFlag(boolean flag) {
		this.flag = flag;
	}

}
