public class ExValorMulta {
    public static void main(String[] args) {
        int allowed = 80;
        int current = 90;
        int considered;

        if (allowed<  100) {
            considered = current + 7;
        } else {
            considered = current + (int) (current * 0.1);
        }

        int diff = considered - allowed;
        int amount = diff * 10;

        System.out.println("Value: " + amount);

    }
}
