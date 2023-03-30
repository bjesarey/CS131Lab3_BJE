/**
 * Tests the classes ArrayList, Square, and PointThreeD
 */

/**
 * @author brandonesarey
 * @version 1.3
 * Lab 3
 * Semester year Spring 2023
 */
public class ListApp<T> {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> stringList=new ArrayList<String>();
		ArrayList<Square> squareList=new ArrayList<Square>();
		ArrayList<PointThreeD> pointList=new ArrayList<PointThreeD>();
		stringList.addItem(new String("S"));
		stringList.addItem(new String("R"));
		stringList.addItem(new String("N"));
		squareList.addItem(new Square(5));
		squareList.addItem(new Square(11.2));
		squareList.addItem(new Square(3.4));
		pointList.addItem(new PointThreeD(3, 6, 9));
		pointList.addItem(new PointThreeD(1, 7, 6));
		pointList.addItem(new PointThreeD(4, 12, 3));
		System.out.println(stringList.toString());
		System.out.println(squareList.toString());
		System.out.println(pointList.toString());
	}//end main()

}//end ListApp
