/*
 * @Description: 
 * @Author: jinxiaojian
 * @Email: jinxiaojian@youxin.com
 * @LastEditors: ��Ф��
 * @Date: 2019-04-14 21:44:22
 * @LastEditTime: 2019-04-14 22:45:43
 */

public class Test {

  static int Add(int a1, int a2) throws ErrorWatch {

    int sum = 0;

    if (a1 < 1 || a2 >  5) {// ��͵ĵ�һ����С��1���ߵڶ���������5�����쳣

      ErrorWatch e = new ErrorWatch(a1, a2);

      throw e;

    }

    for (int i = a1; i <= a2; i++) {

      sum += i;

    }

    return sum;

  }

  public static void main(String[] args) {

    try {

      int s1 = Add(3, 1);

      System.out.println("sum=" + s1);

      int s2 = Add(3, 6);

      System.out.println("sum=" + s2);

    }

    catch (ErrorWatch e) {

      System.out.println("�����쳣��" + e.toString());

    }

  }

}
