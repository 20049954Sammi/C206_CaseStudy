/**
 * 
 */

/**
 * I declare that this code was written by me.
 * I will not copy or allow others to copy my code.
 * I understand that copying code is considered as plagiarism.
 *
 * Zheng Sheng, 11 Aug 2021 8:03:34 pm
 */

import java.time.LocalDate;

public class Order {
	private int orderID;
	private String orderName;
	private int quantity;
	private LocalDate entryDate;
	
	
	public Order(int orderID, String orderName, int quantity, LocalDate entryDate) {
		this.orderID = orderID;
		this.orderName = orderName;
		this.quantity = quantity;
		this.entryDate = entryDate;
	}


	public int getOrderID() {
		return orderID;
	}


	public void setOrderID(int orderID) {
		this.orderID = orderID;
	}


	public String getOrderName() {
		return orderName;
	}


	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	public LocalDate getEntryDate() {
		return entryDate;
	}


	public void setEntryDate(LocalDate entryDate) {
		this.entryDate = entryDate;
	}

	
	
}
