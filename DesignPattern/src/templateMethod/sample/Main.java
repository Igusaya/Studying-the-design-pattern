package templateMethod.sample;

/**
 * 【ロジックの共通化】<br>
 * 　サブクラス側にアルゴリズムを実装する手間が省ける。<br>
 * @author Igusaya
 *
 */
public class Main {

	public static void main(String[] args) {
		AbstractDisplay d1 = new CharDisplay('H');
		AbstractDisplay d2 = new StringDisplay("Hello, World!");
		AbstractDisplay d3 = new StringDisplay("こんにちわ。世界。");

		d1.display();
		d2.display();
		d3.display();
	}
}
