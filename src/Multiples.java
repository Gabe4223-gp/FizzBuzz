public class Multiples {
    public static void main(String[] args) {
        int counter = 0;
        for (int i = 1; i < 1000; i++) {
            boolean multiple_of_3 = i % 3 == 0;
            boolean multiple_of_5 = i % 5 == 0;

            if (multiple_of_3 || multiple_of_5) {
                counter += 1;
            }
        }
        System.out.println(counter);
    }
}
