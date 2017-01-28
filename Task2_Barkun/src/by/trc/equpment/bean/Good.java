package by.trc.equpment.bean;

public class Good {
	private int id;
	private String tittle;
	
	public Good(){
		
	}
	public void setId(int id){
		this.id=id;
	}
	public int getId(){
		return this.id;
	}
	public void setTittle(String tittle){
		this.tittle=tittle;
	}
	public String getTittle(){
		return this.tittle;
	}
}
