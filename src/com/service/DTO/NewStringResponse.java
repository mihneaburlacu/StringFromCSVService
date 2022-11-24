package com.service.DTO;

public class NewStringResponse {
    private String outputString;

    public NewStringResponse() {
        super();
    }

    public NewStringResponse(String outputString) {
        this.outputString = outputString;
    }

    public String getOutputString() {
        return outputString;
    }

    public void setOutputString(String outputString) {
        this.outputString = outputString;
    }

    @Override
    public String toString() {
        String sep = "----------------------------------------------------\n";
        return "output_example: \n" + sep + this.outputString + sep;
    }
}
