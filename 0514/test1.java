/*
 * @Description: 
 * @Author: jinxiaojian
 * @Email: jinxiaojian@youxin.com
 * @Date: 2019-05-13 20:29:34
 * @LastEditTime: 2019-05-13 20:36:24
 * @LastEditors: ��Ф��
 */
public class test1 {
  public static void main(String[] args) {

    // ��������ɼ�
    int score = 53;

    // ��������ӷִ���
    int count = 0;

    // ��ӡ����ӷ�ǰ�ɼ�
    System.out.println(score);

    // ֻҪ�ɼ�С��60����ѭ��ִ�мӷֲ�������ͳ�Ƽӷִ���

    while (score < 60) {
      score++;
      count += 1;
    }

    // ��ӡ����ӷֺ�ɼ����Լ��ӷִ���

    System.out.println(score);
    System.out.println(count);

  }
}