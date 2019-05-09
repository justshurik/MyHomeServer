package ru.justshurik.examples;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class Calculator extends JFrame{
	
	//объ€вл€ем нужные нам переменные
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0;
	JButton plus, mines,multiply,divide,equal,cngSign, Del,CE;
	JTextField Panel;
	
	Integer i1,i2, iResult;
	String t1, t2, tResult;
	Object typeOper;
	
	//конструктор класса
	public Calculator() {
		//название 
		super("ћќ…  јЋ№ ”Ћя“ќ–");
		
		setLayout(new FlowLayout());
		
		//создаем элементы
		//кнопки с цифрами
		b0=new JButton("0");
		b1=new JButton("1");
		b2=new JButton("2");
		b3=new JButton("3");
		b4=new JButton("4");
		b5=new JButton("5");
		b6=new JButton("6");
		b7=new JButton("7");
		b8=new JButton("8");
		b9=new JButton("9");
		
		//кнопки дл€ проведени€ операций
		plus = new JButton("+");
		mines = new JButton("-");
		multiply = new JButton("*");
		divide = new JButton("/");
		cngSign = new JButton("+-");
		Del = new JButton("->");
		CE = new JButton("CE");
		equal = new JButton("=");
		
		//метка
		Panel = new JTextField(25);
		Panel.setText(null);
		Panel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		Panel.setEditable(true);
		Panel.setHorizontalAlignment(JTextField.RIGHT);
		Panel.setEditable(false);;
		//добавление элементов
		add(Panel);
		add(Del);
		add(CE);
		add(cngSign);
		add(equal);
		add(b0);
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(b6);
		add(b7);
		add(b8);
		add(b9);
		add(plus);
		add(mines);
		add(multiply);
		add(divide);
		
		//добавл€ем слушател€ к всем элементам
		Del.addActionListener(new eHandler());
		CE.addActionListener(new eHandler());
		cngSign.addActionListener(new eHandler());
		equal.addActionListener(new eHandler());
		b0.addActionListener(new eHandler());
		b1.addActionListener(new eHandler());
		b2.addActionListener(new eHandler());
		b3.addActionListener(new eHandler());
		b4.addActionListener(new eHandler());
		b5.addActionListener(new eHandler());
		b6.addActionListener(new eHandler());
		b7.addActionListener(new eHandler());
		b8.addActionListener(new eHandler());
		b9.addActionListener(new eHandler());
		plus.addActionListener(new eHandler());
		mines.addActionListener(new eHandler());
		multiply.addActionListener(new eHandler());
		divide.addActionListener(new eHandler());
		
		//финальные настройки отображени€
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(300,400);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		
	}
	
	//создаем класс дл€ обработки событи€
	private class eHandler implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			try {
				
				//обработка событи€
				if(e.getSource().equals(Del)) {
					
					String S=Panel.getText();
					int len = S.length();
					
					//если строка не пуста€
					if (len>0){
						//удал€ем последний символ
						S=S.substring(0, len-1);
						//записываем значение с строку
						Panel.setText(S);
					}
					
				}else if(e.getSource().equals(CE)){
					Panel.setText(null);
					
				}else if(e.getSource().equals(cngSign)){
					String S=Panel.getText();
					int len = S.length();
					
					//если строка не пуста€
					if (len>0){
						int num = Integer.parseInt(S);
						num=num*(-1);
						Panel.setText(Integer.toString(num));
						
					}
				}else if(e.getSource().equals(equal)){
					if (i1!=null) {
						String S=Panel.getText();
						i2=Integer.parseInt(S);
						if (typeOper.equals(plus)) {
							Panel.setText(Integer.toString(i1+i2));
						}else if(typeOper.equals(mines)) {
							Panel.setText(Integer.toString(i1-i2));
						}else if(typeOper.equals(multiply)) {
							Panel.setText(Integer.toString(i1*i2));
						}else if(typeOper.equals(divide)) {
							Panel.setText(Integer.toString(i1/i2));
						}else {throw new Exception();}
					
					}
				}else if(e.getSource().equals(b0)){
					//добавим 0 справа
					String S=Panel.getText();
					S=S+"0";
					Panel.setText(S);
				}
				else if(e.getSource().equals(b1)){
					//добавим 0 справа
					String S=Panel.getText();
					S=S+1;
					Panel.setText(S);
				}else if(e.getSource().equals(b2)){
					//добавим 0 справа
					String S=Panel.getText();
					S=S+2;
					Panel.setText(S);
				}else if(e.getSource().equals(b3)){
					//добавим 0 справа
					String S=Panel.getText();
					S=S+3;
					Panel.setText(S);
				}else if(e.getSource().equals(b4)){
					//добавим 0 справа
					String S=Panel.getText();
					S=S+4;
					Panel.setText(S);
				}else if(e.getSource().equals(b5)){
					//добавим 0 справа
					String S=Panel.getText();
					S=S+5;
					Panel.setText(S);
				}else if(e.getSource().equals(b6)){
					//добавим 0 справа
					String S=Panel.getText();
					S=S+6;
					Panel.setText(S);
				}else if(e.getSource().equals(b7)){
					//добавим 0 справа
					String S=Panel.getText();
					S=S+7;
					Panel.setText(S);
				}else if(e.getSource().equals(b8)){
					//добавим 0 справа
					String S=Panel.getText();
					S=S+8;
					Panel.setText(S);
				}else if(e.getSource().equals(b9)){
					//добавим 0 справа
					String S=Panel.getText();
					S=S+9;
					Panel.setText(S);
				}else if((e.getSource().equals(plus)) || (e.getSource().equals(mines))
						|| (e.getSource().equals(divide)) || (e.getSource().equals(multiply))){
					
					String S=Panel.getText();
					if (S!=null) {
						i1=Integer.parseInt(S);
						typeOper=e.getSource();
						Panel.setText(null);
					}
				}
			}catch(Exception ex) {
				JOptionPane.showMessageDialog(null,"ќЎ»Ѕ ј!");
			}
			
		}
		
	}
	
	
}
