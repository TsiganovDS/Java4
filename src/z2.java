public class z2 {
    public static void main(String[] args) {
        int clientOS = 0; // 0 - Android
        int clientDeviceYear = 2012;
        if (clientOS == 1 && clientDeviceYear <= 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
        }
            else if (clientOS == 0 && clientDeviceYear <= 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке.");
        }
            else if (clientOS == 1) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        }
            else {
            System.out.println("Установите версию приложения для Android по ссылке.");

        }
    }
}


