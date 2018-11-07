package lis.helga.lease.model.document;

import lis.helga.lease.model.item.ConcreteItem;
import lis.helga.lease.model.item.LeaseTerms;


public class LeaseContractItemRow {

	final private ConcreteItem item;
	private double cost;
	private LeaseTerms days;
	public LeaseContractItemRow(ConcreteItem item, LeaseTerms days){
		this.item = item;
		setDays(days);
	}
	public void setDays(LeaseTerms days){
		if(item.getLeaseInfo().getAvailableLeaseType().stream().anyMatch(d->d==days))
			this.days = days;
		else
			this.days=item.getLeaseInfo().getAvailableLeaseType().stream().max((t1,t2)->Integer.compare(t1.getDays(),t1.getDays())).orElse(LeaseTerms.DAY);
		calculateCost();
	}
	private void calculateCost(){
		cost = item.getLeaseInfo().getPricePerDay()*days.getDays();
	}
	
	/**
	 * @return the cost
	 */
	public double getCost() {
		return cost;
	}
	/**
	/**
	 * @return the item
	 */
	public ConcreteItem getItem() {
		return item;
	}
	/**
	 * @return the days
	 */
	public LeaseTerms getDays() {
		return days;
	}

}
