package templateMethod.sample;

/**
 * abstractメソッドはサブクラスに実装を任せ、display()は固定処理として編集を禁止する。
 * @author Igusaya
 *
 */
public abstract class AbstractDisplay {
	public abstract void open();
	public abstract void print();
	public abstract void close();
	public final void display() {
		open();
		for (int i = 0; i < 5; i++) {
			print();
		}
		close();
	}
}
