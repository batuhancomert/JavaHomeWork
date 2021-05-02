package Entities;

public class Campaing {
	int campaingId;
	String campaingName;
	String campaingInfo;
	
	public Campaing(int campaingId, String campaingName, String campaingInfo) {
		super();
		this.campaingId = campaingId;
		this.campaingName = campaingName;
		this.campaingInfo = campaingInfo;
	}

	public int getCampaingId() {
		return campaingId;
	}

	public void setCampaingId(int campaingId) {
		this.campaingId = campaingId;
	}

	public String getCampaingName() {
		return campaingName;
	}

	public void setCampaingName(String campaingName) {
		this.campaingName = campaingName;
	}

	public String getCampaingInfo() {
		return campaingInfo;
	}

	public void setCampaingInfo(String campaingInfo) {
		this.campaingInfo = campaingInfo;
	}

}
