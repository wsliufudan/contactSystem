package pers.wilson.javastudy.contactSys;

/**
 * @author DELL
 *
 */
public class Contact {
	
	private String id;
	private String name;
	private int age;
	private String gender;
	private String phone;
	private String email;
	private String qq;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getQq() {
		return qq;
	}
	public void setQq(String qq) {
		this.qq = qq;
	}
	@Override
	public String toString() {
		return "Contact [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", phone=" + phone
				+ ", email=" + email + ", qq=" + qq + "]";
	}

}
