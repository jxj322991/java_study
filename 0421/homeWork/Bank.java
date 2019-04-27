
/*
 * @Description: 
 * @Author: jinxiaojian
 * @Email: jinxiaojian@youxin.com
 * @LastEditors: ��Ф��
 * @Date: 2019-04-21 21:58:53
 * @LastEditTime: 2019-04-21 22:16:36
 */

import java.util.*;

//��2������һ�������࣬�������������˻��б�����ԣ����˻������˻��Ĺ��ܡ��˻��б����ʹ�ü�����ص��࣬��ArrayList�����ͬʱʹ�÷��͡�

public class Bank {

  public String BankName;

  private ArrayList<Account> account;

  Bank(String bankName) {

    this.BankName = bankName;

    account = new ArrayList<Account>();

  }

  public Bank(String BankName, ArrayList<Account> account) {

    this.BankName = BankName;

    this.account = account;

  }

  // ���˻�

  public void OpenAccount(String user, String passcode, double money)

  {

    account.add(new Account(user, passcode, money));

  }

  // �����˻����û���,���ҵ������ظ��˻������򣬷���null

  public Account SeekAccount(String username)

  {

    for (Account account : account)

    {

      if (username.equals(account.getUser()))

        return account;

    }

    return null;

  }

  // ��ʾ���û��˻���Ϣ

  public void showAccount(String userName) {

    Account account = SeekAccount(userName);

    if (account == null)

      System.out.println("���˻������ڡ�");

    else

      account.show();

  }

  // ���ض��˻���Ǯ

  public void saveMoney(String userName, double money) {

    Account account = SeekAccount(userName); // ����

    if (account == null)

      System.out.println("���˻������ڡ�");

    else

      account.savemoney(money);

  }

  // ���ض��˻�ȡǮ,����֤����

  public void drawMoney(String userName, double money, String password) {

    Account account = SeekAccount(userName); // ����

    if (account == null)

      System.out.println("���˻������ڡ�");

    else

    {

      if (password.equals(account.getPasscode()))

      {

        account.drawmoney(money);

      }

      else

      {

        System.out.printf("%s : ���벻��ȷ��ȡǮʧ�ܡ�\n", userName);

      }

    }

  }

}
