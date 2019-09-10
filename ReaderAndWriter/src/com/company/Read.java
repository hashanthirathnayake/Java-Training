package com.company;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Read {

    public static void main(String[] args) throws IOException {
	// write your code here
        String fileName = "/home/user/Desktop/Hashanthi/ReaderAndWriter/src/com/company/files/file";

        BufferedReader br = new BufferedReader(new FileReader(fileName));

        String currentLine;

        while ((currentLine = br.readLine()) != null) {
            System.out.println(currentLine);
        }

        br.close();
    }
}
