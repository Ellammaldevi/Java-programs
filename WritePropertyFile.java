package com.program;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

public class WritePropertyFile
{
    public static void main(String[] args) 
    {
        try (OutputStream output = new FileOutputStream("config.properties")) 
        {
            Properties prop = new Properties();
            prop.setProperty("database", "localhost");
            prop.setProperty("username", "Codingeek");
            prop.setProperty("password", "Codingeek");
            prop.store(output, null);
        } 
        catch (IOException exception) 
        {
            exception.printStackTrace();
        } 
 
    }
}