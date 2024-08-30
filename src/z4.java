public class z4 {
    public static void main(String[] args) {
    int deliveryDistance = 1;
    if (deliveryDistance >0 && deliveryDistance < 20) {
        System.out.println("Потребуется дней: 1." + "Срок доставки: 1 сутки.");
    }
    else if (deliveryDistance >20 && deliveryDistance < 60) {
        System.out.println("Потребуется дней: 2." + "Срок доставки: 2 суток.");
    }
    else if (deliveryDistance >60 && deliveryDistance < 100) {
        System.out.println("Потребуется дней: 3." + "Срок доставки: 3 суток.");
    } else {
        System.out.println("Доставки нет.");
        }

    }

}

