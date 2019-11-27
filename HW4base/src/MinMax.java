public class MinMax {
    public static void main(String[] args) {
        int numbers[] = {1, 10, 24, 45, 5};
        int min = numbers[0];
        int max = numbers[0];
        for (int a = 0; a < 5 ; a++) {
            if (min > numbers[a]) {
                min = numbers[a];
            }
            if (max < numbers[a]) {
                max = numbers[a];
            }

        }
        System.out.println( max);
        System.out.println( min);
    }
}


