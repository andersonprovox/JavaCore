public class TextBlocks {
    public static void main(String[] args) {
        // antes dos text blocks era assim que se pulava linha ou identação
        System.out.println("Olá,\n  tudo\n    bem");

        //com text block
        String s = """
                Olá,
                    tudo
                        bem
             """;

        System.out.println(s);
    }
}
