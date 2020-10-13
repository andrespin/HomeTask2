import java.util.Random;

public class Main {

    public static void main(String[] args) {
        /*
     1. Задать целочисленный массив, состоящий из элементов 0 и 1.
     Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
     С помощью цикла и условия заменить 0 на 1, 1 на 0;
     */
        int[] mas = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};

        for (int i = 0; i < mas.length; i++) {
            if (mas[i] == 0) {
                mas[i] = 1;
            } else mas[i] = 0;
        }
        // выведем для самопроверки
        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i]);
        }

         /*
     2 Задать пустой целочисленный массив размером 8.
      С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
     */
        int massive[] = new int[8];
        int num = 0;
        for (int i = 0; i < massive.length; i++) {
            massive[i] = num;
            num += 3;
        }
        System.out.println();
        for (int i = 0; i < massive.length; i++) {

            System.out.print(massive[i] + " ");
        }
             /*
     3 Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
      пройти по нему циклом, и числа меньшие 6 умножить на 2;
     */
        fillDiag.changeArray();

                /*
     4. Создать квадратный двумерный целочисленный массив
      (количество строк и столбцов одинаковое), и с помощью цикла(-ов)
       заполнить его диагональные элементы единицами;
     */
        fillDiag.fillDiagonal();

                /*
        5 **  Задать одномерный массив и найти в нем минимальный и максимальный элементы
        * (без помощи интернета);
     */
        // Можно попробовать применить ту самую знаменитую сортировку пузырьком (проходил в универе давно это ещё)
        fillDiag.MINandMAX();

                /*
        6. ** Написать метод, в который передается не пустой одномерный целочисленный массив,
           метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части
           массива равны. Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true, checkBalance([1, 1, 1, ||
           2, 1]) → true, граница показана символами ||, эти символы в массив не входят.
           */
        //    checkBalance();

        int[] Mas = {2, 2, 2, 1, 2, 2, 10, 1};
        System.out.println("Result = " + checkBalance(Mas));




                /*
                **** Написать метод, которому на вход подается одномерный массив и число n (может быть
положительным, или отрицательным), при этом метод должен сместить все элементы
массива на n позиций. Элементы смещаются циклично. Для усложнения задачи нельзя
пользоваться вспомогательными массивами. Примеры: [ 1, 2, 3 ] при n = 1 (на один вправо) ->
[ 3, 1, 2 ]; [ 3, 5, 6, 1] при n = -2 (на два влево) -> [ 6, 1, 3, 5 ]. При каком n в какую сторону сдвиг
можете выбирать сами.
                 */
        System.out.println("\n" + "*****************************");
        int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        //      for(int t = 0; t <=1; t++) System.out.println(a[0]);
        System.out.println("До");
        for (int j = 0; j < a.length; j++) {
            System.out.print(a[j] + " ");
        }
        ShiftElems(a, 1);  // тут решение задания
        System.out.println("\n" + "После");
        for (int j = 0; j < a.length; j++) {
            System.out.print(a[j] + " ");
        }

    }

    static void ShiftElems(int[] a, int n) {
        if (n != 0) {

            int N = 0;
            if (n > a.length) {
                n = Math.abs(n % a.length);
            } else {
                N = n;
            }

            if (N > 0) {
                for (int i = 0; i < N; i++) {
                    int buff = a[0];
                    a[0] = a[a.length - 1];

                    for (int j = 1; j < a.length - 1; j++) {
                        a[a.length - j] = a[a.length - j - 1];
                    }
                    a[1] = buff;

                }
            }
                 if (N < 0) {
                    for (int i = 0; i < N; i--) {
                        int buff = a[a.length - 1];
                        a[a.length - 1] = a[0];
                        for (int j = 1; j < a.length - 1; j++) {
                            a[j - 1] = a[j];
                        }
                        a[a.length - 2] = buff;

                    }

                }
        }
    }


      static boolean checkBalance(int [] massive)
      {
        int leftsum = 0, rightsum = 0;
      //  int[] massive = {2, 2, 2, 1, 2, 2, 10, 1};


        for (int i = 0; i < massive.length - 1; i++) {


            for (int j = 0; j <= i; j++) {
                leftsum += massive[j];
                System.out.println("leftsum = " + leftsum);

            }

            for (int t = i + 1; t < massive.length; t++) {
                rightsum += massive[t];
                System.out.println("rightsum = " + rightsum);

            }

            if (rightsum == leftsum) {
                return true;
            }
            System.out.println("i = " + i);
            rightsum = 0;
            leftsum = 0;

        }
       return false;
    }


        /*
        int leftsum = 0, rightsum = 0;
        for (int i = -1; i < massive.length; i++) {

            leftsum += massive[i];
            System.out.println(leftsum + "i : " + i);

            for (int j = 1 + i; j < massive.length; j++) {
                rightsum = rightsum + massive[j];
            }
            System.out.println("rightsum: " + rightsum);
            rightsum = 0;
        }
        System.out.println("**********************");
*/





}