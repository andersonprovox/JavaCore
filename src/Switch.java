public class Switch {

    public static void main(String[] args) {
        int month = 3;
        int days;

        switch (month) {
            case 1:
                days = 31;
                break;
            case 2:
                days = 28;
                break;
            case 3:
                days = 31;
                break;
            case 4:
                days = 30;
                break;
            default:
                days = 0;
                System.out.println("Inválido");
        }

        System.out.println(days + "dias");
    }

}
