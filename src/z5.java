public class z5 {
    public static void main(String[] args) {
        int monthNumber = 71;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println(monthNumber + "-й месяц принадлежит к сезону Зима.");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println(monthNumber + "-й месяц принадлежит к сезону Весна.");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println(monthNumber + "-й месяц принадлежит к сезону Лето.");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println(monthNumber + "-й месяц принадлежит к сезону Осень.");
                break;
            default:
                System.out.println("Некорректный номер месяца: " + monthNumber);


        }

    }
}
