package pers.wilson.javastudy.contactSys;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class MainProgram {
	
	public static void main(String[] args) {
		try {
			
			ContactOperator  operator = new ContactOperatorImpl();
			while(true)
			{
				//1.�˵�ҳ��
				menuPrint();
				
				//2.�����û����������
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				String command = br.readLine();
				
				//3.�����û�������ִ�в���
				if("1".equals(command)){
					
					Contact contact = new Contact();
					
					System.out.println("������id");
					String id = br.readLine();
					contact.setId(id);
					
					System.out.println("������name");
					String name = br.readLine();
					contact.setName(name);
					
					System.out.println("������gender");
					String gender = br.readLine();
					contact.setGender(gender);
					
					System.out.println("������age");
					String age = br.readLine();
					contact.setAge(Integer.parseInt(age));
					
					System.out.println("������phone");
					String phone = br.readLine();
					contact.setPhone(phone);
					
					System.out.println("������email");
					String email = br.readLine();
					contact.setEmail(email);
					
					System.out.println("������qq");
					String qq = br.readLine();
					contact.setQq(qq);
					
					operator.addContact(contact);
					
				}else if("2".equals(command)){
					
					Contact contact = new Contact();
					
					System.out.println("�������޸ĺ��id");
					String id = br.readLine();
					contact.setId(id);
					
					System.out.println("�������޸ĺ��name");
					String name = br.readLine();
					contact.setName(name);
					
					System.out.println("�������޸ĺ��gender");
					String gender = br.readLine();
					contact.setGender(gender);
					
					System.out.println("�������޸ĺ��age");
					String age = br.readLine();
					contact.setAge(Integer.parseInt(age));
					
					System.out.println("�������޸ĺ��phone");
					String phone = br.readLine();
					contact.setPhone(phone);
					
					System.out.println("�������޸ĺ��email");
					String email = br.readLine();
					contact.setEmail(email);
					
					System.out.println("�������޸ĺ��qq");
					String qq = br.readLine();
					contact.setQq(qq);
					
					operator.updateContact(contact);	
					
				}else if("3".equals(command)){
					
					System.out.println("������ɾ����id");
					String id = br.readLine();
		
					operator.deleteContact(id);	
					
				}else if("4".equals(command)){
					List<Contact>list = operator.findAll();
					for (Contact cont : list) {
						System.out.println(cont);		
					}
				}else if("Q".equals(command)){
					break;
					
				}else{
					System.out.println("����ָ�����");	
				}
			}
			
			 
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException(e);
		}
}

	private static void menuPrint() {
		System.out.println("----------------");
		System.out.println("��1�������ϵ��");
		System.out.println("��2���޸���ϵ��");
		System.out.println("��3��ɾ����ϵ��");
		System.out.println("��4���鿴������ϵ��");
		System.out.println("��Q���˳�ϵͳ");
		System.out.println("----------------");
	}

}
