package com.alanthegoat.fileUtils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedInputFile {
    public static String read(String fileName) throws IOException {
        BufferedReader in = new BufferedReader(new FileReader(fileName));

        String s ;
        StringBuilder sb = new StringBuilder();
        while((s = in.readLine())!=null)
            sb.append(s + "\n");
        in.close();
        return  sb.toString();
    }
}
