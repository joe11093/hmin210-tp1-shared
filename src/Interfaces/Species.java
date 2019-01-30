package Interfaces;

import java.io.Serializable;

public class Species implements Serializable{

	private static final long serialVersionUID = 1L;
	String name;

	public Species(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return this.name;
	}
	
	
}
