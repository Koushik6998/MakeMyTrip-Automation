package Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadTheValues {
	public static void main(String[]args) throws IOException {
	File file=new File("C:\\Users\\thimmisetty.ganesh\\eclipse-workspace\\JDBC\\src\\Utilities\\Oracle.properties");
	FileInputStream input=new FileInputStream(file);
	Properties s=new Properties();
	 s.load(input);
	 String url = s.getProperty("db.url");
	 System.out.println(url);
     String username = s.getProperty("db.username");
     System.out.println(username);
     String password = s.getProperty("db.password");
     System.out.println(password);
    
}}