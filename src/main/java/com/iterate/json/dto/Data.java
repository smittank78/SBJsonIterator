package com.iterate.json.dto;

import java.util.List;

public class Data {
	private int statusCode;
	private String message;
	private int description;

	private List<Real> data;

	private int total_Records;
	private String exception;
	public int getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public int getDescription() {
		return description;
	}
	public void setDescription(int description) {
		this.description = description;
	}
	public List<Real> getData() {
		return data;
	}
	public void setData(List<Real> data) {
		this.data = data;
	}
	public int getTotal_Records() {
		return total_Records;
	}
	public void setTotal_Records(int total_Records) {
		this.total_Records = total_Records;
	}
	public String getException() {
		return exception;
	}
	public void setException(String exception) {
		this.exception = exception;
	}
	@Override
	public String toString() {
		return "data [statusCode:" + statusCode + ", message:" + message + ", description:" + description + ", data:"
				+ data.toString() + ", total_Records:" + total_Records + ", exception:" + exception + "]";
	}	
}