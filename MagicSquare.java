
/**
 * @author 
 * @version 
 */

public class MagicSquare
{
    /** The magic square array data */
    private int[][] array;

    /**
     * Constructs a MagicSquare object.
     * @param input the magic square array data.
     */
    public MagicSquare(int[][] input)
    {
        array = input;
    }

    /**
     * Tests to see if array is indeed a magic square
     * @return true if array is a magic square
     * @return false if the array is not a magic square
     */
    public boolean isMagicSquare()
    {
        if (array.length != array[0].length) {
          return false;
        }
        int constant = 0;
        int sum = 0;
        //get sum of first row for target #
        for (int i = 0; i < array.length; i++) {
          constant += array[0][i];
        }
        //checks each row for constant
        for (int i = 0; i < array.length; i++) {
          sum = 0;
          for (int j = 0; j < array[0].length; j++) {
            sum += array[i][j];
          }
          if (sum != constant) {
            return false;
          }
        }
        //checks each column for constant
        for (int j = 0; j < array[0].length; j++) {
          sum = 0;
          for (int i = 0; i < array.length; i++) {
             sum += array[i][j];
          }
          if (sum != constant) {
            return false;
          }
        }
        //checks the TR-BL diagonal for constant
        sum = 0;
        for (int i = 0; i < array.length; i++) {
          sum += array[i][array[0].length - 1 - i];
        }
        if (sum != constant) {
          return false;
        }
        //checks the TL-BR dagonal for constant
        sum = 0;
        for (int i = 0; i < array.length; i++) {
          sum += array[i][i];
        }
        if (sum != constant) {
          return false;
        }
        return true;   // complete this method
    }

    /**
     * Returns a String which represents the array.
     */
    public String toString()
    {
        String result = "";
        for(int r = 0; r < array.length; r++)
        {
            for(int c = 0; c <array[r].length; c++)
            {
                result += array[r][c];
                result += "\t";
            }
            result += "\n";
        }
        return result;
    }
}
