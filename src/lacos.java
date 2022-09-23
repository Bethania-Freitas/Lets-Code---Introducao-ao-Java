public class lacos {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%nTabuada de %s %n", i);
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%s x %s = %s %n", i, j, (i*j));
            } 
        }
    }
}
