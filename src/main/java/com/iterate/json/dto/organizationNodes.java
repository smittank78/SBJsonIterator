package com.iterate.json.dto;

import java.util.List;

public class organizationNodes {
	
	private List<Real> real;

	public List<Real> getReal() {
		return real;
	}

	public void setReal(List<Real> real) {
		this.real = real;
	}

	@Override
	public String toString() {
		return "organizationNodes [real=" + ((real == null) ? true : real.toString()) + "]";
	}	
	
	
}