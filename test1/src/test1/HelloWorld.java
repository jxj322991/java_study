package test1;

public class HelloWorld {
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
			count++;
		}

		// ��ӡ����ӷֺ�ɼ����Լ��ӷִ���

		System.out.println(score);
		System.out.println(count);

	}
}