package Basic;

public class getsetmethods {
	
	private String username;
	private String pwd;
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		getsetmethods s = new getsetmethods();
		s.setUsername("Sakthi");
		s.setPwd("Kavin");
		
		System.out.println(s.getUsername()+ "   " +s.getPwd());
		
		
		

	}

	

	

}
