package eleks_academy_java;

import org.junit.Test;

import java.io.*;

public class IOStreams {

    @Test
    public void fileInputOutputStream() throws IOException {
        FileInputStream in = null;
        FileOutputStream out = null;

        try {
            in = new FileInputStream("src/input.txt");
            out = new FileOutputStream("src/output.txt");

            // writing everything from input to output
            int c;
            while ((c = in.read()) != -1) {
                out.write(c);
            }

        } finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
    }

    @Test
    public void getDataInputStream() throws IOException {

        BufferedInputStream bufferedInputStream;

        // Reading data from the same file
        DataInputStream dataIn = new DataInputStream(new FileInputStream("src/input.txt"));

        while (dataIn.available() > 0) {
            String k = dataIn.readLine();
            System.out.print(k + " ");
        }
    }

    @Test
    public void write_read_string() throws IOException {
        // Writing string to a file encoded as modified UTF-8
        try (DataOutputStream dataOut = new DataOutputStream(new FileOutputStream("src/file.txt"))) {
            dataOut.write(10);


            // Reading data from the same file
            DataInputStream dataIn = new DataInputStream(new FileInputStream("src/file.txt"));

            while (dataIn.available() > 0) {
                int k = dataIn.read();
                System.out.print(k + " ");
            }
        }
    }

    @Test
    public void write_read_numbers() throws IOException {
        // Writing string to a file encoded as modified UTF-8
        try (DataOutputStream dataOut = new DataOutputStream(new FileOutputStream("src/file.txt"))) {
            dataOut.write(10);


            // Reading data from the same file
            DataInputStream dataIn = new DataInputStream(new FileInputStream("src/file.txt"));

            while (dataIn.available() > 0) {
                int k = dataIn.read();
                System.out.print(k + " ");
            }
        }
    }
}


