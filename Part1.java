import edu.duke.*;
import java.io.*;

public class Part1 {
     public String findGeneSimple(String dna){
        String result="";
        int startIndex=dna.indexOf("ATG");
        if(startIndex == -1){
            return "";
        }
        int stopIndex=dna.indexOf("TAA",startIndex + 3);
        if(stopIndex == -1){
            return "";
        }
        result =dna.substring(startIndex,stopIndex+3);
        return result;

}
    public void testFindGeneSimple(){
    String dna="AATGCGTAATATGGT";
    System.out.println("DNA strand is " + dna);
    String gene= findGeneSimple(dna);
    System.out.println("Gene is " + gene);
    
    
    
    }

}
