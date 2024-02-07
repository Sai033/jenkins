package PdfHandling;

import java.io.File;
import org.apache.pdfbox.Loader;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

public class Pdf {
public static void main(String[] args) throws Exception {
File f=new File("C:\\Users\\smart\\Downloads\\Selenium Full Material Updated Greens.pdf");
PDDocument p=Loader.loadPDF(f);
PDFTextStripper t=new PDFTextStripper();
t.setStartPage(1);
t.setEndPage(2);
String data=t.getText(p);
//System.out.println(data);
if(data.contains("1")){
	System.out.println("Data contains in PDF file");
}
else System.out.println("data not contains");

}
}
