package model;

public class Skara {
	private int IDSkara;
	private String ImeSkara;
	
	
	public Skara(){
		super();
	}
	
	public Skara(String ImeSkara) {
		this.ImeSkara=ImeSkara;
		

	}
	public Skara(int IDSkara, String ImeSkara){
		this.IDSkara=IDSkara;
		this.ImeSkara=ImeSkara;
		
	}

	public int getIDSkara() {
		return IDSkara;
	}

	public void setIDSkara(int iDSkara) {
		IDSkara = iDSkara;
	}

	public String getImeSkara() {
		return ImeSkara;
	}

	public void setImeSkara(String imeSkara) {
		ImeSkara = imeSkara;
	}

}
