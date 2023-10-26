package Oopsconcept;



public class Encapsulate {
	private int id;
	private String name;
	private String email;
	private String password;
	private String mobile;
	private String division;
	private String std;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getDivision() {
		return division;
	}
	public void setDivision(String division) {
		this.division = division;
	}
	public String getStd() {
		return std;
	}
	public void setStd(String std) {
		this.std = std;
	}
	public static void main(String args[])
	{
		Encapsulation s1=new Encapsulate();
		s1.setId(1);
		s1.setName("Amaravathy P");
		s1.setEmail("Amaravathy@gmail.com");
		s1.setPassword("Amaravathy");
		s1.setMobile("9989887881");
		s1.setDivision("B");
		s1.setStd("8");
		
		System.out.println("Id:"+s1.getId()+"\nName:"+s1.getName()+"\nEmail:"+s1.getEmail()+"\nPassword:"+s1.getPassword()+"\nMobile:"+s1.getMobile()+"\nDivision:"+s1.getDivision()+"\nSTD:"+s1.getStd());
		
	}
	

}
