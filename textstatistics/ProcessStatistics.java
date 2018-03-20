package textstatistics;

import java.io.File;

/**
 *
 * @author timberline
 */
public class ProcessStatistics {
    
    public static void main(String[] args){
        
        if(args.length < 1){
            System.out.println("Usage:ProcessText file1 [file2 ...]");
        }else{
            for(String arg : args){
                File file = new File(arg);
                TextStatistics ts = new TextStatistics(file);
                
                if(file.exists()){
                    System.out.println(ts.getLineCount());   
                }
                if(file.exists()){
                    System.out.println(ts.getWordCount());
                }
            }
        }
        
        
    }
    
}
