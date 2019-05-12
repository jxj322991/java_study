
/*
 * @Description: 
 * @Author: jinxiaojian
 * @Email: jinxiaojian@youxin.com
 * @Date: 2019-05-12 20:29:57
 * @LastEditTime: 2019-05-12 21:16:07
 * @LastEditors: ��Ф��
 */
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.FlowLayout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 * ��һ������Ӧ�ó�������ָ�������������ܸ����û�������Ա���ߡ����ؼ����������ָ������������ָ���������������Ƿ�ƫ�ֵ��жϡ����У�����ָ����BMI��=���أ�kg�������^2��m��������24��Ϊƫ�֡�Ҫ���и���ϸ���жϡ�Ҫ�����û�������������ı��򡢵�ѡ��ť����ť�������ֺ��¼�����
 * 
 * @author chunyan
 *
 */
public class Kg extends JFrame {
  JTextField height;
  JTextField weight;
  JLabel result;

  // ���캯��
  public Kg() {
    init();
  }

  // ��ʼ��JFrame
  private void init() {
    this.setTitle("����ָ��������");
    this.setSize(1111, 222);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// ����ر�
    this.setLocationRelativeTo(null);// ���þ���
    this.setContentPane(createContentPane());// ���������
  }

  // �������
  private Container createContentPane() {
    JPanel p = new JPanel(new BorderLayout());
    p.add(BorderLayout.NORTH, createNorthPane());

    p.add(BorderLayout.CENTER, createCenterPane());
    p.add(BorderLayout.SOUTH, createSouthPane());
    return p;
  }

  // ��ߵ������
  private Component createNorthPane() {
    JPanel p = new JPanel();

    // if (key == 1) {
    JLabel label = new JLabel("�Ա�");
    ButtonGroup bg = new ButtonGroup();
    JRadioButton jrb1 = new JRadioButton("��");
    JRadioButton jrb2 = new JRadioButton("Ů");
    bg.add(jrb1);
    bg.add(jrb2);
    p.add(label);
    p.add(jrb1);
    p.add(jrb2);
    // } else if (key == 2) {

    // ��ߣ������
    JLabel label_height = new JLabel("���(��������ߣ���λΪ��cm)��");
    height = new JTextField("", 20);
    p.add(label_height);
    p.add(height);
    // } else {
    // ���أ������
    JLabel label_weight = new JLabel("����(���������أ���λΪ��kg)��");
    weight = new JTextField("", 20);
    p.add(label_weight);
    p.add(weight);
    // }
    return p;

  }

  // �м���ύ
  private Component createCenterPane() {
    JPanel p = new JPanel();
    JButton button = new JButton("�����������");
    button.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent arg0) {
        Double h = Double.valueOf(height.getText()) / 100;
        Double w = Double.valueOf(weight.getText());
        Double bmi = w / (Math.pow(h, 2));
        if (bmi > 24) {
          result.setText("����ָ������������ָ����: " + bmi + " \t  ��ʾ : ƫ��");
        } else if (bmi < 20) {
          result.setText("����ָ������������ָ����: " + bmi + " \t  ��ʾ : ƫ��");
        } else {
          result.setText("����ָ������������ָ����: " + bmi + " \t  ��ʾ : ����");
        }
      }
    });
    p.add(button);
    return p;
  }

  // �ײ��Ľ����ʾ
  private Component createSouthPane() {
    JPanel p = new JPanel();
    result = new JLabel("�����������");
    p.add(result);
    return p;
  }

  public static void main(String[] args) {
    Kg demoFrame = new Kg();
    demoFrame.setVisible(true);
  }
}