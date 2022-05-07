import java.util.Scanner;

public class SubArray {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter size of array");
            int size = sc.nextInt();
            System.out.println("Enter value of consecutive no.");
            int consecutive = sc.nextInt();

            int[] array = new int[size];
            int[] sub_array = new int[consecutive];
            System.out.println("Enter Elements of array");
            for (int i = 0; i < array.length; i++) {
                array[i] = sc.nextInt();
            }
            int sum = 0;
            int newSum = 0;
            for (int j = 0; j <= array.length - consecutive; j++) {

                for (int k = j; k < j + consecutive; k++) {
                    sum += array[k];

                }

                if (sum > newSum) {
                    for (int i = 0; i < sub_array.length; i++) {
                        sub_array[i] = array[j + i];
                    }
                    newSum = sum;
                    sum = 0;
                } else {
                    sum = 0;
                }

            }
            System.out.println("The sum is :" + newSum);
            StringBuilder sb = new StringBuilder();
            sb.append("[");
            for (int i = 0; i < sub_array.length; i++) {
                if (i != 0)
                    sb.append(",");
                sb.append(sub_array[i]);
            }
            sb.append("]");
            System.out.println(sb);
        }

    }
}
