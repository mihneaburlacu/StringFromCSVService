package com.service.start;

import com.service.DTO.NewStringRequest;
import com.service.impl.NewString;
import com.service.impl.ReadFromFile;

import java.io.File;

//The input string is received from file.txt
public class MainClass {
    public static void main(String[] args) {
        NewString newString = new NewString();
        NewStringRequest request = new NewStringRequest();

        ReadFromFile readFromFile = new ReadFromFile();
        String text = readFromFile.read();

        //request.setInputString("full_name, email, location\nAnita, anita@email.com, California\nAron, aron.bla@email.com, California\nAron, aron.bla@email.com, California\nCosmin, kox@bla.com, Giurgiu\nCrina, ggl@test.com, Letcani\nBogdan, vox@example.com, Resita");
        request.setInputString(text);
        System.out.println(newString.service(request).toString());
    }
}
