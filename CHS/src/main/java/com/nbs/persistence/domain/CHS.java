package com.nbs.persistence.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CHS {
	
@Id
@GeneratedValue (strategy= GenerationType.IDENTITY)
	private int ID;
	private int Position;
	private String Name;
	private String PostCode;
	private String URL;
	
	public CHS(int ID, int Position, String Name, String PostCode, String URL) {
}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public int getPosition() {
		return Position;
	}

	public void setPosition(int position) {
		Position = position;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getPostCode() {
		return PostCode;
	}

	public void setPostCode(String postCode) {
		PostCode = postCode;
	}

	public String getURL() {
		return URL;
	}

	public void setURL(String uRL) {
		URL = uRL;
	}
}
