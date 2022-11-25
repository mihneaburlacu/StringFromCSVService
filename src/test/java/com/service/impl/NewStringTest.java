package com.service.impl;

import com.service.DTO.NewStringRequest;
import com.service.DTO.NewStringResponse;

import static org.junit.Assert.*;

public class NewStringTest {

    @org.junit.Test
    public void service() {
        NewString newString = new NewString();
        NewStringResponse result = new NewStringResponse();
        NewStringResponse compareFirst = new NewStringResponse();
        NewStringResponse compareSecond = new NewStringResponse();
        NewStringRequest request = new NewStringRequest();

        request.setInputString("full_name, email, location\nAnita, anita@email.com, California\nAnita, anita@email.com, California\nDana, dana@email.com, LA");
        result.setOutputString(newString.service(request).toString());
        compareFirst.setOutputString("A: \nAnita, anita@email.com, California\n\nD: \nDana, dana@email.com, LA\n\n");
        compareSecond.setOutputString("A: \nAnita, anita@email.com, California\nAnita, anita@email.com, California\n\nD: \nDana, dana@email.com, LA\n\n");

        assertEquals(compareFirst, result);
        assertNotEquals(compareSecond, result);
    }
}