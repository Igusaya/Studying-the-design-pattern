package adapter._1;

/**
 * 継承パターン
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
