public class RepeatCotinue {
    public static void main(String[] args) {
        for (int i = 0; i < 200; i++) {
            if (i % 2 == 0) {
                continue;
            }

            System.out.println(i);//quando a condição for verdadeira vai pular essa impressão
        }

        System.out.println("FIM");
    }
}
