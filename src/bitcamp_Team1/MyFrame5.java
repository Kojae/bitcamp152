package bitcamp_Team1;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * ��ư 3�� , �ؽ�Ʈ�ʵ� 1���� ����
 * ��ư 2����(7,8)  ��ư�� ������ �ش���� �ؽ�Ʈ�ʵ忡 �����Ѵ�.
 * ��ư�� C��ư�� �ؽ�Ʈ �ʵ带 Ŭ�����Ų��.
 */

public class MyFrame5 extends JFrame {
	private JButton btn7 = new JButton("7") ;
	private JButton btn8 = new JButton("8") ;
	private JButton btnClear = new JButton("C") ;
	private JTextField tfRes = new JTextField("");
	
	private ActionListener clickButton = (new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			tfRes.setText(tfRes.getText()+e.getActionCommand());
		}
	});
	
	private ActionListener clearButton = (new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			tfRes.setText("");
			
		}
	});
	
	public MyFrame5() {
		//������Ʈ�� ���� �ν��Ͻ��� ������� �����Ƿ� �������ʹ� ������ �߿����� �ʴ�.
		//�����ӿ� ��ư�� �ؽ�Ʈ�õ带 ��ġ�Ѵ�.
		
		JPanel btnPane = new JPanel();
		btnPane.add(btn7);
		btnPane.add(btn8);
		btnPane.add(btnClear);
		//this.add("center",btnPane);
		//this.add(btnPane,BorderLayout.CENTER);
		this.add(btnPane);
		this.add("South",tfRes);
		this.setLocation(200,300);
		this.pack();
		
		btnClear.addActionListener(clearButton);
		btn7.addActionListener(clickButton);
		btn8.addActionListener(clickButton);
	//	tfRes.addActionListener(eventProcessor);
		
		
		
		// ??? ��ġ�����ڰ� �����ϱ� (layout) �⺻�� BorderLayout = �ϳ��� ������ �ϳ��� ������Ʈ�� ����
		// this.add (  ��  );
		
		
		
		//�̺�Ʈ ������ ���
		//��ġ,ũ�� ����
		
		
	}
	
	
}
