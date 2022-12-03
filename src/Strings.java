public class Strings {
    public static void main(String[] args) {
        String s = "abc";
        String y = "FFF";
        String z = s + y;
        z = z.toUpperCase();//perfeitamente possível reatribuir uma string para a sua variável

        System.out.println(z);
    }
}
