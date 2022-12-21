public class InnerLoops {
    public static void main(String[] args) {
        outer://modo de como nomear labels, aqui o for abaixo da label recebe o nome de outer
        for (int i = 1; i <= 10; i++) {
            inner:
            for (int j = 1; j <= 10; j++) {
                if (j == 5) {
                    break outer;// este break vai fazer interromper a execução do innner e do outer
                    //se fosse usado um break comum sem a label seria interrompido apenas a execução do for interno
                    //para ficar mais claro aconteceria com o for abaixo da label inner.
                }
                System.out.println(i + j);
            }
        }
        System.out.println("FIM");
    }
}
