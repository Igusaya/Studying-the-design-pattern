package factoryMethod.exercises._4_2.framework;

/**
 *Temprate Methodパターンを使用<br>
 *工場として製品を生成する
 * @author Igusaya
 *
 */
public abstract class Factory {

	/**
	 * createProductで製品を作ってregisterProductで登録する作成手順を実装<br>
	 * 上記処理はサブクラスで実装される
	 * @param owner
	 * @return
	 */
	public final Product create(String owner) {
		Product p = createProduct(owner);
		registerProduct(p);
		return p;
	}

	/**
	 * 製品を作る<br>
	 * 実装はサブクラスに任せる
	 * @param owner
	 * @return
	 */
	protected abstract Product createProduct(String owner);

	/**
	 * 作った製品の登録<br>
	 * 実装はサブクラスに任せる
	 * @param prodct
	 */
	protected abstract void registerProduct(Product prodct);
}
