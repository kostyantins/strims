package strategy_pattern;

import org.junit.Test;

import java.io.IOException;

public class TestRead {

    String xlsFile = "file.xls";
    String pdfFile = "file.pdf";

    FileReader reader = new FileReader();

    @Test
    public void readFiles () throws IOException {
        // для Xls файла
        reader.setReader(new XlsReader());
        String dataXls = reader.getContent(xlsFile);

        System.out.println("Xls data " + dataXls);

        // для Pdf файла
        reader.setReader(new PdfReader());
        String dataPdf = reader.getContent(pdfFile);

        System.out.println("Pdf data " + dataPdf);
    }

    @Test
    public void writePDFFiles () throws IOException {
        reader.setReader(new PdfReader());
        reader.setContent(pdfFile);
    }

    @Test
    public void updatePDFFiles () throws IOException {
        reader.setReader(new PdfReader());
        reader.updateContent(pdfFile);
    }

    @Test
    public void readPDFFiles () throws IOException {
        reader.setReader(new PdfReader());
        reader.getContent(pdfFile);
    }

}

