package ru.justshurik.examples;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serialization {
	//метод для десериализации
	public static Object deserData() {
			Object retObj=null;
			try {
				//файл для сериализации
				FileInputStream fileIn = new FileInputStream("prof.ser");
				//поток для сериализации
				ObjectInputStream inObj = new ObjectInputStream(fileIn);
				
				retObj= inObj.readObject();
				
				//закрываем потоки
				fileIn.close();
				inObj.close();
				
			} catch (FileNotFoundException e) {
				System.out.println("Файл не найден!");
				System.exit(3);
			} catch (IOException e) {
				System.out.println("Ошибка ввода/вывода");
				System.exit(4);
			} catch (ClassNotFoundException e) {
				System.out.println("Класс не найден");
				System.exit(5);
			}
			
			return retObj;
		}
		
	//метод для сериализации
	public static void serData(Object Obj) {
			//файл в который будет проихводиться сериализация
			try {
				
				FileOutputStream fileOut = new FileOutputStream("prof.ser");
				ObjectOutputStream outStream = new ObjectOutputStream(fileOut);
				outStream.writeObject(Obj);
				fileOut.close();
				outStream.close();
				
			} catch (FileNotFoundException e) {
				System.out.println("Файл для сериализации не найден");
				System.exit(1);
			}catch(IOException e1) {
				System.out.println("Ошибка ввода/вывода");
				System.exit(2);
			}
			
		}

}
