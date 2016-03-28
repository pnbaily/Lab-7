package javaWork;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class lab7Spring16 {
    
    /************************ ACTIVITY 1: PRINTING METHODS ********************************/
    // this method takes a 1D array of integers and prints it
    public static void printArray(int[] myArray) {
        // your code goes here
    	for(int i=0; i < myArray.length; i++){
    		
    		System.out.print(myArray[i] + " ");
    	}
    	System.out.println("");
    }
    
    // this method takes a 2D array of integers 
    // and prints it row per row
    public static void printArray(int[][] myArray) {
        // your code goes here
    	
    		int[] newArray = new int[myArray.length];
    		for(int i = 0;i < myArray.length; i++){
    			newArray [i] = myArray[i][0];
    		}
    		printArray(newArray);
    		
    		for(int i = 0; i<myArray.length; i++){
    			newArray [i] = myArray[i][1];
    		}
    		printArray(newArray);

    }
    
    // this method takes a 1D array of strings and prints it
    // one string per line
    public static void printArray(String[] myArray) {
        // your code goes here
    	for(int i = 0; i < myArray.length; i++){
    		
    		System.out.println(myArray[i] + " ");
    	}
    	System.out.println("");
    }
    
    /************************ ACTIVITY 2: SEQUENCE METHOD ***********************************/
    // this method takes an empty array of strings and a seed string (which contains only digits)
    // and fills it with the SayItOutLoud sequence starting with the string seed
    // Hint: this means that the first element of the array of strings will be seed
    public static void SayItOutLoud(String[] sequence, String seed) {
        // your code goes here
    	sequence[0] = seed;
    	int j = 0;
    	for(int i =1; i < sequence.length;i++){
    		seed = sequence[i-1];
    		sequence[i]="";
    		j = 0;
    		while(j < seed.length()){
    			
    			char current = seed.charAt(j);
    			int amount = 1;
    		
    			if(j < seed.length()- 1){
    				while( j< seed.length() && seed.charAt(j + 1)== current){
    				
    					amount++;
    					j++;
    				}
    			}
  
   			sequence[i] += String.valueOf(amount);
   			sequence[i] += current;
    			j++;
    			
    		}
    	}
    }
    
    /************************ ACTIVITY 3: MAGIC SQUARE METHOD ******************************/
    // this method takes a 2D array of integers and 
    // checks if it is a magic square 2D array
    // if it is, the method returns true
    // otherwise, it returns false
    public static boolean MagicSquare(int[][] table) {
        
        // your code goes here
        
        return true;
    }
    
    // this method computes the sum of row number "row" of a given 2D array of integers
    public static int sumRow(int[][] table, int row) {
        int sum = 0;
        // your code goes here
        return sum;
    }    
    
    // this method computes the sum of column number "column" of a given 2D array of integers
    // we will assume the table is not ragged
    public static int sumColumn(int[][] table, int column) {
        int sum = 0;
        // your code goes here
        return sum;
    }

    // this method computes the sum of numbers in the main diagonal of a given 2D array of integers
    public static int sumDiagonal1(int[][] table) {
        int sum = 0;
        // your code goes here
        return sum;
    }    
    
    // this method computes the sum of numbers in the secondary diagonal of a given 2D array of integers
    public static int sumDiagonal2(int[][] table) {
        int sum = 0;
        // your code goes here
        return sum;
    }    
    
    /************************ AUXILIARY METHOD, GIVEN TO YOU *******************************/
    // this method takes a 1D array of strings (each string represents an integer)
    // and returns an array of integers of the same size 
    public static int[] toInteger(String[] array) {
        int[] result = new int[array.length];
        for (int i=0; i<array.length; i++) {
            result[i] = Integer.parseInt(array[i]);   
        }
        return result;
    }
    
    /************************ MAIN METHOD ***************************************************/
    public static void main (String[] args) throws IOException {
        
        // get the user name from System.in
        Scanner in = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = in.next();
        
        // create a frame and use it to greet the user
        JFrame frame = new JFrame("CS1401 Lab 7");
        JOptionPane.showMessageDialog(frame,
                                      "Welcome to Lab7, " + name + "!",
                                     "CS1401 Lab 7",    
                                      JOptionPane.INFORMATION_MESSAGE);
        
        /************ INTERACTION RELATED TO ACTIVITY 2 *************************************/
        String seed = JOptionPane.showInputDialog(frame, "What do you want to want to start the sequence from?",
                                                 "CS1401 Lab 7",    
                                                  JOptionPane.INFORMATION_MESSAGE);
        System.out.printf("The user's wants to start the SayItOutLoud sequence from %s.\n", seed);
        int length = Integer.parseInt(JOptionPane.showInputDialog(frame, "How many numbers for you want to generate in the sequence?",
                                                                  "CS1401 Lab 7",    
                                                                  JOptionPane.INFORMATION_MESSAGE));
        System.out.printf("The user's wants to generate " + length + " elements in the SayItOutLoud sequence\n");
        
        String[] sequenceArray = new String[length];
        // here: call the method SayItOutLoud on the array sequenceArray and the first element seed
        // your code goes here
        SayItOutLoud(sequenceArray,seed);
        printArray(sequenceArray);
        // now print the result of applying SayItOutLoud
        // your code goes here
        
        /************ INTERACTION RELATED TO ACTIVITY 3 *************************************/
        
        /*String filename = JOptionPane.showInputDialog(frame, "In which file is your data stored?",
                                                      "CS1401 Lab 7",    
                                                      JOptionPane.INFORMATION_MESSAGE);
        FileReader fr = new FileReader(filename);
        BufferedReader textReader = new BufferedReader(fr);
        // below is the code (given to you) that allows to read a text file like the one given to you as an example (square1.txt)
        int size = Integer.parseInt(textReader.readLine()); 
        int[][] square = new int[size][size];
        
        for (int i=0; i< size; i++) {
            square[i] = toInteger(textReader.readLine().split(" "));
        }
        
        // print what you just stored in a 2D array using the method printArray
        // your code goes here
        
        // here enter your code so that you print out where the data you read is a magic square or not
        */
        /************ END OF PROGRAM *********************************************************/
        // goes back to System.in and frees back the prompt command
        System.exit(0);
     
    }
    
}
