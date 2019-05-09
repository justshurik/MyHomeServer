package ru.justshurik.examples;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Reader extends JFrame{
	
	//элементы, которые нам понадобятся
	JButton b1,b2;
	JLabel l1,l2;
	JTextField t1;
	int i;
	String s;
	eListen e = new eListen();
		
	//создаем конструктор в котором задаем настройки
	public Reader(String Title){
	
		//создаем название окна
		super(Title);
		
		//устанавливаем раскладку элементов - сеточная, базовая
		setLayout(new FlowLayout());
		
		//задаем элементы при конструировании
		b1=new JButton("Очистить");
		b2=new JButton("Увеличить на 1");
		l1=new JLabel("Введите число:");
		l2=new JLabel("");
		t1=new JTextField(10);
		
		//добавляем элементы на форму
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
		
		//крепим листенер к кнопке для расчета
		b2.addActionListener(e);
		//крепим листенер к кнопке для стирания
		b1.addActionListener(e);
		
	}
	
	//создаем класс-слушатель
	public class eListen implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent event) {
			try {
				if (event.getSource()==b2) {
					i = Integer.parseInt(t1.getText())+1;
					s="Результат:" + i;
					l2.setText(s);
					
				}else if (event.getSource()==b1){
					l2.setText(null);
					t1.setText(null);
				}
			}catch(Exception ex) {
				//перехватываем все ошибки
				JOptionPane.showMessageDialog(null,"Не верно ведено число");
			}
		}
		
	}
	
	
	
}
