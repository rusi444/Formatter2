package org.example;
import java.io.IOException;

import org.example.Interface.IReader;
import org.example.Interface.IWritter;

public class Main {
    public static void main(String[] args) throws IOException
    {
        Formatter formatter = new Formatter();

        try
        {
            IReader reader = new StringReader("привет");
            IWritter writter = new StringWritter();

            formatter.format(reader,writter);

            System.out.println("Отформатированный результат: " + ((StringWritter) writter).getResult());
        }
        catch(IOException e)
        {
            System.out.println("Не удалось отформатировать" + e.getMessage());
        }
    }
}