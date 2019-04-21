package com.semairem.ismek;


import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;




public class ServisOtomasyonu {
	
	public static void main(String[] args) throws IOException {
		try {
	         File file = new File("Z:/servis.txt");
	         
	         if(file.createNewFile())System.out.println("Success!");
	         else System.out.println ("Error, file already exists.");
	      }
	      catch(IOException ioe) {
	         ioe.printStackTrace();
	      }
		
		
			    String str = "World";
			    FileWriter writer = new FileWriter("servis.txt"); 
			      
			      
			      writer.write(str); 
			      writer.flush();
			      writer.close();
			    
			    
			    FileReader fr = new FileReader("servis.txt"); 
			      char [] a = new char[str.length()];
			      fr.read(a);  
			      
			      for(char c : a)
			         System.out.print(c);   
			      fr.close();
	}}
			  
