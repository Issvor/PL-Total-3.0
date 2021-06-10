/*
 * All credit for this page goes to Saad Tutorials. https://youtu.be/epDEG6YstSU
 */

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ReadNamesFile {

	public void readNamesFile(String myData) {
		BufferedWriter buffWriter = null;
		Date currentDate = new Date();
		SimpleDateFormat sdfObj = new SimpleDateFormat("MM/dd/yyyy");

		try {
			buffWriter = new BufferedWriter(new FileWriter(new File("PLTotalLog.txt"), true));
			buffWriter.write(sdfObj.format(currentDate) + "\n" + myData + "\n");
			System.out.println("---------------------------");
			System.out.println("Append finished!");
			
		}catch(FileNotFoundException e) {
			System.out.println("File not found!");
		}catch(IOException e) {
			System.out.println("I/O Error catch block!");
		}finally {
			try {
				if(buffWriter != null) {
					buffWriter.close();
				}
			}catch(IOException e){
				System.out.println("I/O Error in the finally block!");
			}
		}
	}
}
