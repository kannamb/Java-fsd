package Filehandling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;

public class FileCreation {	
	public static void createFileUsingFileClass() throws IOException
	{
		//create file
		File file= new File("D:\\Filehandling\\createtestfile.txt");
		
		if(file.createNewFile()) {
			System.out.println("Your file is created");
		}
		else {
			System.out.println("File  is already Exist");
		}
		
		//write data to that file
		FileWriter  writer= new  FileWriter(file,false);//overWrites file
		//FileWriter  writer= new  FileWriter(file,true);//appends File
		writer.write("Filehandling is used here...!");
		writer.close();
		
		
	}
	
	
	
	public static void createFileUsingOutputStream()  throws IOException
	{
		FileOutputStream out= new FileOutputStream("D:\\Filehandling\\createtestfileoutput.txt");
		String input="Outputstream created";
		byte array[]=  input.getBytes();
		out.write(array);
		System.out.println("Data Written Successfully");
		out.close();
	}
	
	public static void createFileUsingNIO() throws IOException
	{
		
		Path path=Paths.get("D:\\Filehandling\\createtestfileoutput.txt");
		//write data using file class
		String input="Welcome  to NIO";
		byte array[]=input.getBytes();
		
		Files.write(path, array, StandardOpenOption.CREATE,StandardOpenOption.APPEND);
		System.out.println("Data Written Successfully");
		
		
		Path path1=Paths.get("D:\\Filehandling\\createtestfileNIO.txt");
		List<String> list=Arrays.asList("Create file","Read file","Update file","Delete file");
		Files.write(path1, list, StandardOpenOption.CREATE,StandardOpenOption.APPEND);
		System.out.println("Multiple Lines Written Successfully");
		
	}
	
	
	public static void main(String[] args) {
		try {
			 //createFileUsingFileClass();
			 //createFileUsingOutputStream();
			 createFileUsingNIO();
		} catch (IOException e) {
		     e.printStackTrace();
		}
	}

}
