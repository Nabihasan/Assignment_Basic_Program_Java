package generic;

public class Main {

	public static void main(String[] args) {
	
		GenericExample<Integer> g = new GenericExample<Integer>(42);
        System.out.println(g.getValue());

        GenericExample<String> g2 = new GenericExample<String>("Nabi Hasan");
        System.out.println(g2.getValue());

        GenericExample<Character> g3 = new GenericExample<Character>('A');
        System.out.println(g3.getValue());

        GenericExample<Double> g4 = new GenericExample<Double>(112.5);
        System.out.println(g4.getValue());

        GenericExample<Boolean> g5 = new GenericExample<Boolean>(true);
        System.out.println(g5.getValue());
		

	}

}
