package scrabble;

import java.util.Scanner;

public class Test {
	public static int scoreArray[] = {1,3,3,2,1,4,2,4,1,8,5,1,3,1,1,3,10,1,1,1,1,4,4,8,4,10}; 
	public static void main(String[] args) throws Exception{
		int inputFreq[] = new int[26];
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the 7 letters:");
		for(int i=0;i<7;i++){
		    char temp = in.next().charAt(0);
		    int index = temp;
		    inputFreq[index-97]++;
		}
		System.out.println(MaxScore.getScore(inputFreq, "C:\\Users\\vshrimal\\Documents\\sowpods.txt", Test.scoreArray));
	}

}
