import edu.duke.*;
import java.io.*;

public class Part2 {
     public String findGeneSimple(String dna,String startCodon,String stopCodon){
        String dnaUpper=dna.toUpperCase();
        int Start=dnaUpper.indexOf(startCodon);
        int End=dnaUpper.indexOf(stopCodon,Start+1);
        return dna.substring(Start,End);

}
 public void testFindGeneSimple(){
    String startCodon="ATG";
    String stopCodon="TAA";
    
    String dna="atgaaataa";
    System.out.println("DNA strand is " + dna);
    String Gene=findGeneSimple(dna,startCodon,stopCodon);
    System.out.println("Gene is " +Gene );
    String dna2="ATGAAATAA";
    System.out.println("DNA strand is " + dna2);
    String Gene2=findGeneSimple(dna2,startCodon,stopCodon);
    System.out.println("Gene is " +Gene2 );
    
       


  
    
    
    }
}