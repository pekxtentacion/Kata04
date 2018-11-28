package kata04.main;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import kata04.model.Histogram;
import kata04.view.HistogramDisplay;
import kata04.view.MailHistogramBuilder;
import kata04.view.MailListReader;

public class Kata04 {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        String fileName = "C:\\Users\\Janet\\Documents\\NetBeansProjects\\Kata04\\email.txt";
        output(process(input(fileName)));
    }
    
    private static List<String> input(String fileName) throws FileNotFoundException, IOException{
        return MailListReader.read(fileName);
    }
    
    private static Histogram<String> process(List<String>mailList){
        return MailHistogramBuilder.build(mailList);
    }
    
    private static void output(Histogram<String> histogram){
        HistogramDisplay histoDisplay = new HistogramDisplay(histogram);
        histoDisplay.execute();
    } 
}
