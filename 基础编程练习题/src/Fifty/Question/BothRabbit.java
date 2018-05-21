package Fifty.Question;

import java.util.Scanner;

/*
古典问题：有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一对兔子，假如兔子都不死，
问每个月的兔子对数为多少？
问题分析：数列为1，1，2，3，5，8，13......斐波那契数列
 */
public class BothRabbit {
    public static void main(String[] args){
        System.out.println("输入月份： ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("第" + "个月兔子的总数为" + f1(n));
    }

    public static int f1(int n){
        if(n == 1|| n==2){
            return 1;
        }else
            return f1(n-2)+f1(n-1);
    }
}
