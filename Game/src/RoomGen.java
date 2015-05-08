import java.util.*;
import java.math.*;

public class RoomGen {
	public static void main(String[] args) {
		
		String[][] floor = randomFloor();
		
		isFloorValid(floor);
		
		// if no rooms adjacent and rooms diagonal then delete room
		
		printFloor(floor);
		
	}
	public static String[][] randomFloor() {
		
		String[][] tempTable = new String[5][5];
//		int numRooms = 0;
		
		for (int i = 0; i < 5; i++) {
//			System.out.println("RAN FIRST LOOP " + i + " times");
			for (int j = 0; j < 5; j++) {
//				System.out.println("RAN SECOND LOOP " + j + " times");
								
				Random randgen = new Random();
				if(randgen.nextBoolean() ){
				tempTable[i][j] = "0";
//				numRooms ++;
				}else{
				tempTable[i][j] = " ";
				}
				
			}
		}
		int SC = (randInt(0,4));
		int SR = (randInt(0,4));
		int EC = (randInt(0,4));
		int ER = (randInt(0,4));
		tempTable[SR][SC] = "S";
		tempTable[ER][EC] = "E";
//		System.out.println(SC + "  " + SR);
		
		return tempTable;	
	}
	public static void printFloor(String[][] table) {
		System.out.println(
				 "[" + table[0][0] + "]" + "[" + table[0][1] + "]" + "[" + table[0][2] + "]" + "[" + table[0][3] + "]" + "[" + table[0][4] + "]"
				 );
		System.out.println(
				 "[" + table[1][0] + "]" + "[" + table[1][1] + "]" + "[" + table[1][2] + "]" + "[" + table[1][3] + "]" + "[" + table[1][4] + "]"
				 );
		System.out.println(		 
				 "[" + table[2][0] + "]" + "[" + table[2][1] + "]" + "[" + table[2][2] + "]" + "[" + table[2][3] + "]" + "[" + table[2][4] + "]"
				 );
		System.out.println(
				 "[" + table[3][0] + "]" + "[" + table[3][1] + "]" + "[" + table[3][2] + "]" + "[" + table[3][3] + "]" + "[" + table[3][4] + "]"
				 );
		System.out.println(
				 "[" + table[4][0] + "]" + "[" + table[4][1] + "]" + "[" + table[4][2] + "]" + "[" + table[4][3] + "]" + "[" + table[4][4] + "]"
				);
		
	}
	
	public static boolean isFloorValid(String[][] floor) {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
//				if(){
//					
//				}
			}
		}
		
		
		boolean isValid = true;
		return isValid;
	}
	public static int randInt(int min, int max) {

	    // NOTE: Usually this should be a field rather than a method
	    // variable so that it is not re-seeded every call.
	    Random rand = new Random();

	    // nextInt is normally exclusive of the top value,
	    // so add 1 to make it inclusive
	    int randomNum = rand.nextInt((max - min) + 1) + min;

	    return randomNum;
	}
}
