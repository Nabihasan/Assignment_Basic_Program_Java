package WildCard;

public class UtilNew {
	
		public static <T> void getArea(GenericRectangle<? extends Number> r) {
			System.out.println("Area :"+r.length.floatValue()*r.breadth.floatValue());
		}
}
