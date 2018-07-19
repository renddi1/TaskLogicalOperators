public class Task_logical_operators {
    //1. Даны 4 числа типа int. Сравнить их и вывести наименьшее на консоль.
    //2. Вывести на консоль количество максимальных чисел среди этих четырех.
    public int task1_2(int a, int b, int c, int d){
        int min = a;
        int max = a;
        int count = 0;

        if (b < min ) min = b;
        if (min > c) min =c;
        if (min > d) min = d;

        if (max < b) max = b;
        if (max < c) max = c;
        if (max < d) max = d;

        if (max == a) count++;
        if (max == b) count++;
        if (max == c) count++;
        if (max == d) count++;

        System.out.println("Максимальное число: " + max);
        System.out.println("Минимальное число: " + min);
        System.out.println("Количество максимальных чисел: " + count);

        return min;
    }
    //3. Даны 5 чисел (тип int). Вывести вначале наименьшее, а затем самое большое из данных чисел.

    public int task3(int a, int b, int c, int d, int e) {
        int min = a;
        int max = a;


        if (b < min) min = b;
        if (c < min) min = c;
        if (d < min) min = d;
        if (e < min) min = e;

        if (max < b) max = b;
        if (max < c) max = c;
        if (max < d) max = d;
        if (max < e) max = e;



        System.out.println("Максимальное число: " + max);
        System.out.println("Минимальное число: " + min);
        

        return min;

    }

}
