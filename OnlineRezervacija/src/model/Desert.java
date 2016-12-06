package model;

public class Desert {
	private int IDDesert;
	private String ImeDesert;
	
	
	public Desert(){
		super();
	}
	
	public Desert(String ImeDesert) {
		this.ImeDesert=ImeDesert;
		

	}
	public Desert(int IDDesert, String ImeDesert){
		this.IDDesert=IDDesert;
		this.ImeDesert=ImeDesert;
		
	}

	public int getIDDesert() {
		return IDDesert;
	}

	public void setIDDesert(int iDDesert) {
		IDDesert = iDDesert;
	}

	public String getImeDesert() {
		return ImeDesert;
	}

	public void setImeDesert(String imeDesert) {
		ImeDesert = imeDesert;
	}

}
