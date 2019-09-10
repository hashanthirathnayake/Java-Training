package com.company;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Write {
    public static void main(String[] args) throws IOException {
        FileWriter writer = new FileWriter("/home/user/Desktop/Hashanthi/ReaderAndWriter/src/com/company/files/fileout.txt");
        BufferedWriter buffer = new BufferedWriter(writer);

        for (int i=1;i<11;i++){
            buffer.write(""+i+"\n");
        }

        buffer.close();
    }
}
