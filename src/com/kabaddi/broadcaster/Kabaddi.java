package com.kabaddi.broadcaster;

import com.kabaddi.containers.KabaddiData;
import com.kabaddi.containers.Scene;
import com.kabaddi.util.KabaddiUtil;

public class Kabaddi extends Scene{
	
	public String session_selected_broadcaster = KabaddiUtil.KABADDI;
	
	private String status;
	
	public static KabaddiData data = new KabaddiData();
	
	public Kabaddi() {
		super();
	}
	
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}