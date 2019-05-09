package ru.justshurik.examples;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Reader extends JFrame{
	
	//��������, ������� ��� �����������
	JButton b1,b2;
	JLabel l1,l2;
	JTextField t1;
	int i;
	String s;
	eListen e = new eListen();
		
	//������� ����������� � ������� ������ ���������
	public Reader(String Title){
	
		//������� �������� ����
		super(Title);
		
		//������������� ��������� ��������� - ��������, �������
		setLayout(new FlowLayout());
		
		//������ �������� ��� ���������������
		b1=new JButton("��������");
		b2=new JButton("��������� �� 1");
		l1=new JLabel("������� �����:");
		l2=new JLabel("");
		t1=new JTextField(10);
		
		//��������� �������� �� �����
		add(l1);
		add(t1);
		add(b1);
		add(b2);
		add(l2);
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(300, 200);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		
		//������ �������� � ������ ��� �������
		b2.addActionListener(e);
		//������ �������� � ������ ��� ��������
		b1.addActionListener(e);
		
	}
	
	//������� �����-���������
	public class eListen implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent event) {
			try {
				if (event.getSource()==b2) {
					i = Integer.parseInt(t1.getText())+1;
					s="���������:" + i;
					l2.setText(s);
					
				}else if (event.getSource()==b1){
					l2.setText(null);
					t1.setText(null);
				}
			}catch(Exception ex) {
				//������������� ��� ������
				JOptionPane.showMessageDialog(null,"�� ����� ������ �����");
			}
		}
		
	}
	
	
	
}
