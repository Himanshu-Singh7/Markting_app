package com.markting.app.exception;

public class PropertyValueException extends RuntimeException{
	String entityName;
	String fieldName;
	long fieldValue;
	public PropertyValueException(String entityName, String fieldName, long fieldValue) {
		super(String.format("%s not found with %s : %s",entityName,fieldName,fieldValue));
		this.entityName = entityName;
		this.fieldName = fieldName;
		this.fieldValue = fieldValue;
	}
	public String getEntityName() {
		return entityName;
	}
	public void setEntityName(String entityName) {
		this.entityName = entityName;
	}
	public String getFieldName() {
		return fieldName;
	}
	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}
	public long getFieldValue() {
		return fieldValue;
	}
	public void setFieldValue(long fieldValue) {
		this.fieldValue = fieldValue;
	}
	
	
	
		
	
	
	

}
