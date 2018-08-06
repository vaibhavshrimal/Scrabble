package scrabble;
import java.io.*;

public class MaxScore {
	public static int getWordScore(String word, int[] characterFrequency,int []scoreArray){
		int score=0;
		for(int i=0;i<word.length();i++){
			char currentChar= word.toLowerCase().charAt(i);
			if(characterFrequency[currentChar-'a']==0){
				return -1;
			}
			else{
				characterFrequency[currentChar-'a']--;
			}
			score+=scoreArray[currentChar-'a'];
		}
		return score;
	}
	

	
	public static int getScore(int[] characterFrequency, String fileName, int[] scoreArray) throws Exception{
		int score=-1;
		File dictionaryFile=new File(fileName);
		BufferedReader br = new BufferedReader(new FileReader(dictionaryFile)); 
		String word;
		int inputFreq[] = new int[26];
		while ((word = br.readLine()) != null){
			for(int i=0;i<26;i++){
				inputFreq[i]=characterFrequency[i];
			}
			score=Math.max(getWordScore(word, inputFreq,scoreArray),score);
		}
		return score;
		
	}
}
