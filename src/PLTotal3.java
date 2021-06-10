
public class PLTotal3 {

	public static void main(String[] args) {
		FindDifference fdObj = new FindDifference(); //Makes an object for FindDifference to call the class
		String output[] = fdObj.findDifference(); //Stores the returned strings from FindDifference into the output array
		
		ReadNamesFile rnfObj = new ReadNamesFile(); //Object for ReadNamesFile to call the class
		rnfObj.readNamesFile(output[0] + "\n" + output[1] + "\n"  + output[2] + "\n" + output[3]); //Takes the returned strings from FindDifference and this plugs into the myData variable in ReadNamesFile
	}
}
