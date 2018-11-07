package lis.helga.lease.model.item;

public class ConcreteItem {

	private Item item;
	private String number;
	private final LeaseInfo leaseInfo;
	private final DepotInfo depotInfo;
	public ConcreteItem(Item item, String number, LeaseInfo leaseInfo,
			DepotInfo depotInfo) {
		super();
		this.item = item;
		this.number = number;
		this.leaseInfo = leaseInfo;
		this.depotInfo = depotInfo;

	}
	/**
	 * @return the item
	 */
	public Item getItem() {
		return item;
	}
	/**
	 * @param item the item to set
	 */
	public void setItem(Item item) {
		this.item = item;
	}
	/**
	 * @return the number
	 */
	public String getNumber() {
		return number;
	}
	/**
	 * @param number the number to set
	 */
	public void setNumber(String number) {
		this.number = number;
	}

	/**
	 * @return the leaseInfo
	 */
	public LeaseInfo getLeaseInfo() {
		return leaseInfo;
	}
	/**
	 * @return the depotInfo
	 */
	public DepotInfo getDepotInfo() {
		return depotInfo;
	}
}
