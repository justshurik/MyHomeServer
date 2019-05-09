package ru.justshurik.examples;
import java.util.concurrent.Exchanger;

import javax.swing.JOptionPane;

public class Thread1 implements Runnable{
	
	Exchanger<Integer> exch;
	Integer message;
	String tName;
	
	public Thread1(Exchanger<Integer> exch,String nameThread) {
		this.exch=exch;
		this.tName = nameThread;
	}
	
	
	public void run() {
		
		message=1;
		int mess;
		try {
					
			while(message<=1000) {
				
				System.out.println(tName + " пошлет " + (message));
				
				mess = exch.exchange(message);
				
				System.out.println(tName + " получил " + mess);
				
				message=mess+1;
			}
						
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "ОШИБКА в потоке "+ tName);
		}
		
		
	}
	
}
