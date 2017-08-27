package pers.wilson.javastudy.contactSys;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;


public class ContactOperatorImpl implements ContactOperator {

	@Override
	public void addContact(Contact contact) {
	try {
		/*
		 * 需求：把contact对象保存到xml文件中
		 * 
		 * <contactList>
				 <contact>
				 	<name>eric</name>
				 	<gender>male</gender>
				 	<age>20</age>
				 	<phone>15001747516</phone>
				 	<email>eric@qq.com</email>
				 	<qq>1198319806</qq>
				 </contact>
			 </contactList>
		 */

		
		File file = new File("D:/Users/DELL/javaworkspace/contactSystem/contact.xml");
		Document doc = null;
		Element rootElement = null;
		
		if(!file.exists()){
			doc = DocumentHelper.createDocument();
			rootElement = doc.addElement("contactList");		
		}else{
			doc = XMLUtil.getDocument();
			rootElement = doc.getRootElement();
		}
		Element contactElement = rootElement.addElement("contact");		
		contactElement.addAttribute("id",contact.getId());
		contactElement.addElement("name").setText(contact.getName());
		contactElement.addElement("gender").setText(contact.getGender());
		contactElement.addElement("age").setText(contact.getAge()+"");
		contactElement.addElement("phone").setText(contact.getPhone());
		contactElement.addElement("email").setText(contact.getEmail());
		contactElement.addElement("qq").setText(contact.getQq());
		
		XMLUtil.write2xml(doc);
			
	} catch (Exception e) {
		e.printStackTrace();
		throw new RuntimeException(e);
	}
	}

/*	private void FileOutputStream   FileOutputStream(String string) {
		// TODO Auto-generated method stub
		
	}*/

	@Override
	public void updateContact(Contact contact) {
		try {
			Document doc = XMLUtil.getDocument();
			Element contactElement = (Element)doc.selectSingleNode("//contact[@id ='" + contact.getId() + "']");
			
			contactElement.element("name").setText(contact.getName());
			contactElement.element("gender").setText(contact.getGender());
			contactElement.element("age").setText(contact.getAge()+"");
			contactElement.element("phone").setText(contact.getPhone());
			contactElement.element("email").setText(contact.getEmail());
			contactElement.element("qq").setText(contact.getQq());
			
			XMLUtil.write2xml(doc);
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
		

	}

	@Override
	public List<Contact> findAll() {
		try {
			Document doc = XMLUtil.getDocument();
			List<Contact> list = new ArrayList<Contact>();
			List<Element> conList = (List<Element>)doc.selectNodes("//contact");
			
			for(Element e:conList){
				Contact con = new Contact();
				con.setId(e.attributeValue("id"));
				con.setAge(Integer.parseInt(e.elementText("age")));
				con.setEmail(e.elementText("email"));
				con.setGender(e.elementText("gender"));
				con.setName(e.elementText("name"));
				con.setPhone(e.elementText("phone"));
				con.setQq(e.elementText("qq"));
				list.add(con);
			}
			
			return list;

		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
		
	}

	@Override
	public void deleteContact(String id) {
		try {
			Document doc = XMLUtil.getDocument();
			Element contactElement = (Element)doc.selectSingleNode("//contact[@id ='" + id + "']");
			
			contactElement.detach();

			XMLUtil.write2xml(doc);
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}

}
