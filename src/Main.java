public class Main {
    public static void main(String[] args) {
        int[] arr = generateRandomArray();
        int sum = 0;
        int sumMin = 200_000;
        int sumMax = 0;
        double sumAverage = 0;
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        int fullName = reverseFullName.length;

        for (int element : arr) {
            sum += element;
        }
        for (int element : arr) {
            sumAverage += element;
        }
        sumAverage = sumAverage / 30;

        for (int element = 0; element < arr.length; element++) {
            if (sumMin > arr[element]) {
                sumMin = arr[element];
            }
        }
        for (int element = 0; element < arr.length; element++) {
            if (sumMax < arr[element]) {
                sumMax = arr[element];
            }
        }
        for (int i = 0; i < fullName / 2; i++) {
            char temp = reverseFullName[i];
            reverseFullName[i] = reverseFullName[fullName - 1 - i];
            reverseFullName[fullName - 1 - i] = temp;
        }
        System.out.println(reverseFullName);
        System.out.println("");

        System.out.println("Сумма затрат за месяц " + sum + " рублей");
        System.out.println("Минимальная сумма трат за день составила " + sumMin + " рублей");
        System.out.println("Максимальная сумма трат за день составила " + sumMax + " рублей");
        System.out.println("Средняя сумма трат за день составила " + sumAverage + " рублей");
    }
    int[] arr = generateRandomArray();

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}