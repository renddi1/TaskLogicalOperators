public class Task_logical_operators {
    //1. Даны 4 числа типа int. Сравнить их и вывести наименьшее на консоль.
    public int task1(int a,int b, int c,int d){
        int min = a;
        if (b < min ) min = b;
        if (min > c) min =c;
        if (min > d) min = d;

        System.out.println(min);


        return min;


    }
}
