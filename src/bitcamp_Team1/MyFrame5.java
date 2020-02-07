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
 * 버튼 3개 , 텍스트필드 1개를 만듬
 * 버튼 2개는(7,8)  버튼을 누르면 해당수를 텍스트필드에 기입한다.
 * 버튼중 C버튼은 텍스트 필드를 클리어시킨다.
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
		//컴포넌트에 대한 인스턴스가 만들어져 있으므로 이제부터는 순서가 중요하지 않다.
		//프레임에 버튼과 텍스트플드를 배치한다.
		
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
		
		
		
		// ??? 배치관리자가 누구일까 (layout) 기본은 BorderLayout = 하나의 영역에 하나의 컴포넌트만 들어간다
		// this.add (  ↑  );
		
		
		
		//이벤트 감시자 등록
		//위치,크기 지정
		
		
	}
	
	
}
