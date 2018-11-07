package lis.helga.lease.model.item;

import java.util.HashSet;
import java.util.Set;

public class LeaseInfo {
	private double pricePerDay;
	final private Set<LeaseTerms> availableLeaseType = new HashSet<LeaseTerms>();
	/**
	 * @return the pricePerDay
	 */
	public double getPricePerDay() {
		return pricePerDay;
	}
	/**
	 * @param pricePerDay the pricePerDay to set
	 */
	public void setPricePerDay(double pricePerDay) {
		this.pricePerDay = pricePerDay;
	}
	/**
	 * @return the availableLeaseType
	 */
	public Set<LeaseTerms> getAvailableLeaseType() {
		return availableLeaseType;
	}
	public void addLeaseType(LeaseTerms type){
		availableLeaseType.add(type);
	}
	public void removeLeaseType(LeaseTerms type){
		availableLeaseType.remove(type);
	}
}



