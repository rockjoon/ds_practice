package basic;

public class Multi99Table {
    public static void main(String[] args) {
        System.out.println("-----곱셈표-----");

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i == 0) {
                    if (j == 0) System.out.print("  |");
                    System.out.printf("%3d", j);
                }
            }
            if (i == 0) {
                System.out.print("---");
            }
        }

    }
}
