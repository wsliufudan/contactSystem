package pers.wilson.javastudy.contactSys;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class TestContactOperatorImpl {
	ContactOperator operator = null;
	
	@Before
	public void init(){
		operator = new ContactOperatorImpl();		
	}

	@Test
	public void  testAddContact(){
		Contact contact = new Contact();
		contact.setId("2");
		contact.setGender("male");
		contact.setAge(20);
		contact.setName("wilson");
		contact.setPhone("15001747516");
		contact.setQq("1113433");
		contact.setEmail("eric@qq.com");
		operator.addContact(contact);	
	}
	
	@Test
	public void  testUpdateContact(){
		Contact contact = new Contact();
		contact.setId("2");
		contact.setGender("male");
		contact.setAge(27);
		contact.setName("wilson");
		contact.setPhone("15001747516");
		contact.setQq("1198319806");
		contact.setEmail("eric@qq.com");
		operator.updateContact(contact);	
	}
	
	@Test
	public void  testdeleteContact(){
		operator.deleteContact("3");	
	}
	
	@Test
	public void  testFindAll(){
		List<Contact> findAll = operator.findAll();	
		for (Contact contact : findAll) {
			System.out.println(contact);
			
		}
	}
}
