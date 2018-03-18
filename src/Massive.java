public class Massive {
    public static void main(String args[]) {
    int[] numbers = {8, 4, 65, 53, 84, 96, 22};

    double sum = 0;
    double average = 0;

    for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        average = sum/numbers.length;

        System.out.println(average);
    }
}
