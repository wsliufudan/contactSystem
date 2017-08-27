package pers.wilson.javastudy.contactSys;

import java.util.List;

public interface ContactOperator {
	/*
	 * 用于存放联系人相关操作的方法
	 */
	public void addContact(Contact contact);
	public void updateContact(Contact contact);
	public void deleteContact(String id);
	public List<Contact> findAll();

}
