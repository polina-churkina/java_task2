//Пользователь вводит с клавиатуры целое неотрицательное число n (n<15).
//С помощью циклов for и while посчитать факториал n! и вывести на экран.

import java.util.Scanner;
public class Lab2 {
    public static void main(String[]args){
        int n, result;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите целое неотрицательное число n (n<15): ");
        n = in.nextInt();
        result = n;
        while (n>1){
            n = n-1;
            result = result*n;
        }
        System.out.print("n! = "+result);
        in.close();
    }
}
