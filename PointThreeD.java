/**
 * 
 */

/**
 * @author brandonesarey
 *
 */
public class PointThreeD {
	private double xPoint;
	private double yPoint;
	private double zPoint;

	public PointThreeD() {
		setxPoint(3);
		setyPoint(7);
		setzPoint(5);
	}//end empty argument constructor
	
	/**
	 * @param xPoint
	 * @param yPoint
	 * @param zPoint
	 */
	public PointThreeD(double x, double y, double z) {
		this.xPoint = x;
		this.yPoint = y;
		this.zPoint = z;
	}//end preferred argument constructor

	/**
	 * @return the xPoint
	 */
	public double getxPoint() {
		return xPoint;
	}// end getxPoint()

	/**
	 * @param xPoint the xPoint to set
	 */
	public void setxPoint(double xPoint) {
		this.xPoint = xPoint;
	}//end setxPoint()

	/**
	 * @return the yPoint
	 */
	public double getyPoint() {
		return yPoint;
	}//end getyPoint()

	/**
	 * @param yPoint the yPoint to set
	 */
	public void setyPoint(double yPoint) {
		this.yPoint = yPoint;
	}//end setyPoint()

	/**
	 * @return the zPoint
	 */
	public double getzPoint() {
		return zPoint;
	}//end getzPoint()

	/**
	 * @param zPoint the zPoint to set
	 */
	public void setzPoint(double zPoint) {
		this.zPoint = zPoint;
	}//end setzPoint()

	@Override
	public String toString() {
		return "PointThreeD [xPoint=" + xPoint + ", yPoint=" + yPoint + ", zPoint=" + zPoint + "]";
	}//end toString()

}// end PointThreeD
