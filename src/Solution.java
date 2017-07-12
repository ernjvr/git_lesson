import java.util.Scanner;

/**
 *Count the number of valleys a hiker walked.
 *input on line 1 - n number of steps eg. 4
 *input on line 2 - actual steps eg. uddu
 *output - print the number of valleys eg. 1
 * @author admin
 */
public class Solution {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        final String steps = scanner.nextLine().toLowerCase();
        int seaLevel = 0;
        int valleyCounter = 0;
        boolean belowSeaLevel = false;
        for (int i = 0; i < steps.length(); i++) {
            final char step = steps.charAt(i);
            switch (step) {
                case 'u':
                    if (seaLevel == 0) {
                        belowSeaLevel = false;
                    }
                    seaLevel++;
                    if (seaLevel == 0 && belowSeaLevel) {
                        valleyCounter++;
                    }
                    break;
                case 'd':
                    if (seaLevel == 0) {
                        belowSeaLevel = true;
                    }
                    seaLevel--;
                    break;
                default:
                    throw new AssertionError();
            }
        }
        System.out.println(valleyCounter);
    }

}
