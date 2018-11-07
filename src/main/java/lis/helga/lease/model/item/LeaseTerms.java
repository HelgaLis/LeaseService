package lis.helga.lease.model.item;

public enum LeaseTerms{
	DAY(1),ONEWEEK(7),TWOWEEK(14),MONTH(30);
	private Integer days;
	LeaseTerms(Integer days){
		this.days = days;
	}
	public Integer getDays(){
		return days;
	}
}