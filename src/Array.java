//Лабораторная №1 Вариант 13490
public class Array {
    public static void main(String[] args) {
        //Создание и заполнение первого массива
        final int A_SIZE = 13, A_MAX = 17;
        int[] a = new int[A_SIZE];
        for (int i = 0; i < A_SIZE; i++) {
            a[i] = A_MAX - i;
        }

        //Создание и заполнение второго массива2
        final int X_SIZE = 10;
        float[] x = new float[X_SIZE];
        for (int i = 0; i < X_SIZE; i++) {
            x[i] = (float) Math.random() * 16 - 4;
        }

        //Создание и заполнение третьего массива
        double[][] array = new double[A_SIZE][X_SIZE];
        for (int i = 0; i < A_SIZE; i++) {
            for (int j = 0; j < X_SIZE; j++) {

                double k = x[j];
                double value = switch (a[i]) {
                    case 17 ->
                            Math.pow((0.25 * Math.pow(1 - Math.cbrt(k), 2) * (3 + Math.pow(Math.sin(k) / 4, Math.atan((k + 4) / 16)))), Math.pow(Math.PI + Math.asin((k + 4) / 16), 2));
                    case 7, 8, 10, 11, 15, 16 ->
                            Math.log(Math.pow((5 + Math.pow(Math.tan(k), 2)) / Math.PI, Math.pow(Math.E, Math.cos(k))));
                    default ->
                            0.25 / (Math.log(Math.pow(Math.E, Math.pow(Math.pow((0.5 / (1 - k)), 3) / 2, 2))));
                };

                array[i][j] = value;
            }
        }

        //Вывод результата
        for (int i = 0; i < A_SIZE; i++) {
            for (int j = 0; j < X_SIZE; j++) {
                System.out.printf("%.4f  ", array[i][j]);
            }
            System.out.println();
        }
    }
}
