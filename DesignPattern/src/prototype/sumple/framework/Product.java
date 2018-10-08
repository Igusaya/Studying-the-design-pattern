package prototype.sumple.framework;

/**
 * 複製を可能にする為のIF<br>
 * java.lang.Cloneableのcloneを実装しているクラスはcloneメソッドを使用して自動的に複製ができるようになる。
 * @author Igusaya
 *
 */
public interface Product extends Cloneable {
	/**
	 * 何を使うかはサブクラスの実装任せ
	 * @param s
	 */
	public abstract void use(String s);
	/**
	 * インスタンスの複製を行う
	 * @return
	 */
	public abstract Product createClone();
}
