package Fifty.Question;
/*
题目：打印出所有的"水仙花数"，所谓"水仙花数"是指一个三位数，其各位数字立方和等于该数本身。例如：153是一个"水仙花数"，因为153=1的三次方＋5的三次方＋3的三次方。
程序分析：利用for循环控制100-999个数，每个数分解出个位，十位，百位。
 */
public class Daffodil_Num {
    public static void main(String[] args){
        for(int n = 100; n <= 999;n++) {
            int h = n / 100;//得到10百位数
            int d = n / 10 % 10;//得到10位数
            int g = n % 10;//得到个位数
            int num = (h * h * h) + (d * d * d) + (g * g * g);
            if (n == num) {
                System.out.println(n);
            }
        }
    }
}
