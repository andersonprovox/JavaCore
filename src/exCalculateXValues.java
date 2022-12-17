public class exCalculateXValues {
    public static void main(String[] args) {
        int x = 13;

        if(x % 2 == 0) {
            x += 5;
        } else {
            x *= 2;
        }

        System.out.println(" O novo valor de X: " + x);
    }
}
