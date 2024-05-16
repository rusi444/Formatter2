package org.example;
import java.io.IOException;

import org.example.Interface.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FormatterTest
{
    @Test
    public void testFormatWithUpperCase() throws IOException
    {
        IReader reader = new StringReader("привет");
        IWritter writter = new StringWritter();

        Formatter formatter = new Formatter();
        formatter.format(reader,writter);

        assertEquals("ПРИВЕТ", ((StringWritter) writter).getResult());
    }

    @Test
    public void testFormatWithLowerCase() throws IOException
    {
        IReader reader = new StringReader("ПРИВЕТ");
        IWritter writter = new StringWritter();

        Formatter formatter = new Formatter();
        formatter.format(reader,writter);

        assertEquals("ПРИВЕТ", ((StringWritter) writter).getResult());
    }

    @Test
    public void testFormatWithNumbers() throws IOException
    {
        IReader reader = new StringReader("12345");
        IWritter writter = new StringWritter();

        Formatter formatter = new Formatter();
        formatter.format(reader,writter);

        assertEquals("12345", ((StringWritter) writter).getResult());
    }
}
