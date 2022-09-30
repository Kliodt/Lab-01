//Лабораторная №1 Вариант 13490
public class Array {
    private static int[] array1(int aSize, int aMax){
        int[] a = new int[aSize];
        for (int i = 0; i < aSize; i++) {
            a[i] = aMax - i;
        }
        return a;
    }

    public static void printArray(int aSize, int xSize, double[][] array){
        for (int i = 0; i < aSize; i++) {
            for (int j = 0; j < xSize; j++) {
                System.out.printf("%13.4f\t", array[i][j]);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        //Создание и заполнение первого массива
        final int A_SIZE = 13, A_MAX = 17;
        int[] a = array1(A_SIZE, A_MAX);


        //Создание и заполнение второго массива
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
                double value;

                if (a[i] == 17) {
                    value = Math.pow((0.25 * Math.pow(1 - Math.cbrt(k), 2) * (3 + Math.pow(Math.sin(k) / 4, Math.atan((k + 4) / 16)))), Math.pow(Math.PI + Math.asin((k + 4) / 16), 2));
                } else if (a[i] == 7 || a[i] == 8 || a[i] == 10 || a[i] == 11 || a[i] == 15 || a[i] == 16) {
                    value = Math.log(Math.pow((5 + Math.pow(Math.tan(k), 2)) / Math.PI, Math.pow(Math.E, Math.cos(k))));
                } else {
                    value = 0.25 / (Math.log(Math.pow(Math.E, Math.pow(Math.pow((0.5 / (1 - k)), 3) / 2, 2))));
                }

                array[i][j] = value;
            }
        }

        //Вывод результата
        printArray(A_SIZE, X_SIZE, array);


    }
}

