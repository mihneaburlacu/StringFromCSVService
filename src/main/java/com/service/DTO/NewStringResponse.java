package com.service.DTO;

import java.util.Objects;

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NewStringResponse that = (NewStringResponse) o;
        return Objects.equals(outputString, that.outputString);
    }

    @Override
    public String toString() {
        return this.outputString;
    }
}
