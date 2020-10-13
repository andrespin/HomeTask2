import java.util.Random;

public class fillDiag {


    static void fillDiagonal()
    {

        int[][] squaremas = new int[10][10];
        System.out.println();


        // Заполним диагональ единицами
        for (int t = 0; t < 10; t++) {
            squaremas[t][t] = 1;
        }


        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(squaremas[i][j] + " ");
            }
            System.out.println();
        }

    }

    static void changeArray()
    {
        System.out.println("\n" + "Задание №3");
        int mas[] = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        // вывести ряд
        System.out.println("До: ");
        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + " ");
        }

        for (int i = 0; i < mas.length; i++) {
            if (mas[i] < 6) mas[i] *= 2;
        }

        System.out.println("После: ");
        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + " ");
        }

    }

    static void MINandMAX ()
    {
        int[] tmas = new int[20];

        for (int i = 0; i < 20; i++) {
            tmas[i] = new Random().nextInt(100);
        }

        int buff = 0;

        // по возрастанию
        for (int n = 20; n > 0; n--) {
            for (int m = 0; m < 19; m++) {
                if (tmas[m] > tmas[m + 1]) {
                    buff = tmas[m];
                    tmas[m] = tmas[m + 1];
                    tmas[m + 1] = buff;
                }
            }
        }

        System.out.print("По возрастанию сортировка: ");
        for (int m = 0; m < 20; m++) {
            System.out.print(" " + tmas[m]);
        }


        // по убыванию
        for (int n = 20; n > 0; n--) {
            for (int m = 0; m < 19; m++) {
                if (tmas[m] > tmas[m + 1]) {
                    buff = tmas[m];
                    tmas[m] = tmas[m + 1];
                    tmas[m + 1] = buff;
                }
            }
        }

        System.out.print("\n" + "По убыванию сортировка: ");
        for (int m = 0; m < 20; m++) {
            System.out.print(" " + tmas[m]);
        }


    }








}
