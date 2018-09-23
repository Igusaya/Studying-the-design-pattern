package adapter._2;

/**
 * 委譲パターン
 * @author Igusaya
 *
 */
public class Main {

	public static void main(String[] args) {
		Print p = new PrintBanner("Hellow");
		p.printWeak();
		p.printStrong();
	}
}
