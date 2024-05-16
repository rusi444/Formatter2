package org.example;

import org.example.Interface.IReader;
import org.example.Interface.IWritter;

import java.io.IOException;

public class Formatter
{
    public void format(IReader reader, IWritter writter) throws IOException
    {
        while(reader.hasNext())
        {
            char c = reader.read();

            c = Character.toUpperCase(c);
            writter.write(c);
        }
    }
}
