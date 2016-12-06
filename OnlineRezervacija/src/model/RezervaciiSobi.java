package model;

public class RezervaciiSobi {
	private int IDRezervaciiSobi;
	private String VkupnoSobi;
	private String BrojNaSlobodniSobi;
	private String BrojNaSoba;
	
	
	public RezervaciiSobi(){
		super();
	}
	
	public RezervaciiSobi(String VkupnoSobi, String BrojNaSlobodniSobi, String BrojNaSoba) {
		this.VkupnoSobi=VkupnoSobi;
		this.BrojNaSlobodniSobi=BrojNaSlobodniSobi;
		this.BrojNaSoba=BrojNaSoba;
		

	}
	public RezervaciiSobi(int IDRezervaciiSobi, String VkupnoSobi, String BrojNaSlobodniSobi, String BrojNaSoba){
		this.IDRezervaciiSobi=IDRezervaciiSobi;
		this.VkupnoSobi=VkupnoSobi;
		this.BrojNaSlobodniSobi=BrojNaSlobodniSobi;
		this.BrojNaSoba=BrojNaSoba;
	}

	public int getIDRezervaciiSobi() {
		return IDRezervaciiSobi;
	}

	public void setIDRezervaciiSobi(int iDRezervaciiSobi) {
		IDRezervaciiSobi = iDRezervaciiSobi;
	}

	public String getVkupnoSobi() {
		return VkupnoSobi;
	}

	public void setVkupnoSobi(String vkupnoSobi) {
		VkupnoSobi = vkupnoSobi;
	}

	public String getBrojNaSlobodniSobi() {
		return BrojNaSlobodniSobi;
	}

	public void setBrojNaSlobodniSobi(String brojNaSlobodniSobi) {
		BrojNaSlobodniSobi = brojNaSlobodniSobi;
	}

	public String getBrojNaSoba() {
		return BrojNaSoba;
	}

	public void setBrojNaSoba(String brojNaSoba) {
		BrojNaSoba = brojNaSoba;
	}

}
