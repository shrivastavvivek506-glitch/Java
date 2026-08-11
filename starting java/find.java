public class find {
    public static void main(string[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int target = 3;
        boolean found = false;

        for (int number : numbers) {
            if (number == target) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Number " + target + " found in the array.");
        } else {
            System.out.println("Number " + target + " not found in the array.");
        }
    }
    
}
