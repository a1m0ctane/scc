package eightball;

import java.io.FileReader;

public class EightBall {
	//SCC comment new code
	public static void main(String args[]) throws Exception {
		char[] buffer = new char[1024];
		String filename = args[0];
		try {
			filename = "" + (Integer.parseInt(filename) % 3);
		} catch (Exception e) {
			System.out.println("Invalid input.");
		}
		new FileReader(filename).read(buffer);
		System.out.println(buffer);

		//Kommentar hinzugefügt code geschrieben
	}
	public static void mainer(String args[]) throws Exception {
		char[] buffer = new char[1024];
		String filename = args[0];
		try {
			filename = "" + (Integer.parseInt(filename) % 3);
		} catch (Exception e) {
			System.out.println("Invalid input.");
		}
		new FileReader(filename).read(buffer);
		System.out.println(buffer);

		//Kommentar hinzugefügt code geschrieben
	}
	public static void mainstage(String args[]) throws Exception {
		char[] buffer = new char[1024];
		String filename = args[0];
		try {
			filename = "" + (Integer.parseInt(filename) % 3);
		} catch (Exception e) {
			System.out.println("Invalid input.");
		}
		new FileReader(filename).read(buffer);
		System.out.println(buffer);
		
		//Kommentar hinzugefügt code geschrieben
	}
}


