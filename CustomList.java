import java.lang.instrument.Instrumentation;
import java.util.Arrays;
import java.util.Scanner;

class List<E> {
    private int size = 0;

    private Object[] value = new Object[size + 1];

    public void add(E e) {

        value[size] = e;
        sort();
        size += 1;
        value = Arrays.copyOf(value, size + 1);

    }

    public int size() {
        return size;
    }

    public void print() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < size(); i++) {
            if (i != 0)
                sb.append(",");
            sb.append(value[i]);
        }
        sb.append("]");
        System.out.println(sb);
    }

    public void sort() {
        for (int i = 0; i < value.length - 1; i++) {
            for (int j = i + 1; j < value.length; j++) {
                if ((value[i].toString().compareTo(value[j].toString())) > 0) {
                    Object temp = value[i];
                    value[i] = value[j];
                    value[j] = temp;
                }

            }
        }
    }

}

public class CustomList {
    static Scanner sc = new Scanner(System.in);

    static void Inp(List<String> li) {
        int i = 0;
        while (i < 15) {
            System.out.println("Enter a Element for List");
            String input = sc.nextLine();
            li.add(input);
            li.print();
            i++;
        }

    }

    public static void main(String[] args) {

        List<String> list = new List<>();
        Inp(list);

    }
}