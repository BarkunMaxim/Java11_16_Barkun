package by.trc.equpment.bean;

public class Owner {
	private int id;
	private String name;
	
	public Owner(){
		
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
	public String detName(){
		return this.name;
	}
}
