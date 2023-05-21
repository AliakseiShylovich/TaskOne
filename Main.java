public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 1, 1, 2, -1};
        int numberOff = 1;                          // хранит число которое необходимо исключить из суммы
        int sum = 0;                                // хранит значение суммы элементов мвссива
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numberOff) {
                continue;
            }
            sum = sum + array[i];
        }
        System.out.println(sum);
    }
}
