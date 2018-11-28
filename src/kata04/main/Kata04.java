package kata04.main;

import java.io.IOException;
import java.util.List;
import kata04.model.Histogram;
import kata04.model.Mail;
import kata04.view.HistogramDisplay;
import kata04.view.MailHistogramBuilder;
import kata04.view.MailListReader;

public class Kata04 {

    public static void main(String[] args) throws IOException {
        String filename = "C:\\Users\\Janet\\Documents\\NetBeansProjects\\Kata04\\email.txt";
        List<Mail> mailList =  MailListReader.read(filename);
        Histogram<String> histogram = MailHistogramBuilder.build(mailList);
        HistogramDisplay histoDisplay = new HistogramDisplay(histogram);
        histoDisplay.execute();
    }
    
}
