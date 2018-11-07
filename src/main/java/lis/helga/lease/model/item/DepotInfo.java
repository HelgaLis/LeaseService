package lis.helga.lease.model.item;

public class DepotInfo {
	
	private String depotPlaceId;
	private double weight;
	private Dimensions dimensions;
	private boolean inHire;
	public DepotInfo(String depotPlaceId, double weight, Dimensions dimensions) {
		super();
		this.depotPlaceId = depotPlaceId;
		this.weight = weight;
		this.dimensions = dimensions;
		this.inHire = false;
	}
	/**
	 * @return the inHire
	 */
	public boolean isInHire() {
		return inHire;
	}
	/**
	 * @param inHire the inHire to set
	 */
	public void setInHire(boolean inHire) {
		this.inHire = inHire;
	}
}

class Dimensions{
	private final double height,width,depth;
	public Dimensions(double height, double width, double depth){
		this.height = height;
		this.width = width;
		this.depth = depth;

	}
	/**
	 * @return the height
	 */
	public double getHeight() {
		return height;
	}
	/**
	 * @return the width
	 */
	public double getWidth() {
		return width;
	}
	/**
	 * @return the depth
	 */
	public double getDepth() {
		return depth;
	}
}
