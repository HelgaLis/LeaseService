package lis.helga.lease.model.document;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import lis.helga.lease.model.item.ConcreteItem;
import lis.helga.lease.model.person.Customer;
import lis.helga.lease.model.person.Manager;

public class LeaseContract {
	final private Manager manager;
	final private Customer customer;
	final private LocalDate rentalStartDate;
	final private LocalDate contractDate;
	private boolean payed;
	final private Set<LeaseContractItemRow> items;
	private double cost;
	private boolean approve;
	
	public LeaseContract(Manager manager, Customer customer, LocalDate rentalStartDay, Set<LeaseContractItemRow> items){
		this.manager = manager;
		this.customer = customer;
		this.rentalStartDate = rentalStartDay;
		this.contractDate = LocalDate.now();
		this.payed = false;
		this.items = items;
		this.setApprove(false);
		calculateCost();
	}
	public void addItem(LeaseContractItemRow item){
		items.add(item);
		calculateCost();
	}
	public void deleteItem(LeaseContractItemRow item){
		items.remove(item);
		calculateCost();
	}
	
	private void calculateCost(){
		cost = items.stream().map(i->i.getCost()).reduce(0.0d,(i1,i2)->i1+i2);
	}
	/**
	 * @return the payed
	 */
	public boolean isPayed() {
		return payed;
	}
	/**
	 * @param payed the payed to set
	 */
	public void setPayed(boolean payed) {
		this.payed = payed;
	}
	/**
	 * @return the cost
	 */
	public double getCost() {
		return cost;
	}
	/**
	 * @return the manager
	 */
	public Manager getManager() {
		return manager;
	}
	/**
	 * @return the customer
	 */
	public Customer getCustomer() {
		return customer;
	}
	/**
	 * @return the rentalStartDate
	 */
	public LocalDate getRentalStartDate() {
		return rentalStartDate;
	}
	/**
	 * @return the contractDate
	 */
	public LocalDate getContractDate() {
		return contractDate;
	}
	/**
	 * @return the items
	 */
	public Set<LeaseContractItemRow> getItems() {
		return items;
	}
	public boolean isApprove() {
		return approve;
	}
	public void setApprove(boolean approve) {
		this.approve = approve;
		items.stream().map(LeaseContractItemRow::getItem).map(ConcreteItem::getDepotInfo).forEach(di->di.setInHire(true));
	}
	
	
	
	
}
