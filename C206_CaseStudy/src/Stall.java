import java.time.LocalDate;

/**
 * I declare that this code was written by me.
 * I will not copy or allow others to copy my code.
 * I understand that copying code is considered as plagiarism.
 *
 * Yi Zheng, Aug 10, 2021 8:09:26 PM
 */

/**
 * I declare that this code was written by me.
 * I will not copy or allow others to copy my code.
 * I understand that copying code is considered as plagiarism.
 *
 * OngYiZheng, Aug 2, 2021 8:09:26 PM
 */

public class Stall {

	private int stallId;
	private String stallName;
	private LocalDate operationDate;

	public Stall(int stallId, String stallName, LocalDate operationDate) {
		this.stallId = stallId;
		this.stallName = stallName;
		this.operationDate = operationDate;
	}

	public int getStallId() {
		return stallId;
	}

	public void setStallId(int stallId) {
		this.stallId = stallId;
	}

	public String getStallName() {
		return stallName;
	}

	public void setStallName(String stallName) {
		this.stallName = stallName;
	}

	public LocalDate getOperationDate() {
		return operationDate;
	}

	public void setOperationDate(LocalDate operationDate) {
		this.operationDate = operationDate;
	}

	public String toString(){
		String output = "";

		output = String.format("%-15d%-25s%-25s\n", stallId,stallName ,operationDate);
		return output;
	}
	

}
