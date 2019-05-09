package ru.justshurik.examples;
import java.io.*;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class FileWork {
	
	private File f;
	private Scanner scn;
	private String[][] res;
	
	public FileWork(String AdressFile) {
		f=new File(AdressFile);
		try {
			scn=new Scanner(f);
		} catch (FileNotFoundException e) {	
			JOptionPane.showMessageDialog(null,"���� �� ������!");
		}
	}
	
	//������� ������ ���������� �� �����
	public void readFile() {
		
		while(scn.hasNext()) {
			
			for(int row=0;row<5;row++) {
				for(int col=0;col<3;col++) {
							
					System.out.println(scn.next());
					
				}
			}
		}
		
		//������� ���������� �� �����
		//Display();
	}
	
	//������� ������ ���������� �� �����
	private void Display() {
		
		for(String[] row : res) {
			for(String el:row) {
				System.out.print(el + " ");
			}
			System.out.println("");
		}
	}
	
}
