/*
 * @Description: 
 * @Author: jinxiaojian
 * @Email: jinxiaojian@youxin.com
 * @LastEditors: ��Ф��
 * @Date: 2019-04-21 21:58:38
 * @LastEditTime: 2019-04-21 22:03:48
 */

public class Test {

  public static void main(String[] args) {

    Bank bank = new Bank("china Bank");

    bank.OpenAccount("user_a", "666666", 999999);

    bank.OpenAccount("user_b", "99999", 10000);

    bank.OpenAccount("user_c", "222222", 4000);

    // ��Ǯ

    bank.saveMoney("user_c", 100);

    // ���ض��˻�ȡǮ,����֤����

    bank.drawMoney("user_c", 1000, "222222");

    // ��ʾ�˻���Ϣ

    bank.showAccount("user_c");

    // ��Ǯ

    bank.saveMoney("user_b", 10000);

    // �������ȡǮʧ�ܵ����

    bank.drawMoney("user_b", 20000, "222222");

    // ��������

    bank.drawMoney("user_a", 1000000, "666666");

  }

}
