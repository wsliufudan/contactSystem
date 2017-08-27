package pers.wilson.javastudy.contactSys;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

public class XMLUtil {
	
	public static Document getDocument(){
		try {
			Document doc = new SAXReader().read(new File("D:/Users/DELL/javaworkspace/contactSystem/contact.xml"));
			return doc;
		} catch (DocumentException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
	
	public static void write2xml(Document doc){
		try {
			FileOutputStream out = new FileOutputStream("D:/Users/DELL/javaworkspace/contactSystem/contact.xml");
			OutputFormat outFormat = OutputFormat.createPrettyPrint();
			outFormat.setEncoding("utf-8");
			XMLWriter write= new XMLWriter(out,outFormat);
			write.write(doc);
			write.close();
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);		
		}
	}
	
}
