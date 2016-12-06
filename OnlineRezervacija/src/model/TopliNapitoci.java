package model;

public class TopliNapitoci {
	private int IDTopliNapitoci;
	private String ImeTopliNapitoci;
	
	
	public TopliNapitoci(){
		super();
	}
	
	public TopliNapitoci(String ImeTopliNapitoci) {
		this.ImeTopliNapitoci=ImeTopliNapitoci;
		

	}
	public TopliNapitoci(int IDTopliNapitoci, String ImeTopliNapitoci){
		this.IDTopliNapitoci=IDTopliNapitoci;
		this.ImeTopliNapitoci=ImeTopliNapitoci;	
	}

	public int getIDTopliNapitoci() {
		return IDTopliNapitoci;
	}

	public void setIDTopliNapitoci(int iDTopliNapitoci) {
		IDTopliNapitoci = iDTopliNapitoci;
	}

	public String getImeTopliNapitoci() {
		return ImeTopliNapitoci;
	}

	public void setImeTopliNapitoci(String imeTopliNapitoci) {
		ImeTopliNapitoci = imeTopliNapitoci;
	}
	
}
