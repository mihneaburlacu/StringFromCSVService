package com.service.DTO;

public class NewStringRequest {
    private String inputString;

    public NewStringRequest() {
        super();
    }

    public NewStringRequest(String inputString) {
        this.inputString = inputString;
    }

    public String getInputString() {
        return inputString;
    }

    public void setInputString(String inputString) {
        this.inputString = inputString;
    }

    @Override
    public String toString() {
        return "input_string: \n" + this.inputString;
    }
}
