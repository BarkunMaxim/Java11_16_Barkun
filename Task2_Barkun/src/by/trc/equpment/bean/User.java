package by.trc.equpment.bean;

public class User {
	private int id;
	private String name;
	private String login;
	private String password;
	
	public User(){
		
	}
	
	public void setId(int id){
		this.id=id;
	}
	public int getId(){
		return this.id;
	}
	public void setName(String name){
		this.name=name;	
	}
	public String getName(){
		return this.name;
	}
	public void setLogin(String login){
		this.login=login;
	}
	public String getLogin(){
		return this.login;
	}
	public void setPassword(String password){
		this.password=password;
	}
	public String getPassword(){
		return this.password;
	}

}
