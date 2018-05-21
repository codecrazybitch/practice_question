package Fifty.Question;
/*
题目：判断101-200之间有多少个素数，并输出所有素数。
程序分析：
    * 素数是：只能被1或本身整除的数，如：3,5,7,11,131...
      *判断素数的方法：用一个数分别去除2到sqrt(这个数)，其中sqrt()是求平方根的函数
      *其实用这个数分别去除2到他本身少1的数也可以，但是运算时间增加了
      *如果能被整除，则表明此数不是素数，反之是素数。
 */
public class HowMuchNumber {
    public static void main(String[] args){
            int sum = 0;
            for(int n = 101; n < 200; n++){
                    if(f(n)){
                        sum++;
                    }
            }
            System.out.println(sum);
    }
    public static boolean f(int n){
        for(int n1 = 2;n1 < Math.sqrt(n);n1++){
            if(n % n1 == 0){
                return false;
            }
        }
        return true;
    }
}
