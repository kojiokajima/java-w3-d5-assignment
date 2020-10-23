import java.util.Scanner;

public class Driver {

	//method to print just one object which pass as an argument
	public static void printSongInformation(Record record) {
		System.out.println("ID:\t\t" + record.getId() +
							"\nTitle:\t\t" + record.getTitle() +
							"\nSinger Name:\t" + record.getSingerName() +
							"\nLength:\t\t" + record.getLength() +
							"\nRank:\t\t" + record.getRank());
	}
	
	//method to iterate through the array and find the index of record for the title
	/*
	 * @return the index of record. If we don't have it, return -1
	 */
	public static int findIndexOfTitle(Record[] records, String title) {
		for (int i = 0; i < records.length; i++) {
			if (records[i].getTitle().equalsIgnoreCase(title)) {
				return i;
			}
		}
		return -1;
	}
	
	//getAverage of lengthRecord --> return average
	public static double getAverageOfLength(Record[] records) {
		double sum = 0.0;
		for (int i = 0; i < records.length; i++) {
			sum += records[i].getLength();
		}
		
		return sum / records.length;
	}
	
	//get Average of ranking --> return average
	public static double getAverageOfRank(Record[] records) {
		double sum = 0.0;
		for (int i = 0; i < records.length; i++) {
			sum += records[i].getRank();
		}
		
		return sum / records.length;
	}
	
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//at least create 7 objects
		Record rec1 = new Record("Closer", "The Chainsmokers", 246, 3);
		Record rec2 = new Record("Paris", "The Chainsmokers", 216, 4);
		Record rec3 = new Record("Tie Me Down", "Gryffin", 248, 1);
		Record rec4 = new Record("Permanent", "Kygo", 228, 2);
		Record rec5 = new Record("Kids in Love", "Kygo", 258, 2);
		Record rec6 = new Record("Here With Me", "Marshmello",156, 3);
		Record rec7 = new Record("Funny", "Zedd", 222, 5);
		Record rec8 = new Record("All Nighter", "Dan + Shay", 204, 4);
		Record rec9 = new Record("Keeps Me Right", "Tall Heights", 228, 1);
		Record rec10 = new Record("Colors", "Halsey", 246, 2);
		
		//create array and add these objects to array
		Record[] records = new Record[10];
		records[0] = rec1;
		records[1] = rec2;
		records[2] = rec3;
		records[3] = rec4;
		records[4] = rec5;
		records[5] = rec6;
		records[6] = rec7;
		records[7] = rec8;
		records[8] = rec9;
		records[9] = rec10;
		
		//ask the user to enter the name of a title of the record
		System.out.print("Enter a title:\t");
		//read the input
		String titleInput = input.nextLine();
		
		//findRecord
		int index = findIndexOfTitle(records, titleInput);
		//print the record
		if (index == -1) {
			System.err.println(titleInput + " was not found");
		} else {
			printSongInformation(records[index]);
		}
		
		//print the averages
		double lengthAverage = getAverageOfLength(records);
		System.out.println("\nThe average of lengths is " + lengthAverage + "[s]");
		double rankAverage = getAverageOfRank(records);
		System.out.println("The average of ranks is " + rankAverage);
		
		

	}

}
