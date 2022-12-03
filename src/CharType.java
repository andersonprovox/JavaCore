public class CharType {
    public static void main(String[] args) {
        char c1 = 'A';
        System.out.println(c1);//A

        int i1 = c1;
        System.out.println(i1);//65

        char c2 = 'A' + 2;
        System.out.println(c2);//C

        char c3 = 48;
        System.out.println(c3);//1

        char c4 = (char) -10;
        System.out.println(c4);//caractere não reconhecível
    }
}
