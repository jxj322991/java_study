/*
 * @Description: 
 * @Author: jinxiaojian
 * @Email: jinxiaojian@youxin.com
 * @LastEditors: ��Ф��
 * @Date: 2019-04-21 21:59:16
 * @LastEditTime: 2019-04-21 22:17:27
 */

//import java.util.*;

//��1������һ���˻��࣬�����û��������롢�������ԡ���Ǯ��ȡǮ�ȷ�����

public class Account {

  private String user;// �û���

  private String passcode;// ����

  private double balance;// ���

  public Account(String user, String passcode, double balance) {

    this.user = user;

    this.passcode = passcode;

    this.balance = balance;

  }

  public String getUser() {

    return user;

  }

  public void setUser(String user) {

    this.user = user;

  }

  public String getPasscode() {

    return passcode;

  }

  public void setPasscode(String passcode) {

    this.passcode = passcode;

  }

  public double getBalance() {

    return balance;

  }

  public void setBalance(double balance) {

    this.balance = balance;

  }

  // ��Ǯ

  public void savemoney(double money)

  {

    balance += money;

    System.out.printf("%s : ����%.2fԪ���˻����Ϊ%.2fԪ��\n", user, money, balance);

  }

  // ȡǮ

  public void drawmoney(double money)

  {

    if (balance - money < 0)

    {

      System.out.printf("%s : �˻����㣬�޷�ȡǮ", user);

    }

    else

    {

      balance -= money;

      System.out.printf("%s : ȡ��%.2fԪ���˻����Ϊ%.2fԪ��\n", user, money, balance);

    }

  }

  public void show() {

    // ��ʾ�˻���Ϣ

    System.out.printf("%s : ���%.2fԪ\n", user, balance);

  }

}
