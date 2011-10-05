package me.jesus.diaspora_android;

import java.sql.Date;

public class Message {
	private String recipient_name; //destinatario
	private String sender_name; //remitente
	private String matter; //asunto
	private String body_message; //cuerpo del mensaje
	private Date date; //fecha
	
	public Message(String recipient_name,String sender_name,String matter,String body_message,Date date){
		this.setRecipient_name(recipient_name);
		this.setSender_name(sender_name);
		this.setMatter(matter);
		this.setBody_message(body_message);
		this.setDate(date);
	}
	
	
	public String getRecipient_name() {
		return recipient_name;
	}
	public void setRecipient_name(String recipient_name) {
		this.recipient_name = recipient_name;
	}
	public String getSender_name() {
		return sender_name;
	}
	public void setSender_name(String sender_name) {
		this.sender_name = sender_name;
	}
	public String getMatter() {
		return matter;
	}
	public void setMatter(String matter) {
		this.matter = matter;
	}
	public String getBody_message() {
		return body_message;
	}
	public void setBody_message(String body_message) {
		this.body_message = body_message;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
}
