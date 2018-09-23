package adapter._2;

/**
 * 予め提供されている機能
 * @author Igusaya
 *
 */
public class Banner {
	private String string;

	public Banner(String string) {
		this.string = string;
	}

	public void showWithParen() {
		System.out.println("(" + string + ")");
	}

	public void showWithAster() {
		System.out.println("*" + string + "*");
	}
}
