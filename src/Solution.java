import java.util.Scanner;

/**
 *
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
