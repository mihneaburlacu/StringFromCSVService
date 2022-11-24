package com.service.impl;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReadFromFile {
    private static final String fileName = "file.txt";

    public ReadFromFile() {
        super();
    }

    public String read() {
        StringBuilder sb = new StringBuilder();

        try(BufferedReader buffer = new BufferedReader(new FileReader(fileName))) {
            String str;
            while((str = buffer.readLine()) != null) {
                sb.append(str).append("\n");
            }
        } catch(Exception exception) {
            exception.printStackTrace();
        }

        return sb.toString();
    }
}
