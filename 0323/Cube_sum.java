
/*
 * @Description: 
 * @Author: jinxiaojian
 * @Email: jinxiaojian@youxin.com
 * @LastEditors: ��Ф��
 * @Date: 2019-03-24 19:41:53
 * @LastEditTime: 2019-03-24 19:42:34
 */
import java.util.Scanner;

class Cube_sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("�������һ��������");
        int n = scanner.nextInt();
        System.out.print("���������һ��������");
        int m = scanner.nextInt();
        System.out.print("�������������ĵ���");
        int y = scanner.nextInt();
        int i = 0;
        long cubesum = 0;
        for (i = n; i <= m; i++) {
            cubesum += i * i * i;

        }
        if (cubesum == y * y * y) {
            System.out.printf("�������������%d......%d��%d^3����������\n", n, m, y);
            System.out.printf("%d^3 + ...... + %d^3 = %d^3\n", n, m, y);
        } else
            System.out.printf("�������������%d......%d��%d^3������������", n, m, y);
    }
}