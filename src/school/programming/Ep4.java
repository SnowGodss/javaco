package school.programming;

public class Ep4 {
    public static  void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 2; j <= 9; j++) {
                System.out.printf("%d * %d = %d ,", j, i, i * j);
            }
            System.out.println();
        }
    }
}
