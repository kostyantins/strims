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
        // Reading data from the same file
        DataInputStream dataIn = new DataInputStream(new FileInputStream("src/input.txt"));

        while (dataIn.available() > 0) {
            String k = dataIn.readLine();
            System.out.print(k + " ");
        }
    }

    public static void main(String args[]) throws IOException {
            // Writing string to a file encoded as modified UTF-8
            try(DataOutputStream dataOut = new DataOutputStream(new FileOutputStream("src/file.txt"))) {
                dataOut.writeUTF("hello dude !!");

                // Reading data from the same file
                DataInputStream dataIn = new DataInputStream(new FileInputStream("src/file.txt"));

                while (dataIn.available() > 0) {
                    String k = dataIn.readUTF();
                    System.out.print(k + " ");
                }
            }
        }
    }


