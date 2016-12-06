package model;

public class Sendvici {
	private int IDSendvici;
	private String ImeSendvici;
	
	
	public Sendvici(){
		super();
	}
	
	public Sendvici(String ImeSendvici) {
		this.ImeSendvici=ImeSendvici;
		

	}
	public Sendvici(int IDSendvici, String ImeSendvici){
		this.IDSendvici=IDSendvici;
		this.ImeSendvici=ImeSendvici;
		
	}

	public int getIDSendvici() {
		return IDSendvici;
	}

	public void setIDSendvici(int iDSendvici) {
		IDSendvici = iDSendvici;
	}

	public String getImeSendvici() {
		return ImeSendvici;
	}

	public void setImeSendvici(String imeSendvici) {
		ImeSendvici = imeSendvici;
	}

}
