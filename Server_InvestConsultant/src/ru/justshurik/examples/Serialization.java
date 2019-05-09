package ru.justshurik.examples;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serialization {
	//����� ��� ��������������
	public static Object deserData() {
			Object retObj=null;
			try {
				//���� ��� ������������
				FileInputStream fileIn = new FileInputStream("prof.ser");
				//����� ��� ������������
				ObjectInputStream inObj = new ObjectInputStream(fileIn);
				
				retObj= inObj.readObject();
				
				//��������� ������
				fileIn.close();
				inObj.close();
				
			} catch (FileNotFoundException e) {
				System.out.println("���� �� ������!");
				System.exit(3);
			} catch (IOException e) {
				System.out.println("������ �����/������");
				System.exit(4);
			} catch (ClassNotFoundException e) {
				System.out.println("����� �� ������");
				System.exit(5);
			}
			
			return retObj;
		}
		
	//����� ��� ������������
	public static void serData(Object Obj) {
			//���� � ������� ����� ������������� ������������
			try {
				
				FileOutputStream fileOut = new FileOutputStream("prof.ser");
				ObjectOutputStream outStream = new ObjectOutputStream(fileOut);
				outStream.writeObject(Obj);
				fileOut.close();
				outStream.close();
				
			} catch (FileNotFoundException e) {
				System.out.println("���� ��� ������������ �� ������");
				System.exit(1);
			}catch(IOException e1) {
				System.out.println("������ �����/������");
				System.exit(2);
			}
			
		}

}
