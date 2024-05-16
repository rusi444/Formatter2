package org.example;
import org.example.Interface.*;

import java.io.IOException;

public class StringReader implements IReader
{
    private String input;
    private int index;

    public StringReader(String input)
    {
        this.input = input;
        this.index = 0;
    }

    @Override
    public boolean hasNext()
    {
        return index < input.length();
    }

    @Override
    public char read() throws IOException
    {
        if (index >= input.length())
        {
            throw new IOException("Конец чтения");
        }

        return input.charAt(index++);
    }
}
