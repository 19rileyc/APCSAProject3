/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textstatistics;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TextStatistics implements TextStatisticsInterface{

    private File textFile;
    private Scanner fileScan;
    private int lineCount;
    private int wordCount;
    private int charCount;
    private int letterCount;
    private String line;
    private String word;
    private String letter;
    public String DELIMITERS = " ,.;:'\"&!?-_\n\t12345678910[]{}()@#$%^*/+-";
    StringTokenizer tokenizer;
    
    
    public TextStatistics(File file){
        
        textFile = file;
        try {
            fileScan = new Scanner(textFile);
            
            while(fileScan.hasNextLine()){
                line = fileScan.nextLine();
                tokenizer = new StringTokenizer(line,DELIMITERS);
                
                lineCount++;
            }
                while(fileScan.hasNext()){
                word = fileScan.next();
                tokenizer = new StringTokenizer(word,DELIMITERS);
                
                wordCount++;
    }
            
        } catch (FileNotFoundException ex) {
            //Logger.getLogger(TextStatistics.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("File cannot be located");
        }
        
    }
    @Override
    public int getCharCount() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getWordCount() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    return wordCount;
    }

    @Override
    public int getLineCount() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    return lineCount;
    
    }
    @Override
    public int[] getLetterCount() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int[] getWordLengthCount() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getAverageWordLength() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
