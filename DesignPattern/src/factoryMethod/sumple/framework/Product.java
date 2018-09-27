package factoryMethod.sumple.framework;

/**
 * 製品を表現したクラス。<br>
 * use()を宣言し、サブクラスに実装をまかせる。<br>
 * 「製品とは使える(use)もの」を保証させる
 * @author Igusaya
 *
 */
public abstract class Product {
	public abstract void use();
}
