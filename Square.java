/**
 * 
 */

/**
 * @author brandonesarey
 *
 */
public class Square {
	private double side;

	public Square() {
		setSide(2);
	}// end empty argument constructor

	/**
	 * @param side
	 */
	public Square(double s) {
		this.side = s;
	}// end preferred constructor

	/**
	 * @return the side
	 */
	public double getSide() {
		return side;
	}// end getSide

	/**
	 * @param side the side to set
	 */
	public void setSide(double side) {
		this.side = side;
	}// end setSide

	public double getArea() {
		return side * 2;
	}// end getArea()

	@Override
	public String toString() {
		return "Square [side=" + side + "]";
	}//end toString()
	
}// end Square
