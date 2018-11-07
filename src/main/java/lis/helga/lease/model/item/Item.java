package lis.helga.lease.model.item;

import java.util.HashSet;
import java.util.Set;


public class Item {
	private String name;
	private final Set<ConcreteItem> concreteItems = new HashSet<ConcreteItem>();
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	public Item(String name){
		
	}
	public void writeOffItem(ConcreteItem item){
		concreteItems.remove(item);
	}
	public void acceptanceItem(ConcreteItem item){
		concreteItems.add(item);
	}
}
