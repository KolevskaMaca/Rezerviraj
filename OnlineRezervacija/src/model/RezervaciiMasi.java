package model;

public class RezervaciiMasi {
	private int IDRezervaciMasi;
	private String VkupnoMasi;
	private String BrojNaSlobodniMasi;
	private String BrojNaMasa;
	
	
	public RezervaciiMasi(){
		super();
	}
	
	public RezervaciiMasi(String VkupnoMasi, String BrojNaSlobodniMasi, String BrojNaMasa) {
		this.VkupnoMasi=VkupnoMasi;
		this.BrojNaSlobodniMasi=BrojNaSlobodniMasi;
		this.BrojNaMasa=BrojNaMasa;
		

	}
	public RezervaciiMasi(int IDRezervaciiMasi, String VkupnoMasi, String BrojNaSlobodniMasi, String BrojNaMasa){
		this.IDRezervaciMasi=IDRezervaciiMasi;
		this.VkupnoMasi=VkupnoMasi;
		this.BrojNaSlobodniMasi=BrojNaSlobodniMasi;
		this.BrojNaMasa=BrojNaMasa;
	}

	public int getIDRezervaciMasi() {
		return IDRezervaciMasi;
	}

	public void setIDRezervaciMasi(int iDRezervaciMasi) {
		IDRezervaciMasi = iDRezervaciMasi;
	}

	public String getVkupnoMasi() {
		return VkupnoMasi;
	}

	public void setVkupnoMasi(String vkupnoMasi) {
		VkupnoMasi = vkupnoMasi;
	}

	public String getBrojNaSlobodniMasi() {
		return BrojNaSlobodniMasi;
	}

	public void setBrojNaSlobodniMasi(String brojNaSlobodniMasi) {
		BrojNaSlobodniMasi = brojNaSlobodniMasi;
	}

	public String getBrojNaMasa() {
		return BrojNaMasa;
	}

	public void setBrojNaMasa(String brojNaMasa) {
		BrojNaMasa = brojNaMasa;
	}

}
