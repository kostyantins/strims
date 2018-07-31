package strategy_pattern;


import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import org.apache.pdfbox.text.PDFTextStripper;

import java.io.File;
import java.io.IOException;

import static java.lang.System.err;

public class PdfReader implements Reader {

    //using Apache PDFBox library
    @Override
    public String readFile(String filePath) throws IOException {
        String text = null;
        try {
            PDDocument doc = PDDocument.load(new File(filePath));
            text = new PDFTextStripper().getText(doc);
        } catch (IOException e) {
            e.printStackTrace();
        }
        //TODO delete if redundant
        System.out.println(text);
        return text;
    }


    //using PDFOne library
//    @Override
//    public void writeFile(String filePathTo) {
//
//        PdfDocument doc = new PdfDocument();
//
//        try {
//            // Write some text on page 1
//            doc.writeText("Hello, World!"); // automatically creates a blank page
//
//            // Save document to file
//            doc.save(filePathTo);
//            doc.close();
//        } catch (IOException | PdfException e) {
//            e.printStackTrace();
//        }
//    }

    //using PDFBox library
    @Override
    public void writeFile(String filePathTo) throws  IOException {
        final PDDocument document = new PDDocument();
        try {
            final PDPage emptyPage = new PDPage();
            document.addPage(emptyPage);
            document.save(filePathTo);
        } catch (IOException ioEx) {
            err.println(
                    "Exception while trying to create blank document - " + ioEx);
        }
    }

//    //using PDFOne library
//    @Override
//    public void updateFile(String filePathTo) {
//
//        // Create a PdfDocument instance
//        PdfDocument doc = new PdfDocument();
//
//        try {
//            // Load input document
//            doc.load(filePathTo);
//            // Write text at position (100, 100) on page 1
//            doc.writeText(
//                    "Hello again, World!",
//                    100, // x-coordinate
//                    50); // y-coordinate
//
//            // Write changes to output file
//            doc.save(filePathTo);
//            doc.close();
//        } catch (IOException | PdfException e) {
//            e.printStackTrace();
//        }
//    }

    //using PDFBox library
    @Override
    public void updateFile(String filePathTo) throws IOException {
        //Loading an existing document
        File file = new File(filePathTo);
        PDDocument document = PDDocument.load(file);

        //Retrieving the pages of the document (be careful with number of pages)
        PDPage page = document.getPage(0);
        PDPageContentStream contentStream = new PDPageContentStream(document, page);

        //Begin the Content stream
        contentStream.beginText();

        //Setting the font to the Content stream
        contentStream.setFont(PDType1Font.TIMES_ROMAN, 12);

        //Setting the position for the line
        contentStream.newLineAtOffset(20, 750);

        String text = "This is the sample document and we are adding content to it.";

        //Adding text in the form of string
        contentStream.showText(text);

        //Ending the content stream
        contentStream.endText();

        System.out.println("Content added");

        //Closing the content stream
        contentStream.close();

        //Saving the document
        document.save(new File(filePathTo));

        //Closing the document
        document.close();
    }
}
