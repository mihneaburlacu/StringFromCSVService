package com.Mihnea.DTO;

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
        return "output_example: \n" + this.outputString;
    }
}
