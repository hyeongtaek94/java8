package Day18;

public class UsingThis {
	public int outerField = 10;

	class Inner {
		int innerField = 20;

		void method() {
			// ¶÷´Ù½Ä
			Functional fi = () -> {
				System.out.println("outterField: " + outerField);
				System.out.println("outterField: " + UsingThis.this.outerField + "\n");
				System.out.println("innerField: " + innerField);
				System.out.println("innerField: " + this.innerField + "\n");
			};
			fi.method();

			Functional fi2 = new Functional() {

				@Override
				public void method() {
					System.out.println("outterField: " + outerField);
					System.out.println("outterField: " + UsingThis.this.outerField + "\n");
					System.out.println("innerField: " + innerField);
					System.out.println("innerField: " + Inner.this.innerField + "\n");
				}
			};

			fi2.method();

		}
	}
}