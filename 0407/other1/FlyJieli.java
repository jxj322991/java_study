/*
 * @Description: 
 * @Author: jinxiaojian
 * @Email: jinxiaojian@youxin.com
 * @LastEditors: ��Ф��
 * @Date: 2019-04-07 03:17:43
 * @LastEditTime: 2019-04-07 03:17:57
 */
package week4_1;

interface Flyable {
  void fly();
}

abstract class anmial implements Flyable {
  public void fly() {
    System.out.println("��ʼ����");
    System.out.println("���н���");
  }// @Override
}

class Flyer extends anmial {
  private String anmial;
  protected static final int distance = 100;

  public void setter(String anmial) {
    this.anmial = anmial;
  }

  public String getter(String anmial) {
    return anmial;
  }

  public void fiying() {
    System.out.println("��ʼ" + distance + "�׷�����");
    System.out.println(this.anmial + "���н���");
  }

  public void fly() {
    System.out.println(this.anmial + "��ʼ����");
  }// @Override

  public class FlyJieli extends Flyer {

  }

  public static void main(String[] args) {
    System.out.println("�������������ʽ��ʼ��");
    // TODO �Զ����ɵķ������
    String anmial1 = "brid1";
    String anmial2 = "brid2";
    String anmial3 = "brid3";
    String anmial4 = "brid4";
    String anmial5 = "brid5";
    Flyer brid1 = new Flyer();
    brid1.setter(anmial1);
    brid1.fly();
    brid1.fiying();
    Flyer brid2 = new Flyer();
    brid2.setter(anmial2);
    brid2.fly();
    brid2.fiying();
    Flyer brid3 = new Flyer();
    brid3.setter(anmial3);
    brid3.fly();
    brid3.fiying();
    Flyer brid4 = new Flyer();
    brid4.setter(anmial4);
    brid4.fly();
    brid4.fiying();
    Flyer brid5 = new Flyer();
    brid5.setter(anmial5);
    brid5.fly();
    brid5.fiying();
    System.out.println("�����������������");

  }

}
