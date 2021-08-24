package Janken;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class LogWriter {
	public static void main(String[] args) {
		try {
			FileWriter file = new FileWriter("/Tramp/src/Janken/HandsFile.txt");
			PrintWriter pw = new PrintWriter(new BufferedWriter(file));
			
			pw.println("test0");
			pw.println("test1");
			
			pw.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
