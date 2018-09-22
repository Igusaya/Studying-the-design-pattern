package iterator.exercises._1_1;
/**
 * 数え上げ、スキャンを行うIF
 * @author Igusaya
 *
 */
public interface Iterator {
	/**
	 * 次の要素が存在するかチェック
	 * @return 存在すればtrue
	 */
	public abstract boolean hasNext();
	/**
	 * 次の要素を得る
	 * @return 次要素
	 */
	public abstract Object next();
}
