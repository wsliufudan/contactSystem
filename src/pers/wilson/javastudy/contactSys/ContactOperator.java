package pers.wilson.javastudy.contactSys;

import java.util.List;

public interface ContactOperator {
	/*
	 * ���ڴ����ϵ����ز����ķ���
	 */
	public void addContact(Contact contact);
	public void updateContact(Contact contact);
	public void deleteContact(String id);
	public List<Contact> findAll();

}
