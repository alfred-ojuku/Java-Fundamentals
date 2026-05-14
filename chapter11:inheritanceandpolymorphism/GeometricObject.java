public class GeometricObject {
	private String color = "white";
	private boolean filled;
	private java.util.Date dateCreated;

	/** construct a default geometric object */
	public GeometricObject() {
		dateCreated = new java.util.Date();
	}

	/** construct a geometric object with the specified color and filled value */
	public GeometricObject(String color, boolean filled){
		dateCreated = new java.util.Date();
		this.color = color;
		this.filled = filled;
	}

	/** return color */
	public String getColor(){
		return color;
	}

	/** set new color */
	public void setColor(String color){
		this.color = color;
	}

	/** return filled */
	public boolean isFilled(){
		return filled;
	}

	/** set new filled */
	public void setFilled(boolean filled){
		this.filled = filled;
	}

	/** get datecreated */
	public java.util.Date getDateCreated(){
		return dateCreated;
	}

	/** return string representation of this object */
	public String toString(){
		return "created on " + dateCreated + "\ncolor: " + color + " and filled: " + filled;
	}
}
