
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class JPanelTest extends JFrame {
	public JPanelTest() {
		Container c = getContentPane();
		// ��������������Ϊ2��2�е����񲼾�,���ˮƽ���10���أ���ֱ���10����
		c.setLayout(new GridLayout(2, 2, 10, 10));
		// ��ʼ��һ����壬�����ʹ��1��4�е����񲼾֣����ˮƽ���10���أ���ֱ���10����
		JPanel p1 = new JPanel(new GridLayout(1, 4, 10, 10));
		// ��ʼ��һ����壬�����ʹ�ñ߽粼��
		JPanel p2 = new JPanel(new BorderLayout());
		// ��ʼ��һ����壬�����ʹ��1��2�е����񲼾֣����ˮƽ���10���أ���ֱ���10����
		JPanel p3 = new JPanel(new GridLayout(1, 2, 10, 10));
		// ��ʼ��һ����壬�����ʹ��2��1�е����񲼾֣����ˮƽ���10���أ���ֱ���10����
		JPanel p4 = new JPanel(new GridLayout(2, 1, 10, 10));
		// ��ÿ����嶼��ӱ߿�ͱ��⣬ʹ��BorderFactory���������ɴ�����ı߿����
		p1.setBorder(BorderFactory.createTitledBorder("���1"));
		p2.setBorder(BorderFactory.createTitledBorder("���2"));
		p3.setBorder(BorderFactory.createTitledBorder("���3"));
		p4.setBorder(BorderFactory.createTitledBorder("���4"));
		// �����1����Ӱ�ť
		p1.add(new JButton("b1"));
		p1.add(new JButton("b1"));
		p1.add(new JButton("b1"));
		p1.add(new JButton("b1"));
		// �����2����Ӱ�ť
		p2.add(new JButton("b2"), BorderLayout.WEST);
		p2.add(new JButton("b2"), BorderLayout.EAST);
		p2.add(new JButton("b2"), BorderLayout.NORTH);
		p2.add(new JButton("b2"), BorderLayout.SOUTH);
		p2.add(new JButton("b2"), BorderLayout.CENTER);
		// �����3����Ӱ�ť
		p3.add(new JButton("b3"));
		p3.add(new JButton("b3"));
		// �����4����Ӱ�ť
		p4.add(new JButton("b4"));
		p4.add(new JButton("b4"));
		// ��������������
		c.add(p1);
		c.add(p2);
		c.add(p3);
		c.add(p4);
		setTitle("�����������ʹ�������");
		setSize(500, 300);// ������
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE); // �رն���
	}

	public static void main(String[] args) {
		JPanelTest test = new JPanelTest();
		test.setVisible(true);
	}
}
