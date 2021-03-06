package lab6;

import java.io.*; 

public class Count 
{ 
    public static void main(String[] args) throws IOException 
    { 
		File file = new File("C:\\Users\\ADMIN\\workspace\\Pratik\\src\\lab6\\rndfile.txt"); 
        FileInputStream fileStream = new FileInputStream(file); 
        InputStreamReader input = new InputStreamReader(fileStream); 
        BufferedReader reader = new BufferedReader(input); 
          
        String line; 
          
        // Initializing counters 
        int countWord = 0; 
        int characterCount = 0; 
        int countLine=0;
       
        // Reading line by line from the  
        // file until a null is returned 
        while((line = reader.readLine()) != null) 
        { 
        	countLine++;
           
            if(!(line.equals(""))) 
            { 
                  
                characterCount += line.length(); 
                  
                String[] wordList = line.split("\\s+"); 
                  
                countWord += wordList.length; 
            } 
        } 
        System.out.println("Total number of characters = " + characterCount);
        System.out.println("Total word count = " + countWord); 
        System.out.println("Total lines count = " + countLine); 
    } 
} 