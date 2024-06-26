package array;
//Write a method returning a double[] already filled with values
// if addNoise true all the elements have to be randomized between plus or minus 5 percent of value.
import java.util.Random;

public class FillArray {
    public static double[] fillArray(int size, double value, boolean addNoise) {
        double[] array = new double[size];

        if (addNoise) {
            Random generator = new Random();
            for (int i = 0; i < size; i++) {
                array[i] = generator.nextDouble(value - 5 * value / 100, value + 5 * value / 100);
            }
        } else {

            for (int j = 0; j < size; j++) {
                array[j] = value;
            }
        }
        return array;
    }



}
