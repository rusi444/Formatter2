package org.example;

import java.io.IOException;

import org.example.Interface.*;

public class StringWritter implements IWritter
{
    private StringBuilder output;

    public StringWritter()
    {
        this.output = new StringBuilder();
    }


    @Override
    public void write(char c) throws IOException
    {
        output.append(c);
    }

    public String getResult()
    {
        return output.toString();
    }
}
