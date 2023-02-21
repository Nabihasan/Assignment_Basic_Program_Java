public class DivideOfTwoNumber{
		public static void main(String[] agg){
			
			float firstNumber=12;
			float secondNumber=3;
			try{
			float divide=firstNumber / secondNumber;
			System.out.println("Division of two number is : "+divide);
			}
			catch(Exception e){
				System.out.println("cannot be divided by 0");
			}

			
		}

}