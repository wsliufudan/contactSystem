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
				//1.菜单页面
				menuPrint();
				
				//2.接收用户输入的命令
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				String command = br.readLine();
				
				//3.根据用户的输入执行操作
				if("1".equals(command)){
					
					Contact contact = new Contact();
					
					System.out.println("请输入id");
					String id = br.readLine();
					contact.setId(id);
					
					System.out.println("请输入name");
					String name = br.readLine();
					contact.setName(name);
					
					System.out.println("请输入gender");
					String gender = br.readLine();
					contact.setGender(gender);
					
					System.out.println("请输入age");
					String age = br.readLine();
					contact.setAge(Integer.parseInt(age));
					
					System.out.println("请输入phone");
					String phone = br.readLine();
					contact.setPhone(phone);
					
					System.out.println("请输入email");
					String email = br.readLine();
					contact.setEmail(email);
					
					System.out.println("请输入qq");
					String qq = br.readLine();
					contact.setQq(qq);
					
					operator.addContact(contact);
					
				}else if("2".equals(command)){
					
					Contact contact = new Contact();
					
					System.out.println("请输入修改后的id");
					String id = br.readLine();
					contact.setId(id);
					
					System.out.println("请输入修改后的name");
					String name = br.readLine();
					contact.setName(name);
					
					System.out.println("请输入修改后的gender");
					String gender = br.readLine();
					contact.setGender(gender);
					
					System.out.println("请输入修改后的age");
					String age = br.readLine();
					contact.setAge(Integer.parseInt(age));
					
					System.out.println("请输入修改后的phone");
					String phone = br.readLine();
					contact.setPhone(phone);
					
					System.out.println("请输入修改后的email");
					String email = br.readLine();
					contact.setEmail(email);
					
					System.out.println("请输入修改后的qq");
					String qq = br.readLine();
					contact.setQq(qq);
					
					operator.updateContact(contact);	
					
				}else if("3".equals(command)){
					
					System.out.println("请输入删除的id");
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
					System.out.println("输入指令错误！");	
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
		System.out.println("【1】添加联系人");
		System.out.println("【2】修改联系人");
		System.out.println("【3】删除联系人");
		System.out.println("【4】查看所有联系人");
		System.out.println("【Q】退出系统");
		System.out.println("----------------");
	}

}
